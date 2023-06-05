import java.util.ArrayList;
public class Auto3 {
    private long numero_chasis;
    private String marca, modelo;
    private float precio;
    private ArrayList<Parachoques> parachoque; //La Rueda como parte del Auto
    private char estado;
    public Auto3(long numero_chasis, String marca, String modelo, float precio, ArrayList<Parachoques> parachoque,
            char estado) {
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.parachoque = parachoque;
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
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
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