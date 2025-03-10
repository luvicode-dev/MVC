
package main;

import controllers.Controlador;
import models.Modelo;
import views.Vista;


public class principal {
    public static void main (String args[] ){
        
        Vista vista_prueba = new Vista();
        Modelo modelo_prueba = new Modelo();
        
        Controlador controlador_P = new Controlador(vista_prueba,modelo_prueba);
    
    
        vista_prueba.setVisible(true);
    }
    
}
