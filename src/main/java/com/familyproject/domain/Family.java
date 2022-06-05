package com.familyproject.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Family {

    @Id
    @NotNull
    @GeneratedValue
    private int familyId;
    private String familyName;
    private int nrOfAdults;
    private int nrOfChildren;
    private int nrOfInfants;

    @OneToMany(
            targetEntity = FamilyMember.class,
            mappedBy = "family",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<FamilyMember> members = new ArrayList<>();

}