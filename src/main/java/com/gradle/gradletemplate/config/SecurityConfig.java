package com.gradle.gradletemplate.config;

import com.gradle.gradletemplate.config.security.CustomAuthenticationFailureHandler;
import com.gradle.gradletemplate.config.security.CustomAuthenticationSuccessHandler;
import com.gradle.gradletemplate.config.security.CustomUserDetailsService;
import com.gradle.gradletemplate.config.security.LoginProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

    @Autowired
    private CustomAuthenticationFailureHandler customAuthenticationFailureHandler;

    @Autowired
    private LoginProvider loginProvider;

    // 인증 예외처리
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/bootstrap/**", "/common/**", "/jquery/**", "/js/**");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
			.headers(headers -> headers
				.cacheControl(cache->cache.disable()))

                .authorizeRequests()
                .antMatchers("/board/**").hasAuthority("MEMBER")
                .anyRequest().permitAll()

			.and()
			.cors()

                .and()
                .formLogin()
                .loginPage("/login/loginForm")
                .loginProcessingUrl("/login")
                .usernameParameter("userId")
                .passwordParameter("userPw")
                .successHandler(customAuthenticationSuccessHandler)
                .failureHandler(customAuthenticationFailureHandler)
                .permitAll()

                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true).deleteCookies("JSESSIONID")

                // ajax 통신 가능하도록
                .and()
                .csrf()
                .disable()
                .authenticationProvider(loginProvider)

        ;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
