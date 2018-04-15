package com.presentation.infrastructure.persistence;

import com.presentation.domain.Material;
import com.presentation.domain.MaterialType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Material repository.
 */
public interface MaterialRepository extends JpaRepository<Material, Long> {

    Optional<Material> findById(String id);

    Optional<Material> findByMaterialType(String materialType);

    List<Material> findByQuantityGreaterThan(int quantity);

}
