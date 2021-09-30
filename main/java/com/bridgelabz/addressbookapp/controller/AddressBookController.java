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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController 
{
	 @RequestMapping(value={"","/","/get"})
     public ResponseEntity<String> getAddressBookData()
     {
    	 return new ResponseEntity<String>("Get call success",HttpStatus.OK);
     }
     
     @GetMapping("/get/{bookId}")
     public ResponseEntity<String> getAddressBookDataById(@PathVariable("empId") int bookId)
     {
    	 return new ResponseEntity<String>("Get call success for id"+bookId,HttpStatus.OK);
     }
     
     @PostMapping("/create")
     public ResponseEntity<String> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 return new ResponseEntity<String>("created Address Book data for "+addressBookDTO,HttpStatus.OK);
     }
     @PutMapping("/update")
     public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
     {
    	 return new ResponseEntity<String>("Updated Address Book data for "+addressBookDTO,HttpStatus.OK);
     }
     @DeleteMapping("/get/{empId}")
     public ResponseEntity<String> deleteAddressBookData(@PathVariable("bookId") int bookId)
     {
    	 return new ResponseEntity<String>("Delete call success for "+bookId,HttpStatus.OK);
     }
}
