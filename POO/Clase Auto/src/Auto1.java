import java.util.ArrayList;
public class Auto1 {
    private long numero_chasis;
    private String marca, modelo;
    private float precio;
    private ArrayList<Motor> motor; //La Rueda como parte del Auto
    private char estado;
    public Auto1(long numero_chasis, String marca, String modelo, float precio, ArrayList<Motor> motor, char estado) {
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.motor = motor;
        this.estado = estado;
    }
    public long getNumero_chasis() {
        return numero_chasis;
    }
    public void setNumero_chasis(long numero_chasis) {
        this.numero_chasis = numero_chasis;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public ArrayList<Motor> getMotor() {
        return motor;
    }
    public void setMotor(ArrayList<Motor> motor) {
        this.motor = motor;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public void mostrar1(){
        System.out.println("");
        System.out.println("\nLOS DATOS DEL MOTOR " + this.getMarca() + " " +this.getModelo() + " " +" SON:");
        System.out.println("COMBUSTION\tCODIGO\tPRECIO\tFORMA\t\tBUJIA");
        for(int i = 0; i < this.getMotor().size(); i++){
            motor.get(i).mostrar1();
        }
    }
}