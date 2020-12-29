package model.project.security;

import model.project.entity.RoleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

    @Autowired
    MyUserDetailsService userDetailsService;

	private PasswordEncoder encode;

	@Autowired
	public SecurityConfiguration(PasswordEncoder encode) {
		this.encode = encode;
	}


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
                .antMatchers("/admin").hasAuthority(RoleType.ADMIN.name())
                .antMatchers("/users").hasAnyAuthority("CLIENT", "ADMIN")
                .antMatchers("/").permitAll();
	}
	
}