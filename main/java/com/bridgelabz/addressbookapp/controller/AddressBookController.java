package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.model.ResponseDTO;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController 
{
	 @RequestMapping(value={"","/","/get"})
     public ResponseEntity<ResponseDTO> getAddressBookData()
     {
		 AddressBookData data=null;
		 data=new AddressBookData(1,new AddressBookDTO("Vaibhav","Kokate","Mali galli","Tasgaon","Maharashtra"));
		 ResponseDTO respDTO=new ResponseDTO("Get call successful",data);
		 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @GetMapping("/get/{bookId}")
     public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("empId") int bookId)
     {
    	 AddressBookData data=null;
    	 data=new AddressBookData(1,new AddressBookDTO("Vaibhav","Kokate","Mali galli","Tasgaon","Maharashtra"));
    	 ResponseDTO respDTO=new ResponseDTO("Get call Id successful",data);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @PostMapping("/create")
     public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 AddressBookData data=null;
    	 data=new AddressBookData(1,addressBookDTO);
    	 ResponseDTO respDTO=new ResponseDTO("created Address Book data successful",data);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @PutMapping("/update")
     public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 AddressBookData data=null;
    	 data=new AddressBookData(1,addressBookDTO);
    	 ResponseDTO respDTO=new ResponseDTO("Updated Address Book data successfully",data);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     @DeleteMapping("/get/{empId}")
     public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId)
     {
    	 ResponseDTO respDTO=new ResponseDTO("Deleted successfully","Deleted id = "+bookId);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
}
