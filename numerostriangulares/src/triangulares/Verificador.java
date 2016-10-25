/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulares;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author esalgadog
 */
public class Verificador {
    
     private Map<Character, Integer> map;

    public Verificador() {
        
        map = new HashMap<>();  
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);
        map.put('"',0);
        
    }
    
     public boolean verificar(String palabra ){
        return _verificador(evaluador(palabra));
    }
    
       private boolean _verificador(int T){
        double n;
        int m;
        
        n=Math.sqrt((2*T)+0.25)-0.5;
        
        m=(int) n;
        
         return n-m>0;
    }
        /*regresa el valor numerico de una palabra*/
     private int evaluador(String str){
         Integer val=0;
         for(char c : str.toCharArray())
        {
            
            val = map.get(c);
            if(val == null)            {   
                System.out.print("Contiene caracteres no soportados");
            }
            else
            {
               val=val+val;
            }
        }

        return val;
    }
       
     
     
    
   
}
