package com.yee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yee.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente,Long>{

}
