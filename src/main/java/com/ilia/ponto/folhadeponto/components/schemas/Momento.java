package com.ilia.ponto.folhadeponto.components.schemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ilia.ponto.folhadeponto.validation.DataFormat;
import com.ilia.ponto.folhadeponto.validation.NotEmptyField;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Momento {   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id; 

    @Column(name = "datahora", length = 200)
    @NotEmptyField
    @DataFormat
    private String dataHora;
}