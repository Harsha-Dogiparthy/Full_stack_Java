package com.fisglobal.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fisglobal.admin.model.Flights;

@Repository
@Transactional
public interface FlightsDao extends JpaRepository<Flights,Integer>{

}
