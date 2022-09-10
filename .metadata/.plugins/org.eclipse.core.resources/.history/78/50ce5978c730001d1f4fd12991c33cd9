package com.desuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desuperior.dsmeta.entity.Sale;
import com.desuperior.dsmeta.repository.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository salesRepository;
	
	public List<Sale> findSales() {
		List<Sale> list = salesRepository.findAll();
		return list;
	}
}
