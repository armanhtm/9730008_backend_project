package com.emailProject.emailProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Column(name = "st_id")
    private Long studentId;

    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "score")
    private Float score;

    @JoinColumn(name = "cs_id")
    private Course course;
}
