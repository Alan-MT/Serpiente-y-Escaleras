package Jugadores;

import Tablero.Ficha.Ficha;

public class Players implements Comparable<Players> {

    private String nombre, apellido;
    private int id, PartidaG, PartidaP, PartidasJ;
    private boolean Penalizado;
    private Ficha ficha;

    public Players() {
    }

    /**
     *
     * @param nombre
     * @param apellido
     */
    public Players(Ficha ficha,String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = generarid();
        this.PartidaG = 0;
        this.PartidaP = 0;
        this.PartidasJ = 0;
        this.Penalizado = true;
        this.ficha = ficha;
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

    public boolean isPenalizado() {
        return Penalizado;
    }

    public void setPenalizado(boolean Penalizado) {
        this.Penalizado = Penalizado;
    }

    public Ficha getFicha() {
        return ficha;
    }
    

    /**
     * Se genera un ID de 3 digitos //para inicializar un jugador
     *
     * @return id
     */
    public int generarid() {
        return (int) (Math.random() * (999 - 100) + 100);
    }

    public String Penalizacion(boolean turno) {
        if (turno) {
            return "En turno";
        } else {
            return "Perdio un turno";
        }
    }
  

    @Override
    public int compareTo(Players o) {
        if (o.getId() > id) {
            return -1;
        } else if (o.getId() > id) {
            return 0;
        } else{
            return 1;
        }
    }

}
/*
javax.swing.ImageIcon@68d030aa
javax.swing.ImageIcon@68d030aa
null
null
null
null
javax.swing.ImageIcon@777824bd
javax.swing.ImageIcon@777824bd
javax.swing.ImageIcon@4fcfb57b
javax.swing.ImageIcon@4fcfb57b
javax.swing.ImageIcon@66734b39
javax.swing.ImageIcon@66734b39
javax.swing.ImageIcon@f4f623d
javax.swing.ImageIcon@f4f623d
null
null
javax.swing.ImageIcon@3924e2a5
javax.swing.ImageIcon@3924e2a5
javax.swing.ImageIcon@b72fc97
null
javax.swing.ImageIcon@b72fc97
*/
