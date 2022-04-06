package com.phenikaa.hrm.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "Notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "`notify_id`", nullable = false)
    private Integer notify_id;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "`department_id`")
    private Department department;
}
