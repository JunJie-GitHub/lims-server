package org.honma.equipment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.honma.equipment.entity.Equipment;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/14
 */
public interface EquipmentService extends IService<Equipment> {
    /**
     *
     * @return 设备名列表
     */
    List<Object>  listEquipmentNames();
}
