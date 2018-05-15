
/**
 * Representa a una granja.
 * 
 * Pertenece al proyecto '0911 - La granja de animales'.
 * 
 * En la granja podemos realizar 3 acciones sobre un animal: podemos alimentarle, 
 * podemos vacunarle y podemos hacerle emitir su sonido caracteristico.
 *
 * @author d4sins
 * @version 2018/05/11
 */
public class Granja {
   
    
    public void alimentar(Animal animal) {
        animal.comer();
    }
    
    public void vacunar(AnimalVacunable animal) {
        animal.vacunar();
    }
    
    public void hacerEmitirSonidoCaracteristico(Animal animal) {
        animal.emitirSonidoCaracteristico();
    }
}
