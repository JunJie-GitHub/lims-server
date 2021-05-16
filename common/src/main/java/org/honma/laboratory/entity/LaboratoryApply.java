package org.honma.laboratory.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: lijunjie
 * @Date: 2021/5/12
 */
@Data
@TableName(value = "laboratory_idle_state")
public class LaboratoryApply {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 实验室名称
     */
    private String name;
    /**
     * 申请人
     */
    private String student;
    /**
     * 学生学号
     */
    private String student_name;
    /**
     * 申请日期
     */
    private String date;
    /**
     * 申请课时
     */
    private String classTime;
    /**
     * 申请理由
     */
    private String reason;
    /**
     * 申请状态
     */
    private String state;
}
