package Tablero.Ficha;

public class Ficha {

    private int posicion;
    private String ficha;

    public Ficha(String ficha) {
        this.posicion = 0;
        this.ficha = ficha;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    public String getFicha() {
        return ficha;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void aumentarPosicion(int p) {
        int posicionActual = getPosicion();
        int proximaPosicion = posicionActual + p;
        setPosicion(proximaPosicion);

    }

    public void restarPosicion(int p) {
        setPosicion(posicion - p);
        if (getPosicion() < 1) {
            setPosicion(1);
        }
    }
    

}
