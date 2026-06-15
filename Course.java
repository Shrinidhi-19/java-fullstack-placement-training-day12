package com.example.FullStackProject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;
    @Column(name = "course_name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="stu_id", referencedColumnName = "stu_id")
    private Student student;
}
