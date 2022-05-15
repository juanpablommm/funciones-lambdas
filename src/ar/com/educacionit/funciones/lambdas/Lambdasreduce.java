package ar.com.educacionit.funciones.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.educacionit.domain.Articulos;

public class Lambdasreduce {
    public static void main(String[] args) {
        
        Collection<Articulos> collection = new ArrayList<>();
        collection.add(new Articulos("batman", new Date(), "dwmoa", 1.400, 123l, 1l, 2l));
        collection.add(new Articulos("superman", new Date(), "dwmoa", 14.400, 1221l, 2l, 2l));
        collection.add(new Articulos("aguaman", new Date(), "dwmoa", 33.400, 12923l, 3l, 3l));
        collection.add(new Articulos("chico bestia", new Date(), "dwmoa", 89.400, 1993l, 2l, 2l));

        /*la funcion terminal reduce nos sirve para aplicar
         *operaciones matematicas, esta recibe tres arguemntos,
         *valor incial, los parametros y la funcion matematica
         *que quiero aplicar*/
        Double valorTotal = collection.stream()
        .map(x -> x.getPrecio())
        .reduce(0d, (x, y) -> x+y);//valor incial, (paramtros), funcion matematica
        /*x equivale al valor incial y y al de la primera iteracion */
        System.out.println("El valor total de los articulos es " + valorTotal);
        
    }
}
