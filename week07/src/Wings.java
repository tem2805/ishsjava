public class Wings implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +"이(가) 날개를 펼쳐 날아갑니다~~");
    }
}
