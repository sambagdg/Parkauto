package com.parkauto.rest.repository;

import com.parkauto.rest.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoitureRepository extends JpaRepository<Voiture, Long> {

}
