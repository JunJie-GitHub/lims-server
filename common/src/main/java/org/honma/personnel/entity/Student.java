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
@TableName("student")
public class Student {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮件
     */
    private String email;
    /**
     * 学号
     */
    private String studentNumber;
}
