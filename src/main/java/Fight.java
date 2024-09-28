public class Fight {
    public static void main(String[] args) {

        Power po1 = new Power("Bola de Fuego", 50);
        Power po2 = new Power("Pellizco", 10);
        Power po3 = new Power("Ataque electrico", 53);
        Power po4 = new Power("Mordisco", 12);
        Pokemon p1 = new Pokemon("charmander", Type.fire, new Power[]{po1, po2});
        Pokemon p2 = new Pokemon("Pikachu", Type.electric, new Power[]{po3, po4});


        fight2pokemons(p1, p2);
        fight2pokemons(p2, p1);
        fight2pokemons(p1, p2);
        fight2pokemons(p2, p1);
        fight2pokemons(p1, p2);
        fight2pokemons(p2, p1);
        fight2pokemons(p1, p2);
        fight2pokemons(p2, p1);
        fight2pokemons(p1, p2);
        fight2pokemons(p2, p1);


    }

    public static void fight2pokemons(Pokemon pokemon1, Pokemon pokemon2) {
        double damage = pokemon2.attack();
        pokemon1.setLife(pokemon1.getLife() - damage);
        //System.out.println(pokemon1.getLife());
        System.out.println("Defiende: " + pokemon1);
        System.out.println("Ataca: " + pokemon2);

    }

}
