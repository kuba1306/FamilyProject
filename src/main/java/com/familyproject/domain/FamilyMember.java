package com.familyproject.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "family_members")
@AllArgsConstructor
@NoArgsConstructor
public class FamilyMember {

    @Id
    @GeneratedValue
    @NotNull
    private int memberId;
    private String givenName;
    private String familyName;
    private int age;
    @ManyToOne
    @JoinColumn(name = "FAMILY_ID")
    private Family family;
}
