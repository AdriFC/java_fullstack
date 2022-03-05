package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entitymanager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entitymanager.createNamedQuery(query).getResultList();
    }

}
