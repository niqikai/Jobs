package indi.welfare.jobs.entity;


import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "pms_position")
public class PmsPosition {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String jobTitle;

  @Column
  private String companyName;

  @Column
  private String jobDescription;

  @Column
  private int industry;

  @Column
  private int positionType;

  @Column
  private BigDecimal minSalary;

  @Column
  private BigDecimal maxSalary;

  @Column
  private boolean suspend;
  @Column
  private int creatorId;

  @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP",insertable = false,updatable = false)
  @Generated(GenerationTime.INSERT)
  private java.sql.Timestamp createTime;


}
