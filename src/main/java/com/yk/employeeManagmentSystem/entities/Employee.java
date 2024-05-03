package com.yk.employeeManagmentSystem.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "birth_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthDate;
    @Column(name = "birth_city")
    private String birthCity;
    @Column(name = "birth_country")
    private String birthCountry;
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;
}
