
/**
 * Representa un cerdo.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public class Cerdo extends Animal implements AnimalVacunable {
    // Peso inicial.
    private static int PESO_INICIAL = 15;
    // Peso incrementado al comer.
    private static int PESO_INCREMENTADO_Al_COMER = 2;
    // Sonido caracteristico.
    private static String SONIDO = "Cerdo: Oink, oink";
    // Curacion por vacuna.
    private static int SANACION_POR_VACUNA = 20;
    
    /**
     * Constructor - Crea un pollo.
     */
    public Cerdo() {
       super(PESO_INICIAL, SONIDO, PESO_INCREMENTADO_Al_COMER);
    }
    
    /**
     * Vacuna al animal sanando parte de su salud.
     */
    @Override
    public void vacunar() {
        setSalud(SANACION_POR_VACUNA);
    }
    
}
