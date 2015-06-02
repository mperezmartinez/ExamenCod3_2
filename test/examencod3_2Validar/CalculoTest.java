/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencod3_2Validar;

import examencod3_2.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validar method, of class Calculo.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        int numero = 4;
        Calculo instance = new Calculo();
        String expResult = "Cálculo correcto";
        String result = instance.validar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
