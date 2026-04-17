# Sistema GAD — Gerenciador de Atividades Diversificadas

Monorepo Nx que abriga o sistema GAD do IFMS Naviraí, com classificação
automática de certificados acadêmicos via NLP.

## Apps

- `apps/web-react` — Frontend React (painel do aluno e do professor)
- `apps/api-spring` — Backend Spring Boot (orquestração e autenticação) — em construção
- `apps/pipeline-python` — Serviço FastAPI de NLP (Docling + GLiNER2 + LoRA) — em construção
- `apps/docs` — Documentação técnica em MkDocs Material — em construção

## Stack

- **Orquestração**: Nx 22 (monorepo poliglota, cache remoto via Nx Cloud)
- **Frontend**: React 19 + Vite + Vitest + Playwright (PNPM)
- **Backend**: Java 21 + Spring Boot 3.5 + Gradle
- **Pipeline NLP**: Python 3.12 + FastAPI + UV (Astral)
- **Dados**: PostgreSQL + pgvector + Redis
- **Infra**: Docker Compose (dev local) + GitHub Actions (CI)
