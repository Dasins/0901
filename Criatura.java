
/**
 * Representa una criatura generico.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public interface Criatura
{
    // Vida perdida al comer.
    public static final int VIDA_PERDIDA_AL_COMER = -10;
    
    /**
     * Incrementa el peso de un animal y reduce sus puntos de vida.
     */
    public void comer();
    
    /**
     * Muestra por pantalla el sonido caracteristico del animal.
     */
    public void emitirSonidoCaracteristico();
    
    /**
     * Devuelve el peso del animal en kilogramos.
     */
    public int getPeso();
    
    /**
     * Devuelve los puntos de vida del animal.
     */
    public int getPuntosDeVida();
}
