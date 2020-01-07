package indi.welfare.jobs.dto.sys;

import lombok.Data;

import java.io.Serializable;

@Data
public class DictData implements Serializable {
    int id;
    DictType type;
    String code;
    String name;

}
