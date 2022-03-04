package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository

public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }

}
