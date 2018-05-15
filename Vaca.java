
/**
 * Representa un vaca.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 *
 * @author d4s1ns
 * @version 2018/05/11
 */
public class Vaca extends Animal implements AnimalVacunable {
    // Peso inicial.
    private static int PESO_INICIAL = 25;
    // Peso incrementado al comer.
    private static int PESO_INCREMENTADO_Al_COMER = 2;
    // Sonido caracteristico.
    private static String SONIDO = "Vaca: Muuu, muuu";
    // Curacion por vacuna.
    private static int SANACION_POR_VACUNA = 30;
    
    /**
     * Constructor - Crea un pollo.
     */
    public Vaca() {
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
