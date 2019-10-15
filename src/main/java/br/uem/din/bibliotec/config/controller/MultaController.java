package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.dao.MultaDao;
import br.uem.din.bibliotec.config.dao.UsuarioDao;
import br.uem.din.bibliotec.config.model.Multa;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MultaController implements Serializable {
    private Multa multa = new Multa();
    private MultaDao multaDao = new MultaDao();
    private UsuarioDao usuarioDao = new UsuarioDao();

    public MultaController(){}

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public MultaDao getMultaDao() {
        return multaDao;
    }   
}
