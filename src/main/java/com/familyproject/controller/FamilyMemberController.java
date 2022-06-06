package com.familyproject.controller;

import com.familyproject.domain.Family;
import com.familyproject.domain.FamilyMember;
import com.familyproject.service.FamilyMemberService;
import com.familyproject.service.FamilyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class FamilyMemberController {

    @Autowired
    FamilyService familyService;
    @Autowired
    FamilyMemberService familyMemberService;

    @GetMapping("/{id}")
    public FamilyMember getById(@PathVariable("id") int id) {
        return familyMemberService.getById(id);
    }
}

//
//    private final FamilyService familyService;
//
//    private final FamilyMemberService familyMemberService;
//}
