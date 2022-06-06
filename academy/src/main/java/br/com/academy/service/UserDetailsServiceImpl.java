package br.com.academy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.academy.model.Usuario;
import br.com.academy.repository.UsuarioRepository;

@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override 
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<String> roles = new ArrayList<String>();
		Usuario usuario = usuarioRepository.findByUsername(username);
		
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado.");
        } 
        	
        roles.add("ADMIN"); 
        roles.add("USER");  
        
        usuario.setRole(roles);
    
        return usuario;
	
}
	

}
