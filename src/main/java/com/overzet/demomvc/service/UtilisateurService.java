package com.overzet.demomvc.service;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    List<Utilisateur> findAll();

}
/*
    ServiceInterface doesn't need to have Interface in name
        and it doesnt need to impl Repo
        instead it should Autowired it

        Try not to put numbers in names of methods
        2DTO
        @Mapper(componentModel = "spring")//TODO Why use "spring" here? for this Im not sure, that could implement that, as you always need to use spring
        and again you have DTO that has @Entity it should be  UtilisateurEntity instead  UtilisateurDAO
        Regarding that everything else is okay 😀


 */