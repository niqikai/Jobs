package indi.welfare.jobs.controller;

import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.entity.PmsPosition;
import indi.welfare.jobs.service.PmsPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pms")
public class PmsPositionController {
    private final PmsPositionService positionService;
    @Autowired
    public PmsPositionController(PmsPositionService positionService) {
        this.positionService = positionService;
    }

/**
    PageInfo<PmsPosition> listAllPositions(int pageNum, int pageSize);

    PageInfo<PmsPosition> listAppliedPositionsByUserId(int userId, int pageNum, int pageSize);

    PageInfo<PmsPosition> listPostedPositionsByUserId(int userId, int pageNum, int pageSize);

    String postPosition( PmsPosition pmsPosition, int userId);

    String applyPosition(int positionId, int userId);
   */

    @GetMapping("/all")
    PageInfo<PmsPosition> listAllPositions(Integer pageNum, Integer pageSize){
        return positionService.listAllPositions(pageNum, pageSize);
    }




}
