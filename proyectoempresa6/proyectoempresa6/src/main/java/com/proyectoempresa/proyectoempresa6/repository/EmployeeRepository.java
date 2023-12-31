package com.ProyectoEmpresa.ProyectoEmpresa6.repository;
import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
