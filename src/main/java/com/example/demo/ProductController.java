package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RequestMapping("/all")
@RestController
public class ProductController {
	

@GetMapping("/products/{product-id}")
@ResponseBody
public  ResponseEntity<?> getOneProducts(@PathVariable("product-id") int id){
	 String uri="https://la-mode.shop/api/products/"+id+"?ws_key=SH97SWJXX4NIXZ8ZELVFQ1EXZERWMT8N";
     RestTemplate restTemplate = new RestTemplate();
     String result = restTemplate.getForObject(uri, String.class);
     return new ResponseEntity<>(result, HttpStatus.OK);
}

@GetMapping(value="/products")
@ResponseBody
public ResponseEntity<?> getAllProducts(){
	 String uri="https://la-mode.shop/api/products?ws_key=SH97SWJXX4NIXZ8ZELVFQ1EXZERWMT8N";
     RestTemplate restTemplate = new RestTemplate();
     String result = restTemplate.getForObject(uri, String.class);
     return new ResponseEntity<>(result, HttpStatus.OK);
}

}

