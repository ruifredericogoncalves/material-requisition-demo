package com.presentation.application.dto;

import com.presentation.domain.Material;

/**
 * Class responsible for the transformation between Material-> MaterialDTO and MaterialDTO -> Material.
 */
public class MaterialAssembler {

    /**
     * Method to convert an entity to a DTO. A Material to a MaterialDTO.
     *
     * @param material object that represents a MaterialRequistion
     * @return MaterialDTO object that contains the details of the material requisition.
     */
    public static MaterialDTO convertToDTO(final Material material) {
        MaterialDTO materialDTO = new MaterialDTO();
        materialDTO.setMaterialType(material.getMaterialType());
        materialDTO.setQuantity(material.getQuantity());
        return materialDTO;
    }

    /**
     * Method to convert a DTO to an entity. A MaterialDTO to a Material.
     *
     * @param materialDTO object that contains the the details of the material.
     * @return the material.
     */
    public static Material convertDTOToEntity(final MaterialDTO materialDTO) {
        Material material = new Material();

        material.setMaterialType(materialDTO.getMaterialType());
        material.setQuantity(materialDTO.getQuantity());
        return material;
    }
}
