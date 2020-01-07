package indi.welfare.jobs.controller;

import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.dto.pms.PositionDTO;
import indi.welfare.jobs.service.PmsPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    @GetMapping("/all")
    PageInfo<PositionDTO> listAllPositions(Integer pageNum, Integer pageSize){
        return positionService.listAllPositions(pageNum, pageSize);
    }

    @GetMapping("/appliedPositions")
    PageInfo<PositionDTO> listAppliedPositionsByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        return positionService.listAppliedPositionsByUserId(userId, pageNum, pageSize);
    }

    @GetMapping("/postedPositions")
    PageInfo<PositionDTO> listPostedPositionsByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        return positionService.listPostedPositionsByUserId(userId, pageNum, pageSize);
    }



    @PostMapping("/postPosition")
    String postPosition(PositionDTO positionDTO, Integer userId) {
        return positionService.postPosition(positionDTO, userId);
    }

    @PostMapping("/applyPosition")
    String applyPosition(Integer positionId, Integer userId) {
        return positionService.applyPosition(positionId, userId);
    }

}
