/*
 * package in.pedaxx.demo;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableWebSecurity public class demo extends WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * 
 * auth.inMemoryAuthentication().withUser("user").password("password").roles(
 * "USER").and().withUser("admin") .password("password").roles("ADMIN");
 * 
 * }
 * 
 * @Bean PasswordEncoder getpassPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance();
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * 
 * http.authorizeRequests().antMatchers("/admin").hasAnyRole("ADMIN").
 * antMatchers("/user") .hasAnyRole("USER",
 * "ADMIN").antMatchers("/").permitAll().and().formLogin();
 * 
 * }
 * 
 * }
 */