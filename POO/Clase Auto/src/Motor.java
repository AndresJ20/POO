public class Motor {
    private String combustion;
    private int codigo;
    private float precio;
    private String forma;
    private float bujia;
    public Motor(String combustion, int codigo, float precio, String forma, float bujia) {
        this.combustion = combustion;
        this.codigo = codigo;
        this.precio = precio;
        this.forma = forma;
        this.bujia = bujia;
    }
    public String getCombustion() {
        return combustion;
    }
    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public float getBujia() {
        return bujia;
    }
    public void setBujia(float bujia) {
        this.bujia = bujia;
    }
    public void mostrar1(){
        System.out.println(this.getCombustion() + "\t\t" + this.getCodigo() + "\t" + this.getPrecio() + "\t" + this.getForma()+ "\t" + this.getBujia());
    }
}