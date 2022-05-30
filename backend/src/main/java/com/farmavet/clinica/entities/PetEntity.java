package com.farmavet.clinica.entities;

import com.farmavet.clinica.enums.GenderEnum;
import com.farmavet.clinica.enums.SpecieEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SpecieEnum specie;

    private String name;
    private LocalDate birthDate;
    private String breed; //raça

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
}
