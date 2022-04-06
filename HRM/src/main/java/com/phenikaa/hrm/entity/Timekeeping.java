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
@Table(name = "Timekeeping")
public class Timekeeping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "timekeeping_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "`user_id`")
    private User user;

    @Column(name = "`start_time`")
    @Temporal(TemporalType.TIME)
    @CreationTimestamp
    private Date startTime;

    @Column(name = "`time_end`")
    @Temporal(TemporalType.TIME)
    @CreationTimestamp
    private Date timeEnd;

    @Column(name = "`day`")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date day;


}
