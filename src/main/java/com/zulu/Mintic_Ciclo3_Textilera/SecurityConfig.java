package com.zulu.Mintic_Ciclo3_Textilera;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return  http.authorizeRequests()
                .mvcMatchers("/")
                .permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/users").permitAll()
                .antMatchers("/movements").permitAll()
                .antMatchers("/enterprises").permitAll()
                .anyRequest().authenticated()
                .and().oauth2Login()
                .and().build();
    }



}