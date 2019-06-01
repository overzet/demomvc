package com.overzet.demomvc.mapper;

import com.overzet.demomvc.model.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")//TODO Why use "spring" here?
public interface UtilisateurMapper {
    @Mapping(target = "id", source = "id")
    Utilisateur customer2DTO(Utilisateur utilisateur);//TODO customer2DTO does what exacly?

}
