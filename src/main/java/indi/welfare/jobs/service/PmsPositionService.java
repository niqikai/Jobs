package indi.welfare.jobs.service;

import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.entity.PmsPosition;

public interface PmsPositionService {
    PageInfo<PmsPosition> listAllPositions(int pageNum, int pageSize);

    PageInfo<PmsPosition> listAppliedPositionsByUserId(int userId, int pageNum, int pageSize);

    PageInfo<PmsPosition> listPostedPositionsByUserId(int userId, int pageNum, int pageSize);

    String postPosition( PmsPosition pmsPosition, int userId);

    String applyPosition(int positionId, int userId);


}
