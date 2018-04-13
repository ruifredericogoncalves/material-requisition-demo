package com.presentation.application.dto;

import com.presentation.domain.MaterialRequisition;

/**
 * Class responsible for the transformation between MaterialRequistion -> MaterialRequisitionDTO and MaterialRequisitionDTO -> MaterialRequistion.
 */
public class MaterialRequisitionAssembler {

    /**
     * Method to convert an entity to a DTO. A MaterialRequisition to a MaterialRequisitionDTO.
     *
     * @param materialRequistion object that represents a MaterialRequistion
     * @return MaterialRequisitionDTO object that contains the details of the material requisition.
     */
    public static MaterialRequisitionDTO convertToDTO(final MaterialRequisition materialRequistion) {
        MaterialRequisitionDTO materialRequisitionDTO = new MaterialRequisitionDTO();
        materialRequisitionDTO.setUserId(materialRequistion.getUserId());
        materialRequisitionDTO.setName(materialRequistion.getName());
        materialRequisitionDTO.setUsername(materialRequistion.getUsername());
        materialRequisitionDTO.setStartDate(materialRequistion.getStartDate());
        materialRequisitionDTO.setEndDate(materialRequistion.getEndDate());
        materialRequisitionDTO.setEmail(materialRequistion.getEmail());

        return materialRequisitionDTO;
    }

    /**
     * Method to convert a DTO to an entity. A MaterialRequisitionDTO to a MaterialRequisition.
     *
     * @param materialRequisitionDTO object that contains the the details of the materialRequisition.
     * @return the materialRequisition.
     */
    public static MaterialRequisition convertDTOToEntity(final MaterialRequisitionDTO materialRequisitionDTO) {
        MaterialRequisition materialRequisition = new MaterialRequisition();

        materialRequisition.setName(materialRequisitionDTO.getName());
        materialRequisition.setUsername(materialRequisitionDTO.getUsername());
        materialRequisition.setStartDate(materialRequisitionDTO.getStartDate());
        materialRequisition.setEndDate(materialRequisitionDTO.getEndDate());
        materialRequisition.setUserId(materialRequisitionDTO.getUserId());
        materialRequisition.setEmail(materialRequisitionDTO.getEmail());
        materialRequisition.setNumberOfDays(materialRequisitionDTO.getNumberOfDays());
        materialRequisition.setQuantity(materialRequisitionDTO.getQuantity());
        return materialRequisition;
    }
}
