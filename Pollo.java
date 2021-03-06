
/**
 * Representa un pollo.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public class Pollo extends Animal implements AnimalVacunable {
    // Peso inicial.
    private static int PESO_INICIAL = 1;
    // Peso incrementado al comer.
    private static int PESO_INCREMENTADO_AL_COMER = 1;
    // Sonido caracteristico.
    private static String SONIDO = "Pollo: Pio, pio";
    // Curacion por vacuna.
    private static int SANACION_POR_VACUNA = 10;
    
    /**
     * Constructor - Crea un pollo.
     */
    public Pollo() {
       super(PESO_INICIAL, SONIDO, PESO_INCREMENTADO_AL_COMER);
    } 
    
    /**
     * Vacuna al animal sanando parte de su salud.
     */
    @Override
    public void vacunar() {
        setSalud(SANACION_POR_VACUNA);
    }
}
