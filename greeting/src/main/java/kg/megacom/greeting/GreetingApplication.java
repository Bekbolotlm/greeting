package kg.megacom.greeting;

import kg.megacom.greeting.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {

	public static void main(String[] args) {


		SpringApplication.run(GreetingApplication.class, args);


		Employee employee = new Employee();

	}



}