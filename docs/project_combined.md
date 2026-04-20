# Project Structure

```txt
.
├── .obsidian/
│   ├── plugins/
│   │   ├── obsidian-latex-suite/
│   │   │   ├── main.js
│   │   │   ├── manifest.json
│   │   │   └── styles.css
│   │   ├── obsidian-plantuml/
│   │   │   ├── main.js
│   │   │   ├── manifest.json
│   │   │   └── styles.css
│   │   ├── smart-connections/
│   │   │   ├── data.json
│   │   │   ├── main.js
│   │   │   ├── manifest.json
│   │   │   └── styles.css
│   │   ├── smart-lookup/
│   │   │   ├── data.json
│   │   │   ├── main.js
│   │   │   ├── manifest.json
│   │   │   └── styles.css
│   │   └── templater-obsidian/
│   │       ├── main.js
│   │       ├── manifest.json
│   │       └── styles.css
│   ├── app.json
│   ├── appearance.json
│   ├── community-plugins.json
│   ├── core-plugins.json
│   └── workspace.json
├── apps/
│   ├── backend/
│   │   ├── gradle/
│   │   │   └── wrapper/
│   │   │       ├── gradle-wrapper.jar
│   │   │       └── gradle-wrapper.properties
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── br/
│   │   │   │   │       └── edu/
│   │   │   │   │           └── ifms/
│   │   │   │   │               └── gad/
│   │   │   │   │                   └── api/
│   │   │   │   │                       └── ApiSpringApplication.java
│   │   │   │   └── resources/
│   │   │   │       ├── db/
│   │   │   │       │   └── migration/
│   │   │   │       │       └── V1__baseline.sql
│   │   │   │       └── application.properties
│   │   │   └── test/
│   │   │       ├── java/
│   │   │       │   └── br/
│   │   │       │       └── edu/
│   │   │       │           └── ifms/
│   │   │       │               └── gad/
│   │   │       │                   └── api/
│   │   │       │                       ├── ApiSpringApplicationTests.java
│   │   │       │                       └── TestcontainersConfiguration.java
│   │   │       └── resources/
│   │   │           ├── application.properties
│   │   │           └── docker-java.properties
│   │   ├── .gitattributes
│   │   ├── .gitignore
│   │   ├── build.gradle
│   │   ├── gradlew
│   │   ├── gradlew.bat
│   │   ├── project.json
│   │   └── settings.gradle
│   ├── frontend-discente-e2e/
│   │   ├── src/
│   │   │   └── example.spec.ts
│   │   ├── eslint.config.mjs
│   │   ├── package.json
│   │   ├── playwright.config.ts
│   │   └── tsconfig.json
│   ├── frontend-discente/
│   │   ├── src/
│   │   │   ├── app/
│   │   │   │   ├── app.module.css
│   │   │   │   ├── app.spec.tsx
│   │   │   │   ├── app.tsx
│   │   │   │   └── nx-welcome.tsx
│   │   │   ├── assets/
│   │   │   │   └── .gitkeep
│   │   │   ├── main.tsx
│   │   │   └── styles.css
│   │   ├── eslint.config.mjs
│   │   ├── index.html
│   │   ├── package.json
│   │   ├── tsconfig.app.json
│   │   ├── tsconfig.json
│   │   ├── tsconfig.spec.json
│   │   └── vite.config.mts
│   ├── frontend-docente-e2e/
│   │   ├── src/
│   │   │   └── example.spec.ts
│   │   ├── eslint.config.mjs
│   │   ├── package.json
│   │   ├── playwright.config.ts
│   │   └── tsconfig.json
│   ├── frontend-docente/
│   │   ├── src/
│   │   │   ├── app/
│   │   │   │   ├── app.module.css
│   │   │   │   ├── app.spec.tsx
│   │   │   │   ├── app.tsx
│   │   │   │   └── nx-welcome.tsx
│   │   │   ├── assets/
│   │   │   │   └── .gitkeep
│   │   │   ├── main.tsx
│   │   │   └── styles.css
│   │   ├── eslint.config.mjs
│   │   ├── index.html
│   │   ├── package.json
│   │   ├── tsconfig.app.json
│   │   ├── tsconfig.json
│   │   ├── tsconfig.spec.json
│   │   └── vite.config.mts
│   └── pipeline/
│       ├── src/
│       │   └── pipeline/
│       │       ├── __init__.py
│       │       └── hello.py
│       ├── tests/
│       │   ├── __init__.py
│       │   ├── conftest.py
│       │   └── test_hello.py
│       ├── .python-version
│       ├── project.json
│       ├── pyproject.toml
│       └── README.md
├── libs/
│   ├── api-client-ts/
│   │   ├── src/
│   │   │   ├── lib/
│   │   │   │   ├── api-client-ts.spec.ts
│   │   │   │   └── api-client-ts.ts
│   │   │   └── index.ts
│   │   ├── eslint.config.mjs
│   │   ├── package.json
│   │   ├── README.md
│   │   ├── tsconfig.json
│   │   ├── tsconfig.lib.json
│   │   ├── tsconfig.spec.json
│   │   └── vitest.config.mts
│   ├── contracts-ts/
│   │   ├── src/
│   │   │   ├── lib/
│   │   │   │   ├── contracts-ts.spec.ts
│   │   │   │   └── contracts-ts.ts
│   │   │   └── index.ts
│   │   ├── eslint.config.mjs
│   │   ├── package.json
│   │   ├── README.md
│   │   ├── tsconfig.json
│   │   ├── tsconfig.lib.json
│   │   ├── tsconfig.spec.json
│   │   └── vitest.config.mts
│   └── ui-components/
│       ├── src/
│       │   ├── lib/
│       │   │   ├── ui-components.module.css
│       │   │   ├── ui-components.spec.tsx
│       │   │   └── ui-components.tsx
│       │   └── index.ts
│       ├── .babelrc
│       ├── eslint.config.mjs
│       ├── package.json
│       ├── README.md
│       ├── tsconfig.json
│       ├── tsconfig.lib.json
│       ├── tsconfig.spec.json
│       └── vite.config.mts
├── .editorconfig
├── .gitignore
├── .npmrc
├── .prettierignore
├── .prettierrc
├── docker-compose.yml
├── eslint.config.mjs
├── nx.json
├── package.json
├── pnpm-workspace.yaml
├── project.json
├── README.md
├── tsconfig.base.json
├── tsconfig.json
└── vitest.workspace.ts
```

# Project Paths

```txt
C:\Users\user\Documents\Vitor\Sistema_GAD\.editorconfig
C:\Users\user\Documents\Vitor\Sistema_GAD\.gitignore
C:\Users\user\Documents\Vitor\Sistema_GAD\.npmrc
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\app.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\appearance.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\community-plugins.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\core-plugins.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\main.js
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\manifest.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\main.js
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\manifest.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\data.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\main.js
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\manifest.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\data.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\main.js
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\manifest.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\main.js
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\manifest.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\workspace.json
C:\Users\user\Documents\Vitor\Sistema_GAD\.prettierignore
C:\Users\user\Documents\Vitor\Sistema_GAD\.prettierrc
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\.gitattributes
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\.gitignore
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\build.gradle
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradle\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradle\wrapper\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradle\wrapper\gradle-wrapper.jar
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradle\wrapper\gradle-wrapper.properties
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradlew
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradlew.bat
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\project.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\settings.gradle
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\ifms\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\ifms\gad\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\ifms\gad\api\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\ifms\gad\api\ApiSpringApplication.java
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\application.properties
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\db\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\db\migration\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\db\migration\V1__baseline.sql
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\api\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\api\ApiSpringApplicationTests.java
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\api\TestcontainersConfiguration.java
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\resources\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\resources\application.properties
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\resources\docker-java.properties
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\playwright.config.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\src\example.spec.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\index.html
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.module.css
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.spec.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\nx-welcome.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\assets\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\assets\.gitkeep
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\main.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.app.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.spec.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\vite.config.mts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\playwright.config.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\src\example.spec.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\index.html
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.module.css
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.spec.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\nx-welcome.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\assets\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\assets\.gitkeep
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\main.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\styles.css
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.app.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.spec.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\vite.config.mts
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\.python-version
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\project.json
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\pyproject.toml
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\README.md
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\pipeline\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\pipeline\__init__.py
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\pipeline\hello.py
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\__init__.py
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\conftest.py
C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\test_hello.py
C:\Users\user\Documents\Vitor\Sistema_GAD\docker-compose.yml
C:\Users\user\Documents\Vitor\Sistema_GAD\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\README.md
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\index.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\lib\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\lib\api-client-ts.spec.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\lib\api-client-ts.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.lib.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.spec.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\vitest.config.mts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\README.md
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\index.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\lib\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\lib\contracts-ts.spec.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\lib\contracts-ts.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.lib.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.spec.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\vitest.config.mts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\.babelrc
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\eslint.config.mjs
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\README.md
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\index.ts
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.module.css
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.spec.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.tsx
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.lib.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.spec.json
C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\vite.config.mts
C:\Users\user\Documents\Vitor\Sistema_GAD\nx.json
C:\Users\user\Documents\Vitor\Sistema_GAD\package.json
C:\Users\user\Documents\Vitor\Sistema_GAD\pnpm-workspace.yaml
C:\Users\user\Documents\Vitor\Sistema_GAD\project.json
C:\Users\user\Documents\Vitor\Sistema_GAD\README.md
C:\Users\user\Documents\Vitor\Sistema_GAD\tsconfig.base.json
C:\Users\user\Documents\Vitor\Sistema_GAD\tsconfig.json
C:\Users\user\Documents\Vitor\Sistema_GAD\vitest.workspace.ts
```

# File Contents

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\app.json

```json
{}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\appearance.json

```json
{}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\community-plugins.json

```json
[
  "smart-connections",
  "smart-lookup",
  "obsidian-local-rest-api",
  "obsidian-latex-suite",
  "obsidian-plantuml",
  "copilot"
]
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\core-plugins.json

```json
{
  "file-explorer": true,
  "global-search": true,
  "switcher": true,
  "graph": true,
  "backlink": true,
  "canvas": true,
  "outgoing-link": true,
  "tag-pane": true,
  "footnotes": false,
  "properties": true,
  "page-preview": true,
  "daily-notes": true,
  "templates": true,
  "note-composer": true,
  "command-palette": true,
  "slash-command": false,
  "editor-status": true,
  "bookmarks": true,
  "markdown-importer": false,
  "zk-prefixer": false,
  "random-note": false,
  "outline": true,
  "word-count": true,
  "slides": false,
  "audio-recorder": false,
  "workspaces": false,
  "file-recovery": true,
  "publish": false,
  "sync": true,
  "bases": true,
  "webviewer": false
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\manifest.json

```json
{
	"id": "obsidian-latex-suite",
	"name": "Latex Suite",
	"version": "1.11.5",
	"minAppVersion": "1.0.0",
	"description": "Make typesetting LaTeX math as fast as handwriting through snippets, text expansion, and editor enhancements",
	"author": "artisticat",
	"authorUrl": "https://github.com/artisticat1",
	"fundingUrl": "https://ko-fi.com/artisticat",
	"isDesktopOnly": false
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-latex-suite\styles.css

```css
/* Settings panel */

.setting-item.hidden {
    display: none;
}

.setting-item.setting-item-heading .latex-suite-settings-icon {
    margin-right: var(--size-4-2);
    display: inline-flex;
}

.setting-item.setting-item-heading:has(.latex-suite-settings-icon) {
    border-bottom: 1px solid var(--background-modifier-border);
}

.setting-item.setting-item-heading:has(.latex-suite-settings-icon) + .setting-item {
    border-top: none;
}

.setting-item.setting-item-heading:has(.latex-suite-settings-icon) ~ .setting-item:not(.setting-item-heading), .latex-suite-snippet-variables-setting + .setting-item-control {
    width: calc(100% - 26px);
    margin-left: 26px;
}

.latex-suite-snippet-variables-setting .setting-item-control {
    height: 120px;
}

.latex-suite-snippet-variables-setting .setting-item-control textarea {
    width: 100%;
    height: 100%;
}

.snippets-text-area, .latex-suite-snippet-variables-setting {
    display: inline-block;
}

.snippets-text-area .setting-item-info, .latex-suite-snippet-variables-setting .setting-item-info {
    margin-bottom: 0.75rem;
}

.snippets-text-area .setting-item-control {
    flex-direction: column;
    align-items: flex-end;
}

.snippets-editor-wrapper {
    width: 100%;
    margin-bottom: 0.75rem;
}

.snippets-editor-wrapper .cm-editor {
    border: 1px solid var(--background-modifier-border);
    border-radius: 4px;
    font-size: var(--font-inputs);
    height: 20em;
    outline: none !important;
    text-align: left;
}

.snippets-editor-wrapper .cm-line, .snippets-editor-wrapper .cm-lineNumbers {
    font-family: var(--font-monospace);
}

.snippets-footer {
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.snippets-editor-validity {
    display: flex;
    align-items: center;
}

.snippets-editor-validity-indicator {
    color: white;
    display: inline-block;
    border-radius: 1em;
    margin-right: 10px;
    cursor: default;
    visibility: hidden;
}

.snippets-editor-validity-indicator svg {
    width: 16px !important;
    height: 16px !important;
}

.snippets-editor-validity-indicator:hover {
    color: white;
}

.snippets-editor-validity-indicator.valid {
    background-color: var(--color-green);
    visibility: visible;
}

.snippets-editor-validity-indicator.invalid {
    background-color: var(--color-red);
    visibility: visible;
}

.snippets-editor-buttons {
    display: flex;
    flex-direction: row;
}

.latex-suite-confirmation-modal .setting-item {
    border: none;
}

.search-input-container input.latex-suite-location-input-el {
    width: initial;
}

/*
Snippet color classes.
*/

/* These extra selectors enforce their color on all children, because CodeMirror does weird nesting of spans when
nesting multiple decorations. */

.latex-suite-snippet-placeholder {
    border-radius: 2px;
    background-color: var(--placeholder-bg);
    outline: var(--placeholder-outline) solid 1px;
}

.latex-suite-snippet-placeholder-0, span.latex-suite-snippet-placeholder-0 span {
    --placeholder-bg: #87cefa2e;
    --placeholder-outline: #87cefa6e;
}

.theme-dark .latex-suite-snippet-placeholder-0, span.latex-suite-snippet-placeholder-0 span {
    --placeholder-outline: #87cefa43;
}

.latex-suite-snippet-placeholder-1, span.latex-suite-snippet-placeholder-1 span {
    --placeholder-bg: #ffa50033;
    --placeholder-outline: #ffa5006b;
}

.theme-dark .latex-suite-snippet-placeholder-1, span.latex-suite-snippet-placeholder-1 span {
    --placeholder-outline: #ffa5004d;
}

.latex-suite-snippet-placeholder-2, span.latex-suite-snippet-placeholder-2 span {
    --placeholder-bg: #00ff0022;
    --placeholder-outline: #00ff0060;
}

.theme-dark .latex-suite-snippet-placeholder-2, span.latex-suite-snippet-placeholder-2 span {
    --placeholder-outline: #00ff003d;
}


/* Conceal */

span.cm-math.cm-concealed-bold {
    font-weight: bold;
}

span.cm-math.cm-concealed-underline {
    text-decoration: underline;
}

span.cm-math.cm-concealed-mathrm, sub.cm-math.cm-concealed-mathrm {
    font-style: normal;
}


/* Conceal superscripts without changing line height */
sup.cm-math {
    line-height: 0;
}

sup.cm-math, sub.cm-math {
    font-style: italic;
}


/* Inline math tooltip styling */

.theme-light .cm-tooltip.cm-tooltip-cursor {
    box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.028), 0px 3.4px 6.7px rgba(0, 0, 0, .042), 0px 5px 20px rgba(0, 0, 0, .07);
}

.theme-dark .cm-tooltip.cm-tooltip-cursor {
    box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.1),
    0px 3.4px 6.7px rgba(0, 0, 0, 0.15),
    0px 0px 30px rgba(0, 0, 0, 0.27);
}
/* CM6 puts the top of the tooltip higher than what's viewable (negative top value),
so to compensate for this, we align the content to the bottom of the tooltip container,
and limit the height.
*/
.cm-tooltip.cm-tooltip-cursor.cm-tooltip-above {
	display: flex;
}

.cm-tooltip.cm-tooltip-cursor.cm-tooltip-above > .MathJax {
	overflow-y: auto;
	max-height: 70%;
	display: inline-block;
	align-self: flex-end;
}

.cm-tooltip.cm-tooltip-cursor.cm-tooltip-below > .MathJax {
	overflow-y: auto;
	max-height: 90%;
}
/* Highlight brackets */
.theme-light .latex-suite-highlighted-bracket, .theme-light .latex-suite-highlighted-bracket [class^="latex-suite-color-bracket-"] {
    background-color: hsl(var(--accent-h), var(--accent-s), 40%, 0.3);
}

.theme-dark .latex-suite-highlighted-bracket, .theme-dark .latex-suite-highlighted-bracket [class^="latex-suite-color-bracket-"] {
    background-color: hsl(var(--accent-h), var(--accent-s), 70%, 0.6);
}


/* Color matching brackets */

.theme-light .latex-suite-color-bracket-0, .theme-light .latex-suite-color-bracket-0 .cm-bracket {
    color: #527aff;
}

.theme-dark .latex-suite-color-bracket-0, .theme-dark .latex-suite-color-bracket-0 .cm-bracket {
    color: #47b8ff;
}

.theme-light .latex-suite-color-bracket-1, .theme-light .latex-suite-color-bracket-1 .cm-bracket {
    color: #ff50b7;
}

.theme-dark .latex-suite-color-bracket-1, .theme-dark .latex-suite-color-bracket-1 .cm-bracket {
    color: #ff55cd;
}

.theme-light .latex-suite-color-bracket-2, .theme-light .latex-suite-color-bracket-2 .cm-bracket {
    color: #69ba00;
}

.theme-dark .latex-suite-color-bracket-2, .theme-dark .latex-suite-color-bracket-2 .cm-bracket {
    color: #73ff63;
}

/* .latex-suite-color-bracket-3 {
    color: #8de15c;
} */

.latex-suite-math-preview-highlight {
	background-color: var(--text-selection);
}
.cm-snippetFieldPosition {
    vertical-align: text-top;
    width: 0;
    height: 1.15em;
    display: inline-block;
    margin: 0 -0.7px -.7em;
    border-left: 1.4px dotted #888;
  }
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\manifest.json

```json
{
	"id": "obsidian-plantuml",
	"name": "PlantUML",
	"version": "1.8.0",
	"minAppVersion": "1.5.7",
	"description": "Render PlantUML Diagrams",
	"author": "Johannes Theiner",
	"authorUrl": "https://github.com/joethei/",
	"isDesktopOnly": false
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\obsidian-plantuml\styles.css

```css
.puml-settings-area {
    margin-left: 5px;
    margin-right: 5px;
    font-size: 14px;
    width: 100%;
}

.plantuml-source-view .cm-activeLine {
    background-color: unset !important;
}

.plantuml-source-view .cm-gutters {
    background-color: unset !important;
}

.plantuml-source-view .cm-cursor {
    border-left: 1.2px solid var(--text-muted);
}

.plantuml-source-view .cm-selectionBackground {
    background-color: var(--text-selection) !important;
}

.puml-loading {
    color: var(--text-accent);
}

.internal-embed.file-embed[src$=".puml"] {
    display: none;
}

.internal-embed.file-embed[src$=".pu"] {
    display: none;
}

.puml-error {
    color: var(--text-error);
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\data.json

```json
{
  "installed_at": 1776551359891,
  "last_version": "4.3.0"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\manifest.json

```json
{
  "id": "smart-connections",
  "name": "Smart Connections",
  "author": "Brian Petro",
  "description": "Chat with your notes & see links to related content with Local or Remote models.",
  "minAppVersion": "1.1.0",
  "authorUrl": "https://smartconnections.app",
  "isDesktopOnly": false,
  "version": "4.3.0"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-connections\styles.css

```css
/* deprecated positioning, use bottom bar instead */
.view-content > .sc-brand {
  position: fixed;
  bottom: 0;
  right: 0;
  background-color: var(--titlebar-background);
}

.sc-brand {
  > svg,
  > p {
    display: inline;
    margin: 0 0.1rem 0 0.3rem;
    color: var(--text-muted);
    font-size: var(--font-smallest);
    line-height: 1;
    height: 0.88rem;
    width: auto;
  }

  > p > a {
    color: var(--text-muted);
  }
}

.sc-list {
  padding-bottom: 20px;

  .tree-item-self {
    cursor: pointer;

    small {
      color: var(--color-gray-40);
    }
  }

  > .sc-collapsed ul {
    display: none;
  }

  > .sc-collapsed span svg {
    transform: rotate(-90deg);
  }

  > :not(.sc-collapsed) span svg {
    transform: rotate(0deg);
  }

  > div {
    span svg {
      height: auto;
      margin: auto 0.5em auto 0;
      flex: none;
    }

    > span {
      display: inline-flex;
      width: 100%;
      padding-left: 0;
    }

    ul {
      margin: 0;
      padding-left: 1.3rem;
    }

    > a {
      display: block;
    }

    > ul > li {
      display: block;
    }
  }
  .sc-result {
    > ul {
      list-style: none;
      padding-left: 0;
    }
  }

  .sc-result.sc-result-plaintext {
    font-size: var(--font-ui-smaller);
    line-height: var(--line-height-tight);
    background-color: var(--search-result-background);
    border-radius: var(--radius-s);
    overflow: hidden;
    margin: var(--size-4-1) 0 var(--size-4-2);
    color: var(--text-muted);
    box-shadow: 0 0 0 1px var(--background-modifier-border);

    & > * li {
      cursor: var(--cursor);
      position: relative;
      padding: var(--size-4-2) var(--size-4-5) var(--size-4-2) var(--size-4-3);
      white-space: pre-wrap;
      width: 100%;
      border-bottom: 1px solid var(--background-modifier-border);
    }
  }

  .sc-result:not(.sc-result-plaintext) {
    cursor: pointer;
    padding: var(--nav-item-padding);
    padding-left: 0;
    margin-bottom: 1px;
    align-items: baseline;
    border-radius: var(--radius-s);
    font-weight: var(--nav-item-weight);

    &:hover {
      color: var(--nav-item-color-active);
      background-color: var(--nav-item-background-active);
      font-weight: var(--nav-item-weight-active);
    }

    span {
      color: var(--h5-color);
    }

    small {
      color: var(--h5-color);
      font-size: 0.8rem;
      font-weight: 500;
    }

    p {
      margin-top: 0.3rem;
      margin-bottom: 0.3rem;
    }

    ul > li {
      h1 {
        font-size: 1.3rem;
      }

      h2 {
        font-size: 1.25rem;
      }

      h3 {
        font-size: 1.2rem;
      }

      h4 {
        font-size: 1.15rem;
      }

      h5 {
        font-size: 1.1rem;
      }

      h6 {
        font-size: 1.05rem;
      }

      h1,
      h2,
      h3,
      h4,
      h5,
      h6 {
        margin-block-start: calc(var(--p-spacing)/2);
        margin-block-end: calc(var(--p-spacing)/2);
      }
    }
  }
} /* end .sc-list */

/* Only on right sidebar */
.mod-right-split .sc-list .sc-result {
  font-size: var(--font-text-size);
  font-size: 0.88rem;
}

.sc-top-bar {
  display: flex;
  width: 100%;
  justify-content: end;

  .sc-context {
    color: var(--nav-item-color);
    font-size: var(--nav-item-size);
    margin: 0.5em 0.5em 1em;
    width: 100%;
  }
}

/* Chat */
.sc-chat-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: flex-end;
  height: 100%;

  .sc-top-bar-container {
    align-self: flex-end;
    display: flex;
    width: 100%;

    .sc-chat-name-input {
      flex-grow: 1;
      min-width: 20px;
    }
  }

  .sc-thread {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    height: 100%;
    width: 100%;
    overflow: hidden;
    user-select: text;
    overflow-y: auto;

    .sc-message-container {
      border: 1px solid var(--divider-color);
      border-radius: 10px;
      margin: 0.5rem 0;
      display: flex;
      flex-direction: column;
      align-items: flex-start;
      width: 100%;
      height: 100%;
      overflow-y: auto;
      background-color: var(--background-primary-alt);

      .sc-message {
        max-width: 90ch;
        width: 90%;
        margin: 10px;
        padding: 10px;
        border-radius: 1.5rem;
        word-break: break-word;

        &.user {
          align-self: flex-end;
          color: var(--text-normal);
          background-color: var(--background-primary);
        }

        &.assistant,
        &.system {
          background-color: var(--background-primary-alt);
          color: var(--text-normal);
        }

        .sc-message-content {
          margin: 0;
          padding: 1rem;

          > * p {
            margin: 0;
          }
        }
      }
    }

    .sc-chat-form {
      display: flex;
      padding: 0 10px 1rem 0;
      width: 100%;
      max-height: 50%;

      .sc-chat-input {
        flex-grow: 1;
        padding: 0.88rem;
        border: none;
        border-radius: 1.5rem;
        resize: none;
        height: auto;
        min-height: 4.2lh;
        max-height: 100%;
        background-color: var(--background-primary);
        color: var(--text-normal);
        margin-right: -2.7rem;
        padding-right: 3rem;
      }

      .sc-btn-container {
        width: 2rem;
        height: 2rem;
        margin: auto;

        > button.send-button {
          border-radius: 99999px;
          cursor: pointer;
          outline: 2px solid transparent;
          padding: 0;
          outline-offset: 2px;
          background: none !important;

          &:focus-visible {
            outline-color: var(--text-faint);
            box-shadow: none;
          }

          > svg {
            > circle {
              fill: var(--text-faint);
            }
            > path {
              fill: var(--background-primary);
            }
          }
        }
      }
    }
  }

  #settings {
    display: flex;
    flex-direction: column;
    max-width: 100%;
    width: 100%;
  }
}

.sc-system {
  align-self: center;
  font-style: italic;
  color: var(--text-faint);
}

.sc-msg-button {
  cursor: pointer;
  float: right;
  margin-left: 5px;
  opacity: 0.8;

  &.cycle-branch {
    float: left;
    display: flex;
  }

  &:hover {
    opacity: 1;
  }
}

#sc-abort-button {
  cursor: pointer;
  padding: 10px;
  border-radius: 5px;

  &:hover {
    background-color: var(--background-primary);
  }
}

.markdown-source-view.mod-cm6 .cm-embed-block:not(.cm-table-widget):hover:has(.sc-change) {
  overflow: unset;
  box-shadow: unset;
  cursor: unset;
}

.notice .sc-notice-actions {
  display: flex;
  justify-content: space-between;
  flex-direction: row-reverse;
}

.sc-chat-container {
  #settings {
    display: flex;
    flex-direction: column;
    max-width: 100%;
    width: 100%;
  }

  .sc-config-error-notice {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 10px;
    background-color: #ffcccc;
    border: 1px solid #ff0000;
    border-radius: 5px;
    margin: 10px 0;
    font-size: 14px;
    font-weight: bold;
    color: #ff0000;
    width: 100%;

    span {
      flex-grow: 1;
    }

    button {
      margin-left: 10px;
    }
  }
}

.sc-bottom-bar {
  position: absolute;
  bottom: 0;
  right: 0;
  left: 0;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: var(--titlebar-background);
  padding: 0 0.5rem;

  .sc-brand {
    flex-shrink: 0;
  }

  .sc-context {
    flex-grow: 1;
    font-size: var(--font-smallest);
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
  }
}

.setting-component[data-setting*="/"][data-setting*="api_key"] {
  display: none;
}

.setting-component[data-setting*="gpu"]:not([data-setting*="/"]) {
  display: none;
}

/* SINCE COMPONENT PATTERN SETTINGS */

.setting-component[data-setting="smart_change.active"] {
  display: none;
}

.group-header {
  display: flex;
  text-wrap: nowrap;
  flex-wrap: wrap;
  align-items: baseline;

  > h2 {
    width: 100%;
    margin-bottom: 0;
  }

  > * {
    flex-grow: 1;
    margin-bottom: 10px;
  }
}

/* SMART CHAT v2 */
.sc-context-list {
  list-style: none;
  margin: 0;
  padding: 0 1rem 1rem;
  display: none;
  flex-direction: column;
  gap: 0.5rem;
}

.sc-context-header[aria-expanded="true"] + .sc-context-list {
  display: flex;
}

.sc-context-header[aria-expanded="false"] + .sc-context-list {
  display: none;
}

.sc-context-toggle-icon {
  margin-left: 0.5rem;
  transition: transform 0.3s ease;
}

.sc-context-header[aria-expanded="true"] .sc-context-toggle-icon {
  transform: rotate(180deg);
}

.sc-context-container {
  border: 1px solid var(--divider-color);
  border-radius: 10px;
  margin: 0.5rem 0;
  background-color: var(--background-primary-alt);
  overflow: auto;
  max-width: 95%;
  margin: 10px;
  flex-shrink: 0;

  .sc-context-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0.88rem 1rem;
    background-color: var(--background-primary);
    color: var(--text-muted);
    font-weight: var(--font-medium);
    cursor: pointer;
    user-select: none;
  
    &:hover {
      background-color: var(--background-primary-hover);
    }
  
    &:focus {
      outline: 2px solid var(--text-muted);
      outline-offset: 2px;
    }
  }
}


.sc-context-item {
  padding: 0.5rem;
  border-radius: var(--radius-s);
  background-color: var(--background-secondary);
  color: var(--text-normal);
  display: flex;
  justify-content: space-between;
  align-items: baseline;
  font-size: var(--font-smallest);
  flex-wrap: wrap;

  &:hover {
    background-color: var(--background-secondary-hover);
  }
}

.sc-context-item-path {
  font-weight: var(--font-medium);
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
  max-width: 70%;
}

.sc-context-item-score {
  font-size: var(--font-small);
  color: var(--color-gray-40);
}

/* Tool Calls Component Styles */
.sc-tool-calls-container {
  border: 1px solid var(--divider-color);
  border-radius: 10px;
  margin: 0.5rem 0;
  background-color: var(--background-primary-alt);
  overflow: auto;
  max-width: 95%;
  margin: 10px;
  flex-shrink: 0;
}

.sc-tool-call {
  margin-bottom: 0.5rem;

  &:last-child {
    margin-bottom: 0;
  }
}

.sc-tool-call-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0.88rem 1rem;
  background-color: var(--background-primary);
  color: var(--text-muted);
  font-weight: var(--font-medium);
  cursor: pointer;
  user-select: none;

  &:hover {
    background-color: var(--background-primary-hover);
  }

  &:focus {
    outline: 2px solid var(--text-muted);
    outline-offset: 2px;
  }

  &[aria-expanded="true"] .sc-tool-call-toggle-icon {
    transform: rotate(180deg);
  }
}

.sc-tool-call-content {
  padding: 0.5rem 1rem;
  background-color: var(--background-secondary);
  font-size: var(--font-smallest);

  pre {
    margin: 0;
    white-space: pre-wrap;
    word-break: break-word;
  }

  code {
    font-family: var(--font-monospace);
  }
}

/* Hide content when collapsed */
.sc-tool-call-header[aria-expanded="false"] + .sc-tool-call-content {
  display: none;
}

/* Show content when expanded */
.sc-tool-call-header[aria-expanded="true"] + .sc-tool-call-content {
  display: block;
}

/* System Message Styles */
.sc-system-message-container {
  margin: 1rem 0;
  border: 1px solid var(--background-modifier-border);
  border-radius: 6px;
  background: var(--background-secondary);
  flex-shrink: 0;
}

.sc-system-message-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0.75rem 1rem;
  cursor: pointer;
  font-weight: 500;
  border-bottom: 1px solid transparent;
  transition: background-color 0.2s ease;

  &:hover {
    background: var(--background-modifier-hover);
  }

  span {
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }

  .sc-system-message-toggle-icon {
    transition: transform 0.2s ease;
  }

  &[aria-expanded="true"] {
    border-bottom-color: var(--background-modifier-border);
  }
}

.sc-system-message-content {
  padding: 1rem;
  position: relative;
  background: var(--background-primary);
  border-bottom-left-radius: 6px;
  border-bottom-right-radius: 6px;

  .sc-system-message-text {
    font-family: var(--font-monospace);
    white-space: pre-wrap;
    word-break: break-word;
    margin-right: 2rem;
  }

  .sc-system-message-copy {
    position: absolute;
    top: 1rem;
    right: 1rem;
    padding: 0.4rem;
    background: transparent;
    border: none;
    cursor: pointer;
    opacity: 0.6;
    transition: opacity 0.2s ease;

    &:hover {
      opacity: 1;
    }

    &.sc-copied {
      color: var(--text-accent);
    }
  }
}

.sc-chat-container {
  .smart-chat-overlay {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: var(--background-primary-alt);
    z-index: 100;
    overflow: auto;

    .smart-chat-overlay-header {
      display: flex;
      justify-content: flex-end;
    }
    .setting-item {
      flex-direction: column;
      align-items: flex-start;
    }
  }
}

.sc-typing-indicator {
  display: flex;
  align-items: center;
  padding: 12px 16px;
  display: none;

  &.visible {
    display: flex;
  }

  .sc-typing-dots {
    display: flex;
    gap: 4px;

    .sc-typing-dot {
      width: 8px;
      height: 8px;
      background: var(--text-muted);
      border-radius: 50%;
      animation: typing-bounce 1.4s infinite ease-in-out;

      &:nth-child(1) {
        animation-delay: 0s;
      }

      &:nth-child(2) {
        animation-delay: 0.2s;
      }

      &:nth-child(3) {
        animation-delay: 0.4s;
      }
    }
  }

}
/* keyframes must be at root level */
@keyframes typing-bounce {
  0%,
  80%,
  100% {
    transform: scale(0.6);
  }
  40% {
    transform: scale(1);
  }
}


/* Lookup */
#sc-lookup-view {
  .sc-container {
    .sc-textarea-container {
      display: flex;
      padding: 0 10px 1rem 0;
      width: 100%;
      max-height: 50%;

      > textarea {
        flex-grow: 1;
        padding: 0.88rem;
        border: none;
        border-radius: 1.5rem;
        resize: none;
        height: auto;
        min-height: 4.2lh;
        max-height: 100%;
        background-color: var(--background-primary);
        color: var(--text-normal);
        margin-right: -2.7rem;
        padding-right: 3rem;
      }
      .sc-textarea-btn-container {
        width: 2rem;
        height: 2rem;
        margin: auto;

        > button.send-button {
          border-radius: 99999px;
          cursor: pointer;
          outline: 2px solid transparent;
          padding: 0;
          outline-offset: 2px;
          background: none !important;

          &:focus-visible {
            outline-color: var(--text-faint);
            box-shadow: none;
          }

          > svg {
            > circle {
              fill: var(--text-faint);
            }
            > path {
              fill: var(--background-primary);
            }
          }
        }
      }
    }
  }
}

/* Side Panes */
div.workspace-leaf-content[data-type^="smart-"] {
  > .view-content {
    display: flex;
    flex-direction: column;
  }
}

.sc-inline-confirm-row {
  margin-top: 10px;
  padding: 6px;
  border: 1px solid var(--interactive-normal);
}
.sc-inline-confirm-row-buttons {
  display: flex;
  justify-content: flex-end;
  gap: 10px;
  margin-top: 10px;

  & .sc-inline-confirm-yes {
    font-weight: bold;
  }
  & .sc-inline-confirm-cancel {
    font-weight: normal;
  }
}

.sc-story-modal {
  width: 80% !important;
  height: 80% !important;
}
.sc-story-container {
  display: flex;
  flex-direction: column;
  height: 100%;
}

.sc-other-plugins {
  display: flex;
  flex-direction: column;
  gap: 10px;
  margin-top: 20px;

  button {
    padding: 10px;
    border-radius: var(--radius-s);
    background-color: var(--background-primary);
    color: var(--text-normal);
    border: none;
    cursor: pointer;
    font-size: var(--font-small);

    &:hover {
      background-color: var(--background-primary-hover);
    }
  }
}


/* Connections results */
a.sc-result-file-title {
    text-decoration: none !important;
}

a.sc-result-file-title > .sc-score {
  display: inline-block;
  width: auto;
  height: 1.7em;
  padding: 0 0.3em;
  line-height: 1.7em;
  text-align: center;
  font-weight: 600 !important;
  font-size: 0.8em !important;
  color: var(--nav-item-color) !important;
  background: var(--background-modifier-hover);
  border-radius: 6px;
}

a.sc-result-file-title > .sc-path {
    margin-right: -3px;
}

a.sc-result-file-title > .sc-path,
a.sc-result-file-title > .sc-title {
    font-weight: bold !important;
    text-decoration: underline;
}


a.sc-result-file-title > .sc-breadcrumb:not(.sc-path, .sc-title, .sc-score) {
    font-style: italic;
}

a.sc-result-file-title > .sc-breadcrumb-separator {
    color: color-mix(in srgb, var(--text-normal) 50%, transparent) !important;
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\data.json

```json
{
  "last_version": "0.1.3"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\manifest.json

```json
{
  "id": "smart-lookup",
  "name": "Smart Lookup",
  "author": "Brian Petro",
  "description": "Query-first semantic search for your Obsidian vault.",
  "minAppVersion": "1.1.0",
  "authorUrl": "https://smartconnections.app",
  "isDesktopOnly": false,
  "version": "0.1.3"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\smart-lookup\styles.css

```css
/* global styles */

/* below needs review since not scoped */
div.workspace-leaf-content[data-type^="smart-"] {
  > .view-content {
    display: flex;
    flex-direction: column;
  }
}
.sc-no-results {
  color: var(--text-muted);
  margin-top: 0.75rem;
}
/* end to-review */
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\manifest.json

```json
{
    "id": "templater-obsidian",
    "name": "Templater",
    "version": "2.19.0",
    "description": "Create and use templates",
    "minAppVersion": "1.12.2",
    "author": "SilentVoid",
    "authorUrl": "https://github.com/SilentVoid13",
    "helpUrl": "https://silentvoid13.github.io/Templater/",
    "isDesktopOnly": false
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\plugins\templater-obsidian\styles.css

```css
.templater_search {
    width: calc(100% - 20px);
}

.templater_div {
    border-top: 1px solid var(--background-modifier-border);
}

.templater_div > .setting-item {
    border-top: none !important;
    align-self: center;
}

.templater_div > .setting-item > .setting-item-control {
    justify-content: space-around;
    padding: 0;
    width: 100%;
}

.templater_div
    > .setting-item
    > .setting-item-control
    > .setting-editor-extra-setting-button {
    align-self: center;
}

.templater_donating {
    margin: 10px;
}

.templater_title {
    margin: 0;
    padding: 0;
    margin-top: 5px;
    text-align: center;
}

.templater_template {
    align-self: center;
    margin-left: 5px;
    margin-right: 5px;
    width: 70%;
}

.templater_cmd {
    margin-left: 5px;
    margin-right: 5px;
    font-size: 14px;
    width: 100%;
}

.templater_div2 > .setting-item {
    align-content: center;
    justify-content: center;
}

.templater-prompt-div,
.templater-multisuggester-div {
    display: flex;
}

.templater-prompt-form {
    display: flex;
    flex-grow: 1;
}

.templater-prompt-input,
.templater-multisuggester-input {
    flex-grow: 1;
}

.templater-button-div {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 1rem;
}

textarea.templater-prompt-input {
    height: 10rem;
}

textarea.templater-prompt-input:focus {
    border-color: var(--interactive-accent);
}

.templater-multisuggester-list {
    margin: 1.5em 0;
}

.cm-s-obsidian .templater-command-bg {
    left: 0px;
    right: 0px;
    background-color: var(--background-primary-alt);
}

.cm-s-obsidian .cm-templater-command {
    font-size: 0.85em;
    font-family: var(--font-monospace);
    line-height: 1.3;
}

.cm-s-obsidian .templater-inline .cm-templater-command {
    background-color: var(--background-primary-alt);
}

.cm-s-obsidian .cm-templater-command.cm-templater-opening-tag {
    font-weight: bold;
}

.cm-s-obsidian .cm-templater-command.cm-templater-closing-tag {
    font-weight: bold;
}

.cm-s-obsidian .cm-templater-command.cm-templater-interpolation-tag {
    color: var(--code-property, #008bff);
}

.cm-s-obsidian .cm-templater-command.cm-templater-execution-tag {
    color: var(--code-function, #c0d700);
}

.cm-s-obsidian .cm-templater-command.cm-keyword {
    color: var(--code-keyword, #00a7aa);
    font-weight: normal;
}

.cm-s-obsidian .cm-templater-command.cm-atom {
    color: var(--code-normal, #f39b35);
}

.cm-s-obsidian .cm-templater-command.cm-value,
.cm-s-obsidian .cm-templater-command.cm-number,
.cm-s-obsidian .cm-templater-command.cm-type {
    color: var(--code-value, #a06fca);
}

.cm-s-obsidian .cm-templater-command.cm-def,
.cm-s-obsidian .cm-templater-command.cm-type.cm-def {
    color: var(--code-normal, var(--text-normal));
}

.cm-s-obsidian .cm-templater-command.cm-property,
.cm-s-obsidian .cm-templater-command.cm-property.cm-def,
.cm-s-obsidian .cm-templater-command.cm-attribute {
    color: var(--code-function, #98e342);
}

.cm-s-obsidian .cm-templater-command.cm-variable,
.cm-s-obsidian .cm-templater-command.cm-variable-2,
.cm-s-obsidian .cm-templater-command.cm-variable-3,
.cm-s-obsidian .cm-templater-command.cm-meta {
    color: var(--code-property, #d4d4d4);
}

.cm-s-obsidian .cm-templater-command.cm-callee,
.cm-s-obsidian .cm-templater-command.cm-operator,
.cm-s-obsidian .cm-templater-command.cm-qualifier,
.cm-s-obsidian .cm-templater-command.cm-builtin {
    color: var(--code-operator, #fc4384);
}

.cm-s-obsidian .cm-templater-command.cm-tag {
    color: var(--code-tag, #fc4384);
}

.cm-s-obsidian .cm-templater-command.cm-comment,
.cm-s-obsidian .cm-templater-command.cm-comment.cm-tag,
.cm-s-obsidian .cm-templater-command.cm-comment.cm-attribute {
    color: var(--code-comment, #696d70);
}

.cm-s-obsidian .cm-templater-command.cm-string,
.cm-s-obsidian .cm-templater-command.cm-string-2 {
    color: var(--code-string, #e6db74);
}

.cm-s-obsidian .cm-templater-command.cm-header,
.cm-s-obsidian .cm-templater-command.cm-hr {
    color: var(--code-keyword, #da7dae);
}

.cm-s-obsidian .cm-templater-command.cm-link {
    color: var(--code-normal, #696d70);
}

.cm-s-obsidian .cm-templater-command.cm-error {
    border-bottom: 1px solid #c42412;
}

.CodeMirror-hints {
    position: absolute;
    z-index: 10;
    overflow: hidden;
    list-style: none;

    margin: 0;
    padding: 2px;

    -webkit-box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
    -moz-box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
    box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
    border-radius: 3px;
    border: 1px solid silver;

    background: white;
    font-size: 90%;
    font-family: monospace;

    max-height: 20em;
    overflow-y: auto;
}

.CodeMirror-hint {
    margin: 0;
    padding: 0 4px;
    border-radius: 2px;
    white-space: pre;
    color: black;
    cursor: pointer;
}

li.CodeMirror-hint-active {
    background: #08f;
    color: white;
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\.obsidian\workspace.json

```json
{
  "main": {
    "id": "1a868e94aa524549",
    "type": "split",
    "children": [
      {
        "id": "52e18f8e80000c26",
        "type": "tabs",
        "children": [
          {
            "id": "4a66a51de80f3a25",
            "type": "leaf",
            "state": {
              "type": "markdown",
              "state": {
                "file": "apps/docs/README.md",
                "mode": "source",
                "source": false
              },
              "icon": "lucide-file",
              "title": "README"
            }
          }
        ]
      }
    ],
    "direction": "vertical"
  },
  "left": {
    "id": "4fca31d1c37be1ed",
    "type": "split",
    "children": [
      {
        "id": "ce3e17ce52563bcb",
        "type": "tabs",
        "children": [
          {
            "id": "057780b15466bf94",
            "type": "leaf",
            "state": {
              "type": "file-explorer",
              "state": {
                "sortOrder": "alphabetical",
                "autoReveal": false
              },
              "icon": "lucide-folder-closed",
              "title": "Explorador de arquivos"
            }
          },
          {
            "id": "154580e96a0829a5",
            "type": "leaf",
            "state": {
              "type": "search",
              "state": {
                "query": "",
                "matchingCase": false,
                "explainSearch": false,
                "collapseAll": false,
                "extraContext": false,
                "sortOrder": "alphabetical"
              },
              "icon": "lucide-search",
              "title": "Procurar"
            }
          },
          {
            "id": "b17d6eb933b6b0e9",
            "type": "leaf",
            "state": {
              "type": "bookmarks",
              "state": {},
              "icon": "lucide-bookmark",
              "title": "Marcadores"
            }
          }
        ]
      }
    ],
    "direction": "horizontal",
    "width": 300
  },
  "right": {
    "id": "e8f7e15d44fc0001",
    "type": "split",
    "children": [
      {
        "id": "a0299481bebf3645",
        "type": "tabs",
        "children": [
          {
            "id": "117471c181b434c3",
            "type": "leaf",
            "state": {
              "type": "backlink",
              "state": {
                "collapseAll": false,
                "extraContext": false,
                "sortOrder": "alphabetical",
                "showSearch": false,
                "searchQuery": "",
                "backlinkCollapsed": false,
                "unlinkedCollapsed": true
              },
              "icon": "links-coming-in",
              "title": "Links inversos"
            }
          },
          {
            "id": "269fce73c93b97f9",
            "type": "leaf",
            "state": {
              "type": "outgoing-link",
              "state": {
                "linksCollapsed": false,
                "unlinkedCollapsed": true
              },
              "icon": "links-going-out",
              "title": "Links de saída"
            }
          },
          {
            "id": "1f653aef67488ae1",
            "type": "leaf",
            "state": {
              "type": "tag",
              "state": {
                "sortOrder": "frequency",
                "useHierarchy": true,
                "showSearch": false,
                "searchQuery": ""
              },
              "icon": "lucide-tags",
              "title": "Etiquetas"
            }
          },
          {
            "id": "e629e7051415997d",
            "type": "leaf",
            "state": {
              "type": "all-properties",
              "state": {
                "sortOrder": "frequency",
                "showSearch": false,
                "searchQuery": ""
              },
              "icon": "lucide-archive",
              "title": "Todas as propriedades"
            }
          },
          {
            "id": "8d2c4a6dc59b3abd",
            "type": "leaf",
            "state": {
              "type": "outline",
              "state": {
                "followCursor": false,
                "showSearch": false,
                "searchQuery": ""
              },
              "icon": "lucide-list",
              "title": "Sumário"
            }
          },
          {
            "id": "46c3c3c3eced067b",
            "type": "leaf",
            "state": {
              "type": "smart-connections-view",
              "state": {},
              "icon": "smart-connections",
              "title": "Connections"
            }
          },
          {
            "id": "ba07d6aaf196b924",
            "type": "leaf",
            "state": {
              "type": "smart-lookup-view",
              "state": {},
              "icon": "smart-lookup",
              "title": "Lookup"
            }
          },
          {
            "id": "f8e81a83d23c5ada",
            "type": "leaf",
            "state": {
              "type": "copilot-chat-view",
              "state": {},
              "icon": "message-square",
              "title": "Copilot"
            }
          }
        ],
        "currentTab": 5
      }
    ],
    "direction": "horizontal",
    "width": 549.5
  },
  "left-ribbon": {
    "hiddenItems": {
      "switcher:Abrir a troca rápida": false,
      "graph:Abrir visualização em gráfico": false,
      "canvas:Criar novo canvas": false,
      "daily-notes:Abrir a nota de hoje": false,
      "templates:Inserir modelo": false,
      "command-palette:Abrir paleta de comandos": false,
      "bases:Criar nova base": false,
      "smart-connections:Smart Connections: Open connections view": false,
      "smart-connections:Smart Connections: Open random connection": false,
      "smart-lookup:Smart Lookup: Open lookup view": false,
      "copilot:Open Copilot Chat": false
    }
  },
  "active": "46c3c3c3eced067b",
  "lastOpenFiles": [
    "README.md",
    "copilot/copilot-custom-prompts/Translate to Chinese.md",
    "copilot/copilot-custom-prompts/Summarize.md",
    "copilot/copilot-custom-prompts/Simplify.md",
    "copilot/copilot-custom-prompts/Rewrite as tweet.md",
    "copilot/copilot-custom-prompts/Remove URLs.md",
    "copilot/copilot-custom-prompts/Make longer.md",
    "copilot/copilot-custom-prompts/Generate glossary.md",
    "copilot/copilot-custom-prompts/Clip Web Page.md",
    "copilot/copilot-conversations/Olá@20260418_184821.md",
    "copilot/copilot-conversations",
    "copilot/copilot-custom-prompts/Clip YouTube Transcript.md",
    "copilot/copilot-custom-prompts/Rewrite as tweet thread.md",
    "copilot/copilot-custom-prompts/Generate table of contents.md",
    "copilot/copilot-custom-prompts/Make shorter.md",
    "copilot/copilot-custom-prompts/Emojify.md",
    "copilot/copilot-custom-prompts/Explain like I am 5.md",
    "copilot/copilot-custom-prompts/Fix grammar and spelling.md",
    "copilot/copilot-custom-prompts",
    "copilot"
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\gradlew.bat

```bat
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\project.json

```json
{
  "$schema": "../../node_modules/nx/schemas/project-schema.json",
  "name": "backend",
  "targets": {
    "serve": {
      "command": "gradlew.bat bootRun",
      "options": {
        "cwd": "apps/backend"
      },
      "cache": false,
      "dependsOn": ["infra:up"],
      "metadata": {
        "description": "Sobe a infra (Postgres + Redis + GUIs) e inicia o Spring Boot"
      }
    }
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\java\br\edu\ifms\gad\api\ApiSpringApplication.java

```java
package br.edu.ifms.gad.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);
	}

}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\main\resources\db\migration\V1__baseline.sql

```sql
-- apps/backend/src/main/resources/db/migration/V1__baseline.sql
--
-- Baseline do schema do GAD. Intencionalmente vazio no Sprint 2.
-- No Sprint 3 adicionaremos as entidades Aluno, Certificado e Classificacao
-- em migrations numeradas V2__, V3__, etc. O Flyway aplica em ordem.
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\api\ApiSpringApplicationTests.java

```java
// apps/backend/src/test/java/br/edu/ifms/gad/api/ApiSpringApplicationTests.java
package br.edu.ifms.gad.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)  // <-- linha nova
class ApiSpringApplicationTests {

    @Test
    void contextLoads() {
        // Este teste, por desígnio, não tem corpo.
        // Seu propósito único é verificar que o ApplicationContext sobe sem
        // erros. Se passar, a espinha dorsal da configuração está saudável.
    }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\backend\src\test\java\br\edu\ifms\gad\api\TestcontainersConfiguration.java

```java
// apps/backend/src/test/java/br/edu/ifms/gad/api/TestcontainersConfiguration.java
package br.edu.ifms.gad.api;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

/**
 * Configuração de teste que sobe um PostgreSQL real via Docker.
 *
 * A ideia tradicional (e correta): teste contra o mesmo banco de produção.
 * Isso evita o clássico "funciona em dev, quebra em prod porque H2 não
 * suporta jsonb" — um clássico que custou noites de sono a muita gente.
 *
 * A anotação @ServiceConnection é a cereja do bolo: desde Spring Boot 3.1,
 * ela injeta automaticamente as propriedades spring.datasource.url,
 * username e password no ApplicationContext, lendo do container que sobe.
 * Zero configuração manual.
 */
@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        // postgres:16-alpine é leve (~80 MB) e rápido para subir (~3 segundos).
        // Quando formos para pgvector no Sprint 4, trocamos para pgvector/pgvector:pg16.
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\eslint.config.mjs

```js
import playwright from 'eslint-plugin-playwright';
import baseConfig from '../../eslint.config.mjs';

export default [
  playwright.configs['flat/recommended'],
  ...baseConfig,
  {
    files: ['**/*.ts', '**/*.js'],
    // Override or add rules here
    rules: {},
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\package.json

```json
{
  "name": "@gad/frontend-discente-e2e",
  "version": "0.0.1",
  "private": true,
  "nx": {
    "implicitDependencies": [
      "@gad/frontend-discente"
    ]
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\playwright.config.ts

```ts
import { defineConfig, devices } from '@playwright/test';
import { nxE2EPreset } from '@nx/playwright/preset';
import { workspaceRoot } from '@nx/devkit';

// For CI, you may want to set BASE_URL to the deployed application.
const baseURL = process.env['BASE_URL'] || 'http://localhost:4200';

/**
 * Read environment variables from file.
 * https://github.com/motdotla/dotenv
 */
// require('dotenv').config();

/**
 * See https://playwright.dev/docs/test-configuration.
 */
export default defineConfig({
  ...nxE2EPreset(__filename, { testDir: './src' }),
  /* Shared settings for all the projects below. See https://playwright.dev/docs/api/class-testoptions. */
  use: {
    baseURL,
    /* Collect trace when retrying the failed test. See https://playwright.dev/docs/trace-viewer */
    trace: 'on-first-retry',
  },
  /* Run your local dev server before starting the tests */
  webServer: {
    command: 'pnpm exec nx run @gad/frontend-discente:preview',
    url: 'http://localhost:4200',
    reuseExistingServer: true,
    cwd: workspaceRoot,
  },
  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },

    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },

    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },

    // Uncomment for mobile browsers support
    /* {
      name: 'Mobile Chrome',
      use: { ...devices['Pixel 5'] },
    },
    {
      name: 'Mobile Safari',
      use: { ...devices['iPhone 12'] },
    }, */

    // Uncomment for branded browsers
    /* {
      name: 'Microsoft Edge',
      use: { ...devices['Desktop Edge'], channel: 'msedge' },
    },
    {
      name: 'Google Chrome',
      use: { ...devices['Desktop Chrome'], channel: 'chrome' },
    } */
  ],
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\src\example.spec.ts

```ts
import { test, expect } from '@playwright/test';

test('has title', async ({ page }) => {
  await page.goto('/');

  // Expect h1 to contain a substring.
  expect(await page.locator('h1').innerText()).toContain('Welcome');
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente-e2e\tsconfig.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "allowJs": true,
    "outDir": "out-tsc/playwright",
    "sourceMap": false
  },
  "include": [
    "**/*.ts",
    "**/*.js",
    "playwright.config.ts",
    "src/**/*.spec.ts",
    "src/**/*.spec.js",
    "src/**/*.test.ts",
    "src/**/*.test.js",
    "src/**/*.d.ts"
  ],
  "exclude": [
    "out-tsc",
    "test-output",
    "eslint.config.js",
    "eslint.config.mjs",
    "eslint.config.cjs"
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\eslint.config.mjs

```js
import nx from '@nx/eslint-plugin';
import baseConfig from '../../eslint.config.mjs';

export default [
  ...nx.configs['flat/react'],
  ...baseConfig,
  {
    files: ['**/*.ts', '**/*.tsx', '**/*.js', '**/*.jsx'],
    // Override or add rules here
    rules: {},
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\index.html

```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>FrontendDiscente</title>
    <base href="/" />

    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />
    <link rel="stylesheet" href="/src/styles.css" />
  </head>
  <body>
    <div id="root"></div>
    <script type="module" src="/src/main.tsx"></script>
  </body>
</html>
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\package.json

```json
{
  "name": "@gad/frontend-discente",
  "version": "0.0.1",
  "private": true
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.module.css

```css
/* Your styles goes here. */
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.spec.tsx

```tsx
import { render } from '@testing-library/react';
import { BrowserRouter } from 'react-router-dom';

import App from './app';

describe('App', () => {
  it('should render successfully', () => {
    const { baseElement } = render(
      <BrowserRouter>
        <App />
      </BrowserRouter>,
    );
    expect(baseElement).toBeTruthy();
  });

  it('should have a greeting as the title', () => {
    const { getAllByText } = render(
      <BrowserRouter>
        <App />
      </BrowserRouter>,
    );
    expect(
      getAllByText(new RegExp('Welcome @gad/frontend-discente', 'gi')).length >
        0,
    ).toBeTruthy();
  });
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\app.tsx

```tsx
// Uncomment this line to use CSS modules
// import styles from './app.module.css';
import NxWelcome from './nx-welcome';

import { Route, Routes, Link } from 'react-router-dom';

export function App() {
  return (
    <div>
      <NxWelcome title="@gad/frontend-discente" />

      {/* START: routes */}
      {/* These routes and navigation have been generated for you */}
      {/* Feel free to move and update them to fit your needs */}
      <br />
      <hr />
      <br />
      <div role="navigation">
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/page-2">Page 2</Link>
          </li>
        </ul>
      </div>
      <Routes>
        <Route
          path="/"
          element={
            <div>
              This is the generated root route.{' '}
              <Link to="/page-2">Click here for page 2.</Link>
            </div>
          }
        />
        <Route
          path="/page-2"
          element={
            <div>
              <Link to="/">Click here to go back to root page.</Link>
            </div>
          }
        />
      </Routes>
      {/* END: routes */}
    </div>
  );
}

export default App;
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\app\nx-welcome.tsx

```tsx
/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 This is a starter component and can be deleted.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 Delete this file and get started with your project!
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
export function NxWelcome({ title }: { title: string }) {
  return (
    <>
      <style
        dangerouslySetInnerHTML={{
          __html: `
    html {
      -webkit-text-size-adjust: 100%;
      font-family: ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont,
      'Segoe UI', Roboto, 'Helvetica Neue', Arial, 'Noto Sans', sans-serif,
      'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol',
      'Noto Color Emoji';
      line-height: 1.5;
      tab-size: 4;
      scroll-behavior: smooth;
    }
    body {
      font-family: inherit;
      line-height: inherit;
      margin: 0;
    }
    h1,
    h2,
    p,
    pre {
      margin: 0;
    }
    *,
    ::before,
    ::after {
      box-sizing: border-box;
      border-width: 0;
      border-style: solid;
      border-color: currentColor;
    }
    h1,
    h2 {
      font-size: inherit;
      font-weight: inherit;
    }
    a {
      color: inherit;
      text-decoration: inherit;
    }
    pre {
      font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas,
      'Liberation Mono', 'Courier New', monospace;
    }
    svg {
      display: block;
      vertical-align: middle;
      shape-rendering: auto;
      text-rendering: optimizeLegibility;
    }
    pre {
      background-color: rgba(55, 65, 81, 1);
      border-radius: 0.25rem;
      color: rgba(229, 231, 235, 1);
      font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas,
      'Liberation Mono', 'Courier New', monospace;
      overflow: auto;
      padding: 0.5rem 0.75rem;
    }

    .shadow {
      box-shadow: 0 0 #0000, 0 0 #0000, 0 10px 15px -3px rgba(0, 0, 0, 0.1),
      0 4px 6px -2px rgba(0, 0, 0, 0.05);
    }
    .rounded {
      border-radius: 1.5rem;
    }
    .wrapper {
      width: 100%;
    }
    .container {
      margin-left: auto;
      margin-right: auto;
      max-width: 768px;
      padding-bottom: 3rem;
      padding-left: 1rem;
      padding-right: 1rem;
      color: rgba(55, 65, 81, 1);
      width: 100%;
    }
    #welcome {
      margin-top: 2.5rem;
    }
    #welcome h1 {
      font-size: 3rem;
      font-weight: 500;
      letter-spacing: -0.025em;
      line-height: 1;
    }
    #welcome span {
      display: block;
      font-size: 1.875rem;
      font-weight: 300;
      line-height: 2.25rem;
      margin-bottom: 0.5rem;
    }
    #hero {
      align-items: center;
      background-color: hsla(214, 62%, 21%, 1);
      border: none;
      box-sizing: border-box;
      color: rgba(55, 65, 81, 1);
      display: grid;
      grid-template-columns: 1fr;
      margin-top: 3.5rem;
    }
    #hero .text-container {
      color: rgba(255, 255, 255, 1);
      padding: 3rem 2rem;
    }
    #hero .text-container h2 {
      font-size: 1.5rem;
      line-height: 2rem;
      position: relative;
    }
    #hero .text-container h2 svg {
      color: hsla(162, 47%, 50%, 1);
      height: 2rem;
      left: -0.25rem;
      position: absolute;
      top: 0;
      width: 2rem;
    }
    #hero .text-container h2 span {
      margin-left: 2.5rem;
    }
    #hero .text-container a {
      background-color: rgba(255, 255, 255, 1);
      border-radius: 0.75rem;
      color: rgba(55, 65, 81, 1);
      display: inline-block;
      margin-top: 1.5rem;
      padding: 1rem 2rem;
      text-decoration: inherit;
    }
    #hero .logo-container {
      display: none;
      justify-content: center;
      padding-left: 2rem;
      padding-right: 2rem;
    }
    #hero .logo-container svg {
      color: rgba(255, 255, 255, 1);
      width: 66.666667%;
    }
    #middle-content {
      align-items: flex-start;
      display: grid;
      grid-template-columns: 1fr;
      margin-top: 3.5rem;
    }

    #middle-content #middle-content-container {
      display: flex;
      flex-direction: column;
      gap: 2rem;
    }
    #learning-materials {
      padding: 2.5rem 2rem;
    }
    #learning-materials h2 {
      font-weight: 500;
      font-size: 1.25rem;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    .list-item-link {
      align-items: center;
      border-radius: 0.75rem;
      display: flex;
      margin-top: 1rem;
      padding: 1rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 100%;
    }
    .list-item-link svg:first-child {
      margin-right: 1rem;
      height: 1.5rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 1.5rem;
    }
    .list-item-link > span {
      flex-grow: 1;
      font-weight: 400;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
    }
    .list-item-link > span > span {
      color: rgba(107, 114, 128, 1);
      display: block;
      flex-grow: 1;
      font-size: 0.75rem;
      font-weight: 300;
      line-height: 1rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
    }
    .list-item-link svg:last-child {
      height: 1rem;
      transition-property: all;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 1rem;
    }
    .list-item-link:hover {
      color: rgba(255, 255, 255, 1);
      background-color: hsla(162, 55%, 33%, 1);
    }
    .list-item-link:hover > span {}
    .list-item-link:hover > span > span {
      color: rgba(243, 244, 246, 1);
    }
    .list-item-link:hover svg:last-child {
      transform: translateX(0.25rem);
    }
    #other-links {}
    .button-pill {
      padding: 1.5rem 2rem;
      margin-bottom: 2rem;
      transition-duration: 300ms;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      align-items: center;
      display: flex;
    }
    .button-pill svg {
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      flex-shrink: 0;
      width: 3rem;
    }
    .button-pill > span {
      letter-spacing: -0.025em;
      font-weight: 400;
      font-size: 1.125rem;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    .button-pill span span {
      display: block;
      font-size: 0.875rem;
      font-weight: 300;
      line-height: 1.25rem;
    }
    .button-pill:hover svg,
    .button-pill:hover {
      color: rgba(255, 255, 255, 1) !important;
    }
    #nx-console:hover {
      background-color: rgba(0, 122, 204, 1);
    }
    #nx-console svg {
      color: rgba(0, 122, 204, 1);
    }
    #nx-console-jetbrains {
      margin-top: 2rem;
    }
    #nx-console-jetbrains:hover {
      background-color: rgba(255, 49, 140, 1);
    }
    #nx-console-jetbrains svg {
      color: rgba(255, 49, 140, 1);
    }
    #nx-repo:hover {
      background-color: rgba(24, 23, 23, 1);
    }
    #nx-repo svg {
      color: rgba(24, 23, 23, 1);
    }
    #nx-cloud {
      margin-bottom: 2rem;
      margin-top: 2rem;
      padding: 2.5rem 2rem;
    }
    #nx-cloud > div {
      align-items: center;
      display: flex;
    }
    #nx-cloud > div svg {
      border-radius: 0.375rem;
      flex-shrink: 0;
      width: 3rem;
    }
    #nx-cloud > div h2 {
      font-size: 1.125rem;
      font-weight: 400;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    #nx-cloud > div h2 span {
      display: block;
      font-size: 0.875rem;
      font-weight: 300;
      line-height: 1.25rem;
    }
    #nx-cloud p {
      font-size: 1rem;
      line-height: 1.5rem;
      margin-top: 1rem;
    }
    #nx-cloud pre {
      margin-top: 1rem;
    }
    #nx-cloud a {
      border-radius: 0.75rem;
      color: white;
      background-color: hsla(214, 62%, 21%, 1);
      display: inline-block;
      margin-top: 1.5rem;
      padding: 0.5rem 1rem;
      text-align:left;
      text-decoration: inherit;
    }

    #commands {
      padding: 2.5rem 2rem;
      margin-top: 3.5rem;
    }
    #commands h2 {
      font-size: 1.25rem;
      font-weight: 400;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    #commands p {
      font-size: 1rem;
      font-weight: 300;
      line-height: 1.5rem;
      margin-top: 1rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    details {
      align-items: center;
      display: flex;
      margin-top: 1rem;
      padding-left: 1rem;
      padding-right: 1rem;
      width: 100%;
    }
    details pre > span {
      color: rgba(181, 181, 181, 1);
      display: block;
    }
    summary {
      border-radius: 0.5rem;
      display: flex;
      font-weight: 400;
      padding: 0.5rem;
      cursor: pointer;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
    }
    summary:hover {
      background-color: rgba(243, 244, 246, 1);
    }
    summary svg {
      height: 1.5rem;
      margin-right: 1rem;
      width: 1.5rem;
    }
    #love {
      color: rgba(107, 114, 128, 1);
      font-size: 0.875rem;
      line-height: 1.25rem;
      margin-top: 3.5rem;
      opacity: 0.6;
      text-align: center;
    }
    #love svg {
      color: rgba(252, 165, 165, 1);
      width: 1.25rem;
      height: 1.25rem;
      display: inline;
      margin-top: -0.25rem;
    }
    @media screen and (min-width: 768px) {
      #hero {
        grid-template-columns: repeat(2, minmax(0, 1fr));
      }
      #hero .logo-container {
        display: flex;
      }
      #middle-content {
        grid-template-columns: repeat(2, minmax(0, 1fr));
        gap: 4rem;
      }
    }
          `,
        }}
      />
      <div className="wrapper">
        <div className="container">
          <div id="welcome">
            <h1>
              <span> Hello there, </span>
              Welcome {title} 👋
            </h1>
          </div>

          <div id="hero" className="rounded">
            <div className="text-container">
              <h2>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M9 12l2 2 4-4M7.835 4.697a3.42 3.42 0 001.946-.806 3.42 3.42 0 014.438 0 3.42 3.42 0 001.946.806 3.42 3.42 0 013.138 3.138 3.42 3.42 0 00.806 1.946 3.42 3.42 0 010 4.438 3.42 3.42 0 00-.806 1.946 3.42 3.42 0 01-3.138 3.138 3.42 3.42 0 00-1.946.806 3.42 3.42 0 01-4.438 0 3.42 3.42 0 00-1.946-.806 3.42 3.42 0 01-3.138-3.138 3.42 3.42 0 00-.806-1.946 3.42 3.42 0 010-4.438 3.42 3.42 0 00.806-1.946 3.42 3.42 0 013.138-3.138z"
                  />
                </svg>
                <span>You&apos;re up and running</span>
              </h2>
              <a href="#commands"> What&apos;s next? </a>
            </div>
            <div className="logo-container">
              <svg
                fill="currentColor"
                role="img"
                viewBox="0 0 24 24"
                xmlns="http://www.w3.org/2000/svg"
              >
                <path d="M11.987 14.138l-3.132 4.923-5.193-8.427-.012 8.822H0V4.544h3.691l5.247 8.833.005-3.998 3.044 4.759zm.601-5.761c.024-.048 0-3.784.008-3.833h-3.65c.002.059-.005 3.776-.003 3.833h3.645zm5.634 4.134a2.061 2.061 0 0 0-1.969 1.336 1.963 1.963 0 0 1 2.343-.739c.396.161.917.422 1.33.283a2.1 2.1 0 0 0-1.704-.88zm3.39 1.061c-.375-.13-.8-.277-1.109-.681-.06-.08-.116-.17-.176-.265a2.143 2.143 0 0 0-.533-.642c-.294-.216-.68-.322-1.18-.322a2.482 2.482 0 0 0-2.294 1.536 2.325 2.325 0 0 1 4.002.388.75.75 0 0 0 .836.334c.493-.105.46.36 1.203.518v-.133c-.003-.446-.246-.55-.75-.733zm2.024 1.266a.723.723 0 0 0 .347-.638c-.01-2.957-2.41-5.487-5.37-5.487a5.364 5.364 0 0 0-4.487 2.418c-.01-.026-1.522-2.39-1.538-2.418H8.943l3.463 5.423-3.379 5.32h3.54l1.54-2.366 1.568 2.366h3.541l-3.21-5.052a.7.7 0 0 1-.084-.32 2.69 2.69 0 0 1 2.69-2.691h.001c1.488 0 1.736.89 2.057 1.308.634.826 1.9.464 1.9 1.541a.707.707 0 0 0 1.066.596zm.35.133c-.173.372-.56.338-.755.639-.176.271.114.412.114.412s.337.156.538-.311c.104-.231.14-.488.103-.74z" />
              </svg>
            </div>
          </div>

          <div id="middle-content">
            <div id="middle-content-container">
              <div id="learning-materials" className="rounded shadow">
                <h2>Learning materials</h2>
                <a
                  href="https://nx.dev/getting-started/intro?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M12 6.253v13m0-13C10.832 5.477 9.246 5 7.5 5S4.168 5.477 3 6.253v13C4.168 18.477 5.754 18 7.5 18s3.332.477 4.5 1.253m0-13C13.168 5.477 14.754 5 16.5 5c1.747 0 3.332.477 4.5 1.253v13C19.832 18.477 18.247 18 16.5 18c-1.746 0-3.332.477-4.5 1.253"
                    />
                  </svg>
                  <span>
                    Documentation
                    <span> Everything is in there </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://nx.dev/blog/?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M19 20H5a2 2 0 01-2-2V6a2 2 0 012-2h10a2 2 0 012 2v1m2 13a2 2 0 01-2-2V7m2 13a2 2 0 002-2V9a2 2 0 00-2-2h-2m-4-3H9M7 16h6M7 8h6v4H7V8z"
                    />
                  </svg>
                  <span>
                    Blog
                    <span> Changelog, features & events </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://www.youtube.com/@NxDevtools/videos?utm_source=nx-project&sub_confirmation=1"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    role="img"
                    viewBox="0 0 24 24"
                    fill="currentColor"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <title>YouTube</title>
                    <path d="M23.498 6.186a3.016 3.016 0 0 0-2.122-2.136C19.505 3.545 12 3.545 12 3.545s-7.505 0-9.377.505A3.017 3.017 0 0 0 .502 6.186C0 8.07 0 12 0 12s0 3.93.502 5.814a3.016 3.016 0 0 0 2.122 2.136c1.871.505 9.376.505 9.376.505s7.505 0 9.377-.505a3.015 3.015 0 0 0 2.122-2.136C24 15.93 24 12 24 12s0-3.93-.502-5.814zM9.545 15.568V8.432L15.818 12l-6.273 3.568z" />
                  </svg>
                  <span>
                    YouTube channel
                    <span> Nx Show, talks & tutorials </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://nx.dev/react-tutorial/1-code-generation?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M15 15l-2 5L9 9l11 4-5 2zm0 0l5 5M7.188 2.239l.777 2.897M5.136 7.965l-2.898-.777M13.95 4.05l-2.122 2.122m-5.657 5.656l-2.12 2.122"
                    />
                  </svg>
                  <span>
                    Interactive tutorials
                    <span> Create an app, step-by-step </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
              </div>
              <a
                id="nx-repo"
                className="button-pill rounded shadow"
                href="https://github.com/nrwl/nx?utm_source=nx-project"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  fill="currentColor"
                  role="img"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path d="M12 .297c-6.63 0-12 5.373-12 12 0 5.303 3.438 9.8 8.205 11.385.6.113.82-.258.82-.577 0-.285-.01-1.04-.015-2.04-3.338.724-4.042-1.61-4.042-1.61C4.422 18.07 3.633 17.7 3.633 17.7c-1.087-.744.084-.729.084-.729 1.205.084 1.838 1.236 1.838 1.236 1.07 1.835 2.809 1.305 3.495.998.108-.776.417-1.305.76-1.605-2.665-.3-5.466-1.332-5.466-5.93 0-1.31.465-2.38 1.235-3.22-.135-.303-.54-1.523.105-3.176 0 0 1.005-.322 3.3 1.23.96-.267 1.98-.399 3-.405 1.02.006 2.04.138 3 .405 2.28-1.552 3.285-1.23 3.285-1.23.645 1.653.24 2.873.12 3.176.765.84 1.23 1.91 1.23 3.22 0 4.61-2.805 5.625-5.475 5.92.42.36.81 1.096.81 2.22 0 1.606-.015 2.896-.015 3.286 0 .315.21.69.825.57C20.565 22.092 24 17.592 24 12.297c0-6.627-5.373-12-12-12" />
                </svg>
                <span>
                  Nx is open source
                  <span> Love Nx? Give us a star! </span>
                </span>
              </a>
            </div>
            <div id="other-links">
              <a
                id="nx-console"
                className="button-pill rounded shadow"
                href="https://marketplace.visualstudio.com/items?itemName=nrwl.angular-console&utm_source=nx-project"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  fill="currentColor"
                  role="img"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <title>Visual Studio Code</title>
                  <path d="M23.15 2.587L18.21.21a1.494 1.494 0 0 0-1.705.29l-9.46 8.63-4.12-3.128a.999.999 0 0 0-1.276.057L.327 7.261A1 1 0 0 0 .326 8.74L3.899 12 .326 15.26a1 1 0 0 0 .001 1.479L1.65 17.94a.999.999 0 0 0 1.276.057l4.12-3.128 9.46 8.63a1.492 1.492 0 0 0 1.704.29l4.942-2.377A1.5 1.5 0 0 0 24 20.06V3.939a1.5 1.5 0 0 0-.85-1.352zm-5.146 14.861L10.826 12l7.178-5.448v10.896z" />
                </svg>
                <span>
                  Install Nx Console for VSCode
                  <span>The official VSCode extension for Nx.</span>
                </span>
              </a>
              <a
                id="nx-console-jetbrains"
                className="button-pill rounded shadow"
                href="https://plugins.jetbrains.com/plugin/21060-nx-console"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  height="48"
                  width="48"
                  viewBox="20 20 60 60"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path d="m22.5 22.5h60v60h-60z" />
                  <g fill="#fff">
                    <path d="m29.03 71.25h22.5v3.75h-22.5z" />
                    <path d="m28.09 38 1.67-1.58a1.88 1.88 0 0 0 1.47.87c.64 0 1.06-.44 1.06-1.31v-5.98h2.58v6a3.48 3.48 0 0 1 -.87 2.6 3.56 3.56 0 0 1 -2.57.95 3.84 3.84 0 0 1 -3.34-1.55z" />
                    <path d="m36 30h7.53v2.19h-5v1.44h4.49v2h-4.42v1.49h5v2.21h-7.6z" />
                    <path d="m47.23 32.29h-2.8v-2.29h8.21v2.27h-2.81v7.1h-2.6z" />
                    <path d="m29.13 43.08h4.42a3.53 3.53 0 0 1 2.55.83 2.09 2.09 0 0 1 .6 1.53 2.16 2.16 0 0 1 -1.44 2.09 2.27 2.27 0 0 1 1.86 2.29c0 1.61-1.31 2.59-3.55 2.59h-4.44zm5 2.89c0-.52-.42-.8-1.18-.8h-1.29v1.64h1.24c.79 0 1.25-.26 1.25-.81zm-.9 2.66h-1.57v1.73h1.62c.8 0 1.24-.31 1.24-.86 0-.5-.4-.87-1.27-.87z" />
                    <path d="m38 43.08h4.1a4.19 4.19 0 0 1 3 1 2.93 2.93 0 0 1 .9 2.19 3 3 0 0 1 -1.93 2.89l2.24 3.27h-3l-1.88-2.84h-.87v2.84h-2.56zm4 4.5c.87 0 1.39-.43 1.39-1.11 0-.75-.54-1.12-1.4-1.12h-1.44v2.26z" />
                    <path d="m49.59 43h2.5l4 9.44h-2.79l-.67-1.69h-3.63l-.67 1.69h-2.71zm2.27 5.73-1-2.65-1.06 2.65z" />
                    <path d="m56.46 43.05h2.6v9.37h-2.6z" />
                    <path d="m60.06 43.05h2.42l3.37 5v-5h2.57v9.37h-2.26l-3.53-5.14v5.14h-2.57z" />
                    <path d="m68.86 51 1.45-1.73a4.84 4.84 0 0 0 3 1.13c.71 0 1.08-.24 1.08-.65 0-.4-.31-.6-1.59-.91-2-.46-3.53-1-3.53-2.93 0-1.74 1.37-3 3.62-3a5.89 5.89 0 0 1 3.86 1.25l-1.26 1.84a4.63 4.63 0 0 0 -2.62-.92c-.63 0-.94.25-.94.6 0 .42.32.61 1.63.91 2.14.46 3.44 1.16 3.44 2.91 0 1.91-1.51 3-3.79 3a6.58 6.58 0 0 1 -4.35-1.5z" />
                  </g>
                </svg>
                <span>
                  Install Nx Console for JetBrains
                  <span>
                    Available for WebStorm, Intellij IDEA Ultimate and more!
                  </span>
                </span>
              </a>
              <div id="nx-cloud" className="rounded shadow">
                <div>
                  <svg
                    id="nx-cloud-logo"
                    role="img"
                    xmlns="http://www.w3.org/2000/svg"
                    stroke="currentColor"
                    fill="transparent"
                    viewBox="0 0 24 24"
                  >
                    <path
                      strokeWidth="2"
                      d="M23 3.75V6.5c-3.036 0-5.5 2.464-5.5 5.5s-2.464 5.5-5.5 5.5-5.5 2.464-5.5 5.5H3.75C2.232 23 1 21.768 1 20.25V3.75C1 2.232 2.232 1 3.75 1h16.5C21.768 1 23 2.232 23 3.75Z"
                    />
                    <path
                      strokeWidth="2"
                      d="M23 6v14.1667C23 21.7307 21.7307 23 20.1667 23H6c0-3.128 2.53867-5.6667 5.6667-5.6667 3.128 0 5.6666-2.5386 5.6666-5.6666C17.3333 8.53867 19.872 6 23 6Z"
                    />
                  </svg>
                  <h2>
                    Nx Cloud
                    <span>Enable faster CI & better DX</span>
                  </h2>
                </div>
                <p>Your workspace is connected to Nx Cloud.</p>
                <a
                  href="https://nx.dev/ci/intro/ci-with-nx#learn-about-nx-on-ci"
                  target="_blank"
                  rel="noreferrer"
                >
                  {' '}
                  Learn about Nx on CI
                </a>
              </div>
            </div>
          </div>

          <div id="commands" className="rounded shadow">
            <h2>Next steps</h2>
            <p>Here are some things you can do with Nx:</p>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                Build, test and lint your app
              </summary>
              <pre>
                <span># Build</span>
                nx build {title}
                <span># Test</span>
                nx test {title}
                <span># Lint</span>
                nx lint {title}
                <span># Run them together!</span>
                nx run-many -p {title} -t build test lint
              </pre>
            </details>

            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                View project details
              </summary>
              <pre>nx show project {title}</pre>
            </details>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                View interactive project graph
              </summary>
              <pre>nx graph</pre>
            </details>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                Add UI library
              </summary>
              <pre>
                <span># Generate UI lib</span>
                nx g @nx/react:lib ui
                <span># Add a component</span>
                nx g @nx/react:component ui/src/lib/button
              </pre>
            </details>
          </div>

          <p id="love">
            Carefully crafted with
            <svg
              fill="currentColor"
              stroke="none"
              viewBox="0 0 24 24"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M4.318 6.318a4.5 4.5 0 000 6.364L12 20.364l7.682-7.682a4.5 4.5 0 00-6.364-6.364L12 7.636l-1.318-1.318a4.5 4.5 0 00-6.364 0z"
              />
            </svg>
          </p>
        </div>
      </div>
    </>
  );
}

export default NxWelcome;
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\main.tsx

```tsx
import { StrictMode } from 'react';
import { BrowserRouter } from 'react-router-dom';
import * as ReactDOM from 'react-dom/client';
import App from './app/app';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement,
);

root.render(
  <StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </StrictMode>,
);
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\src\styles.css

```css
/* You can add global styles to this file, and also import other style files */
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.app.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "dist",
    "tsBuildInfoFile": "dist/tsconfig.app.tsbuildinfo",
    "jsx": "react-jsx",
    "lib": ["dom"],
    "types": [
      "node",
      "@nx/react/typings/cssmodule.d.ts",
      "@nx/react/typings/image.d.ts",
      "vite/client"
    ],
    "rootDir": "src"
  },
  "exclude": [
    "out-tsc",
    "dist",
    "src/**/*.spec.ts",
    "src/**/*.test.ts",
    "src/**/*.spec.tsx",
    "src/**/*.test.tsx",
    "src/**/*.spec.js",
    "src/**/*.test.js",
    "src/**/*.spec.jsx",
    "src/**/*.test.jsx",
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "eslint.config.js",
    "eslint.config.cjs",
    "eslint.config.mjs"
  ],
  "include": ["src/**/*.js", "src/**/*.jsx", "src/**/*.ts", "src/**/*.tsx"]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.json

```json
{
  "files": [],
  "include": [],
  "references": [
    {
      "path": "./tsconfig.app.json"
    },
    {
      "path": "./tsconfig.spec.json"
    }
  ],
  "extends": "../../tsconfig.base.json"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-discente\tsconfig.spec.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "./out-tsc/vitest",
    "types": [
      "vitest/globals",
      "vitest/importMeta",
      "vite/client",
      "node",
      "vitest",
      "@nx/react/typings/cssmodule.d.ts",
      "@nx/react/typings/image.d.ts"
    ],
    "jsx": "react-jsx"
  },
  "include": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "src/**/*.d.ts"
  ],
  "references": [
    {
      "path": "./tsconfig.app.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\eslint.config.mjs

```js
import playwright from 'eslint-plugin-playwright';
import baseConfig from '../../eslint.config.mjs';

export default [
  playwright.configs['flat/recommended'],
  ...baseConfig,
  {
    files: ['**/*.ts', '**/*.js'],
    // Override or add rules here
    rules: {},
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\package.json

```json
{
  "name": "@gad/frontend-docente-e2e",
  "version": "0.0.1",
  "private": true,
  "nx": {
    "implicitDependencies": [
      "@gad/frontend-docente"
    ]
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\playwright.config.ts

```ts
import { defineConfig, devices } from '@playwright/test';
import { nxE2EPreset } from '@nx/playwright/preset';
import { workspaceRoot } from '@nx/devkit';

// For CI, you may want to set BASE_URL to the deployed application.
const baseURL = process.env['BASE_URL'] || 'http://localhost:4200';

/**
 * Read environment variables from file.
 * https://github.com/motdotla/dotenv
 */
// require('dotenv').config();

/**
 * See https://playwright.dev/docs/test-configuration.
 */
export default defineConfig({
  ...nxE2EPreset(__filename, { testDir: './src' }),
  /* Shared settings for all the projects below. See https://playwright.dev/docs/api/class-testoptions. */
  use: {
    baseURL,
    /* Collect trace when retrying the failed test. See https://playwright.dev/docs/trace-viewer */
    trace: 'on-first-retry',
  },
  /* Run your local dev server before starting the tests */
  webServer: {
    command: 'pnpm exec nx run @gad/frontend-docente:preview',
    url: 'http://localhost:4200',
    reuseExistingServer: true,
    cwd: workspaceRoot,
  },
  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },

    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },

    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },

    // Uncomment for mobile browsers support
    /* {
      name: 'Mobile Chrome',
      use: { ...devices['Pixel 5'] },
    },
    {
      name: 'Mobile Safari',
      use: { ...devices['iPhone 12'] },
    }, */

    // Uncomment for branded browsers
    /* {
      name: 'Microsoft Edge',
      use: { ...devices['Desktop Edge'], channel: 'msedge' },
    },
    {
      name: 'Google Chrome',
      use: { ...devices['Desktop Chrome'], channel: 'chrome' },
    } */
  ],
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\src\example.spec.ts

```ts
import { test, expect } from '@playwright/test';

test('has title', async ({ page }) => {
  await page.goto('/');

  // Expect h1 to contain a substring.
  expect(await page.locator('h1').innerText()).toContain('Welcome');
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente-e2e\tsconfig.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "allowJs": true,
    "outDir": "out-tsc/playwright",
    "sourceMap": false
  },
  "include": [
    "**/*.ts",
    "**/*.js",
    "playwright.config.ts",
    "src/**/*.spec.ts",
    "src/**/*.spec.js",
    "src/**/*.test.ts",
    "src/**/*.test.js",
    "src/**/*.d.ts"
  ],
  "exclude": [
    "out-tsc",
    "test-output",
    "eslint.config.js",
    "eslint.config.mjs",
    "eslint.config.cjs"
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\eslint.config.mjs

```js
import nx from '@nx/eslint-plugin';
import baseConfig from '../../eslint.config.mjs';

export default [
  ...nx.configs['flat/react'],
  ...baseConfig,
  {
    files: ['**/*.ts', '**/*.tsx', '**/*.js', '**/*.jsx'],
    // Override or add rules here
    rules: {},
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\index.html

```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>FrontendDocente</title>
    <base href="/" />

    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />
    <link rel="stylesheet" href="/src/styles.css" />
  </head>
  <body>
    <div id="root"></div>
    <script type="module" src="/src/main.tsx"></script>
  </body>
</html>
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\package.json

```json
{
  "name": "@gad/frontend-docente",
  "version": "0.0.1",
  "private": true
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.module.css

```css
/* Your styles goes here. */
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.spec.tsx

```tsx
import { render } from '@testing-library/react';
import { BrowserRouter } from 'react-router-dom';

import App from './app';

describe('App', () => {
  it('should render successfully', () => {
    const { baseElement } = render(
      <BrowserRouter>
        <App />
      </BrowserRouter>,
    );
    expect(baseElement).toBeTruthy();
  });

  it('should have a greeting as the title', () => {
    const { getAllByText } = render(
      <BrowserRouter>
        <App />
      </BrowserRouter>,
    );
    expect(
      getAllByText(new RegExp('Welcome @gad/frontend-docente', 'gi')).length >
        0,
    ).toBeTruthy();
  });
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\app.tsx

```tsx
// Uncomment this line to use CSS modules
// import styles from './app.module.css';
import NxWelcome from './nx-welcome';

import { Route, Routes, Link } from 'react-router-dom';

export function App() {
  return (
    <div>
      <NxWelcome title="@gad/frontend-docente" />

      {/* START: routes */}
      {/* These routes and navigation have been generated for you */}
      {/* Feel free to move and update them to fit your needs */}
      <br />
      <hr />
      <br />
      <div role="navigation">
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/page-2">Page 2</Link>
          </li>
        </ul>
      </div>
      <Routes>
        <Route
          path="/"
          element={
            <div>
              This is the generated root route.{' '}
              <Link to="/page-2">Click here for page 2.</Link>
            </div>
          }
        />
        <Route
          path="/page-2"
          element={
            <div>
              <Link to="/">Click here to go back to root page.</Link>
            </div>
          }
        />
      </Routes>
      {/* END: routes */}
    </div>
  );
}

export default App;
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\app\nx-welcome.tsx

```tsx
/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 This is a starter component and can be deleted.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 Delete this file and get started with your project!
 * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
export function NxWelcome({ title }: { title: string }) {
  return (
    <>
      <style
        dangerouslySetInnerHTML={{
          __html: `
    html {
      -webkit-text-size-adjust: 100%;
      font-family: ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont,
      'Segoe UI', Roboto, 'Helvetica Neue', Arial, 'Noto Sans', sans-serif,
      'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol',
      'Noto Color Emoji';
      line-height: 1.5;
      tab-size: 4;
      scroll-behavior: smooth;
    }
    body {
      font-family: inherit;
      line-height: inherit;
      margin: 0;
    }
    h1,
    h2,
    p,
    pre {
      margin: 0;
    }
    *,
    ::before,
    ::after {
      box-sizing: border-box;
      border-width: 0;
      border-style: solid;
      border-color: currentColor;
    }
    h1,
    h2 {
      font-size: inherit;
      font-weight: inherit;
    }
    a {
      color: inherit;
      text-decoration: inherit;
    }
    pre {
      font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas,
      'Liberation Mono', 'Courier New', monospace;
    }
    svg {
      display: block;
      vertical-align: middle;
      shape-rendering: auto;
      text-rendering: optimizeLegibility;
    }
    pre {
      background-color: rgba(55, 65, 81, 1);
      border-radius: 0.25rem;
      color: rgba(229, 231, 235, 1);
      font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas,
      'Liberation Mono', 'Courier New', monospace;
      overflow: auto;
      padding: 0.5rem 0.75rem;
    }

    .shadow {
      box-shadow: 0 0 #0000, 0 0 #0000, 0 10px 15px -3px rgba(0, 0, 0, 0.1),
      0 4px 6px -2px rgba(0, 0, 0, 0.05);
    }
    .rounded {
      border-radius: 1.5rem;
    }
    .wrapper {
      width: 100%;
    }
    .container {
      margin-left: auto;
      margin-right: auto;
      max-width: 768px;
      padding-bottom: 3rem;
      padding-left: 1rem;
      padding-right: 1rem;
      color: rgba(55, 65, 81, 1);
      width: 100%;
    }
    #welcome {
      margin-top: 2.5rem;
    }
    #welcome h1 {
      font-size: 3rem;
      font-weight: 500;
      letter-spacing: -0.025em;
      line-height: 1;
    }
    #welcome span {
      display: block;
      font-size: 1.875rem;
      font-weight: 300;
      line-height: 2.25rem;
      margin-bottom: 0.5rem;
    }
    #hero {
      align-items: center;
      background-color: hsla(214, 62%, 21%, 1);
      border: none;
      box-sizing: border-box;
      color: rgba(55, 65, 81, 1);
      display: grid;
      grid-template-columns: 1fr;
      margin-top: 3.5rem;
    }
    #hero .text-container {
      color: rgba(255, 255, 255, 1);
      padding: 3rem 2rem;
    }
    #hero .text-container h2 {
      font-size: 1.5rem;
      line-height: 2rem;
      position: relative;
    }
    #hero .text-container h2 svg {
      color: hsla(162, 47%, 50%, 1);
      height: 2rem;
      left: -0.25rem;
      position: absolute;
      top: 0;
      width: 2rem;
    }
    #hero .text-container h2 span {
      margin-left: 2.5rem;
    }
    #hero .text-container a {
      background-color: rgba(255, 255, 255, 1);
      border-radius: 0.75rem;
      color: rgba(55, 65, 81, 1);
      display: inline-block;
      margin-top: 1.5rem;
      padding: 1rem 2rem;
      text-decoration: inherit;
    }
    #hero .logo-container {
      display: none;
      justify-content: center;
      padding-left: 2rem;
      padding-right: 2rem;
    }
    #hero .logo-container svg {
      color: rgba(255, 255, 255, 1);
      width: 66.666667%;
    }
    #middle-content {
      align-items: flex-start;
      display: grid;
      grid-template-columns: 1fr;
      margin-top: 3.5rem;
    }

    #middle-content #middle-content-container {
      display: flex;
      flex-direction: column;
      gap: 2rem;
    }
    #learning-materials {
      padding: 2.5rem 2rem;
    }
    #learning-materials h2 {
      font-weight: 500;
      font-size: 1.25rem;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    .list-item-link {
      align-items: center;
      border-radius: 0.75rem;
      display: flex;
      margin-top: 1rem;
      padding: 1rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 100%;
    }
    .list-item-link svg:first-child {
      margin-right: 1rem;
      height: 1.5rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 1.5rem;
    }
    .list-item-link > span {
      flex-grow: 1;
      font-weight: 400;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
    }
    .list-item-link > span > span {
      color: rgba(107, 114, 128, 1);
      display: block;
      flex-grow: 1;
      font-size: 0.75rem;
      font-weight: 300;
      line-height: 1rem;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
    }
    .list-item-link svg:last-child {
      height: 1rem;
      transition-property: all;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      width: 1rem;
    }
    .list-item-link:hover {
      color: rgba(255, 255, 255, 1);
      background-color: hsla(162, 55%, 33%, 1);
    }
    .list-item-link:hover > span {}
    .list-item-link:hover > span > span {
      color: rgba(243, 244, 246, 1);
    }
    .list-item-link:hover svg:last-child {
      transform: translateX(0.25rem);
    }
    #other-links {}
    .button-pill {
      padding: 1.5rem 2rem;
      margin-bottom: 2rem;
      transition-duration: 300ms;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      align-items: center;
      display: flex;
    }
    .button-pill svg {
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
      flex-shrink: 0;
      width: 3rem;
    }
    .button-pill > span {
      letter-spacing: -0.025em;
      font-weight: 400;
      font-size: 1.125rem;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    .button-pill span span {
      display: block;
      font-size: 0.875rem;
      font-weight: 300;
      line-height: 1.25rem;
    }
    .button-pill:hover svg,
    .button-pill:hover {
      color: rgba(255, 255, 255, 1) !important;
    }
    #nx-console:hover {
      background-color: rgba(0, 122, 204, 1);
    }
    #nx-console svg {
      color: rgba(0, 122, 204, 1);
    }
    #nx-console-jetbrains {
      margin-top: 2rem;
    }
    #nx-console-jetbrains:hover {
      background-color: rgba(255, 49, 140, 1);
    }
    #nx-console-jetbrains svg {
      color: rgba(255, 49, 140, 1);
    }
    #nx-repo:hover {
      background-color: rgba(24, 23, 23, 1);
    }
    #nx-repo svg {
      color: rgba(24, 23, 23, 1);
    }
    #nx-cloud {
      margin-bottom: 2rem;
      margin-top: 2rem;
      padding: 2.5rem 2rem;
    }
    #nx-cloud > div {
      align-items: center;
      display: flex;
    }
    #nx-cloud > div svg {
      border-radius: 0.375rem;
      flex-shrink: 0;
      width: 3rem;
    }
    #nx-cloud > div h2 {
      font-size: 1.125rem;
      font-weight: 400;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    #nx-cloud > div h2 span {
      display: block;
      font-size: 0.875rem;
      font-weight: 300;
      line-height: 1.25rem;
    }
    #nx-cloud p {
      font-size: 1rem;
      line-height: 1.5rem;
      margin-top: 1rem;
    }
    #nx-cloud pre {
      margin-top: 1rem;
    }
    #nx-cloud a {
      border-radius: 0.75rem;
      color: white;
      background-color: hsla(214, 62%, 21%, 1);
      display: inline-block;
      margin-top: 1.5rem;
      padding: 0.5rem 1rem;
      text-align:left;
      text-decoration: inherit;
    }

    #commands {
      padding: 2.5rem 2rem;
      margin-top: 3.5rem;
    }
    #commands h2 {
      font-size: 1.25rem;
      font-weight: 400;
      letter-spacing: -0.025em;
      line-height: 1.75rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    #commands p {
      font-size: 1rem;
      font-weight: 300;
      line-height: 1.5rem;
      margin-top: 1rem;
      padding-left: 1rem;
      padding-right: 1rem;
    }
    details {
      align-items: center;
      display: flex;
      margin-top: 1rem;
      padding-left: 1rem;
      padding-right: 1rem;
      width: 100%;
    }
    details pre > span {
      color: rgba(181, 181, 181, 1);
      display: block;
    }
    summary {
      border-radius: 0.5rem;
      display: flex;
      font-weight: 400;
      padding: 0.5rem;
      cursor: pointer;
      transition-property: background-color, border-color, color, fill, stroke,
      opacity, box-shadow, transform, filter, backdrop-filter,
      -webkit-backdrop-filter;
      transition-timing-function: cubic-bezier(0.4, 0, 0.2, 1);
      transition-duration: 150ms;
    }
    summary:hover {
      background-color: rgba(243, 244, 246, 1);
    }
    summary svg {
      height: 1.5rem;
      margin-right: 1rem;
      width: 1.5rem;
    }
    #love {
      color: rgba(107, 114, 128, 1);
      font-size: 0.875rem;
      line-height: 1.25rem;
      margin-top: 3.5rem;
      opacity: 0.6;
      text-align: center;
    }
    #love svg {
      color: rgba(252, 165, 165, 1);
      width: 1.25rem;
      height: 1.25rem;
      display: inline;
      margin-top: -0.25rem;
    }
    @media screen and (min-width: 768px) {
      #hero {
        grid-template-columns: repeat(2, minmax(0, 1fr));
      }
      #hero .logo-container {
        display: flex;
      }
      #middle-content {
        grid-template-columns: repeat(2, minmax(0, 1fr));
        gap: 4rem;
      }
    }
          `,
        }}
      />
      <div className="wrapper">
        <div className="container">
          <div id="welcome">
            <h1>
              <span> Hello there, </span>
              Welcome {title} 👋
            </h1>
          </div>

          <div id="hero" className="rounded">
            <div className="text-container">
              <h2>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M9 12l2 2 4-4M7.835 4.697a3.42 3.42 0 001.946-.806 3.42 3.42 0 014.438 0 3.42 3.42 0 001.946.806 3.42 3.42 0 013.138 3.138 3.42 3.42 0 00.806 1.946 3.42 3.42 0 010 4.438 3.42 3.42 0 00-.806 1.946 3.42 3.42 0 01-3.138 3.138 3.42 3.42 0 00-1.946.806 3.42 3.42 0 01-4.438 0 3.42 3.42 0 00-1.946-.806 3.42 3.42 0 01-3.138-3.138 3.42 3.42 0 00-.806-1.946 3.42 3.42 0 010-4.438 3.42 3.42 0 00.806-1.946 3.42 3.42 0 013.138-3.138z"
                  />
                </svg>
                <span>You&apos;re up and running</span>
              </h2>
              <a href="#commands"> What&apos;s next? </a>
            </div>
            <div className="logo-container">
              <svg
                fill="currentColor"
                role="img"
                viewBox="0 0 24 24"
                xmlns="http://www.w3.org/2000/svg"
              >
                <path d="M11.987 14.138l-3.132 4.923-5.193-8.427-.012 8.822H0V4.544h3.691l5.247 8.833.005-3.998 3.044 4.759zm.601-5.761c.024-.048 0-3.784.008-3.833h-3.65c.002.059-.005 3.776-.003 3.833h3.645zm5.634 4.134a2.061 2.061 0 0 0-1.969 1.336 1.963 1.963 0 0 1 2.343-.739c.396.161.917.422 1.33.283a2.1 2.1 0 0 0-1.704-.88zm3.39 1.061c-.375-.13-.8-.277-1.109-.681-.06-.08-.116-.17-.176-.265a2.143 2.143 0 0 0-.533-.642c-.294-.216-.68-.322-1.18-.322a2.482 2.482 0 0 0-2.294 1.536 2.325 2.325 0 0 1 4.002.388.75.75 0 0 0 .836.334c.493-.105.46.36 1.203.518v-.133c-.003-.446-.246-.55-.75-.733zm2.024 1.266a.723.723 0 0 0 .347-.638c-.01-2.957-2.41-5.487-5.37-5.487a5.364 5.364 0 0 0-4.487 2.418c-.01-.026-1.522-2.39-1.538-2.418H8.943l3.463 5.423-3.379 5.32h3.54l1.54-2.366 1.568 2.366h3.541l-3.21-5.052a.7.7 0 0 1-.084-.32 2.69 2.69 0 0 1 2.69-2.691h.001c1.488 0 1.736.89 2.057 1.308.634.826 1.9.464 1.9 1.541a.707.707 0 0 0 1.066.596zm.35.133c-.173.372-.56.338-.755.639-.176.271.114.412.114.412s.337.156.538-.311c.104-.231.14-.488.103-.74z" />
              </svg>
            </div>
          </div>

          <div id="middle-content">
            <div id="middle-content-container">
              <div id="learning-materials" className="rounded shadow">
                <h2>Learning materials</h2>
                <a
                  href="https://nx.dev/getting-started/intro?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M12 6.253v13m0-13C10.832 5.477 9.246 5 7.5 5S4.168 5.477 3 6.253v13C4.168 18.477 5.754 18 7.5 18s3.332.477 4.5 1.253m0-13C13.168 5.477 14.754 5 16.5 5c1.747 0 3.332.477 4.5 1.253v13C19.832 18.477 18.247 18 16.5 18c-1.746 0-3.332.477-4.5 1.253"
                    />
                  </svg>
                  <span>
                    Documentation
                    <span> Everything is in there </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://nx.dev/blog/?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M19 20H5a2 2 0 01-2-2V6a2 2 0 012-2h10a2 2 0 012 2v1m2 13a2 2 0 01-2-2V7m2 13a2 2 0 002-2V9a2 2 0 00-2-2h-2m-4-3H9M7 16h6M7 8h6v4H7V8z"
                    />
                  </svg>
                  <span>
                    Blog
                    <span> Changelog, features & events </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://www.youtube.com/@NxDevtools/videos?utm_source=nx-project&sub_confirmation=1"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    role="img"
                    viewBox="0 0 24 24"
                    fill="currentColor"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <title>YouTube</title>
                    <path d="M23.498 6.186a3.016 3.016 0 0 0-2.122-2.136C19.505 3.545 12 3.545 12 3.545s-7.505 0-9.377.505A3.017 3.017 0 0 0 .502 6.186C0 8.07 0 12 0 12s0 3.93.502 5.814a3.016 3.016 0 0 0 2.122 2.136c1.871.505 9.376.505 9.376.505s7.505 0 9.377-.505a3.015 3.015 0 0 0 2.122-2.136C24 15.93 24 12 24 12s0-3.93-.502-5.814zM9.545 15.568V8.432L15.818 12l-6.273 3.568z" />
                  </svg>
                  <span>
                    YouTube channel
                    <span> Nx Show, talks & tutorials </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
                <a
                  href="https://nx.dev/react-tutorial/1-code-generation?utm_source=nx-project"
                  target="_blank"
                  rel="noreferrer"
                  className="list-item-link"
                >
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M15 15l-2 5L9 9l11 4-5 2zm0 0l5 5M7.188 2.239l.777 2.897M5.136 7.965l-2.898-.777M13.95 4.05l-2.122 2.122m-5.657 5.656l-2.12 2.122"
                    />
                  </svg>
                  <span>
                    Interactive tutorials
                    <span> Create an app, step-by-step </span>
                  </span>
                  <svg
                    fill="none"
                    stroke="currentColor"
                    viewBox="0 0 24 24"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      strokeWidth="2"
                      d="M9 5l7 7-7 7"
                    />
                  </svg>
                </a>
              </div>
              <a
                id="nx-repo"
                className="button-pill rounded shadow"
                href="https://github.com/nrwl/nx?utm_source=nx-project"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  fill="currentColor"
                  role="img"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path d="M12 .297c-6.63 0-12 5.373-12 12 0 5.303 3.438 9.8 8.205 11.385.6.113.82-.258.82-.577 0-.285-.01-1.04-.015-2.04-3.338.724-4.042-1.61-4.042-1.61C4.422 18.07 3.633 17.7 3.633 17.7c-1.087-.744.084-.729.084-.729 1.205.084 1.838 1.236 1.838 1.236 1.07 1.835 2.809 1.305 3.495.998.108-.776.417-1.305.76-1.605-2.665-.3-5.466-1.332-5.466-5.93 0-1.31.465-2.38 1.235-3.22-.135-.303-.54-1.523.105-3.176 0 0 1.005-.322 3.3 1.23.96-.267 1.98-.399 3-.405 1.02.006 2.04.138 3 .405 2.28-1.552 3.285-1.23 3.285-1.23.645 1.653.24 2.873.12 3.176.765.84 1.23 1.91 1.23 3.22 0 4.61-2.805 5.625-5.475 5.92.42.36.81 1.096.81 2.22 0 1.606-.015 2.896-.015 3.286 0 .315.21.69.825.57C20.565 22.092 24 17.592 24 12.297c0-6.627-5.373-12-12-12" />
                </svg>
                <span>
                  Nx is open source
                  <span> Love Nx? Give us a star! </span>
                </span>
              </a>
            </div>
            <div id="other-links">
              <a
                id="nx-console"
                className="button-pill rounded shadow"
                href="https://marketplace.visualstudio.com/items?itemName=nrwl.angular-console&utm_source=nx-project"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  fill="currentColor"
                  role="img"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <title>Visual Studio Code</title>
                  <path d="M23.15 2.587L18.21.21a1.494 1.494 0 0 0-1.705.29l-9.46 8.63-4.12-3.128a.999.999 0 0 0-1.276.057L.327 7.261A1 1 0 0 0 .326 8.74L3.899 12 .326 15.26a1 1 0 0 0 .001 1.479L1.65 17.94a.999.999 0 0 0 1.276.057l4.12-3.128 9.46 8.63a1.492 1.492 0 0 0 1.704.29l4.942-2.377A1.5 1.5 0 0 0 24 20.06V3.939a1.5 1.5 0 0 0-.85-1.352zm-5.146 14.861L10.826 12l7.178-5.448v10.896z" />
                </svg>
                <span>
                  Install Nx Console for VSCode
                  <span>The official VSCode extension for Nx.</span>
                </span>
              </a>
              <a
                id="nx-console-jetbrains"
                className="button-pill rounded shadow"
                href="https://plugins.jetbrains.com/plugin/21060-nx-console"
                target="_blank"
                rel="noreferrer"
              >
                <svg
                  height="48"
                  width="48"
                  viewBox="20 20 60 60"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path d="m22.5 22.5h60v60h-60z" />
                  <g fill="#fff">
                    <path d="m29.03 71.25h22.5v3.75h-22.5z" />
                    <path d="m28.09 38 1.67-1.58a1.88 1.88 0 0 0 1.47.87c.64 0 1.06-.44 1.06-1.31v-5.98h2.58v6a3.48 3.48 0 0 1 -.87 2.6 3.56 3.56 0 0 1 -2.57.95 3.84 3.84 0 0 1 -3.34-1.55z" />
                    <path d="m36 30h7.53v2.19h-5v1.44h4.49v2h-4.42v1.49h5v2.21h-7.6z" />
                    <path d="m47.23 32.29h-2.8v-2.29h8.21v2.27h-2.81v7.1h-2.6z" />
                    <path d="m29.13 43.08h4.42a3.53 3.53 0 0 1 2.55.83 2.09 2.09 0 0 1 .6 1.53 2.16 2.16 0 0 1 -1.44 2.09 2.27 2.27 0 0 1 1.86 2.29c0 1.61-1.31 2.59-3.55 2.59h-4.44zm5 2.89c0-.52-.42-.8-1.18-.8h-1.29v1.64h1.24c.79 0 1.25-.26 1.25-.81zm-.9 2.66h-1.57v1.73h1.62c.8 0 1.24-.31 1.24-.86 0-.5-.4-.87-1.27-.87z" />
                    <path d="m38 43.08h4.1a4.19 4.19 0 0 1 3 1 2.93 2.93 0 0 1 .9 2.19 3 3 0 0 1 -1.93 2.89l2.24 3.27h-3l-1.88-2.84h-.87v2.84h-2.56zm4 4.5c.87 0 1.39-.43 1.39-1.11 0-.75-.54-1.12-1.4-1.12h-1.44v2.26z" />
                    <path d="m49.59 43h2.5l4 9.44h-2.79l-.67-1.69h-3.63l-.67 1.69h-2.71zm2.27 5.73-1-2.65-1.06 2.65z" />
                    <path d="m56.46 43.05h2.6v9.37h-2.6z" />
                    <path d="m60.06 43.05h2.42l3.37 5v-5h2.57v9.37h-2.26l-3.53-5.14v5.14h-2.57z" />
                    <path d="m68.86 51 1.45-1.73a4.84 4.84 0 0 0 3 1.13c.71 0 1.08-.24 1.08-.65 0-.4-.31-.6-1.59-.91-2-.46-3.53-1-3.53-2.93 0-1.74 1.37-3 3.62-3a5.89 5.89 0 0 1 3.86 1.25l-1.26 1.84a4.63 4.63 0 0 0 -2.62-.92c-.63 0-.94.25-.94.6 0 .42.32.61 1.63.91 2.14.46 3.44 1.16 3.44 2.91 0 1.91-1.51 3-3.79 3a6.58 6.58 0 0 1 -4.35-1.5z" />
                  </g>
                </svg>
                <span>
                  Install Nx Console for JetBrains
                  <span>
                    Available for WebStorm, Intellij IDEA Ultimate and more!
                  </span>
                </span>
              </a>
              <div id="nx-cloud" className="rounded shadow">
                <div>
                  <svg
                    id="nx-cloud-logo"
                    role="img"
                    xmlns="http://www.w3.org/2000/svg"
                    stroke="currentColor"
                    fill="transparent"
                    viewBox="0 0 24 24"
                  >
                    <path
                      strokeWidth="2"
                      d="M23 3.75V6.5c-3.036 0-5.5 2.464-5.5 5.5s-2.464 5.5-5.5 5.5-5.5 2.464-5.5 5.5H3.75C2.232 23 1 21.768 1 20.25V3.75C1 2.232 2.232 1 3.75 1h16.5C21.768 1 23 2.232 23 3.75Z"
                    />
                    <path
                      strokeWidth="2"
                      d="M23 6v14.1667C23 21.7307 21.7307 23 20.1667 23H6c0-3.128 2.53867-5.6667 5.6667-5.6667 3.128 0 5.6666-2.5386 5.6666-5.6666C17.3333 8.53867 19.872 6 23 6Z"
                    />
                  </svg>
                  <h2>
                    Nx Cloud
                    <span>Enable faster CI & better DX</span>
                  </h2>
                </div>
                <p>Your workspace is connected to Nx Cloud.</p>
                <a
                  href="https://nx.dev/ci/intro/ci-with-nx#learn-about-nx-on-ci"
                  target="_blank"
                  rel="noreferrer"
                >
                  {' '}
                  Learn about Nx on CI
                </a>
              </div>
            </div>
          </div>

          <div id="commands" className="rounded shadow">
            <h2>Next steps</h2>
            <p>Here are some things you can do with Nx:</p>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                Build, test and lint your app
              </summary>
              <pre>
                <span># Build</span>
                nx build {title}
                <span># Test</span>
                nx test {title}
                <span># Lint</span>
                nx lint {title}
                <span># Run them together!</span>
                nx run-many -p {title} -t build test lint
              </pre>
            </details>

            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                View project details
              </summary>
              <pre>nx show project {title}</pre>
            </details>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                View interactive project graph
              </summary>
              <pre>nx graph</pre>
            </details>
            <details>
              <summary>
                <svg
                  fill="none"
                  stroke="currentColor"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                  />
                </svg>
                Add UI library
              </summary>
              <pre>
                <span># Generate UI lib</span>
                nx g @nx/react:lib ui
                <span># Add a component</span>
                nx g @nx/react:component ui/src/lib/button
              </pre>
            </details>
          </div>

          <p id="love">
            Carefully crafted with
            <svg
              fill="currentColor"
              stroke="none"
              viewBox="0 0 24 24"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M4.318 6.318a4.5 4.5 0 000 6.364L12 20.364l7.682-7.682a4.5 4.5 0 00-6.364-6.364L12 7.636l-1.318-1.318a4.5 4.5 0 00-6.364 0z"
              />
            </svg>
          </p>
        </div>
      </div>
    </>
  );
}

export default NxWelcome;
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\main.tsx

```tsx
import { StrictMode } from 'react';
import { BrowserRouter } from 'react-router-dom';
import * as ReactDOM from 'react-dom/client';
import App from './app/app';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement,
);

root.render(
  <StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </StrictMode>,
);
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\src\styles.css

```css
/* You can add global styles to this file, and also import other style files */
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.app.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "dist",
    "tsBuildInfoFile": "dist/tsconfig.app.tsbuildinfo",
    "jsx": "react-jsx",
    "lib": ["dom"],
    "types": [
      "node",
      "@nx/react/typings/cssmodule.d.ts",
      "@nx/react/typings/image.d.ts",
      "vite/client"
    ],
    "rootDir": "src"
  },
  "exclude": [
    "out-tsc",
    "dist",
    "src/**/*.spec.ts",
    "src/**/*.test.ts",
    "src/**/*.spec.tsx",
    "src/**/*.test.tsx",
    "src/**/*.spec.js",
    "src/**/*.test.js",
    "src/**/*.spec.jsx",
    "src/**/*.test.jsx",
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "eslint.config.js",
    "eslint.config.cjs",
    "eslint.config.mjs"
  ],
  "include": ["src/**/*.js", "src/**/*.jsx", "src/**/*.ts", "src/**/*.tsx"]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.json

```json
{
  "files": [],
  "include": [],
  "references": [
    {
      "path": "./tsconfig.app.json"
    },
    {
      "path": "./tsconfig.spec.json"
    }
  ],
  "extends": "../../tsconfig.base.json"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\frontend-docente\tsconfig.spec.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "./out-tsc/vitest",
    "types": [
      "vitest/globals",
      "vitest/importMeta",
      "vite/client",
      "node",
      "vitest",
      "@nx/react/typings/cssmodule.d.ts",
      "@nx/react/typings/image.d.ts"
    ],
    "jsx": "react-jsx"
  },
  "include": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "src/**/*.d.ts"
  ],
  "references": [
    {
      "path": "./tsconfig.app.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\project.json

```json
{
  "name": "pipeline",
  "$schema": "../../node_modules/nx/schemas/project-schema.json",
  "projectType": "application",
  "sourceRoot": "apps/pipeline/pipeline",
  "targets": {
    "lock": {
      "executor": "@nxlv/python:lock",
      "options": {
        "update": false
      }
    },
    "sync": {
      "executor": "@nxlv/python:sync",
      "options": {}
    },
    "add": {
      "executor": "@nxlv/python:add",
      "options": {}
    },
    "update": {
      "executor": "@nxlv/python:update",
      "options": {}
    },
    "remove": {
      "executor": "@nxlv/python:remove",
      "options": {}
    },
    "build": {
      "executor": "@nxlv/python:build",
      "outputs": ["{projectRoot}/dist"],
      "options": {
        "outputPath": "{projectRoot}/dist",
        "publish": false,
        "lockedVersions": true,
        "bundleLocalDependencies": true
      },
      "cache": true
    },
    "lint": {
      "executor": "@nxlv/python:ruff-check",
      "outputs": [],
      "options": {
        "lintFilePatterns": []
      },
      "cache": true
    },
    "format": {
      "executor": "@nxlv/python:ruff-format",
      "outputs": [],
      "options": {
        "filePatterns": []
      },
      "cache": true
    },
    "test": {
      "executor": "@nxlv/python:run-commands",
      "outputs": [
        "{workspaceRoot}/reports/{projectRoot}/unittests",
        "{workspaceRoot}/coverage/{projectRoot}"
      ],
      "options": {
        "command": "uv run pytest tests/",
        "cwd": "{projectRoot}"
      },
      "cache": true
    },
    "install": {
      "executor": "@nxlv/python:install",
      "options": {
        "silent": false,
        "args": "",
        "verbose": false,
        "debug": false
      }
    }
  },
  "tags": [],
  "release": {
    "version": {
      "versionActions": "@nxlv/python/release/version-actions"
    }
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\pyproject.toml

```toml
[tool.coverage.run]
branch = true
source = [ "src" ]

[tool.coverage.report]
exclude_lines = ['if TYPE_CHECKING:']
show_missing = true

[tool.pytest.ini_options]
addopts = """
 --cov
 --cov-report html:'../../coverage/apps/pipeline/html'
 --cov-report xml:'../../coverage/apps/pipeline/coverage.xml'
 --html='../../reports/apps/pipeline/unittests/html/index.html'
 --junitxml='../../reports/apps/pipeline/unittests/junit.xml'
"""

[project]
name = "pipeline"
version = "1.0.0"
description = "Automatically generated by Nx."
requires-python = ">=3.9,<4"
readme = 'README.md'
dependencies = []


[dependency-groups]
dev = [
  "autopep8>=2.3.1",
  "ruff>=0.8.2",
  "pytest>=8.3.4",
  "pytest-sugar>=1.0.0",
  "pytest-cov>=6.0.0",
  "pytest-html>=4.1.1",
]

[build-system]
requires = ["uv_build>=0.8.9,<0.9.0"]
build-backend = "uv_build"

[tool.ruff]
exclude = [
  ".ruff_cache",
  ".svn",
  ".tox",
  ".venv",
  "dist",
]

line-length = 88
indent-width = 4

[tool.ruff.lint]
select = [
  # pycodestyle
  "E",
  # Pyflakes
  "F",
  # pyupgrade
  "UP",
  # flake8-bugbear
  "B",
  # flake8-simplify
  "SIM",
  # isort
  "I",
]
ignore = []

fixable = ["ALL"]
unfixable = []
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\README.md

```md
# pipeline

Project description here.
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\pipeline\__init__.py

```python
"""Automatically generated by Nx."""
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\src\pipeline\hello.py

```python
"""Sample Hello World application."""


def hello():
    """Return a friendly greeting."""
    return "Hello pipeline"
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\__init__.py

```python
"""unit tests."""
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\conftest.py

```python
"""Unit tests configuration module."""
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\apps\pipeline\tests\test_hello.py

```python
"""Hello unit test module."""

from pipeline.hello import hello


def test_hello():
    """Test the hello function."""
    assert hello() == "Hello pipeline"
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\docker-compose.yml

```yaml
# docker-compose.yml
#
# Infraestrutura local do GAD.
# Sobe Postgres + Redis em containers isolados — NADA é instalado no host.
#
# Uso:
#   docker compose up -d        → sobe tudo em background
#   docker compose down         → para e remove os containers
#   docker compose down -v      → para, remove containers E apaga os dados
#
# Os dados persistem entre restarts graças aos volumes nomeados abaixo.
# Se quiser começar do zero, use "down -v".

services:
  postgres:
    image: postgres:16-alpine
    container_name: gad-postgres
    restart: unless-stopped
    ports:
      - "5432:5432"
    environment:
      POSTGRES_DB: gad
      POSTGRES_USER: gad
      POSTGRES_PASSWORD: gad
    volumes:
      - gad-pgdata:/var/lib/postgresql/data
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U gad -d gad"]
      interval: 5s
      timeout: 5s
      retries: 5

  redis:
    image: redis:7-alpine
    container_name: gad-redis
    restart: unless-stopped
    ports:
      - "6379:6379"
    volumes:
      - gad-redisdata:/data
    healthcheck:
      test: ["CMD", "redis-cli", "ping"]
      interval: 5s
      timeout: 5s
      retries: 5

  # ---- GUIs Web (acessíveis pelo browser) ----

  pgadmin:
    image: dpage/pgadmin4:latest
    container_name: gad-pgadmin
    restart: unless-stopped
    ports:
      - "5050:80"
    environment:
      PGADMIN_DEFAULT_EMAIL: admin@gad.dev
      PGADMIN_DEFAULT_PASSWORD: admin
      PGADMIN_CONFIG_SERVER_MODE: "False"        # abre direto sem login de servidor
      PGADMIN_CONFIG_MASTER_PASSWORD_REQUIRED: "False"
    volumes:
      - gad-pgadmin:/var/lib/pgadmin
    depends_on:
      postgres:
        condition: service_healthy

  redisinsight:
    image: redis/redisinsight:latest
    container_name: gad-redisinsight
    restart: unless-stopped
    ports:
      - "5540:5540"
    depends_on:
      redis:
        condition: service_healthy

volumes:
  gad-pgdata:
  gad-redisdata:
  gad-pgadmin:
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\eslint.config.mjs

```js
import nx from '@nx/eslint-plugin';

export default [
  ...nx.configs['flat/base'],
  ...nx.configs['flat/typescript'],
  ...nx.configs['flat/javascript'],
  {
    ignores: [
      '**/dist',
      '**/out-tsc',
      '**/vite.config.*.timestamp*',
      '**/vitest.config.*.timestamp*',
      '**/test-output',
    ],
  },
  {
    files: ['**/*.ts', '**/*.tsx', '**/*.js', '**/*.jsx'],
    rules: {
      '@nx/enforce-module-boundaries': [
        'error',
        {
          enforceBuildableLibDependency: true,
          allow: ['^.*/eslint(\\.base)?\\.config\\.[cm]?[jt]s$'],
          depConstraints: [
            {
              sourceTag: '*',
              onlyDependOnLibsWithTags: ['*'],
            },
          ],
        },
      ],
    },
  },
  {
    files: [
      '**/*.ts',
      '**/*.tsx',
      '**/*.cts',
      '**/*.mts',
      '**/*.js',
      '**/*.jsx',
      '**/*.cjs',
      '**/*.mjs',
    ],
    // Override or add rules here
    rules: {},
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\eslint.config.mjs

```js
import baseConfig from '../../eslint.config.mjs';

export default [
  ...baseConfig,
  {
    files: ['**/*.json'],
    rules: {
      '@nx/dependency-checks': [
        'error',
        {
          ignoredFiles: [
            '{projectRoot}/eslint.config.{js,cjs,mjs,ts,cts,mts}',
            '{projectRoot}/vite.config.{js,ts,mjs,mts}',
          ],
        },
      ],
    },
    languageOptions: {
      parser: await import('jsonc-eslint-parser'),
    },
  },
  {
    ignores: ['**/out-tsc'],
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\package.json

```json
{
  "name": "@gad/api-client-ts",
  "version": "0.0.1",
  "private": true,
  "type": "module",
  "main": "./dist/index.js",
  "module": "./dist/index.js",
  "types": "./dist/index.d.ts",
  "exports": {
    "./package.json": "./package.json",
    ".": {
      "@gad/source": "./src/index.ts",
      "types": "./dist/index.d.ts",
      "import": "./dist/index.js",
      "default": "./dist/index.js"
    }
  },
  "dependencies": {
    "tslib": "^2.3.0"
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\README.md

```md
# api-client-ts

This library was generated with [Nx](https://nx.dev).

## Building

Run `nx build api-client-ts` to build the library.

## Running unit tests

Run `nx test api-client-ts` to execute the unit tests via [Vitest](https://vitest.dev/).
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\index.ts

```ts
export * from './lib/api-client-ts.js';
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\lib\api-client-ts.spec.ts

```ts
import { apiClientTs } from './api-client-ts.js';

describe('apiClientTs', () => {
  it('should work', () => {
    expect(apiClientTs()).toEqual('api-client-ts');
  });
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\src\lib\api-client-ts.ts

```ts
export function apiClientTs(): string {
  return 'api-client-ts';
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.json

```json
{
  "extends": "../../tsconfig.base.json",
  "files": [],
  "include": [],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    },
    {
      "path": "./tsconfig.spec.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.lib.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "baseUrl": ".",
    "rootDir": "src",
    "outDir": "dist",
    "tsBuildInfoFile": "dist/tsconfig.lib.tsbuildinfo",
    "emitDeclarationOnly": false,
    "module": "nodenext",
    "moduleResolution": "nodenext",
    "forceConsistentCasingInFileNames": true,
    "types": ["node"]
  },
  "include": ["src/**/*.ts"],
  "references": [],
  "exclude": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx"
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\api-client-ts\tsconfig.spec.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "./out-tsc/vitest",
    "types": [
      "vitest/globals",
      "vitest/importMeta",
      "vite/client",
      "node",
      "vitest"
    ],
    "module": "nodenext",
    "moduleResolution": "nodenext",
    "forceConsistentCasingInFileNames": true
  },
  "include": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "src/**/*.d.ts"
  ],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\eslint.config.mjs

```js
import baseConfig from '../../eslint.config.mjs';

export default [
  ...baseConfig,
  {
    files: ['**/*.json'],
    rules: {
      '@nx/dependency-checks': [
        'error',
        {
          ignoredFiles: [
            '{projectRoot}/eslint.config.{js,cjs,mjs,ts,cts,mts}',
            '{projectRoot}/vite.config.{js,ts,mjs,mts}',
          ],
        },
      ],
    },
    languageOptions: {
      parser: await import('jsonc-eslint-parser'),
    },
  },
  {
    ignores: ['**/out-tsc'],
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\package.json

```json
{
  "name": "@gad/contracts-ts",
  "version": "0.0.1",
  "private": true,
  "type": "module",
  "main": "./dist/index.js",
  "module": "./dist/index.js",
  "types": "./dist/index.d.ts",
  "exports": {
    "./package.json": "./package.json",
    ".": {
      "@gad/source": "./src/index.ts",
      "types": "./dist/index.d.ts",
      "import": "./dist/index.js",
      "default": "./dist/index.js"
    }
  },
  "dependencies": {
    "tslib": "^2.3.0"
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\README.md

```md
# contracts-ts

This library was generated with [Nx](https://nx.dev).

## Building

Run `nx build contracts-ts` to build the library.

## Running unit tests

Run `nx test contracts-ts` to execute the unit tests via [Vitest](https://vitest.dev/).
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\index.ts

```ts
export * from './lib/contracts-ts.js';
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\lib\contracts-ts.spec.ts

```ts
import { contractsTs } from './contracts-ts.js';

describe('contractsTs', () => {
  it('should work', () => {
    expect(contractsTs()).toEqual('contracts-ts');
  });
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\src\lib\contracts-ts.ts

```ts
export function contractsTs(): string {
  return 'contracts-ts';
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.json

```json
{
  "extends": "../../tsconfig.base.json",
  "files": [],
  "include": [],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    },
    {
      "path": "./tsconfig.spec.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.lib.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "baseUrl": ".",
    "rootDir": "src",
    "outDir": "dist",
    "tsBuildInfoFile": "dist/tsconfig.lib.tsbuildinfo",
    "emitDeclarationOnly": false,
    "module": "nodenext",
    "moduleResolution": "nodenext",
    "forceConsistentCasingInFileNames": true,
    "types": ["node"]
  },
  "include": ["src/**/*.ts"],
  "references": [],
  "exclude": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx"
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\contracts-ts\tsconfig.spec.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "./out-tsc/vitest",
    "types": [
      "vitest/globals",
      "vitest/importMeta",
      "vite/client",
      "node",
      "vitest"
    ],
    "module": "nodenext",
    "moduleResolution": "nodenext",
    "forceConsistentCasingInFileNames": true
  },
  "include": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "src/**/*.d.ts"
  ],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\eslint.config.mjs

```js
import nx from '@nx/eslint-plugin';
import baseConfig from '../../eslint.config.mjs';

export default [
  ...nx.configs['flat/react'],
  ...baseConfig,
  {
    files: ['**/*.ts', '**/*.tsx', '**/*.js', '**/*.jsx'],
    // Override or add rules here
    rules: {},
  },
  {
    ignores: ['**/out-tsc'],
  },
];
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\package.json

```json
{
  "name": "@gad/ui-components",
  "version": "0.0.1",
  "type": "module",
  "main": "./dist/index.js",
  "module": "./dist/index.js",
  "types": "./dist/index.d.ts",
  "exports": {
    "./package.json": "./package.json",
    ".": {
      "@gad/source": "./src/index.ts",
      "types": "./dist/index.d.ts",
      "import": "./dist/index.js",
      "default": "./dist/index.js"
    }
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\README.md

```md
# @gad/ui-components

This library was generated with [Nx](https://nx.dev).

## Running unit tests

Run `nx test @gad/ui-components` to execute the unit tests via [Vitest](https://vitest.dev/).
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\index.ts

```ts
export * from './lib/ui-components';
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.module.css

```css
/*
 * Replace this with your own classes
 *
 * e.g.
 * .container {
 * }
*/
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.spec.tsx

```tsx
import { render } from '@testing-library/react';

import GadUiComponents from './ui-components';

describe('GadUiComponents', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<GadUiComponents />);
    expect(baseElement).toBeTruthy();
  });
});
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\src\lib\ui-components.tsx

```tsx
import styles from './ui-components.module.css';

export function GadUiComponents() {
  return (
    <div className={styles['container']}>
      <h1>Welcome to GadUiComponents!</h1>
    </div>
  );
}

export default GadUiComponents;
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.json

```json
{
  "files": [],
  "include": [],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    },
    {
      "path": "./tsconfig.spec.json"
    }
  ],
  "extends": "../../tsconfig.base.json"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.lib.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "dist",
    "types": [
      "node",
      "@nx/react/typings/cssmodule.d.ts",
      "@nx/react/typings/image.d.ts",
      "vite/client"
    ],
    "rootDir": "src",
    "jsx": "react-jsx",
    "tsBuildInfoFile": "dist/tsconfig.lib.tsbuildinfo"
  },
  "exclude": [
    "out-tsc",
    "dist",
    "**/*.spec.ts",
    "**/*.test.ts",
    "**/*.spec.tsx",
    "**/*.test.tsx",
    "**/*.spec.js",
    "**/*.test.js",
    "**/*.spec.jsx",
    "**/*.test.jsx",
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "eslint.config.js",
    "eslint.config.cjs",
    "eslint.config.mjs"
  ],
  "include": ["src/**/*.js", "src/**/*.jsx", "src/**/*.ts", "src/**/*.tsx"]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\libs\ui-components\tsconfig.spec.json

```json
{
  "extends": "../../tsconfig.base.json",
  "compilerOptions": {
    "outDir": "./out-tsc/vitest",
    "types": [
      "vitest/globals",
      "vitest/importMeta",
      "vite/client",
      "node",
      "vitest"
    ],
    "jsx": "react-jsx"
  },
  "include": [
    "vite.config.ts",
    "vite.config.mts",
    "vitest.config.ts",
    "vitest.config.mts",
    "src/**/*.test.ts",
    "src/**/*.spec.ts",
    "src/**/*.test.tsx",
    "src/**/*.spec.tsx",
    "src/**/*.test.js",
    "src/**/*.spec.js",
    "src/**/*.test.jsx",
    "src/**/*.spec.jsx",
    "src/**/*.d.ts"
  ],
  "references": [
    {
      "path": "./tsconfig.lib.json"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\nx.json

```json
{
  "$schema": "./node_modules/nx/schemas/nx-schema.json",
  "defaultBase": "master",
  "analytics": false,
  "namedInputs": {
    "default": ["{projectRoot}/**/*", "sharedGlobals"],
    "production": [
      "default",
      "!{projectRoot}/.eslintrc.json",
      "!{projectRoot}/eslint.config.mjs",
      "!{projectRoot}/**/?(*.)+(spec|test).[jt]s?(x)?(.snap)",
      "!{projectRoot}/tsconfig.spec.json",
      "!{projectRoot}/src/test-setup.[jt]s",
      "!{projectRoot}/src/test/**/*"
    ],
    "sharedGlobals": []
  },
  "plugins": [
    {
      "plugin": "@nx/js/typescript",
      "options": {
        "typecheck": {
          "targetName": "typecheck"
        },
        "build": {
          "targetName": "build",
          "configName": "tsconfig.lib.json",
          "buildDepsName": "build-deps",
          "watchDepsName": "watch-deps"
        }
      }
    },
    {
      "plugin": "@nx/eslint/plugin",
      "options": {
        "targetName": "lint"
      }
    },
    {
      "plugin": "@nx/vite/plugin",
      "options": {
        "buildTargetName": "build",
        "testTargetName": "test",
        "serveTargetName": "serve",
        "devTargetName": "dev",
        "previewTargetName": "preview",
        "serveStaticTargetName": "serve-static",
        "typecheckTargetName": "typecheck",
        "buildDepsTargetName": "build-deps",
        "watchDepsTargetName": "watch-deps"
      }
    },
    {
      "plugin": "@nx/vitest",
      "options": {
        "testTargetName": "test",
        "ciTargetName": "test-ci",
        "testMode": "watch"
      }
    },
    {
      "plugin": "@nx/playwright/plugin",
      "options": {
        "targetName": "e2e"
      }
    },
    {
      "plugin": "@nx/docker",
      "options": {
        "buildTarget": {
          "name": "docker:build"
        },
        "runTarget": {
          "name": "docker:run"
        }
      }
    },
    {
      "plugin": "@nx/gradle",
      "options": {
        "testTargetName": "test",
        "classesTargetName": "classes",
        "buildTargetName": "build"
      }
    }
  ],
  "targetDefaults": {
    "test": {
      "dependsOn": ["^build"]
    }
  },
  "generators": {
    "@nx/react": {
      "application": {
        "babel": true,
        "style": "css",
        "linter": "eslint",
        "bundler": "vite"
      },
      "component": {
        "style": "css"
      },
      "library": {
        "style": "css",
        "linter": "eslint",
        "unitTestRunner": "vitest"
      }
    }
  },
  "nxCloudId": "69e2c5180680f8c80c42022b"
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\package.json

```json
{
  "name": "@gad/source",
  "version": "0.0.0",
  "license": "MIT",
  "scripts": {},
  "private": true,
  "dependencies": {
    "react": "^19.0.0",
    "react-dom": "^19.0.0",
    "react-router-dom": "6.30.3"
  },
  "devDependencies": {
    "@babel/core": "^7.14.5",
    "@babel/preset-react": "^7.14.5",
    "@eslint/js": "^9.8.0",
    "@nx/devkit": "22.6.5",
    "@nx/docker": "^22.6.5",
    "@nx/eslint": "22.6.5",
    "@nx/eslint-plugin": "22.6.5",
    "@nx/gradle": "^22.6.5",
    "@nx/js": "22.6.5",
    "@nx/playwright": "22.6.5",
    "@nx/react": "22.6.5",
    "@nx/vite": "22.6.5",
    "@nx/vitest": "22.6.5",
    "@nx/web": "22.6.5",
    "@nx/workspace": "22.6.5",
    "@nxlv/python": "^22.1.2",
    "@playwright/test": "^1.36.0",
    "@swc-node/register": "~1.11.1",
    "@swc/cli": "~0.8.0",
    "@swc/core": "~1.15.5",
    "@swc/helpers": "~0.5.18",
    "@testing-library/dom": "10.4.0",
    "@testing-library/react": "16.3.0",
    "@types/node": "20.19.9",
    "@types/react": "^19.0.0",
    "@types/react-dom": "^19.0.0",
    "@vitejs/plugin-react": "^6.0.0",
    "@vitest/coverage-v8": "~4.1.0",
    "@vitest/ui": "~4.1.0",
    "eslint": "^9.8.0",
    "eslint-config-prettier": "^10.0.0",
    "eslint-plugin-import": "2.31.0",
    "eslint-plugin-jsx-a11y": "6.10.1",
    "eslint-plugin-playwright": "^1.6.2",
    "eslint-plugin-react": "7.35.0",
    "eslint-plugin-react-hooks": "5.0.0",
    "jiti": "2.4.2",
    "jsdom": "~22.1.0",
    "jsonc-eslint-parser": "^2.1.0",
    "nx": "22.6.5",
    "prettier": "~3.6.2",
    "tslib": "^2.3.0",
    "typescript": "~5.9.2",
    "typescript-eslint": "^8.40.0",
    "vite": "^8.0.0",
    "vite-plugin-dts": "~4.5.0",
    "vitest": "~4.1.0"
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\pnpm-workspace.yaml

```yaml
packages:
  - "apps/*"
  - "libs/**"
autoInstallPeers: true
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\project.json

```json
{
  "name": "infra",
  "$schema": "node_modules/nx/schemas/project-schema.json",
  "projectType": "application",
  "targets": {
    "up": {
      "command": "docker compose up -d --wait",
      "cache": false,
      "metadata": {
        "description": "Sobe Postgres + Redis + GUIs e aguarda healthchecks"
      }
    },
    "down": {
      "command": "docker compose down",
      "cache": false,
      "metadata": {
        "description": "Para e remove os containers (dados preservados)"
      }
    },
    "reset": {
      "command": "docker compose down -v",
      "cache": false,
      "metadata": {
        "description": "Para containers e APAGA todos os dados (reset total)"
      }
    },
    "logs": {
      "command": "docker compose logs -f",
      "cache": false,
      "metadata": {
        "description": "Exibe logs dos containers em tempo real"
      }
    },
    "ps": {
      "command": "docker compose ps",
      "cache": false,
      "metadata": {
        "description": "Lista status dos containers"
      }
    }
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\README.md

```md
# Sistema GAD — Gerenciador de Atividades Diversificadas

Monorepo Nx que abriga o sistema GAD do IFMS Naviraí, com classificação
automática de certificados acadêmicos via NLP.

## Apps

- `apps/web-react` — Frontend React (painel do aluno e do professor)
- `apps/backend` — Backend Spring Boot (orquestração e autenticação) — em construção
- `apps/pipeline` — Serviço FastAPI de NLP (Docling + GLiNER2 + LoRA) — em construção
- `apps/docs` — Documentação técnica em MkDocs Material — em construção

## Stack

- **Orquestração**: Nx 22 (monorepo poliglota, cache remoto via Nx Cloud)
- **Frontend**: React 19 + Vite + Vitest + Playwright (PNPM)
- **Backend**: Java 21 + Spring Boot 3.5 + Gradle
- **Pipeline NLP**: Python 3.12 + FastAPI + UV (Astral)
- **Dados**: PostgreSQL + pgvector + Redis
- **Infra**: Docker Compose (dev local) + GitHub Actions (CI)
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\tsconfig.base.json

```json
{
  "compilerOptions": {
    "composite": true,
    "declarationMap": true,
    "emitDeclarationOnly": true,
    "importHelpers": true,
    "isolatedModules": true,
    "lib": ["es2022"],
    "module": "esnext",
    "moduleResolution": "bundler",
    "noEmitOnError": true,
    "noFallthroughCasesInSwitch": true,
    "noImplicitOverride": true,
    "noImplicitReturns": true,
    "noUnusedLocals": true,
    "skipLibCheck": true,
    "strict": true,
    "target": "es2022",
    "customConditions": ["@gad/source"]
  }
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\tsconfig.json

```json
{
  "extends": "./tsconfig.base.json",
  "compileOnSave": false,
  "files": [],
  "references": [
    {
      "path": "./libs/contracts-ts"
    },
    {
      "path": "./libs/api-client-ts"
    },
    {
      "path": "./libs/ui-components"
    },
    {
      "path": "./apps/frontend-discente-e2e"
    },
    {
      "path": "./apps/frontend-discente"
    },
    {
      "path": "./apps/frontend-docente-e2e"
    },
    {
      "path": "./apps/frontend-docente"
    }
  ]
}
```

## File: C:\Users\user\Documents\Vitor\Sistema_GAD\vitest.workspace.ts

```ts
export default [
  '**/vite.config.{mjs,js,ts,mts}',
  '**/vitest.config.{mjs,js,ts,mts}',
];
```
