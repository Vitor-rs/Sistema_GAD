# 🌍 Configuração de Variáveis de Ambiente - Sistema GAD

Este documento explica como configurar e usar as variáveis de ambiente no Sistema GAD (Gestão Acadêmica Digital).

## 📁 Estrutura de Arquivos de Ambiente

```
Sistema_GAD/
├── .env.dev                    # Desenvolvimento (commitado)
├── .env.test                   # Testes (commitado)
├── .env.prod.example          # Exemplo para produção
├── .env.prod                  # Produção (NÃO commitado)
└── scripts/
    ├── load-env.ps1           # Script para carregar variáveis
    └── start-dev.ps1          # Script de inicialização dev
```

## 🚀 Como Usar

### 1. **Desenvolvimento Local**

Para desenvolvimento, use o arquivo `.env.dev` que já está configurado:

```powershell
# Opção 1: Usando script automático
.\scripts\start-dev.ps1

# Opção 2: Carregando manualmente
.\scripts\load-env.ps1 -Environment dev
mvn spring-boot:run

# Opção 3: Direto com Maven
mvn spring-boot:run -Dspring.profiles.active=dev
```

### 2. **Execução de Testes**

```powershell
# Os testes usam automaticamente o profile 'test'
mvn test

# Para carregar explicitamente as variáveis de teste
.\scripts\load-env.ps1 -Environment test
mvn test
```

### 3. **Produção**

```powershell
# 1. Copie o arquivo de exemplo
Copy-Item .env.prod.example .env.prod

# 2. Configure com valores reais
notepad .env.prod

# 3. Carregue as variáveis
.\scripts\load-env.ps1 -Environment prod

# 4. Execute a aplicação
java -jar target/gad-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```

## 🔧 Variáveis Principais

### 🏗️ **Configurações Gerais**
| Variável | Descrição | Exemplo |
|----------|-----------|---------|
| `SPRING_PROFILES_ACTIVE` | Profile ativo | `dev`, `test`, `prod` |
| `SERVER_PORT` | Porta do servidor | `8080` |

### 🗄️ **Banco de Dados**
| Variável | Descrição | Exemplo |
|----------|-----------|---------|
| `DATABASE_URL` | URL do banco PostgreSQL | `jdbc:postgresql://localhost:5432/gad_prod` |
| `DATABASE_USERNAME` | Usuário do banco | `gad_user` |
| `DATABASE_PASSWORD` | Senha do banco | `senha_segura` |

### 🤖 **Spring AI**
| Variável | Descrição | Exemplo |
|----------|-----------|---------|
| `OLLAMA_BASE_URL` | URL do servidor Ollama | `http://localhost:11434` |
| `OLLAMA_MODEL` | Modelo de IA a usar | `llama2` |

### 🔐 **Segurança**
| Variável | Descrição | Exemplo |
|----------|-----------|---------|
| `JWT_SECRET` | Chave secreta JWT | `chave-muito-longa-e-segura` |
| `JWT_EXPIRATION` | Tempo de expiração JWT (ms) | `3600000` |

### 📧 **Email**
| Variável | Descrição | Exemplo |
|----------|-----------|---------|
| `MAIL_HOST` | Servidor SMTP | `smtp.ifms.edu.br` |
| `MAIL_PORT` | Porta SMTP | `587` |
| `MAIL_USERNAME` | Usuário email | `sistema.gad@ifms.edu.br` |
| `MAIL_PASSWORD` | Senha do email | `senha_email` |

## 🔒 Segurança

### ⚠️ **IMPORTANTE - Nunca Commitar:**
- `.env.prod` - Contém dados sensíveis de produção
- `.env` - Arquivo genérico com dados sensíveis
- Qualquer arquivo com senhas reais

### ✅ **Pode Commitar:**
- `.env.dev` - Apenas dados de desenvolvimento
- `.env.test` - Apenas dados de teste
- `.env.*.example` - Arquivos de exemplo

## 🐳 Docker

### Desenvolvimento com Docker Compose

O arquivo `compose.yaml` usa automaticamente as variáveis:

```yaml
services:
  postgres:
    environment:
      - POSTGRES_DB=${DATABASE_NAME:-gad_dev}
      - POSTGRES_USER=${DATABASE_USERNAME:-gad_user}
      - POSTGRES_PASSWORD=${DATABASE_PASSWORD:-gad_password}
```

### Executar com Docker

```powershell
# Carregar variáveis e iniciar serviços
.\scripts\load-env.ps1 -Environment dev
docker-compose up -d
mvn spring-boot:run
```

## 🛠️ Troubleshooting

### Script PowerShell não executa
```powershell
# Habilitar execução de scripts
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
```

### Variáveis não carregam
```powershell
# Verificar se o arquivo existe
Test-Path .env.dev

# Carregar manualmente uma variável
$env:SPRING_PROFILES_ACTIVE = "dev"
```

### Console H2 não abre
```powershell
# Verificar se está no profile dev
echo $env:SPRING_PROFILES_ACTIVE

# URL do console H2
# http://localhost:8080/h2-console
# JDBC URL: jdbc:h2:mem:gad_dev
# User: sa
# Password: (vazio)
```

## 📋 Checklist de Deploy

### ✅ **Antes do Deploy em Produção:**

1. [ ] Copiar `.env.prod.example` para `.env.prod`
2. [ ] Configurar todas as variáveis com valores reais
3. [ ] Gerar chave JWT segura (mínimo 256 bits)
4. [ ] Configurar credenciais do banco PostgreSQL
5. [ ] Configurar servidor de email
6. [ ] Verificar URLs de serviços externos (Ollama)
7. [ ] Testar conectividade com banco de dados
8. [ ] Configurar logs para arquivo
9. [ ] Verificar configurações de monitoramento
10. [ ] **NUNCA commitar `.env.prod`**

### 🔍 **Verificação de Configuração:**

```powershell
# Verificar profile ativo
echo $env:SPRING_PROFILES_ACTIVE

# Verificar conexão com banco
mvn spring-boot:run -Dspring.boot.run.arguments="--spring.datasource.url=$env:DATABASE_URL"

# Testar aplicação
curl http://localhost:$env:SERVER_PORT/actuator/health
```

## 📞 Suporte

Para dúvidas sobre configuração de ambiente:
1. Consulte este documento
2. Verifique os logs da aplicação
3. Teste com o ambiente de desenvolvimento primeiro
4. Contate a equipe de desenvolvimento

---
**Sistema GAD - IFMS**  
*Gestão Acadêmica Digital*
