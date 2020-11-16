package Modelo;


public class Usuario {
    
    private String nombre;
    private String apellido;
    private int tel;
    private String tip_dc;
    private int doc;
    private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getTip_dc() {
        return tip_dc;
    }

    public void setTip_dc(String tip_dc) {
        this.tip_dc = tip_dc;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
