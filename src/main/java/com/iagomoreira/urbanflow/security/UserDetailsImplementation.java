package com.iagomoreira.urbanflow.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;

public class UserDetailsImplementation implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String id;
	private String email;
	private String password;
	private String departmentId;
	private Role role;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImplementation(User user) {

		this.id = user.getId();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.departmentId = user.getDepartmentId();
		this.role = user.getRole();
		this.authorities = List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getId() {
		return id;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}