package com.onlineReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.onlineReservation.model.BookingModel;


@EnableJpaRepositories
@Repository
public interface BookingRepo extends JpaRepository<BookingModel, Integer> {
	
	public BookingModel findById(int id);
	
	public List<BookingModel> findByBusIDAndDate(String busId,String JDate);
	public List<BookingModel> findByUserId(String uid);

}
