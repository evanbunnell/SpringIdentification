/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Oct 18, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;

	public Address() {
		super();
	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	// getters
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	// setters
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
