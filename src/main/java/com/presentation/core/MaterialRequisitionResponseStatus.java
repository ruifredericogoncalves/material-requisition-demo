package com.presentation.core;

import com.presentation.domain.MaterialRequisition;

/**
 * Created by rjnascimento on 13/04/2018.
 */
public class MaterialRequisitionResponseStatus {
    private MaterialRequisitionStatus status;
    private String errorCode;
    private String errorMessage;

    public MaterialRequisitionResponseStatus(MaterialRequisitionStatus status){
        this.status = status;
    }


    public MaterialRequisitionStatus getStatus() {
        return status;
    }

    public void setStatus(final MaterialRequisitionStatus status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
