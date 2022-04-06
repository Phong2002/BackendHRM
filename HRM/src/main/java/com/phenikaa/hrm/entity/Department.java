package com.phenikaa.hrm.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "`department_id`", nullable = false)
    private Integer id;

    @Column(name="`name`")
    private String name;

    @Column(name="`introduce`")
    private String introduce;

    @Column(name = "`founding_date`")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date foundingDate;



}
