package com.project.marks.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.marks.model.Marks;
import com.project.marks.service.MarksService;

@RestController
public class MarksController {

	@Autowired
	private MarksService marksService;
	
	@RequestMapping(value="/students/{studID}/marks",method=RequestMethod.GET)
	public List<Marks> getAllMarks(@PathVariable String studID){
		return marksService.getAllMarks(studID);
	}
	

}
