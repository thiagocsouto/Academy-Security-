package br.com.academy.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable, UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="email")
	private String email;
	@Size(min= 3, max= 20, message = "Usuario deve conter entre 3 a 20 caracteres")
	@Column(name="login")
	private String username;
	@Column(name="senha")
	private String password;
	
	@Transient
	private List<String> role;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	 public List<String> getRole() {
			return role;
		}

		public void setRole(List<String> role) {
			this.role = role;
		}

	@Override
 public Collection<? extends GrantedAuthority> getAuthorities() {
     List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(); 		
     for (String auth : this.role) { 			
         grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + auth)); 		
     }
     return grantedAuthorities; 	 
 }

	@Override
 public String getPassword() {
     return this.password;
 } 

 @Override
 public String getUsername() {
     return this.username;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
