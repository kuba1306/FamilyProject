package com.familyproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "family_members")
@Data
@NoArgsConstructor
public class FamilyMember {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID", unique = true, nullable = false)
    private int id;
    @Column(name = "GIVEN_NAME")
    private String givenName;
    @Column(name = "FAMILY_NAME")
    private String familyName;
    @Column(name = "AGE")
    private int age;
    @ManyToOne
    @JoinColumn(name = "FAMILY_ID")
    private Family family;
}
