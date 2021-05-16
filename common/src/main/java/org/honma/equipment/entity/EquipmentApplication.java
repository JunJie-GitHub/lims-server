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
@TableName("equipment_application")
public class EquipmentApplication {
    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
    private String id;

    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学号
     */
    private String studentName;
    /**
     * 设备名
     */
    private String equipmentName;
    /**
     * 实验内容
     */
    private String experimentContext;
    /**
     * 实验目的
     */
    private String experimentPurpose;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 指导老师
     */
    private String tutor;
    /**
     * '状态(1:通过,0:未审核, 2:拒绝)'
     */
    private String state;
}
