package Tablero.Ficha;


public class Ficha {
    private int posicion;

    public Ficha() {
        this.posicion = 0;
    }



    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
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
        if (proximaPosicion > 40) {
            setPosicion(proximaPosicion - 40);
        } else {
            setPosicion(proximaPosicion);
        }
    }

    public void restarPosicion(int p) {
        setPosicion(posicion - p);
        if (getPosicion() < 1) {
            setPosicion(1);
        }
    }

}

