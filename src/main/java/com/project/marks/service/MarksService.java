package com.project.marks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.marks.dao.MarksDao;
import com.project.marks.model.Marks;

@Component
public class MarksService {

	@Autowired
	private MarksDao marksDao;
	
	
	public List<Marks> getAllMarks(String studID) {
		return marksDao.getAllMarks(studID);
	}

}
