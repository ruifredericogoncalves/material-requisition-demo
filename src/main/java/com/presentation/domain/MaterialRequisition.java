package com.presentation.domain;

import com.presentation.domain.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by rjnascimento on 13/04/2018.
 */
@Entity
@Table(name = "material_requisition")
public class MaterialRequisition extends BaseEntity {

    private String userId;
    private String username;
    private String name;
    private String email;
    private String materialType;
    private int quantity;
    private int numberOfDays;
    private Long startDate;
    private Long endDate;


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

    public void setNumberOfDays(final int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Date getStartDate() {
        return new Date(startDate);
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate.getTime();
    }

    public Date getEndDate() {
        return endDate != null ? new Date(endDate) : null;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate != null ? endDate.getTime() : null;
    }
}
