package com.phenikaa.hrm.Data_Access_Layer;

import com.phenikaa.hrm.entity.ResetPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResetPasswordRepository extends JpaRepository<ResetPassword,Integer>, JpaSpecificationExecutor<Integer> {
}
