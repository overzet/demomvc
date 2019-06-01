package com.overzet.demomvc.controller;

import com.overzet.demomvc.entity.UtilisateurDAO;
import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.service.UtilisateurServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
public class UtilisateurController {

    @Autowired
    UtilisateurServiceInterface utilisateurServiceInterface;

    @GetMapping(path = "/")
    public Iterable<Utilisateur> getAllUsers() {
        return utilisateurServiceInterface.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return utilisateurServiceInterface.findById(id);
    }

    @PostMapping(path = "/add")
    public String addNewUser(@RequestBody String name, @RequestParam String email) {
        UtilisateurDAO utilisateurDAO = new UtilisateurDAO(name, email);
        utilisateurDAO.save(utilisateurDAO);//TODO so I can not use save, why?
        return "Saved";
    }
}
