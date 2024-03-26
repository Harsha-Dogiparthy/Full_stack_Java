package com.fisglobal.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.admin.dao.FlightsDao;
import com.fisglobal.admin.model.Flights;

@Service
public class FlightsServiceImpl implements FlightsService{

	@Autowired
	FlightsDao dao;
	
	@Override
	public List<Flights> allFlights() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
