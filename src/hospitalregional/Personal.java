/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalregional;

/**
 *
 * @author USUARIO
 */
public class Personal {
    private static int numcorrelativo = 0;
    private String codigoInterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String celular;
    private String correo;
    private String tipoPersonal;

    public Personal() {
        this.codigoInterno = generarCodigo();
    }
    
    public void Personal(String tipoDocumento, String tipoPersonal) {
        this.codigoInterno = generarCodigo();
        setTipoDocumento(tipoDocumento);
        setTipoPersonal(tipoPersonal);
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) 
    {
        try {
            if (tipoDocumento.equalsIgnoreCase("DNI") || tipoDocumento.equalsIgnoreCase("CE")) {
                this.tipoDocumento = tipoDocumento;
            } else {
                System.out.println("Tipo de documento invalido, Use: DNI o CE(Carnet de Extranjería)");
            }
        } catch (NullPointerException e) {
            System.out.println("El tipo de documento no puede estar vacio.");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) 
    {
        try {
            if (this.tipoDocumento.equalsIgnoreCase("DNI")) {
                if (numeroDocumento.length() == 8) {
                    this.numeroDocumento = numeroDocumento;
                } else {
                    System.out.println("El DNI debe tener 8 digitos");
                }
            } else if (this.tipoDocumento.equalsIgnoreCase("CE")) {
                if (numeroDocumento.length() == 9) {
                    this.numeroDocumento = numeroDocumento;
                } else {
                    System.out.println("El Carnet de Extranjeria debe tener 9 digitos");
                }
            }
        } catch (NullPointerException e) 
        {
            System.out.println("El numero de documento no puede estar vacio");
        }
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        
        if(apellidoPaterno == null || apellidoPaterno.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!apellidoPaterno.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.apellidoPaterno = apellidoPaterno;
        }
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        if(apellidoMaterno == null || apellidoMaterno.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!apellidoMaterno.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.apellidoMaterno = apellidoMaterno;
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if(nombres == null || nombres.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!nombres.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.nombres = nombres;
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) 
    {
        try {
            if (!celular.matches("\\d+")) {
                System.out.println("El celular solo debe contener numeros");
            } else if (celular.length() != 9) {
                System.out.println("El celular debe tener 9 digitos.");
            } else {
                this.celular = celular;
            }
        } catch (NullPointerException e) 
        {
            System.out.println("El celular no puede estar vacio");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) 
    {
        try {
            if (tipoPersonal.equalsIgnoreCase("MEDICO") || tipoPersonal.equalsIgnoreCase("ENFERMERO") || tipoPersonal.equalsIgnoreCase("ADMINISTRATIVO")) {
                this.tipoPersonal = tipoPersonal;
            } else {
                System.out.println("Tipo de personal invalido Use: MEDICO, ENFERMERO o ADMINISTRATIVO");
            }
        } catch (NullPointerException e) {
            System.out.println("El tipo de personal no puede estar vacio");
        }
    }  
    
    public static String generarCodigo() {
        numcorrelativo++;
        return "P" + String.format("%04d", numcorrelativo);
    }
    
    public void verDatos(){
        System.out.println("PERSONAL: COD: " + this.codigoInterno
            + " | TIPODOC: "  + this.tipoDocumento
            + " | NUMDOC: "   + this.numeroDocumento
            + " | PATERNO: "  + this.apellidoPaterno
            + " | MATERNO: "  + this.apellidoMaterno
            + " | NOMBRES: "  + this.nombres
            + " | CEL: "      + this.celular
            + " | CORREO: "    + this.correo
            + " | TIPO: "     + this.tipoPersonal
        );
    }  
}
