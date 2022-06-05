package com.familyproject.repository;

import com.familyproject.domain.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface FamilyRepository extends JpaRepository<Family, Integer> {

}
