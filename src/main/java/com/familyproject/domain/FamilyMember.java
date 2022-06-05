package com.familyproject.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "family_members")
public class FamilyMember {

    private int memberId;
    private String givenName;
    private String familyName;
    private int age;
    private Family family;

    public FamilyMember(String givenName, String familyName, int age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "MEMBER_ID", unique = true)
    public int getMemberId() {
        return memberId;
    }

    @Column(name = "GIVEN_NAME")
    public String getGivenName() {
        return givenName;
    }

    @Column(name = "FAMILY_NAME")
    public String getFamilyName() {
        return familyName;
    }

    @Column(name = "AGE")
    public int getAge() {
        return age;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBERS")
    public Family getFamily() {
        return family;
    }
}
