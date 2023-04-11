package com.example.jpashop.member.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue
    private Long id;
    private String name; // 이름

    private String city;
    private String street;
    private String zipcode;

    //Getter, Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id=id; }

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city=city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street=street; }

    public String getZipcode() { return zipcode; }
    public void setZipcode(String zipcode) { this.zipcode=zipcode; }

}
