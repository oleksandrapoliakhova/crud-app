package com.crudapp.crudapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "GRADES")
public class Grade {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long studentId;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "review_note")
    private String reviewNote;

}
