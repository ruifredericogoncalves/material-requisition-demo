package com.presentation.application;

import com.presentation.application.dto.MaterialAssembler;
import com.presentation.application.dto.MaterialDTO;
import com.presentation.application.dto.MaterialRequisitionAssembler;
import com.presentation.application.dto.MaterialRequisitionDTO;
import com.presentation.domain.Material;
import com.presentation.domain.MaterialRequisition;
import com.presentation.infrastructure.persistence.MaterialRepository;
import com.presentation.infrastructure.persistence.MaterialRequisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service responsible for all logic regarding material requisition. Create, list, etc.
 */

@Service
public class MaterialRequisitionService {

    private static final int ZERO = 0;

    @Autowired
    private MaterialRepository materialRepository;


    @Autowired
    private MaterialRequisitionRepository materialRequisitionRepository;

    /**
     * Create material requisition.
     *
     * @param materialRequisitionDTO
     * @return material requisition.
     */
    public MaterialRequisitionDTO createMaterialRequisition(final MaterialRequisitionDTO materialRequisitionDTO) {

        MaterialRequisition materialRequisition = MaterialRequisitionAssembler.convertDTOToEntity(materialRequisitionDTO);

        String materialType = materialRequisition.getMaterialType();
        int quantity = materialRequisition.getQuantity();

        Assert.notNull(materialType, "Material type not defined.");
        Assert.isTrue(quantity > 0, "Quantity should be bigger than zero.");

        Material material = getAvailableMaterialByType(materialType);
        if (material != null && material.getQuantity() >= quantity) {
            // create material requisition
            materialRequisition = materialRequisitionRepository.save(materialRequisition);
            // update quantity
            material.setQuantity(material.getQuantity() - quantity);
            materialRepository.save(material);
        }
        return MaterialRequisitionAssembler.convertToDTO(materialRequisition);
    }


    /**
     * Create material devolution.
     *
     * @param materialRequisitionDTO
     * @return material devolution.
     */
    public MaterialRequisitionDTO createMaterialDevolution(final MaterialRequisitionDTO materialRequisitionDTO) {

        MaterialRequisition materialRequisition = MaterialRequisitionAssembler.convertDTOToEntity(materialRequisitionDTO);

        String materialType = materialRequisition.getMaterialType();
        int quantity = materialRequisition.getQuantity();

        Assert.notNull(materialType, "Material type not defined.");

        Material material = getAvailableMaterialByType(materialType);
        if (material != null) {
            // create material requisition
            materialRequisition = materialRequisitionRepository.save(materialRequisition);
            // update quantity
            material.setQuantity(material.getQuantity() + quantity);
            materialRepository.save(material);
        }
        return MaterialRequisitionAssembler.convertToDTO(materialRequisition);
    }


    public List<MaterialDTO> getAllAvailableMaterial() {
        List<Material> availableMaterial = materialRepository.findByQuantityGreaterThan(ZERO);
        return availableMaterial.stream()
                .map(material -> MaterialAssembler.convertToDTO(material))
                .collect(Collectors.toList());
    }

    public List<MaterialRequisitionDTO> getAllRequisitionsByType(final String materialType) {
        List<MaterialRequisition> requisitionsByType = materialRequisitionRepository.findAllByMaterialType(materialType);
        return requisitionsByType.stream()
                .map(requisition -> MaterialRequisitionAssembler.convertToDTO(requisition))
                .collect(Collectors.toList());
    }


    private Material getAvailableMaterialByType(final String materialType) {
        Optional<Material> availableMaterial = materialRepository.findByMaterialTypeAndByQuantityGreaterThan(materialType, ZERO);
        return availableMaterial.isPresent() ? availableMaterial.get() : null;
    }


}
