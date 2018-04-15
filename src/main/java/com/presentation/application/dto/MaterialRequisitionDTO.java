package com.presentation.application.dto;

import com.presentation.core.MaterialRequisitionMessage;
import com.presentation.domain.MaterialType;

import java.util.Date;

/**
 * DTO for material requisition used on API calls.
 * <p>
 * 7.
 */
public final class MaterialRequisitionDTO extends MaterialRequisitionMessage {


    private String userId;
    private String username;
    private String name;
    private String email;
    private String materialType;
    private int quantity;
    private int numberOfDays;
    private Date startDate;
    private Date endDate;

    public MaterialRequisitionDTO() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

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

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

