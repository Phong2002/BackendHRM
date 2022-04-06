package com.phenikaa.hrm.Data_Access_Layer;

import com.phenikaa.hrm.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> , JpaSpecificationExecutor<Department> {
    List<Department> findAll();
}
