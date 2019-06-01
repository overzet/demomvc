package com.overzet.demomvc.service;

import com.overzet.demomvc.model.Utilisateur;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class UtilisateurService implements UtilisateurServiceInterface {
    @Override
    public List<Utilisateur> findAll() {
        return null;
    }

    @Override
    public List<Utilisateur> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Utilisateur> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Utilisateur> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Utilisateur utilisateur) {

    }

    @Override
    public void deleteAll(Iterable<? extends Utilisateur> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Utilisateur> S save(S s) {
        return null;
    }

    @Override
    public <S extends Utilisateur> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Utilisateur> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Utilisateur> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Utilisateur> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Utilisateur getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Utilisateur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Utilisateur> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Utilisateur> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Utilisateur> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Utilisateur> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Utilisateur> boolean exists(Example<S> example) {
        return false;
    }
}
