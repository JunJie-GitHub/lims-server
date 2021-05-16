package org.honma.laboratory.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.entity.LaboratoryApplyState;

import java.util.Date;
import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
public interface LaboratoryMapper extends BaseMapper<Laboratory> {
    Boolean insertLaboratoryApplication(@Param("name") String name,
                                        @Param("date") Date date,
                                        @Param("classTime") String classTime,
                                        @Param("reason") String reason,
                                        @Param("state") String state);
    List<LaboratoryApplyState> getAllLaboratoryState();
}
