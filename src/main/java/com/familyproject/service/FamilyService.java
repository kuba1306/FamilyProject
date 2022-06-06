package com.familyproject.service;

import com.familyproject.domain.Family;
import com.familyproject.exception.FamilyNotFoundException;
import com.familyproject.repository.FamilyMemberRepository;
import com.familyproject.repository.FamilyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FamilyService {

    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    FamilyMemberRepository familyMemberRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;


    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public int createFamily(Family family) {
        familyRepository.save(family);
        return family.getId();
    }

    public Family getById(Integer id) throws FamilyNotFoundException {
        return jdbcTemplate.queryForObject("SELECT family_id, family_name, nr_of_adults, nr_of_children, nr_of_infants " +
                "FROM families WHERE family_id = ?", BeanPropertyRowMapper.newInstance(Family.class), id);
    }


    public void deleteFamily(final Integer id) throws FamilyNotFoundException {
        Family family = familyRepository.findById(id).orElseThrow(()->new FamilyNotFoundException(
                "Family with id nr" + id + " doesn't exist"
        ));
        familyRepository.delete(family);
    }
}