package com.phenikaa.hrm.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "Reward_Punish")
public class RewardPunish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "`amount`")
    private Long amount;

    @Column(name = "`reason`")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "`user_id`")
    private User user;

}
