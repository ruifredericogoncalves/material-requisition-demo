package com.presentation.core;

/**
 * Created by rjnascimento on 13/04/2018.
 */
public enum MaterialRequisitionStatus {

    /**
     * The interaction was successful.
     */
    SUCCESS,
    /**
     * The interaction failed, usually due to a technical/business failure.
     */
    FAILURE,
    /**
     * The request is rejected if it violates a precondition for processing. This could be a technical rejection
     * where the message is malformed, or a business rejection where a precondition is not met.
     */
    REJECTION,
    /**
     * The interaction state is unknown.
     */
    UNKNOWN
}
