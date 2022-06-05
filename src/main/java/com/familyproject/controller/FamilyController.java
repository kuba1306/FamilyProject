package com.familyproject.controller;

import com.familyproject.domain.Family;
import com.familyproject.service.FamilyMemberService;
import com.familyproject.service.FamilyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/family")
@AllArgsConstructor
public class FamilyController {
}

//    private final FamilyService familyService;
//
//    private final FamilyMemberService familyMemberService;
//
//    @GetMapping("/{id}")
//    public Family getById(@PathVariable("id") int id) {
//        return familyService.getById(id);
//    }
//
//    @PostMapping("")
//    public int create(List<Family> families) {
//        return familyService.create(families);
//    }

//    @PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<FamilyDto> createFamily(RequestBody FamilyDto familyDto) {
//        Family family = FamilyMapper.
//
//    }
//}
