package com.presentation.core;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Created by rjnascimento on 13/04/2018.
 */
public class MaterialRequisitionMessage {
    private MaterialRequisitionHeader header;

    public MaterialRequisitionHeader getHeader() {
        return header;
    }

    public void setHeader(final MaterialRequisitionHeader header) {
        this.header = header;
    }


}
