package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public class AddressBookService implements IAddressBookService
{
	@Override
	public List<AddressBookData> getAddressBookData() {
	     List<AddressBookData> list=new ArrayList<>();
	     list.add(new AddressBookData(1,new AddressBookDTO("Vaibhav","Kokate","Mali galli","Tasgaon","Maharashtra")));
		 return list;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id)
	{
		AddressBookData data;
		data = new AddressBookData(1,new AddressBookDTO("Vaibhav","Kokate","Mali galli","Tasgaon","Maharashtra"));
		return data;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO book) {
		AddressBookData data;
		data=new AddressBookData(1,book);
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
		
	}
}
