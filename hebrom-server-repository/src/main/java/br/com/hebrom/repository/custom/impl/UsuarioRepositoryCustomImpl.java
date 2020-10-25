package br.com.hebrom.repository.custom.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Usuario;
import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.repository.custom.UsuarioRepositoryCustom;

@Repository
@Transactional
public class UsuarioRepositoryCustomImpl implements UsuarioRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Usuario realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO) {
        String query = "select * FROM tb_usuario where tx_login = '" + autenticacaoDTO.getLogin();
        query += "'and tx_senha = '" + autenticacaoDTO.getSenha() + "'";

        return (Usuario) entityManager.createNativeQuery(query, Usuario.class).getSingleResult();
    }

}