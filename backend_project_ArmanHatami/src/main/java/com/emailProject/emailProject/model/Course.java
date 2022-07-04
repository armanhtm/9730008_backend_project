package com.emailProject.emailProject.model;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "courses")
public class Course {

    @Column(name = "cs_id")
    private Long id;

    @Column(name = "name")
    private String className;

    @Column(name = "teacher_name")
    private String teacherName;

    @OneToMany(mappedBy = "course")
    private List<Student> students;
}
