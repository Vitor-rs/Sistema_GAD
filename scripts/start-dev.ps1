# ========================================
# SCRIPT POWERSHELL - INICIALIZAÇÃO DESENVOLVIMENTO
# Sistema GAD (Gestão Acadêmica Digital)
# ========================================

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "SISTEMA GAD - INICIALIZAÇÃO DESENVOLVIMENTO" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan

# Carrega variáveis de ambiente de desenvolvimento
Write-Host "1. Carregando variáveis de ambiente..." -ForegroundColor Yellow
& "$PSScriptRoot\load-env.ps1" -Environment "dev"

# Verifica se Docker está rodando e inicia serviços se necessário
Write-Host "2. Verificando Docker..." -ForegroundColor Yellow
try {
    docker --version | Out-Null
    Write-Host "  Docker encontrado!" -ForegroundColor Green
    
    # Verifica se compose.yaml existe
    if (Test-Path "compose.yaml") {
        Write-Host "  Iniciando serviços Docker..." -ForegroundColor Yellow
        docker-compose up -d
        Write-Host "  Serviços Docker iniciados!" -ForegroundColor Green
    }
} catch {
    Write-Host "  Docker não encontrado ou não está rodando" -ForegroundColor Yellow
    Write-Host "  Continuando sem Docker..." -ForegroundColor Yellow
}

# Aguarda um momento para os serviços subirem
Write-Host "3. Aguardando serviços..." -ForegroundColor Yellow
Start-Sleep -Seconds 3

# Inicia a aplicação Spring Boot
Write-Host "4. Iniciando aplicação Spring Boot..." -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "APLICAÇÃO INICIANDO..." -ForegroundColor Green
Write-Host "Console H2: http://localhost:8080/h2-console" -ForegroundColor Yellow
Write-Host "Aplicação: http://localhost:8080" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Cyan

# Executa a aplicação
mvn spring-boot:run
