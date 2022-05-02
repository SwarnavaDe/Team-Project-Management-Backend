package com.bosenet.iss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosenet.iss.model.Contributor;

@Repository
public interface ContributorRepository extends JpaRepository<Contributor, Long> {

}
