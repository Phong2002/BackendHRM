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
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "`user_id`", nullable = false)
    public int id;
    @Column(name ="`firstname`" ,nullable = false)
    public String firstname;
    @Column(name ="`lastname`" ,nullable = false)
    public String lastname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "`dateOfBirth`")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date foundingDate;

    @Column(name = "address")
    private String address;

    @Column(name ="`email`" ,nullable = false)
    public String email;
    @Column(name ="`username`" ,nullable = false)
    public String username;
    @Column(name ="`password`" ,nullable = false)
    public String password;

    @Column(name = "`workStartDate`")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date workStartDate;

    @Column(name = "`numberPhone`")
    private String numberPhone;

    @Column(name = "`salary`")
    private Long salary;

    @Column(name = "`id_card`")
    private String idCard;

    @ManyToOne
    @JoinColumn(name = "`department_id`")
    private Department department;






}
