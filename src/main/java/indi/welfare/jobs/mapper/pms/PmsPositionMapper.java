package indi.welfare.jobs.mapper.pms;

import indi.welfare.jobs.dto.pms.PositionDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PmsPositionMapper {

    List<PositionDTO> selectAll();

    PositionDTO select(Integer id);

    @Select(" select * from pms_position where creator_id = #{userId} order by create_time desc" )
    List<PositionDTO> selectPostedPositionsByUserId(int userId);

    List<PositionDTO> selectAppliedPositionsByUserId(int userId);

    int insertPosition(PositionDTO positionDTO, int userId);

    @Insert(" insert into pms_applied_position (position_id, user_id) VALUES (#{positionId}, #{userId}) ")
    int insertAppliedPosition(int positionId, int userId);

    @Update(" update pms_applied_position set checked = 1 where position_id = #{positionId}")
    int updateAppliedPosition(int positionId);

}