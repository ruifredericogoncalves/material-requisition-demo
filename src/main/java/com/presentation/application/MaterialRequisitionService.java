package com.presentation.application;

import com.presentation.application.dto.MaterialAssembler;
import com.presentation.application.dto.MaterialDTO;
import com.presentation.application.dto.MaterialRequisitionDTO;
import com.presentation.domain.Material;
import com.presentation.infrastructure.persistence.MaterialRepository;
import com.presentation.infrastructure.persistence.MaterialRequisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
     * @param materialRequisitionDTO
     * @return
     */
    public MaterialRequisitionDTO createMaterialRequisition(MaterialRequisitionDTO materialRequisitionDTO) {
        return null;
    }

    public List<MaterialDTO> getAllAvailableMaterial() {
        List<Material> availableMaterial = materialRepository.findByQuantityGreaterThan(ZERO);
        return availableMaterial.stream()
                .map(material -> MaterialAssembler.convertToDTO(material))
                .collect(Collectors.toList());
    }


}
