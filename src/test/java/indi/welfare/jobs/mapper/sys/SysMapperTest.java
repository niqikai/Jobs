package indi.welfare.jobs.mapper.sys;

import indi.welfare.jobs.dto.sys.DictData;
import indi.welfare.jobs.dto.sys.DictType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SysMapperTest {

    @Resource
    private SysMapper mapper;

    @Test
    void selectDataById() {
        DictData data = mapper.selectDataById(1);
        System.out.println(data);
    }

    @Test
    void selectTypeById() {
        DictType type = mapper.selectTypeById(3);
        System.out.println(type);
    }
}