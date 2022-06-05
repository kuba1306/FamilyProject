package com.familyproject.repository;

import com.familyproject.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer> {
}
