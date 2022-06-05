package com.familyproject.service;

import com.familyproject.domain.Family;
import com.familyproject.repository.FamilyMemberRepository;
import com.familyproject.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FamilyService {

    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    FamilyMemberRepository familyMemberRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;
    private int id;

    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public Family getById(int id) {
        return jdbcTemplate.queryForObject("SELECT family_id, family_name, nr_of_adults, nr_of_children, nr_of_infants " +
                "FROM families WHERE family_id = ?", BeanPropertyRowMapper.newInstance(Family.class), id);
    }
}