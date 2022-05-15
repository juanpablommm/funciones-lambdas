package ar.com.educacionit.funciones.lambdas;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas {
    public static void main(String[] args) {
        
        Collection<Integer> collection = new ArrayList<>();
        collection.add(50);
        collection.add(10);
        collection.add(30);
        collection.add(80);
        collection.add(90);
        
        System.out.println("collection");
        collection.forEach(System.out::print);
        
        //funciones lambdas para aplicarlas a las collections debemos
        
        //1. obtener el stream con que se trabajara
        Stream<Integer> stream = collection.stream();
        
        /*2. aplicamos las funcion intermedia que necesitamos 
         * basicamente donde va la logica que queremos aplicar a la
         * collection, sobre el stream que tenemos, lo cual nps
         * devuleve un nuevo stream*/
        Stream<Integer> filtros = stream.filter(aux -> aux >= 30);
        
        /*3. ahora aplicamos la funcion terminal, en este caso
         * collect la cual recive como parametro la clase Collectors
         * donde aplicaremos los metodos que necesitamos, como toList
         * para que se nos genere una lista*/
        List<Integer> listaFinal = filtros.collect(Collectors.toList());
        
        System.out.println("\ncollection despues de funciones lambdas");
        listaFinal.forEach(System.out::print);
        
//        collection.forEach(System.out::print);
//        //filtar mayores a 30
//        Iterator<Integer> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next() <= 30) {
//                iterator.remove();
//            }
//        }
//        System.out.println("depues-------");
//        collection.forEach(System.out::print);
    }
}
