/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencod3_2Bateria;

import examencod3_2.Calculo;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculoTest {
   private int inputNumber;
   private int inputNumber2;
   private int expectedRes;
   private Calculo CalculoTest;

   @Before
   public void initialize() {
      CalculoTest = new Calculo();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public CalculoTest(int inputNumber,int inputnumber2 ,int expectedRes) {
      this.inputNumber = inputNumber;
      this.inputNumber2=inputnumber2;
      this.expectedRes=expectedRes;
   }

   @Parameterized.Parameters
   public static Collection Calcula2Test() {
      return Arrays.asList(new Object[][] {
         {2,6,2},
         { 4,8,4},
         { 6,18,6},
         { 3,9,3},
      });
   }

    /**
     * Test of realizaOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizaOperacion() {
     System.out.println("Parameterized Number is : " + expectedRes);
      assertEquals(expectedRes, CalculoTest.obtenerMCD(inputNumber, inputNumber2),0);
    }
    
}
