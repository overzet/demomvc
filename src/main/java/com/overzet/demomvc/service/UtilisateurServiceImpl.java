package com.overzet.demomvc.service;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

}
