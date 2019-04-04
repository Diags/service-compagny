package agixis.client.app.microservice.service.compagny;

import agixis.client.app.microservice.service.compagny.dao.CompanyRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ServiceCompagnyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCompagnyApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompanyRepo companyRepo){
        return args -> {
            Stream.of("Societe1","Societe2","Societe3","Societe4","Societe5").forEach(soc-> {

                companyRepo.save(new Company(null,soc,100+Math.random()*900));
            });
            companyRepo.findAll().forEach(System.out::println);
        };
    }
}
