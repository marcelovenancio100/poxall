package br.com.nvx.authorizationserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserStoreConfig {

	@Bean
	public UserDetailsService userDetailsService() {
    //TODO implementar a partir de uma base de dados.

		var userDetailsManager = new InMemoryUserDetailsManager();
		
		userDetailsManager.createUser(
			User.withUsername("root")
				.password("{noop}1234")
				.roles("ROOT")
				.build());
		return userDetailsManager;
	}
}
