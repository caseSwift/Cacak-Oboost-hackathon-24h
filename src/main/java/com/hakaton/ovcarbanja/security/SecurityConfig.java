package com.hakaton.ovcarbanja.security;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
                "select email, password, 'true' as enabled from user where email=?"
        ).authoritiesByUsernameQuery(
                "select email, 'ROLE_USER' from user where email=?"
        );
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/auth/**").permitAll()
                .and().authorizeRequests().antMatchers("home/**").permitAll()
                .and()
                .authorizeRequests()
                .antMatchers( "/search/**", "/shop/**", "/profile/**").authenticated()
                .and()
                .formLogin().loginPage("/auth").loginProcessingUrl("/loginUser")
                .defaultSuccessUrl("/search");

    }
}
