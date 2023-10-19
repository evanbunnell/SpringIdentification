/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Oct 18, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Identification;

@Configuration
public class BeanConfiguration {
	@Bean
	public Identification identification(String name, String phone, int age, int weight) {
		Identification bean = new Identification();
		bean.setName(name);
		bean.setPhone(phone);
		bean.setAge(age);
		bean.setWeight(weight);
		return bean;
	}
	
	@Bean
	public Address address(String street, String city, String state) {
		Address bean = new Address(street, city, state);
		return bean;
	}
}
