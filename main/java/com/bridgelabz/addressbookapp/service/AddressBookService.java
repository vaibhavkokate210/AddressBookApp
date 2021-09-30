package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public class AddressBookService implements IAddressBookService{

	private List<AddressBookData> list=new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		 return list;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id)
	{
		return list.stream().filter(empData->empData.getBookId()==id).findFirst().orElseThrow(()->new AddressBookException("Address Book not found"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO book) {
		AddressBookData data;
		data=new AddressBookData(list.size()+1,book);
		list.add(data);
		return data;
	}

	@Override
	public  AddressBookData updateAddressBookData(AddressBookDTO book) {
		AddressBookData data;
		data=new AddressBookData(1,book);
		return data;
	}

	@Override
	public void deleteAddressBookData(int id) {
		list.remove(id-1);
	}
	
	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO dto) {
		AddressBookData data=this.getAddressBookDataById(id);
		data.setFirstName(dto.getFirstName());
		data.setLastName(dto.getLastName());
		data.setAddress(dto.getAddress());
		data.setCity(dto.getCity());
		data.setState(dto.getState());
		list.set(id-1, data);
		return data;
	}
}
