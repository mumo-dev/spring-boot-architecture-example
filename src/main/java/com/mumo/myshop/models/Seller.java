package com.mumo.myshop.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "approved", nullable = false)
    private Boolean approved;

    @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "fk_user", nullable = false)
    private User user;




}