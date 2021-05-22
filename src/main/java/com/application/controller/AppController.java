package com.application.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.AppModel;
import com.application.repository.AppRepository;


@RestController
public class AppController {
	@Autowired
	AppRepository repo;
	
	@GetMapping("/checkin")
	public AppModel addCheckin(@RequestParam String name) {
		DateFormat dateFormat =new SimpleDateFormat("yyyy/MM/dd");
		Date date= new Date();
		String id=name+""+java.time.LocalTime.now();
		AppModel id1=new AppModel(id,name,"IN",dateFormat.format(date),java.time.LocalTime.now());
		repo.save(id1);
		return id1;
	}
	
	@GetMapping("/checkout")
	public AppModel addCheckout(@RequestParam String name) {
		DateFormat dateFormat =new SimpleDateFormat("yyyy/MM/dd");
		Date date= new Date();
		String id=name+""+java.time.LocalTime.now();
		AppModel id1=new AppModel(id,name,"OUT",dateFormat.format(date),java.time.LocalTime.now());
		repo.save(id1);
		return id1;
	}
	
	@GetMapping("/getLog")
	public List<AppModel>getLog(String date){
		return (List<AppModel>)repo.findByDate(date);
	}
	
	@GetMapping("/getAllLog")
	public List<AppModel> getAllLog(){
		return (List<AppModel>)repo.findAll();
	}

}
