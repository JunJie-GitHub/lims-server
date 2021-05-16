package org.honma.laboratory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.entity.LaboratoryApplyState;

import java.util.Date;
import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
public interface LaboratoryService extends IService<Laboratory> {
    Boolean insertLaboratoryApplication(String name, Date date,String classTime,String reason,String state);
    List<LaboratoryApplyState> getAllLaboratoryState();
}
