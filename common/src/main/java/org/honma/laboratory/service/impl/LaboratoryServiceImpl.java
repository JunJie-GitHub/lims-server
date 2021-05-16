package org.honma.laboratory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.entity.LaboratoryApplyState;
import org.honma.laboratory.mapper.LaboratoryMapper;
import org.honma.laboratory.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
@Service
public class LaboratoryServiceImpl extends ServiceImpl<LaboratoryMapper, Laboratory> implements LaboratoryService {
    @Autowired
    LaboratoryMapper laboratoryMapper;

    @Override
    public Boolean insertLaboratoryApplication(String name, Date date, String classTime, String reason, String state) {
        return laboratoryMapper.insertLaboratoryApplication(name, date, classTime, reason, state);
    }

    @Override
    public List<LaboratoryApplyState> getAllLaboratoryState() {
        return laboratoryMapper.getAllLaboratoryState();
    }
}
