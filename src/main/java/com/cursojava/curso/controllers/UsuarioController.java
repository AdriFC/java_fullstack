package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(35418L);
        usuario.setNombre("Adrián");
        usuario.setApellido("Fraga Cortés");
        usuario.setEmail("adri86vigo@gmail.com");
        usuario.setTelefono("676595231");

        Usuario usuario2 = new Usuario();
        usuario2.setId(56418L);
        usuario2.setNombre("Daniel");
        usuario2.setApellido("Martiñán Otero");
        usuario2.setEmail("dmartinan1991@gmail.com");
        usuario2.setTelefono("617634171");

        Usuario usuario3 = new Usuario();
        usuario3.setId(65913L);
        usuario3.setNombre("Susana");
        usuario3.setApellido("Pérez Gonzalez");
        usuario3.setEmail("susanapg@gmail.com");
        usuario3.setTelefono("632594175");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Adrián");
        usuario.setApellido("Fraga Cortés");
        usuario.setEmail("adri86vigo@gmail.com");
        usuario.setTelefono("676595231");

        return usuario;
    }

    @RequestMapping(value="usuarioss")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Adrián");
        usuario.setApellido("Fraga Cortés");
        usuario.setEmail("adri86vigo@gmail.com");
        usuario.setTelefono("676595231");
        return usuario;
    }

    @RequestMapping(value="usuarioaa")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Adrián");
        usuario.setApellido("Fraga Cortés");
        usuario.setEmail("adri86vigo@gmail.com");
        usuario.setTelefono("676595231");
        return usuario;
    }

    @RequestMapping(value="usuariocc")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Adrián");
        usuario.setApellido("Fraga Cortés");
        usuario.setEmail("adri86vigo@gmail.com");
        usuario.setTelefono("676595231");
        return usuario;
    }
}
