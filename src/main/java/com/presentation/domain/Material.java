package com.presentation.domain;

import com.presentation.domain.MaterialType;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rj
 *
 */
@Entity
@Table(name = "Material")
public class Material {

    private MaterialType materialType;
    private String quantity;


}


