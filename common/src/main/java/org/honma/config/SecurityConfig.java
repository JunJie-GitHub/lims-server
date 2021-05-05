package org.honma.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: lijunjie
 * @Date: 2021/5/5
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(password());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("http://localhost:9529/#/login") //登录页面设置
                .loginProcessingUrl("/user/login")           //登录请求路径
                .defaultSuccessUrl("/admin/test").permitAll() //登录成功后跳转路径
                .and().authorizeRequests()
                .antMatchers("/", "/admin/test", "/user/login").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable();  //关闭csrf防护

    }

    @Bean
    PasswordEncoder password(){
        return new BCryptPasswordEncoder();
    }
}
