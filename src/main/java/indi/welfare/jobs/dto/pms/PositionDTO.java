package indi.welfare.jobs.dto.pms;

import indi.welfare.jobs.dto.sys.City;
import indi.welfare.jobs.dto.sys.DictData;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PositionDTO implements Serializable {
    private Integer id;

    private String jobTitle;

    private String companyName;
//    private Integer cityId;
    private City city;

    private String jobDescription;
//    private Integer industryId;
    private DictData industry;

    private DictData positionType;

    private BigDecimal minSalary;

    private BigDecimal maxSalary;

    private Boolean suspend;

    private Integer creatorId;

    private Date createTime;




}