import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);

        Pokemon playerPokemon = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어 포켓몬스터 선택 \n1)피카츄 2)꼬부기 3)리자몽 : ");
        int number = scanner.nextInt();
        if (number-1 == 0)
            playerPokemon = new Pikachu(100, 27, new NoFly());
        else if(number-1 == 1)
            playerPokemon = new Squirtle(120, 21, new NoFly());
        else if(number-1 == 2)
            playerPokemon = new Charizard(200, 40, new Wings());

        int randomNumber = (int)(Math.random() * 3);
        Pokemon enemyPokemon;
        System.out.println("야생의 포켓몬스터가 나타났다!");
        if(randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly());
        else if(randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly());
        else if(randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings());


        //Pokemon playerPokemon = new Pikachu(100, 27, new NoFly());
        //Pokemon playerPokemon = new Charizard(200, 40, new Wings());
        //Pokemon playerPokemon = new Squirtle(120, 21, new NoFly());

//        Jetpack jetpack = new Jetpack();
//
//        Pikachu p1 = new Pikachu(100, 27, new NoFly());
//        //p1.setFlyingTool(new NoFly());
//        p1.performFlyable();
//        p1.setFlyingTool(jetpack);  //제트팩 추진기 획득
//        p1.performFlyable();
//
////        Pikachu p2 = new Pikachu(100, 28);
//        Charizard c1 = new Charizard(200, 40, new Wings());
//        //c1.setFlyingTool(new Wings());
//        c1.performFlyable();
////        Squirtle s1 = new Squirtle(120, 21);
//
//        System.out.println("배틀 시작!");
//        System.out.println(p1);
//        System.out.println(c1);
//        System.out.println("=============");
//
//        int turn = 1;
//
//        while(!p1.isFainted() && !c1.isFainted()){
//            System.out.println("턴 " + turn + "시작.");
//            p1.attack(c1);
//            if(c1.isFainted()){
//                System.out.println(c1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
//                break;
//            }
//            c1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이(가) 기절했습니다! " + c1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("==============");
//            turn++;
//        }
//        System.out.println("배틀 종료");
    }



//        Pikachu myPikachu = new Pikachu(100, 27);
//        Pikachu yourPikachu = new Pikachu(100, 28);
//        Squirtle enemySquirtle = new Squirtle(120, 21);
//        System.out.println("Game start~");
//        myPikachu.attack(enemySquirtle);
//        enemySquirtle.attack(myPikachu);
//        for (int i=0;i<5;i++)
//            enemySquirtle.attack(myPikachu);
//        System.out.println(myPikachu);
//        System.out.println(enemySquirtle);
//    }
}
