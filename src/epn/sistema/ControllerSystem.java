package epn.sistema;

import java.util.ArrayList;

public class ControllerSystem {
    public boolean on(){
        Atenea      atenea      = new Atenea();
        SAEW        saew        = new SAEW();
        AppMobile   appMobile   = new AppMobile();
        SistemaEPN appMobile = new AppMobile();
        
        ArrayList<SistemaEPN> lista = new ArrayList<>();
        lista.add(atenea);
        lista.add(saew);
        lista.add(appMobile);

        System.out.println("Inicializando sistema...");
        atenea.on();
        saew.on();
        appMobile.on();
        
        // CORRECCIÓN: Se usa 'for' en lugar de 'foreach'
        for(SistemaEPN sistema : lista){
            sistema.on();
        } 

        return true;
    }
    
    public boolean off(){
        System.out.println("Apagando sistema...");
        return true;
    }
}