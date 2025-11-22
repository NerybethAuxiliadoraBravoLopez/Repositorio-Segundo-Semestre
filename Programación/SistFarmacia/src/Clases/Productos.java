
package Clases;


public class Productos {
    String Nombre;
    String Laboratorio;
    int Existencia;
    String Categoria;
    String Fecha;
    String Codigo;
    double Precio;
    String Estante;

    public Productos() {
    }

    public Productos(String Nombre, String Laboratorio, int Existencia, String Categoria, String Fecha, String Codigo, double Precio, String Estante) {
        this.Nombre = Nombre;
        this.Laboratorio = Laboratorio;
        this.Existencia = Existencia;
        this.Categoria = Categoria;
        this.Fecha = Fecha;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Estante = Estante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String Laboratorio) {
        this.Laboratorio = Laboratorio;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getEstante() {
        return Estante;
    }

    public void setEstante(String Estante) {
        this.Estante = Estante;
    }
    
    
            
            }

    

