package ar.com.educacionit.funciones.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.educacionit.domain.Articulos;

public class Lambdas4Objects {
    public static void main(String[] args) {
        
        Collection<Articulos> collection = new ArrayList<>();
        collection.add(new Articulos("batman", new Date(), "dwmoa", 1.400, 123l, 1l, 2l));
        collection.add(new Articulos("superman", new Date(), "dwmoa", 14.400, 1221l, 2l, 2l));
        collection.add(new Articulos("aguaman", new Date(), "dwmoa", 33.400, 12923l, 3l, 3l));
        collection.add(new Articulos("chico bestia", new Date(), "dwmoa", 89.400, 1993l, 2l, 2l));

        List<Double> list = collection.stream().map(aux -> aux.getPrecio()).filter(aux -> aux <= 14.400).collect(Collectors.toList());
        System.out.println(list);
        
        //la funcion terminal count me permite contar los elmementos
        Long c = collection.stream().filter(x -> x.getPrecio() <= 14.4000).count();
        System.out.println("ahy " + c + " articulos cuyo precio es de 14.400 a menos");
        
        //la funcion intermedia peek, me permite imprmir lo que esta pasando
        //cada vez que aplicamos una funcioj intermedia, que elemenots
        //pasan un filter etc, (como un debug ya que no se puede saber
        //como pasa todo debsajo de las ambdas)
        
        System.out.println("\naplicanod el peek");
        List<Articulos> list2 = collection.stream()
        .peek(System.out::println)
        .filter(x -> x.getPrecio() > 14.400)
        .peek(System.out::println)
        .collect(Collectors.toList());
        
        System.out.println(list2);
        
        
        
    }
}
