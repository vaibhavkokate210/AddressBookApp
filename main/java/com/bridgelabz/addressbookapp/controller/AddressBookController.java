package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController 
{
	 @Autowired
	 IAddressBookService service; 
	
	 @RequestMapping(value={"","/","/get"})
     public ResponseEntity<ResponseDTO> getAddressBookData()
     {
		 List<AddressBookData> dataList=null;
		 dataList=service.getAddressBookData();
    	 ResponseDTO respDTO=new ResponseDTO("Get call successful",dataList);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @GetMapping("/get/{bookId}")
     public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("bookId") int bookId)
     {
    	 AddressBookData dataList=null;
    	 dataList=service.getAddressBookDataById(bookId);
    	 ResponseDTO respDTO=new ResponseDTO("Get call Id successful",dataList);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @PostMapping("/create")
     public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 AddressBookData dataList=null;
    	 dataList=service.createAddressBookData(addressBookDTO);
    	 ResponseDTO respDTO=new ResponseDTO("created Address Book data successful",dataList);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @PutMapping("/update")
     public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 AddressBookData dataList=null;
    	 dataList=service.updateAddressBookData(addressBookDTO);
    	 ResponseDTO respDTO=new ResponseDTO("Updated Address Book data successfully",dataList);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
     }
     
     @DeleteMapping("/get/{empId}")
     public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId)
     {
    	 service.deleteAddressBookData(bookId);
    	 ResponseDTO respDTO=new ResponseDTO("Deleted successfully","Deleted id = "+bookId);
    	 return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    	 
     }
}
