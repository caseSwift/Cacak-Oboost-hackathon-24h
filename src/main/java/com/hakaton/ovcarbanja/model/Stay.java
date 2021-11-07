package com.hakaton.ovcarbanja.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date startsAt;
    private Date endsAt;
    @ManyToOne
    private Hotel hotel;
    @ManyToOne
    private User user;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Activity> activities;


}
