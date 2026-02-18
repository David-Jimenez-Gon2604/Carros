public class Carros{
    private String marca;
    private int salida;
    private String velocidad;
    private boolean caja;

    //Setters - Asignar
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setSalida(int salida){
        this.salida = salida;
    }
    public void setVelocidad(String velocidad){
        this.velocidad = velocidad;
    }
    public void setCaja(boolean caja){
        this.caja = caja;
    }

    // Getters - Obtener
    public String getMarca(){
        return this.marca;
    }
     public int getSalida(){
        return this.salida;
     }
     public String getVelocidad(){
        return this.velocidad;
    }
     public boolean getCaja(){
        return this.caja;
    }


    public void mostrarInfo(){
        System.out.println("Nombre "+this.marca);
        System.out.println("poder "+this.velocidad);
        System.out.println("pareja "+this.caja);
    }

}