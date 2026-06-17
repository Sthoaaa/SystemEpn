package epn.sistema;

public abstract class SistemaEPN SistemaEPN implements IAccion {
    private String version;
    private String nombre;

    // Se deben implementar obligatoriamente los métodos de IAccion:
    
    @Override
    public boolean on() {
        // Comportamiento por defecto o base
        System.out.println("Iniciando componente base de SistemaEPN...");
        return true;
    }

    @Override
    public boolean off() {
        // Comportamiento por defecto o base
        System.out.println("Apagando componente base de SistemaEPN...");
        return true;
    }
}