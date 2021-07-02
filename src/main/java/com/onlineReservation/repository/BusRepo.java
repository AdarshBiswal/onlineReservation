package com.onlineReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineReservation.model.BusModel;

@EnableJpaRepositories
@Repository
public interface BusRepo extends JpaRepository<BusModel, String> {
	
	public BusModel findById(int id);
	public BusModel findByBusName(String name);
	public List<BusModel> findByStartCity(String startCity);
	

}
