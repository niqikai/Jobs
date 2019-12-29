package indi.welfare.jobs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.entity.PmsPosition;
import indi.welfare.jobs.mapper.PmsPositionMapper;
import indi.welfare.jobs.service.PmsPositionService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PmsPositionServiceImpl implements PmsPositionService {

    @Resource
    private PmsPositionMapper positionMapper;

    @Override
    public PageInfo<PmsPosition> listAllPositions(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PmsPosition> list = positionMapper.selectAll();
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<PmsPosition> listAppliedPositionsByUserId(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PmsPosition> list = positionMapper.selectAppliedPositionsByUserId(userId);
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<PmsPosition> listPostedPositionsByUserId(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PmsPosition> list = positionMapper.selectPostedPositionsByUserId(userId);
        return new PageInfo<>(list);
    }

    @Transactional
    @Override
    public String postPosition(PmsPosition pmsPosition, int userId) {
        int ret = positionMapper.insertPosition(pmsPosition, userId);
        return ret == 1? "success": "failed";
    }

    @Transactional
    @Override
    public String applyPosition(int positionId, int userId) {
        int ret = positionMapper.insertAppliedPosition(positionId, userId);
        return ret == 1? "success": "failed";
    }
}
