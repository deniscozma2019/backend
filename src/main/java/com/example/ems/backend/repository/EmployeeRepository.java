package com.example.ems.backend.repository;

import com.example.ems.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Id> {

    Optional<Object> findById(Long id);
}
