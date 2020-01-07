package indi.welfare.jobs.dto.ums;

import lombok.Data;

import java.io.Serializable;
@Data
public class ThinUserDTO implements Serializable {
    private Integer id;
    private String username;
}
