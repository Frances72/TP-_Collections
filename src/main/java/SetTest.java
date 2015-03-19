/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {
    public static void main(String[] args)
    {
        String [] colours = {"red","white","blue","green","grey","orange","tan","white","cyan","peach","grey","orange"};
        
        List<String> list = Arrays.asList(colours);
        
        System.out.printf("List: %s\n", list);
    
    printNonDuplicates(list);
    }
    private static void printNonDuplicates(Collection<String> values)
    {
        Set<String> set = new HashSet<>(values);
        System.out.print("\nNonDuplicates are: " );
        for(String value: set)
            System.out.printf("%s ", value);
        
        System.out.println();
                
    }
}
