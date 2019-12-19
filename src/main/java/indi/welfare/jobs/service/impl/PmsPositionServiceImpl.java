package indi.welfare.jobs.service.impl;

import indi.welfare.jobs.dao.PmsPositionRepository;
import indi.welfare.jobs.entity.PmsPosition;
import indi.welfare.jobs.service.PmsPositionService;
import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class PmsPositionServiceImpl implements PmsPositionService {

    private PmsPositionRepository pmsPositionRepository;

    @Autowired
    public PmsPositionServiceImpl(PmsPositionRepository pmsPositionRepository) {
        this.pmsPositionRepository = pmsPositionRepository;
    }


    @Override
    public Page<PmsPosition> findAll(int page, int size) {
        // 根据 createTime 降序排
        return pmsPositionRepository.findAll(

                PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "createTime"))
        );
    }
}
