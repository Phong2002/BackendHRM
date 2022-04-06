package com.phenikaa.hrm.Data_Access_Layer;

import com.phenikaa.hrm.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notifications,Integer>, JpaSpecificationExecutor<Integer> {
    List<Notifications> findAll();
}
