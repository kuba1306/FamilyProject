package com.familyproject.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name="family")
@NoArgsConstructor
@AllArgsConstructor
public class Family {

    private int familyId;
    private String familyName;
    private int nrOfAdults;
    private int nrOfChildren;
    private int nrOfInfants;
    private List<FamilyMember> members = new ArrayList<>();

    public Family(String familyName, int nrOfAdults, int nrOfChildren, int nrOfInfants) {
        this.familyName = familyName;
        this.nrOfAdults = nrOfAdults;
        this.nrOfChildren = nrOfChildren;
        this.nrOfInfants = nrOfInfants;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name="ID", unique=true)
    public String getFamilyName() {
        return familyName;
    }

    @Column(name="NR_ADULTS")
    public int getNrOfAdults() {
        return nrOfAdults;
    }

    @Column(name="NR_CHILDREN")
    public int getNrOfChildren() {
        return nrOfChildren;
    }

    @Column(name="NR_INFANTS")
    public int getNrOfInfants() {
        return nrOfInfants;
    }

    @OneToMany(
            targetEntity = FamilyMember.class,
            mappedBy = "family",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<FamilyMember> getMembers() {
        return members;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setNrOfAdults(int nrOfAdults) {
        this.nrOfAdults = nrOfAdults;
    }

    public void setNrOfChildren(int nrOfChildren) {
        this.nrOfChildren = nrOfChildren;
    }

    public void setNrOfInfants(int nrOfInfants) {
        this.nrOfInfants = nrOfInfants;
    }

    public void setMembers(List<FamilyMember> members) {
        this.members = members;
    }
}



