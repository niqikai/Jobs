package indi.welfare.jobs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RmsResume implements Serializable {
    private Integer id;

    private Integer userId;

    private String name;

    private Date birthday;

    private Integer degree;

    private Integer gender;

    private String phoneNumber;

    private String experience;

    private Date createTime;


}