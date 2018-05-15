
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test del proyecto 0901.
 *
 * @author  d4s1ns
 * @version 2018/05/11
 */
public class Test0901
{
    private Granja granja;
    private Pato pato;
    private Vaca vaca;
    private Cerdo cerdo;
    private Pollo pollo;

    /**
     * Default constructor for test class Test0901
     */
    public Test0901()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        granja = new Granja();
        pato = new Pato();
        vaca = new Vaca();
        cerdo = new Cerdo();
        pollo = new Pollo();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void valoresIniciales()
    {
        String output = null;
        // Pato.
        assertEquals(2, pato.getPeso());
        assertEquals(100, pato.getPuntosDeVida());
        output = "PATO:\nPeso: " + pato.getPeso() + " Salud: " + 
                 pato.getPuntosDeVida();
        System.out.println(output);
        // Pollo.
        assertEquals(1, pollo.getPeso());
        assertEquals(100, pollo.getPuntosDeVida());
        output = "POLLO:\nPeso: " + pollo.getPeso() + " Salud: " + 
                  pollo.getPuntosDeVida();
        System.out.println(output);
        // Vaca.
        assertEquals(25, vaca.getPeso());
        assertEquals(100, vaca.getPuntosDeVida());
        output = "VACA:\nPeso: " + vaca.getPeso() + " Salud: " + 
                  vaca.getPuntosDeVida();
        System.out.println(output);
        // Cerdo.
        assertEquals(15, cerdo.getPeso());
        assertEquals(100, cerdo.getPuntosDeVida());
        output = "CERDO:\nPeso: " + cerdo.getPeso() + " Salud: " + 
                  cerdo.getPuntosDeVida();
        System.out.println(output);
    }

    @Test
    public void emitirSonidos()
    {
        granja.hacerEmitirSonidoCaracteristico(pato);
        granja.hacerEmitirSonidoCaracteristico(cerdo);
        granja.hacerEmitirSonidoCaracteristico(vaca);
        granja.hacerEmitirSonidoCaracteristico(pollo);
    }
}


