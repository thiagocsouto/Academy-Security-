package br.com.academy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.model.Usuario;
import br.com.academy.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void salvarUsuario(Usuario usuario) throws Exception{
		usuarioRepository.save(usuario);  
	}
	
	
//	public Usuario loginUsuario(String login, String senha){	
//		Usuario usuarioLogin = usuarioRepository.buscarLogin(login, senha);
//		return usuarioLogin;		
//	}

}

//Caso queira usar criptografia na senha:
//try {
//	
//	if(usuarioRepository.findByEmail(usuario.getEmail()) != null) {
//		throw new EmailExistsException("email já existe no cadastro: "+ usuario.getEmail());
//	}
//	
//	usuario.setSenha(usuario.getSenha());
//	
//} catch (NoSuchAlgorithmException e) {
//	
//	throw new CriptoExistException("Erro na criptografia da senha");
//}
