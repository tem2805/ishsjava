import fly.NoFly;
import fly.Wings;
import pokemons.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);

        Skill[] pickachuskills = {
                new Skill("Nuzzle", 20),
                new Skill("Thunder Shock", 40),
                new Skill("Quick Attack", 40),
        };

        Skill[] squirtleskills = {
                new Skill("Tackle", 40),
                new Skill("Water Gun", 40),
                new Skill("Rapid Spin", 50),
        };

        Skill[] charizardskills = {
                new Skill("Scratch", 40),
                new Skill("Dragon Breath", 60),
                new Skill("Flare Blitz", 120),
        };

        //pokemons.Pokemon playerPokemon = null;
        Pokemon playerPokemon = new Pikachu(100, 27, new NoFly(), pickachuskills);
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.print("플레이어 포켓몬스터 선택\n1) 피카츄  2) 꼬부기  3) 리자몽 : ");
                int number = scanner.nextInt();  // string
                if (number - 1 == 0) {
                    playerPokemon = new Pikachu(100, 27, new NoFly(), pickachuskills);
                    break;
                } else if (number - 1 == 1) {
                    playerPokemon = new Squirtle(120, 21, new NoFly(), squirtleskills);
                    break;
                } else if (number - 1 == 2) {
                    playerPokemon = new Charizard(200, 40, new Wings(), charizardskills);
                    break;
                } else
                    System.out.println("메뉴에서 골라주세요");
            } catch (InputMismatchException err) {
                System.out.println("숫자로 입력하세요. 메뉴에서 고르세요.");
                //System.out.println(err.getMessage());
                scanner.nextLine(); //버퍼에 남아있는 값(문자열) 제거
            }
        }

        int randomNumber = (int)(Math.random() * 3);
        Pokemon enemyPokemon;
        System.out.println("야생의 포켓몬스터가 나타났다!");
        if(randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly(), pickachuskills);
        else if(randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly(), squirtleskills);
        else if(randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings(), charizardskills);


        System.out.println("배틀 시작!");
        System.out.println("=============");

        for(int i = 0; i < playerPokemon.skills.length; i++){
            System.out.println((i+1) + ". " + playerPokemon.skills[i].getName() + " (" + playerPokemon.skills[i].getDamage() + ")");
        }

//        int turn = 1;
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



//        pokemons.Pikachu myPikachu = new pokemons.Pikachu(100, 27);
//        pokemons.Pikachu yourPikachu = new pokemons.Pikachu(100, 28);
//        pokemons.Squirtle enemySquirtle = new pokemons.Squirtle(120, 21);
//        System.out.println("Game start~");
//        myPikachu.attack(enemySquirtle);
//        enemySquirtle.attack(myPikachu);
//        for (int i=0;i<5;i++)
//            enemySquirtle.attack(myPikachu);
//        System.out.println(myPikachu);
//        System.out.println(enemySquirtle);
//    }
}
