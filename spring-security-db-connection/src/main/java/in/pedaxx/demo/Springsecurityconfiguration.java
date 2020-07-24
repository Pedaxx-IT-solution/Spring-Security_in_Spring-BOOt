package in.pedaxx.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Springsecurityconfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	// the above datasource is pointing to the database

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		/*  1st 
		 // my database is now in memory 
		  auth.inMemoryAuthentication().withUser("user").password("password").roles("user")
		.and().withUser("admin").password("password").roles("admin");
		*/
		
		
		
		
		
		
/* 2nd		
		// default schema configured by spring

	auth.jdbcAuthentication().dataSource(dataSource).withDefaultSchema()
	.withUser(
			User.withUsername("user").password("password").roles("USER")
			).withUser(
					User.withUsername("admin").password("password").roles("ADMIN")		
					);
	
*/	
		
		
		
		
		
		auth.jdbcAuthentication().dataSource(dataSource);
		
		// the below is the default query made by spring we can change the parameter for customizd schema
	/*	.usersByUsernameQuery(
				
				"select username , password , enables from users where username = ?"
				)
		.authoritiesByUsernameQuery(
				"select username , authority from authorities where username = ? "
				
				);
		*/
		
		
	
		
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("ADMIN", "USER")
				.antMatchers("/").permitAll().and().formLogin();

	}
	
	@Bean
	PasswordEncoder getpassword() {
		return NoOpPasswordEncoder.getInstance();
		
	}

}
