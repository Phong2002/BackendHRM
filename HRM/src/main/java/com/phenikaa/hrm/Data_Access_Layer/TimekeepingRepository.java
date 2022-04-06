package com.phenikaa.hrm.Data_Access_Layer;

import com.phenikaa.hrm.entity.Timekeeping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TimekeepingRepository extends JpaRepository<Timekeeping,Integer>, JpaSpecificationExecutor<Integer> {
}
