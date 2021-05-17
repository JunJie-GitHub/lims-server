package org.honma.security.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.honma.personnel.entity.Account;
import org.honma.personnel.entity.Admin;
import org.honma.personnel.mapper.AdminMapper;
import org.honma.personnel.service.AccountService;
import org.honma.personnel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijunjie
 * @Date: 2021/5/5
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //s是表单传过来的用户名
        Account account = accountService.getOne(new QueryWrapper<Account>().eq("username", s));
        if (account == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new User(account.getUsername(), new BCryptPasswordEncoder().encode(account.getPassword()), auths);
    }
}
