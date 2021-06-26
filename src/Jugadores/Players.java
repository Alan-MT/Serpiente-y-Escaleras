package Jugadores;

public class Players {
    
    private String nombre, apellido;
    private int id, PartidaG, PartidaP, PartidasJ;

    public Players() {
    }
    /**
     * 
     * @param nombre
     * @param apellido 
     */
    public Players(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = generarid();
        this.PartidaG = 0;
        this.PartidaP = 0;
        this.PartidasJ = 0;
    }

    /**
     * 
     * @return 
     */
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidaG() {
        return PartidaG;
    }

    public void setPartidaG(int PartidaG) {
        this.PartidaG = PartidaG;
    }

    public int getPartidaP() {
        return PartidaP;
    }

    public void setPartidaP(int PartidaP) {
        this.PartidaP = PartidaP;
    }

    public int getPartidasJ() {
        return PartidasJ;
    }

    public void setPartidasJ(int PartidasJ) {
        this.PartidasJ = PartidasJ;
    }

    /**
     * Se genera un ID de 3 digitos
    //para inicializar un jugador
     * @return id
     */
    public int generarid(){
        return (int)(Math.random()*(999-100)+100);
    }
    
}
