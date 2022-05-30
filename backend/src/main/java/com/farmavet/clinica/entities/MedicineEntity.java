package com.farmavet.clinica.entities;

import com.farmavet.clinica.enums.PharmacologicalClassEnum;

import javax.persistence.Entity;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "medicine")
public class MedicineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacture;
    private String name;
    private String type;
    private PharmacologicalClassEnum pharmacologicalClass;
    private BigDecimal salesPrice;
    private int units;
}
