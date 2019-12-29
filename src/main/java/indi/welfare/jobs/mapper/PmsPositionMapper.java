package indi.welfare.jobs.mapper;

import indi.welfare.jobs.entity.PmsPosition;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PmsPositionMapper {

    List<PmsPosition> selectAll();

    @Select(" select * from pms_position where creator_id = #{userId} order by create_time desc" )
    List<PmsPosition> selectPostedPositionsByUserId(int userId);

    List<PmsPosition> selectAppliedPositionsByUserId(int userId);

    int insertPosition( PmsPosition pmsPosition, int userId);

    @Insert(" insert into pms_applied_position (position_id, user_id) VALUES (#{positionId}, #{userId}) ")
    int insertAppliedPosition(int positionId, int userId);

    @Update(" update pms_applied_position set checked = 1 where position_id = #{positionId}")
    int updateAppliedPosition(int positionId);

}