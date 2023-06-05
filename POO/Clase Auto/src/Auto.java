import java.util.ArrayList;
public class Auto {
    private long numero_chasis;
    private String marca, modelo;
    private float precio;
    private ArrayList<Parachoques> parachoque; //El Parachoque como parte del Auto
    private ArrayList<Puerta> puerta; //La Puerta como parte del Auto
    private ArrayList<Motor> motor; // El motor como parte del Auto
    private ArrayList<Rueda> ruedas; //La Rueda como parte del Auto
    private char estado;
    public Auto(long numero_chasis, String marca, String modelo, float precio, ArrayList<Parachoques> parachoque,
            ArrayList<Puerta> puerta, ArrayList<Motor> motor, ArrayList<Rueda> ruedas, char estado) {
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.parachoque = parachoque;
        this.puerta = puerta;
        this.motor = motor;
        this.ruedas = ruedas;
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
    public ArrayList<Parachoques> getParachoque() {
        return parachoque;
    }
    public void setParachoque(ArrayList<Parachoques> parachoque) {
        this.parachoque = parachoque;
    }
    public ArrayList<Puerta> getPuerta() {
        return puerta;
    }
    public void setPuerta(ArrayList<Puerta> puerta) {
        this.puerta = puerta;
    }
    public ArrayList<Motor> getMotor() {
        return motor;
    }
    public void setMotor(ArrayList<Motor> motor) {
        this.motor = motor;
    }
    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }
    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public void mostrar(){
        System.out.println("CHASIS: " + this.getNumero_chasis());
        System.out.println("MARCA: " + this.getMarca());
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PRECIO: " + this.getPrecio());
        System.out.println("ESTADO: " + this.getEstado());
        System.out.println("\nLOS DATOS DE LA RUEDAS DEL " + this.getMarca() + " " +this.getModelo() +  " "+" SON:");
        System.out.println("SEC\tCODIGO\tMARCA\tRIN\tPRECIO\tESTADO");
        for(int i = 0; i < this.getRuedas().size(); i++){
            System.out.print((i+1) + "\t");
            ruedas.get(i).mostrar();
        }
    }
    public void mostrar1(){
        System.out.println("\nLOS DATOS DEL MOTOR " + this.getMarca() + " " +this.getModelo() +  " "+ " SON:");
        System.out.println("COMBUSTION\tCODIGO\tPRECIO\tFORMA\t\tBUJIA");
        for(int i = 0; i < this.getMotor().size(); i++){
            motor.get(i).mostrar1();
        }
    }
    public void mostrar2(){
        System.out.println("\nLOS DATOS DE LAS PUERTAS " + this.getMarca() + " " +this.getModelo() + " " +" SON:");
        System.out.println("SEC\tCODIGO\tMATERIAL\tPRECIO\tMANIJA\tBISAGRA");
        for(int i = 0; i < this.getPuerta().size(); i++){
            System.out.print((i+1) + "\t");
            puerta.get(i).mostrar2();
        }
    }
    public void mostrar3(){
        System.out.println("");
        System.out.println("\nLOS DATOS DE LOS PARACHOQUES DEL " + this.getMarca() + " " +this.getModelo() + " " +" SON:");
        System.out.println("PARTE\t\tCODIGO\tMATERIAL\tPRECIO\tPESO");
        for(int i = 0; i < this.getParachoque().size(); i++){
            parachoque.get(i).mostrar3();
        }
    }
}