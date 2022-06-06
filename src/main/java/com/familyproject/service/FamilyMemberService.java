package com.familyproject.service;

import com.familyproject.domain.Family;
import com.familyproject.domain.FamilyMember;
import com.familyproject.exception.FamilyMemberNotFoundException;
import com.familyproject.exception.FamilyNotFoundException;
import com.familyproject.repository.FamilyMemberRepository;
import com.familyproject.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FamilyMemberService {

    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    FamilyMemberRepository familyMemberRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public FamilyMemberService(FamilyMemberRepository familyMemberRepository) {
        this.familyMemberRepository = familyMemberRepository;
    }

    public FamilyMember getById(int id) {
        return jdbcTemplate.queryForObject("SELECT member_id, age, family_name, given_name, family_id " +
                "FROM family_members  WHERE member_id = ?", BeanPropertyRowMapper.newInstance(FamilyMember.class), id);
    }

    public void createFamilyMember(FamilyMember familyMember) {
        familyMemberRepository.save(familyMember);
    }

    public void deleteFamilyMember(final Integer id) throws FamilyMemberNotFoundException {
        FamilyMember familyMember = familyMemberRepository.findById(id).orElseThrow(()->new FamilyMemberNotFoundException(
                "Family member with id nr " + id + " doesn't exist"
        ));
        familyMemberRepository.delete(familyMember);
    }

    public List<FamilyMember> getAll() {
        return familyMemberRepository.findAll();
    }
}


