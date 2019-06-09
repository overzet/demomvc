package com.overzet.demomvc.controller;

import com.overzet.demomvc.model.Utilisateur;
import com.overzet.demomvc.service.UtilisateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("users")
public class UtilisateurController {

    @Autowired
    private UtilisateurServiceImpl utilisateurServiceImpl;

    @GetMapping
    public Collection<Utilisateur> getAllUsers() {
        return utilisateurServiceImpl.findAll();
    }

    @GetMapping("hello")
    public String doSomething() {
        return utilisateurServiceImpl.doSomething();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        utilisateurServiceImpl.deleteUser(id);
    }


    @GetMapping("/{id}")
    public Utilisateur findUtilisateur(@PathVariable Long id) {
        return utilisateurServiceImpl.get(id);
    }

//    @GetMapping("/{id}")
//    public Utilisateur getUser(@PathVariable Long id) {
//        return utilisateurServiceImpl.get(id);
//    }


    @PostMapping("/add")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
        return utilisateurServiceImpl.save(utilisateur);
    }
}
