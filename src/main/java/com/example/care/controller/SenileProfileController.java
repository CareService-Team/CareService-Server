package com.example.care.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.care.mapper.SenileMapper;
import com.example.care.model.SenileProfile;

@RestController
public class SenileProfileController {
	private SenileMapper mapper;
	
	public SenileProfileController(SenileMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/senile/{s_id}")
	public SenileProfile getSenileProfile(@PathVariable("s_id") String s_id) {
		return mapper.getSenileProfile(s_id);
	}
	
	@GetMapping("/senile/all")
	public List<SenileProfile> getSenileProfileList(){
		return mapper.getSenileProfileList();
	}
	
	@PutMapping("/senile/{s_id}")
	public void putSenileProfile(@PathVariable("s_id") String s_id, @RequestParam("s_password") String s_password, @RequestParam("s_name") String s_name, @RequestParam("s_phone") String s_phone, 
			@RequestParam("s_gender") String s_gender, @RequestParam("s_address") String s_address, @RequestParam("s_birth") String s_birth) {
		mapper.insertSenileProfile(s_id, s_password, s_name, s_phone, s_gender, s_address, s_birth);
	}
	
	@PostMapping("/senile/{s_id}")
	public void postSenileProfile(@PathVariable("s_id") String s_id, @RequestParam("s_name") String s_name, 
			@RequestParam("s_phone") String s_phone, @RequestParam("s_address") String s_address) {
		mapper.updateSenileProfile(s_id, s_name, s_phone, s_address);
	}
	
	@DeleteMapping("/senile/{s_id}")
	public void deleteSenileProfile(@PathVariable("s_id") String s_id) {
		mapper.deleteSenileProfile(s_id);
	}
	
	//test 10-09
}
	
