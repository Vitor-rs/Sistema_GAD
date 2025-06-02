# ========================================
# SCRIPT POWERSHELL - CARREGAMENTO DE VARIÁVEIS DE AMBIENTE
# Sistema GAD (Gestão Acadêmica Digital)
# ========================================

param(
    [Parameter(Mandatory=$false)]
    [ValidateSet("dev", "test", "prod")]
    [string]$Environment = "dev"
)

# Função para carregar arquivo .env
function Load-EnvFile {
    param([string]$FilePath)
    
    if (Test-Path $FilePath) {
        Write-Host "Carregando variáveis de ambiente de: $FilePath" -ForegroundColor Green
        
        Get-Content $FilePath | ForEach-Object {
            if ($_ -match "^\s*([^#][^=]*)\s*=\s*(.*)\s*$") {
                $name = $matches[1].Trim()
                $value = $matches[2].Trim()
                
                # Remove aspas se existirem
                if ($value -match '^"(.*)"$') {
                    $value = $matches[1]
                }
                
                # Define a variável de ambiente
                [Environment]::SetEnvironmentVariable($name, $value, "Process")
                Write-Host "  $name = $value" -ForegroundColor Gray
            }
        }
    } else {
        Write-Host "Arquivo não encontrado: $FilePath" -ForegroundColor Red
        exit 1
    }
}

# Determina o arquivo de ambiente
$envFile = ".env.$Environment"

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "SISTEMA GAD - CARREGAMENTO DE AMBIENTE" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "Ambiente: $Environment" -ForegroundColor Yellow

# Carrega o arquivo de ambiente específico
Load-EnvFile -FilePath $envFile

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "Variáveis de ambiente carregadas com sucesso!" -ForegroundColor Green
Write-Host "Você pode agora executar a aplicação com:" -ForegroundColor Yellow
Write-Host "  mvn spring-boot:run" -ForegroundColor White
Write-Host "========================================" -ForegroundColor Cyan
