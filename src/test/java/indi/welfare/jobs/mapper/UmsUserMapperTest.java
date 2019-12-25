package indi.welfare.jobs.mapper;

import indi.welfare.jobs.entity.UmsUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UmsUserMapperTest {

    @Resource
    UmsUserMapper userMapper;

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
}