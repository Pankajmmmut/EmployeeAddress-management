package com.assignment.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emId;
    private String emFirstName;
    private String emLastName;
    @OneToOne(targetEntity=Address.class)
    @JoinColumn(name = "fk_addId")
    Address address;
}
