package com.familyproject.controller;

import com.familyproject.domain.Family;
import com.familyproject.domain.FamilyMember;
import com.familyproject.exception.FamilyMemberNotFoundException;
import com.familyproject.service.FamilyMemberService;
import com.familyproject.service.FamilyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class FamilyMemberController {

    @Autowired
    FamilyService familyService;
    @Autowired
    FamilyMemberService familyMemberService;

    @GetMapping("/{id}")
    public FamilyMember getById(@PathVariable("id") int id) throws FamilyMemberNotFoundException {
        return familyMemberService.getById(id);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createFamilyMember(@RequestBody FamilyMember familyMember) {
        familyMemberService.createFamilyMember(familyMember);
        return ResponseEntity.ok().build();
    }
}

