package com.crudapp.crudapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "ESSAY")
public class Essay {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long studentId;

    @Column(name = "essay")
    private String essay;

    @Column(name = "submitted_date")
    private Date submittedDate;

    @Column(name = "submitted_time")
    private SimpleDateFormat submittedTime;

}
