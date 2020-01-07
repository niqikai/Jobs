package indi.welfare.jobs.service;

import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.dto.pms.PositionDTO;

public interface PmsPositionService {
    PageInfo<PositionDTO> listAllPositions(int pageNum, int pageSize);

    PageInfo<PositionDTO> listAppliedPositionsByUserId(int userId, int pageNum, int pageSize);

    PageInfo<PositionDTO> listPostedPositionsByUserId(int userId, int pageNum, int pageSize);

    String postPosition(PositionDTO positionDTO, int userId);

    String applyPosition(int positionId, int userId);


}
