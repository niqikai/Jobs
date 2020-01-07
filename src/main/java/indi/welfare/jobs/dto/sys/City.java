package indi.welfare.jobs.dto.sys;

import lombok.Data;

import java.io.Serializable;

@Data
public class City implements Serializable {
    private Integer id;
    private String cityName;
    private Integer parentId;
    private String shortName;
    private Integer depth;
    private String cityCode;
    private String mergeName;
}
