package com.overzet.demomvc.repository;

import com.overzet.demomvc.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    @Query(
            value = "SELECT * FROM Utilisateur u WHERE u.id = ?",
            nativeQuery = true)
    Utilisateur findUtilisateurById(Long id);

}
