package com.familyproject.repository;

import com.familyproject.domain.Family;
import com.familyproject.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {
}
