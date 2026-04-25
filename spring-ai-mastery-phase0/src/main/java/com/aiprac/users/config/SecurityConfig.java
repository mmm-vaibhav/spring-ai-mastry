package com.aiprac.users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/actuator/**", "/h2-console/**").permitAll()
                .anyRequest().permitAll()   // For learning phase only
            )
            .csrf(csrf -> csrf.disable())   // Disable for simplicity in dev
            .headers(headers -> headers.frameOptions(frame -> frame.disable())); // Allow H2 console

        return http.build();
    }
}