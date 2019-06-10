package com.project.marks.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import com.project.marks.model.Marks;

@Component
public class MarksDao {

	public List<Marks> getAllMarks(String studID) {
		List<Marks> marksList = buildMarksList();
		List<Marks> marks = new ArrayList<Marks>();
		for(Marks mark : marksList) {
			if(studID.equalsIgnoreCase(mark.getStudId())) {
				marks.add(mark);
			}
		}
		
		return marks;
	}

	
	public List<Marks> buildMarksList(){
		return Arrays.asList(new Marks("1","Maths",95),new Marks("1","Science",94),
				 new Marks("1","SST",95),new Marks("2","English",93));
		
	}
	
	
}
