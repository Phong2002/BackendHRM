package com.phenikaa.hrm.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "Complain")
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "complain_id", nullable = false)
    private Integer id;

    @Column(name = "`content`")
    private String content;

    @ManyToOne()
    @JoinColumn(name = "`user_id`")
    private User user;

}
