package com.familyproject.controller;

import com.familyproject.service.FamilyMemberService;
import com.familyproject.service.FamilyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/familymember")
@AllArgsConstructor
public class FamilyMemberController {
}

//
//    private final FamilyService familyService;
//
//    private final FamilyMemberService familyMemberService;
//}
