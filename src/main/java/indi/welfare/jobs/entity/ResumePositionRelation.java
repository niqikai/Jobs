package indi.welfare.jobs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ResumePositionRelation implements Serializable {
    private Integer id;

    private Integer positionId;

    private Integer resumeId;

    private Boolean checked;

    private Date createTime;


}