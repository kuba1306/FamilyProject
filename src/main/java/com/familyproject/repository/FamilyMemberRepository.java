package com.familyproject.repository;

import com.familyproject.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer> {

    @Override
    List<FamilyMember> findAll();
    @Override
    FamilyMember save(FamilyMember familyMember);






}
