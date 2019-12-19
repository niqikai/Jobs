package indi.welfare.jobs.dao;

import indi.welfare.jobs.entity.PmsPosition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PmsPositionRepository extends JpaRepository<PmsPosition, Integer> {
    PmsPosition findById(int id);

    Page<PmsPosition> findAllBySuspendFalse(Pageable pageable);

}
