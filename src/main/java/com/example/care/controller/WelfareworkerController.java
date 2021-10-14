package com.example.care.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.care.mapper.WelfareworkerMapper;
import com.example.care.model.Welfareworker;

@RestController
public class WelfareworkerController {
	private WelfareworkerMapper mapper;
	
	public WelfareworkerController(WelfareworkerMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/welfareworker/{w_id}")
	public Welfareworker getWelfareworker(@PathVariable("w_id") String w_id) {
		return mapper.getWelfareworker(w_id);
	}
	
	@GetMapping("/welfareworker/all")
	public List<Welfareworker> getWelfareworkerList(){
		return mapper.getWelfareworkerList();
	}
	
	@PostMapping("/welfareworker/{w_id}")
	public void postWelfareworker(
			@PathVariable("w_id") String w_id, 
			@RequestParam("w_password") String w_password, 
			@RequestParam("w_name") String w_name, 
			@RequestParam("w_phone") String w_phone, 
			@RequestParam("w_gender") String w_gender, 
			@RequestParam("w_birth") String w_birth) {
		mapper.insertWelfareworker(w_id, w_password, w_name, w_phone, w_gender, w_birth);
	}
	
	@PutMapping("/welfareworker/{w_id}")
	public void putWelfareworker(
			@PathVariable("w_id") String w_id, 
			@RequestParam("w_name") String w_name, 
			@RequestParam("w_phone") String w_phone) {
		mapper.updateWelfareworker(w_id, w_name, w_phone);
	}
	
	@DeleteMapping("/welfarewoker/{w_id}")
	public void deleteWelfareworker(@PathVariable("w_id") String w_id) {
		mapper.deleteWelfareworker(w_id);
	}
	
	
}
