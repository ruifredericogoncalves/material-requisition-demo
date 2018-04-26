package com.presentation.core;


/**
 * Material Requisition Response.
 *
 * @param <MaterialRequisitionHeader> Header.
 * @param <T>                         Body.
 */
public class MaterialRequisitionResponse<MaterialRequisitionHeader, T> {

    private final MaterialRequisitionHeader header;
    private final T body;


    public MaterialRequisitionResponse(final MaterialRequisitionHeader header, final T body) {
        this.header = header;
        this.body = body;
    }

    public MaterialRequisitionHeader getHeader() {
        return header;
    }


    public T getBody() {
        return body;
    }

}

