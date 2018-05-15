
/**
 * Representa un pato.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public class Pato extends Animal {
    // Peso inicial.
    private static int PESO_INICIAL = 2;
    // Peso incrementado al comer.
    private static int PESO_INCREMENTADO_AL_COMER = 1;
    // Sonido caracteristico.
    private static String SONIDO = "Pato: Cuac, cuac";
    
    /**
     * Constructor - Crea un pollo.
     */
    public Pato() {
       super(PESO_INICIAL, SONIDO, PESO_INCREMENTADO_AL_COMER);
    }
    
}
