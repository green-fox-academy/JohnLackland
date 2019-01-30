package pokemon;

import java.util.List;

public class Pokemon {
    String name;
    String type;
    String effectiveAgainst;

    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    public boolean isEffectiveAgainst(Pokemon anotherPokemon) {
        return this.effectiveAgainst.equals(anotherPokemon.type);
    }
    public void Chose(List<Pokemon> pokemonOfAsh, Pokemon wildPokemon){

        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)){
                System.out.println("I choose you, " + pokemonOfAsh.get(i).name);
            }
        }
    }
}