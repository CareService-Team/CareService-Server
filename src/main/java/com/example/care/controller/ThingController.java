package com.example.care.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.care.mapper.ThingMapper;
import com.example.care.model.Thing;

@RestController
public class ThingController {
	private ThingMapper mapper;
	
	public ThingController(ThingMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/thing/{t_id}")
	public Thing getThing(@PathVariable("t_id") String t_id) {
		return mapper.getThing(t_id);
	}
	
	@GetMapping("/thing/all")
	public List<Thing> getThingList(){
		return mapper.getThingList();
	}
	
	@PostMapping("/thing/{t_id}")
	public void postThing(
			@PathVariable("t_id") String t_id,
			@RequestParam("t_name") String t_name, 
			@RequestParam("t_remain") String t_remain) {
		mapper.insertThing(t_id, t_name, t_remain);
	}
	
	@PutMapping("/thing/{t_id}")
	public void putThing(
			@PathVariable("t_id") String t_id, 
			@RequestParam("t_remain") String t_remain) {
		mapper.updateThing(t_id, t_remain);
	}
	
	@DeleteMapping("/thing/{t_id}")
	public void deleteThing(@PathVariable("t_id") String t_id) {
		mapper.deleteThing(t_id);
	}
	
	
	
}
