package com.overzet.demomvc.controller;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("users")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public Collection<Utilisateur> getAllUsers() {
        return utilisateurService.findAll();
    }

//    @GetMapping("/{id}")
//    public Optional<Utilisateur> findById(@PathVariable Long id) {
//        return utilisateurService.findById(id);
//    }
//
//    @PostMapping("/add")
//    public Utilisateur addNewUser(@RequestBody Utilisateur utilisateur) {
//        return utilisateurService.save(utilisateur);
//    }
}
