public class Squirtle extends Pokemon{
    public Squirtle(int hp, int attackPower, NoFly noFly){
        super("꼬부기",hp,attackPower, noFly);
        System.out.println("꼬북꼬북");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 2;
        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용!(데미지 : " + damage + ")");
        //target.setHp(target.getHp()-damage);
        target.receieveDamage(damage);
        System.out.println(target.getName() + "의 남은 HP: " + target.getHp());
    }
}
