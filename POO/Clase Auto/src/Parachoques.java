public class Parachoques {
    private String parte;
    private int codigo;
    private String material;
    private float precio;
    private float peso;
    public Parachoques(String parte, int codigo, String material, float precio, float peso) {
        this.parte = parte;
        this.codigo = codigo;
        this.material = material;
        this.precio = precio;
        this.peso = peso;
    }
    public String getParte() {
        return parte;
    }
    public void setParte(String parte) {
        this.parte = parte;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void mostrar3(){
        System.out.println(this.getParte() + "\t" + this.getCodigo() + "\t" + this.getMaterial() + "\t\t" + this.getPrecio()+ "\t" + this.getPeso());
    }
}