package epn.sistema;

import epn.usuario.Estudiante;

public class AppMobile extends SistemaEPN implements IAccion{
    private Boolean estadoConexion;
    private Estudiante usuarioLogueado;
    @Override
    public boolean on() {
        System.out.println("on AppMobile");
        return true;
    }
    @Override
    public boolean off() {
        System.out.println("off AppMobile");
        return true;
    }
}
