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
