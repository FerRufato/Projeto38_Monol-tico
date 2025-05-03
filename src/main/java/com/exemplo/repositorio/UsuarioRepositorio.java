package com.exemplo.repositorio;

import com.exemplo.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class UsuarioRepositorio {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    public List<Usuario> listar() {
        return em.createQuery("FROM Usuario", Usuario.class).getResultList();
    }
}
