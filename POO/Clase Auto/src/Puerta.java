public class Puerta {
    private int codigo;
    private String material;
    private float precio;
    private float manija;
    private float bisagra;
    public Puerta(int codigo, String material, float precio, float manija, float bisagra) {
        this.codigo = codigo;
        this.material = material;
        this.precio = precio;
        this.manija = manija;
        this.bisagra = bisagra;
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
    public float getManija() {
        return manija;
    }
    public void setManija(float manija) {
        this.manija = manija;
    }
    public float getBisagra() {
        return bisagra;
    }
    public void setBisagra(float bisagra) {
        this.bisagra = bisagra;
    }
    public void mostrar2(){
        System.out.println(this.getCodigo() + "\t" + this.getMaterial() + "\t\t" + this.getPrecio() + "\t" + this.getManija()+ "\t" + this.getBisagra());
    }
}