package com.phenikaa.hrm;

import com.phenikaa.hrm.Data_Access_Layer.ComplainRepository;
import com.phenikaa.hrm.Data_Access_Layer.DepartmentRepository;
import com.phenikaa.hrm.Data_Access_Layer.NotificationRepository;
import com.phenikaa.hrm.Data_Access_Layer.UserRepository;
import com.phenikaa.hrm.entity.Department;
import com.phenikaa.hrm.entity.Notifications;
import com.phenikaa.hrm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
UserRepository userRepository;
    @Autowired
DepartmentRepository departmentRepository;
    @Autowired
ComplainRepository complainRepository;
    @Autowired
NotificationRepository notificationRepository;

    @GetMapping("/user")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/department")
    public ResponseEntity<?> getAllDepartments(){
        return new ResponseEntity<>(departmentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/compalain")
    public ResponseEntity<?> getAllComplain(){
        return new ResponseEntity<>(complainRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/notification")
    public ResponseEntity<?> getAllNotifications(){
        return new ResponseEntity<>(notificationRepository.findAll(), HttpStatus.OK);
    }
}
