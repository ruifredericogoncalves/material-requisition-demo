package com.presentation.domain;

import com.presentation.domain.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rj
 */
@Entity
@Table(name = "material")
public class Material extends BaseEntity {

    private String materialType;
    private int quantity;

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


