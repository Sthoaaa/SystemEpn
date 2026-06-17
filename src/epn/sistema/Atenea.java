package epn.sistema;

public class Atenea extends SistemaEPN implements IAccion{
    private String tipoCertificado;
    private Float costoTramite;
    private String estadoSolicitud;
    
    @Override
    public boolean on() {
        System.out.println("on Atenea");
        return true;
    }
    @Override
    public boolean off() {
        System.out.println("off Atenea");
        return true;
    }
}

