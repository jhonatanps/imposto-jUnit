/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imposto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cirim
 */
public class PessoaIT {
    
    public PessoaIT() {
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
     * Test of calculoImposto method, of class Pessoa.
     */
    @Test
    public void testCalculoImposto() {
        System.out.println("calculoImposto");
        Pessoa instance = new Pessoa();
        instance.setNome("jhonatan");
        instance.setNumeroDepenDentes(1.0);
        instance.setRendaBrutaAnual(9000.00);
        double expResult = 0.0;
        double result = instance.calculoImposto();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calculaDependente method, of class Pessoa.
     */
    @Test
    public void testCalculaDependente() {
        System.out.println("calculaDependente");
        Pessoa instance = new Pessoa();
        instance.setNome("jhonatan");
        instance.setNumeroDepenDentes(1.0);
        instance.setRendaBrutaAnual(9000.00);
        double expResult = 600.0;
        double result = instance.calculaDependente();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calculaRendaLiquida method, of class Pessoa.
     */
    @Test
    public void testCalculaRendaLiquida() {
        System.out.println("calculaRendaLiquida");
        Pessoa instance = new Pessoa();
        instance.setNome("jhonatan");
        instance.setNumeroDepenDentes(1.0);
        instance.setRendaBrutaAnual(9000.00);
        double expResult = 9000.00;
        double result = instance.calculaRendaLiquida();
        assertEquals(expResult, result, 0.0);
       
    }

   
}
