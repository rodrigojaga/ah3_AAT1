package ah3;

import java.util.LinkedList;

public class vendedor {
        
        public static LinkedList<vendedor> vendedores = new LinkedList<>();
        //public static LinkedList<vendedor> vendedores1 = new LinkedList<>();
        private int codigo;
        private String nombre;
        private String caja;
        private String ventas;
        private String genero;
        private String contrasena;

    public vendedor(int codigo, String nombre, String caja, String ventas, String genero, String contrasena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.contrasena = contrasena;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

//    public Object[] datos(){
//        vendedorCrear va = new vendedorCrear();
//        Object[] obj = new Object[5];
//        obj[0] = va.codVendedor.getText();
//        obj[1] = va.nomVendedor.getText();
//        obj[2] = va.cajaVendedor.getText();
//        obj[3] = va.ventasVendedor.getText();
//        obj[4] = va.helicpteroapache.getText();
//        return obj;
//    }
   

  
        
  

    
    
   

   
        
    
    
    
}
