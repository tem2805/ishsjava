package pokemons;

public class Skill {
    private String name;
    private int damage;

    public Skill(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
