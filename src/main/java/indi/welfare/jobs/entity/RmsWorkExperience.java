package indi.welfare.jobs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RmsWorkExperience implements Serializable {
    private Integer id;

    private Integer resumeId;

    private Date startDate;

    private Date endDate;

    private String company;

    private Date createTime;

    private String description;


}