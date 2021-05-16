package org.honma.equipment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/5/14
 */
@Data
@TableName("equipment")
public class Equipment {
    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
    private String id;
    /**
     * 设备名
     */
    private String name;
    /**
     * 设备用途
     */
    private String purpose;
    /**
     * 数量
     */
    private String quantity;
    /**
     * 设备位置
     */
    private String location;
    /**
     * 备注(可存维修信息)
     */
    private String remarks;
    /**
     * 设备id
     */
    private String equipmentId;
    /**
     * 设备状态(0: 正常, 1:待维修)
     */
    private String status;

}
