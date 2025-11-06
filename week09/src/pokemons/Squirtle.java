package pokemons;

import fly.NoFly;

public class Squirtle extends Pokemon{
    public Squirtle(int hp, int attackPower, NoFly noFly, Skill[] skills){
        super("꼬부기",hp,attackPower, noFly, skills);
        System.out.println("꼬북꼬북");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAttackPower() + 2 + this.skills[choice].getDamage();
        System.out.println(name + " -> " + target.getName() + "에게 '" + this.skills[choice].getName() + "' 사용!(데미지 : " + damage + ")");
        //target.setHp(target.getHp()-damage);
        target.receieveDamage(damage);
        System.out.println(target.getName() + "의 남은 HP: " + target.getHp());
    }
}
