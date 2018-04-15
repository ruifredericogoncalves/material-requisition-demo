package com.presentation.infrastructure.persistence;

import com.presentation.domain.MaterialRequisition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Job repository.
 */
public interface MaterialRequisitionRepository extends JpaRepository<MaterialRequisition, Long> {

    Optional<MaterialRequisition> findById(String id);
}
