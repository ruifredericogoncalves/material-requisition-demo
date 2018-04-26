package com.presentation.application.dto;

/**
 * DTO for material requisition used on API calls.
 */
public final class MaterialDTO {

    private String materialType;
    private int quantity;

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(final String materialType) {
        this.materialType = materialType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
}

