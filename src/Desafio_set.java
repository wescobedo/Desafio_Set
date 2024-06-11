

import java.util.*;


public class Desafio_set {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("falabella");
        marcas.add("mazda");
        marcas.add("omo");
        marcas.add("fiat");
        marcas.add("pioneer");
        marcas.add("sansui");
        marcas.add("cardinale");
        marcas.add("levis");
        marcas.add("hucke");
        marcas.add("savory");
        System.out.println(marcas);
        marcas.add("“Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");
        System.out.println(marcas);
        marcas.set (10, "Blockbuster");
        marcas.remove(11);
        System.out.println(marcas);

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("toshiba");
        posiblesMarcas.add("JVC");
        posiblesMarcas.add("Sanyo");

        marcas.addAll(posiblesMarcas);
        System.out.println(marcas);

        System.out.println(marcas.size());

        /*EJERCICIO 2*/


        Set<String> invitados = new TreeSet<>();
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");
        System.out.println(invitados);

        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");
        invitados.addAll(posiblesInvitados);
        System.out.println(invitados);

        invitados.remove("Jorge" );
        System.out.println(invitados);


        /*EJERCICIO 3*/


        Map<String, Integer> golosinas = new TreeMap<>();
        golosinas.put("Chocman", 100);
        golosinas.put("Trululu" , 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga traga", 150);
        golosinas.put("Tableton", 5);
        System.out.println(golosinas);

        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value<100){
            System.out.println(key);
            System.out.println(value);
        }
        }
        Queue juegos = new LinkedList<>();
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachupin");
        juegos.add("Pillarse");
        System.out.println(juegos);
        System.out.println(juegos.size());


    }


}
