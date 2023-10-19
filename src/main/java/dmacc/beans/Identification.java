/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Oct 18, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Identification {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private int age;
	private int weight;
	@Autowired
	private Address address;

	public Identification() {
		super();
	}

	public Identification(String name) {
		super();
		this.name = name;
	}

	public Identification(String name, String phone, int age, int weight) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.weight = weight;
	}

	public Identification(int id, String name, String phone, int age, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.weight = weight;
	}

	// getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}	
	
	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}	

	public Address getAddress() {
		return address;
	}

	// setters
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Identification [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", weight="
				+ weight + ", address=" + address + "]";
	}

	

	
}
