package indi.welfare.jobs.service;

import indi.welfare.jobs.entity.PmsPosition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PmsPositionService {
    // 分页查找正在招聘的岗位;
    Page<PmsPosition> findAll(int page, int size);
}
