
/**
 * Representa un animal generico.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 * 
 * Todos los animales pueden comer, aumentando su peso pero disminuyendo su
 * salud y emitir su sonido caracteristico.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public abstract class Animal {
    // Vida perdida al comer.
    private static final int VIDA_PERDIDA_AL_COMER = -10;
    // Puntos de vida iniciales.
    private static final int PUNTOS_DE_VIDA_INICIALES = 100;
    
    // Peso actual del animal.
    private int peso;
    // Salud actual del animal.
    private int salud;
    // Sonido del animal.
    private String sonido;
    // Peso incrementado al comer;
    private int kgGanadosPorComida;

    /**
     * Constructor - Crea un animal a partir de su peso en kg y su sonido 
     * caracteristico.
     * @param pesoInicial Peso inicial del animal en kg.
     * @param sonido Sonido caracteristico del animal.
     * @param kgGanadosPorComida Kg que gana el animal tras cada comida.
     */
    public Animal(int pesoInicial, String sonido, int kgGanadosPorComida) {
        peso = pesoInicial;
        salud = PUNTOS_DE_VIDA_INICIALES;
        this.sonido = sonido;
        this.kgGanadosPorComida = kgGanadosPorComida;
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
        peso += kgGanadosPorComida;
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
