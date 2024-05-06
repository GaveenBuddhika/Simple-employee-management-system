package com.example.employeems.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {


    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int emID;
        private String emName;
        private String emAdress;
        private String emNum;

    }

}
