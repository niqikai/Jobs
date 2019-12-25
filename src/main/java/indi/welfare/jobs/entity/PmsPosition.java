package indi.welfare.jobs.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsPosition implements Serializable {
    private Integer id;

    private String jobTitle;

    private String companyName;

    private Integer cityId;

    private Integer industry;

    private Integer positionType;

    private BigDecimal minSalary;

    private BigDecimal maxSalary;

    private Boolean suspend;

    private Integer creatorId;

    private Date createTime;

    private String jobDescription;


}