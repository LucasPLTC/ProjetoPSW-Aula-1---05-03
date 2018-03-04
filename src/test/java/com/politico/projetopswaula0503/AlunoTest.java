/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.politico.projetopswaula0503;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Carvalho
 */
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of situacao method, of class Aluno.
     */
    @Test
    public void testSituacao() {
        System.out.println("situacao1");
        double freq = 0.0;
        double P1 = 0.0;
        double Trabalho = 0.0;
        double ProjAula = 0.0;
        double PF = 0.0;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(freq, P1, Trabalho, ProjAula, PF);
        assertEquals(expResult, result);
        
       
    }
    @Test
    public void testSituacao2() {
        System.out.println("situacao2");
        double freq = 10.0;
        double P1 = 10.0;
        double Trabalho = 10.0;
        double ProjAula = 10.0;
        double PF = 10.0;
        Aluno instance = new Aluno();
        boolean expResult = true;
        boolean result = instance.situacao(freq, P1, Trabalho, ProjAula, PF);
        assertEquals(expResult, result);
        
       
    }
    @Test
    public void testSituacao3() {
        System.out.println("situacao3");
        double freq = 10.0;
        double P1 = 2.0;
        double Trabalho = 2.0;
        double ProjAula = 2.0;
        double PF = 2.0;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(freq, P1, Trabalho, ProjAula, PF);
        assertEquals(expResult, result);
        
       
    }
    @Test
    public void testSituacao4() {
        System.out.println("situacao4");
        double freq = 10.0;
        double P1 = 6.0;
        double Trabalho = 6.0;
        double ProjAula = 6.0;
        double PF = 6.0;
        Aluno instance = new Aluno();
        boolean expResult = true;
        boolean result = instance.situacao(freq, P1, Trabalho, ProjAula, PF);
        assertEquals(expResult, result);
        
       
    }
    
    @Test
    public void testSituacao5() {
        System.out.println("situacao5");
        double freq = 10.0;
        double P1 = 5.0;
        double Trabalho = 5.0;
        double ProjAula = 5.0;
        double PF = 3.0;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(freq, P1, Trabalho, ProjAula, PF);
        assertEquals(expResult, result);
        
       
    }
    
    
}
