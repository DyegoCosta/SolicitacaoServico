package Domain.Application;

import Domain.Models.Usuario;

public class Authentication implements IAuthentication {

    private static Authentication instance = new Authentication();
    private Usuario usuario;

    private Authentication() {
    }

    public static Authentication getInstance() {
        return instance;
    }

    public void setUsuarioAutenticado(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Usuario obterUsuarioAutenticado() {
        return usuario;
    }
}
