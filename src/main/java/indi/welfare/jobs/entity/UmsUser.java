package indi.welfare.jobs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Date signUpTime;


}