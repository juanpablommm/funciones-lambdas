package ar.com.educacionit.funciones.lambdas;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas2 {
    public static void main(String[] args) {
        
        Collection<Integer> collection = new ArrayList<>();
        collection.add(50);
        collection.add(10);
        collection.add(30);
        collection.add(80);
        collection.add(90);
     
        /*Lambdas 
         *1. obtner el stream 
         *2. aplicar la funcion intermedia
         *3. aplicar la funcion terminal*/
        List<Integer> list = collection.stream().filter(aux -> aux <= 30).collect(Collectors.toList());
        System.out.println(list);
        
    }
}
