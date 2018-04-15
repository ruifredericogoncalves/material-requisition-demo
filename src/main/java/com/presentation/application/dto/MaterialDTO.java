package com.presentation.application.dto;

/**
 * DTO for material requisition used on API calls.
 * <p>
 * 7.
 */
public final class MaterialDTO {

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

