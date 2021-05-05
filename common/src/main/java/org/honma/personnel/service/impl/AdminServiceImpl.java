package org.honma.personnel.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.honma.personnel.entity.Admin;
import org.honma.personnel.mapper.AdminMapper;
import org.honma.personnel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lijunjie
 * @Date: 2021/4/24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired AdminMapper adminMapper;

    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean loginValid(String username, String password) {
        Admin user = this.selectOne(new EntityWrapper<Admin>().eq("username", username));
        if (user == null){
            return false;
        }
        return username.equals(user.getUsername()) && password.equals(user.getPassword());
    }
}
