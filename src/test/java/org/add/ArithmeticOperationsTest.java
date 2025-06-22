package org.add;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest
{

    @Test
    public void addTest()
    {
        ArithmeticOperations c =new ArithmeticOperations();
        int actualresult = c.adds(10,30);
        System.out.println(actualresult);
        assertEquals(40,actualresult);
    }

    @Test
    public void subTest()
    {
        ArithmeticOperations ca =new ArithmeticOperations();
        double subresult = ca.sub(80.0,70.0);
        System.out.println( subresult);
        assertEquals(10.0,subresult);
    }

    @Test
    public void mulTest()
    {
        ArithmeticOperations cm = new ArithmeticOperations();
        int mulresult = cm.mul(8,6);
        System.out.println(mulresult);
        assertEquals(48,mulresult);

    }

    @Test
    public void divTest()
    {
        ArithmeticOperations cd = new ArithmeticOperations();
        double  divresult = cd.div(25.0,5.0);
        System.out.println(divresult);
        assertEquals(5.0,divresult);
    }

    @Test
    public void moduleTest()
    {
        ArithmeticOperations mod = new ArithmeticOperations();
        double modresult = mod.modulename(8.0,2.0);
        System.out.println(modresult);
        assertEquals(4.0,modresult);
    }


}