/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalregional;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HospitalRegional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
        Controlador_Hospital controla = new Controlador_Hospital();
        String rpta = "si";
 
        while (rpta.equalsIgnoreCase("si")) {
 
            Personal p = new Personal();
            while (p.getTipoDocumento() == null) {
                System.out.println("Ingrese el tipo de documento (DNI / CE(Carnet de Extranjeria)");
                p.setTipoDocumento(sc.nextLine());
            }
            while (p.getNumeroDocumento() == null) {
                if (p.getTipoDocumento().equalsIgnoreCase("DNI")) {
                    System.out.println("Ingrese el numero de documento DNI: ");
                } else {
                    System.out.println("Ingrese el numero de documento Carnet de Extranjeria:");
                }
                p.setNumeroDocumento(sc.nextLine());
            }
            while(true)
            {
            System.out.println("Ingrese el Apellido Paterno:");
            p.setApellidoPaterno(sc.nextLine());
            if(p.getApellidoPaterno() != null) break;
            }
            
            while(true)
            {
            System.out.println("Ingrese el Apellido Materno:");
            p.setApellidoMaterno(sc.nextLine());
            if(p.getApellidoMaterno()!= null)break;
            }
            
            while(true)
            {
            System.out.println("Ingrese los Nombres:");
            p.setNombres(sc.nextLine());
            if(p.getNombres()!= null) break;
            }
            while (p.getCelular() == null) {
                System.out.println("Ingrese el numero de celular:");
                p.setCelular(sc.nextLine());
            }
 
            System.out.println("Ingrese el correo electronico:");
            p.setCorreo(sc.nextLine());
 
            while (p.getTipoPersonal() == null) {
                System.out.println("Ingrese el tipo de personal (MEDICO / ENFERMERO / ADMINISTRATIVO):");
                p.setTipoPersonal(sc.nextLine());
            }
            controla.AgregarPersonal(p);
 
            System.out.println("Desea agregar mas personal: (si/no):");
            rpta = sc.nextLine();
        }
 
        controla.ListarPersonal();
    }
    
}
