package indi.welfare.jobs.mapper.sys;

import indi.welfare.jobs.dto.sys.City;
import indi.welfare.jobs.dto.sys.DictData;
import indi.welfare.jobs.dto.sys.DictType;

public interface SysMapper {
    DictData selectDataById(Integer id);

    DictType selectTypeById(Integer id);

    City selectCityById(Integer id);

}
