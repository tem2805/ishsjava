// 2025년도 2학기 정보과학과제연구 기말 수행평가 (무단 전재 및 재배포 금지)
// 학번 : 1209
// 성명 : 김현겸

import fly.Flyable;
import fly.NoFly;
import fly.Wings;
import java.util.ArrayList;
import java.util.InputMismatchException;
import pokemons.*;
import java.util.Scanner;

public class GameDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static int battleCount = 0;
    private static int victoryCount = 0;

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     포켓몬 배틀 게임에 오신 것을     ");
        System.out.println("        환영합니다! (위치: 풀숲)      ");
        System.out.println("========================================\n");
        // 여기서 부터 코딩 시작
        selectPlayerPokemon();

    }

    private static Pokemon selectPlayerPokemon() {
        Pokemon playerPokemon = null;

        // 여기서 부터 코딩 시작
        while(true){
            try{
                System.out.println("당신의 포켓몬을 선택하세요:\n1. 피카츄 \n2. 꼬부기 \n3. 리자몽");
                int number = scanner.nextInt()-1;
                ArrayList<Skill> squirtleSkills = new ArrayList<>();
                squirtleSkills.add(new Skill("물대포", 58));
                squirtleSkills.add(new Skill("하이드로펌프", 93));
                squirtleSkills.add(new Skill("아쿠아테일", 71));

                ArrayList<Skill> charizardSkills = new ArrayList<>();
                charizardSkills.add(new Skill("전기충격", 50));
                charizardSkills.add(new Skill("십만볼트", 95));
                charizardSkills.add(new Skill("전광석화", 72));

                ArrayList<Skill> pikachuSkills = new ArrayList<>();
                pikachuSkills.add(new Skill("화염방사", 52));
                pikachuSkills.add(new Skill("불꽃세례", 97));
                pikachuSkills.add(new Skill("용의분노", 74));

                if (number == 0) {
                    playerPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
                    break;
                } else if (number == 1) {
                    playerPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
                    break;
                } else if (number == 2) {
                    playerPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
                    break;
                } else
                    System.out.println("메뉴에서 골라주세요 (1-3)");
            } catch (InputMismatchException err) {
                System.out.println("숫자로 입력하세요.");
                }
            }



        // 여기 까지 코드 작성
        return playerPokemon;
    }

    private static Pokemon createRandomEnemyPokemon() {
        int randomNumber = (int)(Math.random() * 3);
        Pokemon enemyPokemon = null;
        // 여기서 부터 코딩 시작
        System.out.println("야생의 포켓몬스터가 나타났다!");

        ArrayList<Skill> squirtleSkills = new ArrayList<>();
        squirtleSkills.add(new Skill("물대포", 58));
        squirtleSkills.add(new Skill("하이드로펌프", 93));
        squirtleSkills.add(new Skill("아쿠아테일", 71));

        ArrayList<Skill> charizardSkills = new ArrayList<>();
        charizardSkills.add(new Skill("전기충격", 50));
        charizardSkills.add(new Skill("십만볼트", 95));
        charizardSkills.add(new Skill("전광석화", 72));

        ArrayList<Skill> pikachuSkills = new ArrayList<>();
        pikachuSkills.add(new Skill("화염방사", 52));
        pikachuSkills.add(new Skill("불꽃세례", 97));
        pikachuSkills.add(new Skill("용의분노", 74));
        if (randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
        else if (randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly(), squirtleSkills);
        else if (randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings(), charizardSkills);


        // 여기 까지 코드 작성
        return enemyPokemon;
    }

    private static void displayEscapeEffect(Pokemon pokemon) {
        System.out.println("\n====================");
        System.out.println("도망 이펙트 발동!");
        System.out.println("====================");
        // 여기서 부터 코딩 시작
        pokemon.performFlyable();
        animateEscape();



        // 여기 까지 코드 작성
    }

    private static void animateEscape() {
        // 여기서 부터 코딩 시작
        for(int i=1; i<=3;i++){
            System.out.print("도망치는 중");
            try{
                for(int i=1; i<=3; i++){
                    System.out.print(".");
                    System.out.println();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (InterruptedException) {
                throw new e.printStackTrace();
            }
        }
        System.out.println();



        // 여기 까지 코드 작성
    }

    private static BattleResult startBattle(Pokemon playerPokemon, Pokemon enemyPokemon) {
        System.out.println("배틀 시작!\n");

        while (true) {
            // 여기서 부터 코딩 시작
            System.out.println(playerPokemon.getName()+" HP:"+playerPokemon.getHp()+" | "+enemyPokemon.getName()+" HP:"+enemyPokemon.getHp());
            System.out.println("행동을 선택하세요:\n1. 공격\n2. 도망");
            try{

            }catch(InputMismatchException){
                System.out.println("잘못된 선택입니다.");
            }


            // 여기 까지 코드 작성
        }
    }

    private enum BattleResult {
        VICTORY,
        DEFEAT,
        ESCAPE
    }
}
