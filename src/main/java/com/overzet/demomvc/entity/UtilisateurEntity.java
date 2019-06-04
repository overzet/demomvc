package com.overzet.demomvc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class UtilisateurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    public UtilisateurEntity() {
    }

    public UtilisateurEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
