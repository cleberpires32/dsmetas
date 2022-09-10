package com.desuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desuperior.dsmeta.entity.Sale;
import com.desuperior.dsmeta.repository.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository salesRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable page) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = minDate.equals("")? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("")? today : LocalDate.parse(maxDate);
		Page<Sale> list = salesRepository.findSales(min,max, page);
		return list;
	}
}
