package org.honma.personnel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.honma.personnel.entity.Admin;

/**
 * @Author: lijunjie
 * @Date: 2021/4/24
 */
public interface AdminService extends IService<Admin> {

    boolean loginValid(String username, String password);
}
