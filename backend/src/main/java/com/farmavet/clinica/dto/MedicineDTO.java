package com.farmavet.clinica.dto;

import com.farmavet.clinica.enums.PharmacologicalClassEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MedicineDTO {
    private Long id;
    private String manufacture;
    private String name;
    private String type;
    private PharmacologicalClassEnum pharmacologicalClass;
    private BigDecimal salesPrice;
    private int units;
}