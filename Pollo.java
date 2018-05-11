
/**
 * Representa un pollo.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public class Pollo extends Animal //implements Criatura
{
    // Peso inicial.
    private static int PESO_INICIAL = 1;
    // Peso incrementado al comer.
    private static int PESO_INCREMENTADO_Al_COMER = 1;
    // Sonido caracteristico.
    private static String SONIDO = "Co-Coco-Cococo";
    
    public Pollo() {
       super(PESO_INICIAL, SONIDO);
    }
    
    /**
     * Incrementa el peso de un animal y reduce sus puntos de vida.
     */
    @Override
    public void comer() {
        super.comer();
        setPeso(PESO_INCREMENTADO_Al_COMER);
    } 
    
}
