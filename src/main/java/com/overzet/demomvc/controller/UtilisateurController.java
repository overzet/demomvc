package com.overzet.demomvc.controller;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.service.UtilisateurServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
public class UtilisateurController {

    @Autowired
    private UtilisateurServiceInterface utilisateurServiceInterface;

    @GetMapping(path = "/")
    public Iterable<Utilisateur> getAllUsers() {
        return utilisateurServiceInterface.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return utilisateurServiceInterface.findById(id);
    }

    @PostMapping("/add")
    public Utilisateur addNewUser(@RequestBody Utilisateur utilisateur) {
        return utilisateurServiceInterface.save(utilisateur);
    }
}
