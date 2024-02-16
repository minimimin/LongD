package com.longd.longd.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true);
        config.setAllowedOrigins(List.of("http://i10d206.p.ssafy.io:3001", "https://i10d206.p.ssafy.io/", "http://localhost:3001", "http://172.30.1.10:3001/", "http://192.168.100.188:3001", "http://192.168.0.2:3001", "http://192.168.236.200:5173/","http://192.168.236.188:5173/","http://172.30.1.36:5173/", "http://172.30.1.51:5173/","http://localhost:3001","http://192.168.35.125:3001/", "http://192.168.35.205:3001/", "http://172.30.1.11:3001/", "http://192.168.0.38:3001/", "http://172.28.192.1:3001/"));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        config.setAllowedHeaders(List.of("*"));
        config.setExposedHeaders(List.of("*"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }

}