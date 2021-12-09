package tn.esprit.spring.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tn.esprit.spring.Filter.CustomAuthenticationFilter;
import tn.esprit.spring.service.UserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CustomAuthenticationFilter customAuthenticationFilter =new CustomAuthenticationFilter(authenticationManagerBean());
        http.authorizeRequests() .antMatchers("/SpringMVC**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/getRevenuBrutProduit/{idProduit}/{startDate}/{endDate}").access("hasRole('SUPERADMIN')")
                .antMatchers("/get**}").access("hasRole('ADMIN')")
                .antMatchers("/retrieve-all-clients").access("hasRole('ADMIN')")
                .anyRequest()
                .authenticated()
                //.anyRequest().permitAll()//to permit all request without login a la place de  .authenticated()
                .and()
                .httpBasic().and().csrf().disable()
                .addFilter(customAuthenticationFilter);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
