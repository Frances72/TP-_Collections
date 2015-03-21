/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestMAPCode {
    
    public TestMAPCode() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }public void mapExample() {
      // Create a tree set
      Set ts = new TreeSet();
      // Add elements to the tree set
      ts.add("C");
      ts.add(23, "pop", "aces");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      System.out.println(ts);
   }
    
    
}
