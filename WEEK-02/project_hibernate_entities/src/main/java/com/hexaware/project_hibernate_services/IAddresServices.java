package com.hexaware.project_hibernate_services;

import java.util.List;

import com.hexaware.project_hibernate_entities.Address;

public interface IAddresServices {
	public Address createAddress(Address address);
	public Address updateAddress(Address address);
	public void deleteByAddressId(int addressId);
	public List<Address> getByState(String state);
	public List<Address> getByCityPincode(String cityPincode);
	public List<Address> getAllAddress();

}
