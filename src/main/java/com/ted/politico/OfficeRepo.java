package com.ted.politico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ted.politico.models.Office;

@RepositoryRestResource(collectionResourceRel="offices", path="offices")
public interface OfficeRepo extends JpaRepository<Office, Integer>
{

}
