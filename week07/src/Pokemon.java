public abstract class Pokemon {
//    private String name;
    protected String name;
    private int hp;
    private int attackPower;

    public Pokemon(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setHp(int hp) {
        this.hp =hp;
    }

    public abstract void attack(Pokemon target);
    public void receieveDamage(int damage){
        hp = hp - damage;
        if(hp < 0) hp = 0;
    }

    public boolean isFainted(){
        return hp <= 0;
    }

    @Override
    public String toString() {
        return name + " (HP : " + hp + ", AttackPower : " + attackPower + ")";
    }
}
