package com.familyproject.controller;

import com.familyproject.domain.Family;
import com.familyproject.exception.FamilyNotFoundException;
import com.familyproject.service.FamilyMemberService;
import com.familyproject.service.FamilyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/family")
public class FamilyController {

    @Autowired
    FamilyService familyService;

    @Autowired
    FamilyMemberService familyMemberService;

    @GetMapping("/{id}")
    public Family getById(@PathVariable("id") int id) {
        return familyService.getById(id);
    }
}