package ru.gb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
		

		//Bean - объект , жизненным циклом которого управляет Spring.
		//ApplicationContext - контейнер для бинов.
		//Singleton - класс, у которого только 1 объект


	}

}
