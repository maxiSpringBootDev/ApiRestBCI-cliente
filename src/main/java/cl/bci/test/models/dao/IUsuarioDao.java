package cl.bci.test.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.bci.test.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
