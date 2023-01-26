package com.bluty.graphbear.repository;

import com.bluty.graphbear.entity.EmployerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployerRepository extends JpaRepository<EmployerEntity, UUID> {
}
