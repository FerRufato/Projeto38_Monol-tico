package com.exemplo.servico;

import com.exemplo.modelo.Usuario;
import com.exemplo.repositorio.UsuarioRepositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioServico {

    @Inject
    private UsuarioRepositorio repositorio;

    public void cadastrar(Usuario usuario) {
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        repositorio.salvar(usuario);
    }
}
