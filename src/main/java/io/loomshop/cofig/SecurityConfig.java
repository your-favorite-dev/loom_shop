package io.loomshop.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                authorizeRequests.requestMatchers("/",
                                "/index.html",
                                "/css/**",
                                "/js**",
                                "/images/**"
                        ).permitAll()
                        .anyRequest().authenticated()
        ).formLogin(form -> form
                .loginPage("/login")
                .permitAll()).logout(logout -> logout.permitAll());
        return http.build();
    }
}
