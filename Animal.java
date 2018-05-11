
/**
 * Representa un animal generico.
 * 
 * Por su parte, todos los animales deben contar con los siguientes métodos:
 *  comer: no recibe parámetros ni devuelve nada. Cuando se invoca incrementa 
 *  en 1.
 *  kilogramo el peso si se trata de un pollo o un pato o en 2 kilogramos si 
 *  se trata de un cerdo o una vaca. En cualquier caso, reduce los puntos de 
 *  vida del animal en 10 puntos.
 *  emitirSonidoCaracteristico: no recibe parámetros ni devuelve nada. Cuando 
 *  se invoca se muestra por pantalla el sonido característico del animal.
 *  getPeso: no recibe parámetros y devuelve el peso del animal en kilogramos.
 *  getPuntosDeVida: no recibe parámetros y devuelve los puntos de vida 
 *  actuales del animal.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public abstract class Animal implements Criatura
{
    // Puntos de vida iniciales.
    public static final int PUNTOS_DE_VIDA_INICIALES = 100;
    // Sonido caracteristico.
    private static String SONIDO = "Co-Coco-Cococo";
    
    // Peso actual del animal.
    private int peso;
    // Salud actual del animal.
    private int salud;
    // Sonido del animal.
    private String sonido;

    /**
     * Constructor - Crea un animal a partir de su peso en kg y su sonido 
     * caracteristico.
     * @param pesoInicial Peso inicial del animal en kg.
     */
    public Animal(int pesoInicial, String sonido) {
        peso = pesoInicial;
        salud = PUNTOS_DE_VIDA_INICIALES;
        this.sonido = sonido;
    }
    
    /**
     * Modifica el peso del animal.
     * @param variacion Valor que se incrementa (entero positivo) o sustrae 
     *        (entero negativo) del peso.
     */
    public void setPeso(int variacion) {
        peso += variacion;
    }
    
    /**
     * Modifica la salud del animal.
     * * @param variacion Valor que se incrementa (entero positivo) o sustrae 
     *        (entero negativo) del peso.
     */
    public void setSalud(int variacion) {
        salud += variacion;
    }
    
    /**
     * Incrementa el peso de un animal y reduce sus puntos de vida.
     */
    public void comer() {
        salud += VIDA_PERDIDA_AL_COMER;
    }
    
    /**
     * Muestra por pantalla el sonido caracteristico del animal.
     */
    public void emitirSonidoCaracteristico() {
        System.out.println(sonido);
    }
    
    /**
     * Devuelve el peso del animal en kilogramos.
     */
    public int getPeso() {
        return peso;
    }
    
    /**
     * Devuelve los puntos de vida del animal.
     */
    public int getPuntosDeVida() {
        return salud;
    }
}
