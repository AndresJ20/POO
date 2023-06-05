import java.util.ArrayList;
public class Auto2 {
    private long numero_chasis;
    private String marca, modelo;
    private float precio;
    private ArrayList<Puerta> puerta; //La Rueda como parte del Auto
    private char estado;
    public Auto2(long numero_chasis, String marca, String modelo, float precio, ArrayList<Puerta> puerta, char estado) {
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.puerta = puerta;
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
    public ArrayList<Puerta> getPuerta() {
        return puerta;
    }
    public void setPuerta(ArrayList<Puerta> puerta) {
        this.puerta = puerta;
    }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public void mostrar2(){
        System.out.println("");
        System.out.println("\nLOS DATOS DE LAS PUERTAS " + this.getMarca() + " " +this.getModelo() + " " +" SON:");
        System.out.println("SEC\tCODIGO\tMATERIAL\tPRECIO\tMANIJA\tBISAGRA");
        for(int i = 0; i < this.getPuerta().size(); i++){
            System.out.print((i+1) + "\t");
            puerta.get(i).mostrar2();
        }
    }
}