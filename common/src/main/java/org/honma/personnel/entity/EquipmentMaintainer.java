package org.honma.personnel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/4/15
 */
@Data
@TableName("equipment_maintainer")
public class EquipmentMaintainer {
    /**
     * 主键id
     */
    @TableId(type = IdType.INPUT)
    private String id;

    /**
     * 姓名
     */
    private String name;
    /**
     * 薪资
     */
    private String salary;
    /**
     * 邮件
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
}
