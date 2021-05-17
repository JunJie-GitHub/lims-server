package org.honma.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.honma.equipment.entity.Equipment;
import org.honma.equipment.mapper.EquipmentMapper;
import org.honma.equipment.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/14
 */
@Service
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements EquipmentService {
    @Autowired
    EquipmentMapper equipmentMapper;

    @Override
    public List<Object> listEquipmentNames() {
        List<Object> names =  equipmentMapper.selectObjs(new QueryWrapper<Equipment>().select("name"));
        return names;
    }

    @Override
    public List<Object> listTutors() {
        return equipmentMapper.selectObjs(new QueryWrapper<Equipment>().select("tutor"));
    }

}
