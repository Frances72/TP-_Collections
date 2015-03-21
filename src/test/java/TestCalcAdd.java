/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestCalcAdd {
    
    public TestCalcAdd() {
    }
    
    @Test
    public void add(){
        Calculator calc = new Calculator();
        int result = calc.add(10,20);
        Assert.assertEquals("Add 2 + 3", 30, result);
        
    }
}
