package org.honma.personnel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.honma.personnel.entity.Account;
import org.honma.personnel.entity.UserInfo;
import org.honma.personnel.mapper.AccountMapper;
import org.honma.personnel.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/17
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<UserInfo> getUserInfos() {
        return accountMapper.getUserInfos();
    }
}
