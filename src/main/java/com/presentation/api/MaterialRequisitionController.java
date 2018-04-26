package com.presentation.api;

import com.presentation.application.MaterialRequisitionService;
import com.presentation.application.dto.MaterialDTO;
import com.presentation.application.dto.MaterialRequisitionDTO;
import com.presentation.core.MaterialRequisitionHeader;
import com.presentation.core.MaterialRequisitionResponse;
import com.presentation.core.MaterialRequisitionResponseStatus;
import com.presentation.core.MaterialRequisitionStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * API to manage material requisition.
 * This API exposes several operations.
 * Allows:
 * <p>
 * - a list of who is using which material.
 * - a list of available material.
 * - a material requisition form.
 * - a material devolution form.
 * The user can request: a book, a laptop, a monitor, a video projector, etc.
 * <p>
 * Created by rjnascimento on 13/04/2018.
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
@Api(basePath = "/api", value = "Material Requisition", description = "Operations with material requisition", produces = "application/json")
public class MaterialRequisitionController {

    @Autowired
    private MaterialRequisitionService materialRequisitionService;

    /**
     * Create a material requisition.
     *
     * @param
     * @return ResponseEntity with status code CREATED and a materialRequisitionDTO object if everything is ok or INTERNAL_SERVER_ERROR otherwise.
     */
    @PostMapping(value = "/materialRequisition")
    @ApiOperation(value = "Create a material requisition", notes = "Creates a material requisition.")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Requisition not created."),
            @ApiResponse(code = 201, message = "Material requisition created")})
    public ResponseEntity createMaterialRequisition(@RequestBody final MaterialRequisitionDTO materialRequisitionDTO) {

        ResponseEntity responseEntity;
        MaterialRequisitionDTO newMaterialRequisition = materialRequisitionService.createMaterialRequisition(materialRequisitionDTO);
        if (newMaterialRequisition != null) {
            responseEntity = new ResponseEntity<>(newMaterialRequisition, HttpStatus.CREATED);
        } else {
            responseEntity = new ResponseEntity<>(newMaterialRequisition, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    /**
     * Get all materialAvailable from the database.
     *
     * @return list of available material.
     */
    @GetMapping(value = "/material/list")
    @ApiOperation(value = "Get all available material.", notes = "A list of available material.")
    public ResponseEntity availableMaterialList() {
        List<MaterialDTO> availableMaterial = materialRequisitionService.getAllAvailableMaterial();

        MaterialRequisitionResponseStatus responseStatus = new MaterialRequisitionResponseStatus();
        responseStatus.setStatus(MaterialRequisitionStatus.SUCCESS);
        MaterialRequisitionResponse materialRequisitionResponse = new MaterialRequisitionResponse<>(new MaterialRequisitionHeader(responseStatus), availableMaterial);

        return new ResponseEntity<>(materialRequisitionResponse, HttpStatus.OK);
    }

}