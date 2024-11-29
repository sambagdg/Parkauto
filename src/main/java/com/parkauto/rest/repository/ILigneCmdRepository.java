package com.parkauto.rest.repository;

import com.parkauto.rest.entity.LigneCmd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneCmdRepository extends JpaRepository<LigneCmd, Long> {
}
