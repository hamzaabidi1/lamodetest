package com.exemple.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RequestMapping("/all")
@RestController
public class ProductController {
	
//@RequestMapping("/hello")
//public String hello()
//{
//	return "hello world";
//	}
@GetMapping("/products")
@ResponseBody
public List<Object> getAllProducts(){
	String url="https://la-mode.shop/api/products?ws_key=SH97SWJXX4NIXZ8ZELVFQ1EXZERWMT8N";
	RestTemplate restTemplate = new RestTemplate();
	Object[] products=restTemplate.getForObject(url, Object[].class);
	return Arrays.asList(products);
}

@GetMapping("/products/{product-id}")
@ResponseBody
public Object getOneProducts(@PathVariable("product-id") int id){
	return id;
}
}

