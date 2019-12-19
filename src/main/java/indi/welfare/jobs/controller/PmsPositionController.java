package indi.welfare.jobs.controller;

import indi.welfare.jobs.entity.PmsPosition;
import indi.welfare.jobs.service.PmsPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pms/position")
public class PmsPositionController {
    private PmsPositionService pmsPositionService;
    @Autowired
    public PmsPositionController(PmsPositionService pmsPositionService) {
        this.pmsPositionService = pmsPositionService;
    }


    @GetMapping("/all")
    public Page<PmsPosition> listAllPositions() {

        return pmsPositionService.findAll(0, 10 );
    }

    @GetMapping("/listAll")
    public List<PmsPosition> listAll() {

        return pmsPositionService.findAll(0, 10 ).getContent();
    }

}
