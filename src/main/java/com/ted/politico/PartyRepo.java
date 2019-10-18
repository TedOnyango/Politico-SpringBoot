package com.ted.politico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ted.politico.models.Party;

@RepositoryRestResource(collectionResourceRel="parties", path="parties")
public interface PartyRepo extends JpaRepository<Party, Integer>
{

}
