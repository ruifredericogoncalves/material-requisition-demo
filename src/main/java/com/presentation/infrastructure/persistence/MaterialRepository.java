package com.presentation.infrastructure.persistence;

import com.presentation.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Material repository.
 */
public interface MaterialRepository extends JpaRepository<Material, Long> {

    Optional<Material> findById(String id);

    Optional<Material> findByMaterialType(String materialType);

    Optional<Material> findByMaterialTypeAndQuantityGreaterThan(String materialType, int quantity);

    List<Material> findByQuantityGreaterThan(int quantity);

}
