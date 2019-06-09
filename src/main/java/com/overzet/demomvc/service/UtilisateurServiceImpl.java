package com.overzet.demomvc.service;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }


    public Utilisateur findTheGuyById(Long id) {
        return utilisateurRepository.findUtilisateurById(id);
    }

    public Utilisateur get(Long id) {
        return utilisateurRepository.getOne(id);// 'getOne' comes from Jpa and uses Jackson which I added
    }


    public void deleteUser(Long id) {
        utilisateurRepository.deleteById(id);
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }


    public String doSomething() {
        return "Hi, my name is repelsteeltje";
    }
}
