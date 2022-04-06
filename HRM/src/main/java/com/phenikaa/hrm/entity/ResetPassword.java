package com.phenikaa.hrm.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "User")
public class ResetPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "token_id", nullable = false)
    private Integer id;

    @Column(name = "Token")
    private String token;

    @Column(name = "`user_id`")
    private Integer user_id;
}
