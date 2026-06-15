package com.example.FullStackProject;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data //Lombok generates getter and setter, toString, equals, hashCode
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Long id;
    @Column(name = "stu_name", nullable = false, length=100)
    private String name;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Course> courses;
}
