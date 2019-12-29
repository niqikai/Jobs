package indi.welfare.jobs.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import indi.welfare.jobs.entity.PmsPosition;
import indi.welfare.jobs.entity.UmsUser;
import indi.welfare.jobs.service.PmsPositionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UmsUserMapperTest {

    @Resource
    private UmsUserMapper userMapper;

    @Resource
    private PmsPositionMapper positionMapper;

    @Autowired
    private PmsPositionService positionService;


    @Test
    void serviceTest() {
        System.out.println(positionService.applyPosition(1,4));
    }

    @Test
    void insert() {
        UmsUser user  = new UmsUser();
        user.setUsername("name1");
        user.setPassword("456");

        System.out.println(userMapper.insert(user));
    }

    @Test
    void selectAll() {
        List<UmsUser> users = new ArrayList<>(userMapper.selectAll());
        System.out.println(users);
    }

    @Test
    void pageHelperTest() {
        PageHelper.startPage(1,10);
        List<PmsPosition> list = new ArrayList<>();
        list = positionMapper.selectAll();
        PageInfo<PmsPosition> pList = new PageInfo<>(list);

        System.out.println(pList);
    }


    @Test
    void testInsert() {
        PmsPosition position = new PmsPosition();
        position.setJobTitle("123");
        position.setCompanyName("sdf");
        position.setCityId(1);
        position.setJobDescription("12222222");
        position.setIndustry(1);
        position.setPositionType(12);
        position.setMinSalary(new BigDecimal("1000"));
        position.setMaxSalary(new BigDecimal("1000"));
        int ret = positionMapper.insertPosition( position, 113);
        System.out.println(ret);

    }






}