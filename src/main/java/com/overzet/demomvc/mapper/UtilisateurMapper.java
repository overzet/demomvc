package com.overzet.demomvc.mapper;

import com.overzet.demomvc.model.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    @Mapping(target = "id", source = "id")
    Utilisateur customerDTO(Utilisateur utilisateur);

}
