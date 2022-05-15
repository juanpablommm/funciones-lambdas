package ar.com.educacionit.funciones.lambdas;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas3 {
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
         *3. aplicar la funcion terminal
         *
         *la funcion intermedia map, hace que dado el dato que
         *entre aplica una funcion interna de convercion y nos devulve
         *otro tipo de dato*/
        List<String> list = collection.stream().map(aux -> "valor: " + aux.toString()).collect(Collectors.toList());
        System.out.println(list);
        
    }
}
