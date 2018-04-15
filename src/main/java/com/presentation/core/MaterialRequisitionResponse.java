package com.presentation.core;

import com.sun.xml.internal.ws.server.sei.MessageFiller;

/**
 * Created by rjnascimento on 14/04/2018.
 */
public class MaterialRequisitionResponse<MaterialRequisitionHeader, T> {

    MaterialRequisitionHeader header;
    T body;

    public MaterialRequisitionResponse(MaterialRequisitionHeader header, T body) {
        this.header = header;
        this.body = body;
    }

    public MaterialRequisitionHeader getHeader() {
        return header;
    }

    public void setHeader(MaterialRequisitionHeader header) {
        this.header = header;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}

