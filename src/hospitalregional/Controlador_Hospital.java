/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalregional;

import java.util.ArrayList;

/**
 *
 * @author zakkc
 */
public class Controlador_Hospital {
    ArrayList<Personal> Lista = new ArrayList();
    
    public void AgregarPersonal(Personal p)
    {
        Lista.add(p);
    }
    
    public void ListarPersonal()
    {
        System.out.println("========== LISTA DE PERSONAL DEL HOSPITAL ==========");
        for (Personal per:Lista) {
            per.verDatos();
        }
    }
    
    
    
}
