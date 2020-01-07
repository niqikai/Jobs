package indi.welfare.jobs.mapper;

import indi.welfare.jobs.dto.UmsUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UmsUserMapper {

    int insert(UmsUser umsUser);

    @Select("select * from ums_user")
    List<UmsUser> selectAll();
}