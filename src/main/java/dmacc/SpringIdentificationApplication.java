package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Identification;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.IdentificationRepository;

@SpringBootApplication
public class SpringIdentificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIdentificationApplication.class, args);
	}

	@Autowired
	IdentificationRepository repo;

	public void run(String[] args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		Identification identification = appContext.getBean("identification", Identification.class);
		repo.save(identification);

		// Creating a bean to use – not managed by Spring
		Identification id = new Identification("Danny Zuko", "319-319-3169", 24, 175);
		Address a = new Address("42069 Des Moines Street", "Keokuk", "IA");
		id.setAddress(a);
		repo.save(id);
		List<Identification> allMyIds = repo.findAll();
		for (Identification people : allMyIds) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
