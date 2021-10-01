package cl.bci.test.service;

import java.util.List;

import cl.bci.test.models.entity.Usuario;

public interface IUsuarioService {
	
    public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);

}
