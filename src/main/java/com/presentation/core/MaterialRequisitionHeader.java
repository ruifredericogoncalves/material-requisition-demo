package com.presentation.core;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class MaterialRequisitionHeader {
    private String messageId;
    private String timestamp;
    private MaterialRequisitionResponseStatus responseStatus;


    public MaterialRequisitionHeader(MaterialRequisitionResponseStatus responseStatus)  {
        this.messageId = UUID.randomUUID().toString();
        this.timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX")
                .withZone(ZoneOffset.UTC).format(Instant.now());
        this.responseStatus =responseStatus;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(final String messageId) {
        this.messageId = messageId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public MaterialRequisitionResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(final MaterialRequisitionResponseStatus responseStatus) {
    }

}
