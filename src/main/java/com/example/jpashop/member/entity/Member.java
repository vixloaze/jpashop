package com.example.jpashop.member.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id; // 아이디
    @Column(name = "NAME")
    private String username; // 이름
    // 매핑 정보 없음
    private Integer age; // 나이

    //Getter, Setter
    public String getId() { return id; }
    public void setId(String id) { this.id=id; }

    public String getUsername() { return id; }
    public void setUsername(String username) { this.username=username; }

    public Integer getAge() { return age; }
    public void setAge(Integer id) { this.age=age; }


}
