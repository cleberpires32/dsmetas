package com.desuperior.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmeta.entity.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
