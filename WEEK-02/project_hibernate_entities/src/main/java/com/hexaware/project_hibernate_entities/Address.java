package com.hexaware.project_hibernate_entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Addresses")
public class Address {

	@Id
	@Column(name = "addressId")
	private int addressId;

	@Column(name = "addressLine")
	private String addressLine;

	@Column(name = "cityPincode")
	private String cityPincode;

	@Column(name = "state")
	private String state;

	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
	private List<Users> users;

	public Address() {
		super();

	}

	public Address(int addressId, String addressLine, String cityPincode, String state, List<Users> users) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.cityPincode = cityPincode;
		this.state = state;
		this.users = users;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCityPincode() {
		return cityPincode;
	}

	public void setCityPincode(String cityPincode) {
		this.cityPincode = cityPincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

}
