package com.familyproject.service;

import com.familyproject.domain.FamilyMember;
import com.familyproject.repository.FamilyMemberRepository;
import com.familyproject.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Service
public class FamilyMemberService {

    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    FamilyMemberRepository familyMemberRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<FamilyMember> getAll() {

        return jdbcTemplate.query("SELECT id, familyName, givenName, familyId FROM familyMember",
                BeanPropertyRowMapper.newInstance(FamilyMember.class));
    }
}


