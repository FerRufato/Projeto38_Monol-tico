package com.exemplo.controle;

import com.exemplo.modelo.Usuario;
import com.exemplo.servico.UsuarioServico;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UsuarioBean {

    private Usuario usuario = new Usuario();

    @Inject
    private UsuarioServico servico;

    public void salvar() {
        servico.cadastrar(usuario);
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
