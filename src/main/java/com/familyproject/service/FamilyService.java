package com.familyproject.service;

import com.familyproject.domain.Family;
import com.familyproject.repository.FamilyMemberRepository;
import com.familyproject.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FamilyService {


    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    FamilyMemberRepository familyMemberRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;
}


//    @Autowired
//    FamilyRepository familyRepository;
//    @Autowired
//    FamilyMemberRepository familyMemberRepository;
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public Family getById(int id) {
//        return jdbcTemplate.queryForObject("SELECT id, familyName, nrOfAdults, nrOfChildren, nrOfInfants FROM family WHERE " +
//                "id = ?", BeanPropertyRowMapper.newInstance(Family.class), id);
//    }
//
//    public int create(List<Family> families) {
//        families.forEach(family -> jdbcTemplate
//                .update("INSERT INTO family(id, familyName, nrOfAdults, nrOfChildren, nrOfInfants)",
//                        family.getFamilyId(), family.getFamilyName(), family.getNrOfAdults(), family.getNrOfChildren(), family.getNrOfInfants()));
//        return 1;
//    }
//}
