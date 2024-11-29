package com.parkauto.rest.repository;

import com.parkauto.rest.entity.Camion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICamionRepository extends JpaRepository<Camion, Long> {
}
