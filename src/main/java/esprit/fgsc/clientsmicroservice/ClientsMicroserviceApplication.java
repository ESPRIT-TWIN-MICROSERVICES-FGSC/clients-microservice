package esprit.fgsc.clientsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ClientsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsMicroserviceApplication.class, args);
	}

}
