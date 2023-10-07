package one.digitalinnovation.gof;
/**
 *
 * Projeto Spring Boot via String Initializr.
 * Os seguintes módulos foram selecionados:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenDeign
 *
 * @author IaraTassi
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
