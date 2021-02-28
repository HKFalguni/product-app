//package com.rakuten.training.web;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rakuten.training.domain.Customer;
//import com.rakuten.training.service.CustomerService;
//
//@RestController
//public class CustomerController {
//	
//	@Autowired
//	CustomerService service;
//	
//	@GetMapping("/Customers")
//	public List<Customer> getAllCustomers(){
//		return service.findAll();
//	}
//	
//	@GetMapping("/Customers/{id}")
//	public ResponseEntity<Customer> getCustomerById(@PathVariable("id")int pid) {
//		Customer p = service.findbyId(pid);
//		if(p != null) {
//			return new ResponseEntity<Customer>(p, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	@PostMapping("/Customers")
//	public ResponseEntity addNewCustomer(@RequestBody Customer toBeAdded) {
//		
//		try {
//            int id = service.addCustomer(toBeAdded);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setLocation(URI.create("/Customers/"+id));
//            return new ResponseEntity<>(toBeAdded,headers,HttpStatus.CREATED);
//        } catch (IllegalArgumentException e) {
//            
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//	
//	
//}
//	