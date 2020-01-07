package indi.welfare.jobs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.dto.pms.PositionDTO;
import indi.welfare.jobs.mapper.pms.PmsPositionMapper;
import indi.welfare.jobs.service.PmsPositionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsPositionServiceImpl implements PmsPositionService {

    @Resource
    private PmsPositionMapper positionMapper;

    @Override
    public PageInfo<PositionDTO> listAllPositions(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PositionDTO> list = positionMapper.selectAll();
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<PositionDTO> listAppliedPositionsByUserId(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PositionDTO> list = positionMapper.selectAppliedPositionsByUserId(userId);
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<PositionDTO> listPostedPositionsByUserId(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PositionDTO> list = positionMapper.selectPostedPositionsByUserId(userId);
        return new PageInfo<>(list);
    }

    @Transactional
    @Override
    public String postPosition(PositionDTO positionDTO, int userId) {
        int ret = positionMapper.insertPosition(positionDTO, userId);
        return ret == 1? "success": "failed";
    }

    @Transactional
    @Override
    public String applyPosition(int positionId, int userId) {
        int ret = positionMapper.insertAppliedPosition(positionId, userId);
        return ret == 1? "success": "failed";
    }
}
