package com.example.care.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.care.mapper.SenileThingMapper;
import com.example.care.model.SenileThing;

@RestController
public class SenileThingController {
	private SenileThingMapper mapper;
	
	public SenileThingController(SenileThingMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/senilething/{s_id}")
	public SenileThing getSenileThing(@PathVariable("s_id") String s_id) {
		return mapper.getSenileThing(s_id);
	}
	
	@GetMapping("/senilething/all")
	public List<SenileThing> getSenileThingList(){
		return mapper.getSenileThingList();
	}
	
	@PostMapping("/senilething/{s_address}")
	public void putSenileThing(
			@PathVariable("s_address") String s_address, 
			@RequestParam("t_name") String t_name, 
			@RequestParam("t_count") String t_count,
			@RequestParam("t_id") String t_id,
			@RequestParam("s_id") String s_id,
			@RequestParam("request_date") String request_date) {
		mapper.insertSenileThing(s_address, t_name, t_count, t_id, s_id, request_date);
	}
	
	@PutMapping("/senilething/{s_address}/{request_date}")
	public void postSenileThing(
			@PathVariable("s_address") String s_address, 
			@PathVariable("request_date") String request_date,
			@RequestParam("t_count") String t_count) {
		mapper.updateSenileThing(s_address, request_date, t_count);
	}
	
	@DeleteMapping("/senilething/{s_address}/{request_date}")
	public void deleteSenileThing(
			@PathVariable("s_address") String s_address,
			@PathVariable("request_date") String request_date) {
		mapper.updateSenileThing(s_address, request_date, request_date);
	}
}
