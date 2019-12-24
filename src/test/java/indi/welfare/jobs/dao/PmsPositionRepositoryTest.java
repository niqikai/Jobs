package indi.welfare.jobs.dao;

import indi.welfare.jobs.entity.PmsPosition;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.math.BigDecimal;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PmsPositionRepositoryTest {
    @Autowired
    PmsPositionRepository pmsPositionRepository;

    @Autowired
    PmsPositionService pmsPositionService;

    @Test
    void test() {
        PmsPosition position = new PmsPosition();
        position.setJobTitle("1111111")
                .setCompanyName("2")
                .setCreatorId(1)
                .setIndustry(3)
                .setJobDescription("asdf")
                .setMaxSalary(new BigDecimal("10000"))
                .setMinSalary(new BigDecimal("222"))
                .setPositionType(1);
        System.out.println(position);
//        pmsPositionRepository.save(position);
    }

    @Test
    void test2() {
        PmsPosition position = pmsPositionRepository.findById(1);
        position.setCompanyName("9999");

        pmsPositionRepository.save(position);



    }

    @Test
    void test3() {
        for (int i = 120; i < 130; i ++) {
            PmsPosition position = new PmsPosition();
            Integer x = i;
            position.setJobTitle(x.toString())
                    .setCompanyName("q")
                    .setCreatorId(1)
                    .setIndustry(x*10)
                    .setJobDescription("asdf")
                    .setMaxSalary(new BigDecimal("10000"))
                    .setMinSalary(new BigDecimal("222"))
                    .setPositionType(1).setSuspend(true);
            pmsPositionRepository.save(position);
        }

    }


    @Test
    void testPaging() {

        Page<PmsPosition> positions =pmsPositionRepository.findAll(PageRequest.of(0,10,Sort.by(Sort.Direction.DESC,"id")));
        System.out.println(positions.getContent());
        System.out.println(
                pmsPositionRepository.findAllBySuspendFalse(PageRequest.of(0,10,Sort.by(Sort.Direction.DESC,"id"))).getContent()
        );
    }

}