// 2025년도 2학기 정보과학과제연구 기말 수행평가 (무단 전재 및 재배포 금지)
// 학번 : 1209
// 성명 : 김현겸

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


        // 여기 까지 코드 작성
        return playerPokemon;
    }

    private static Pokemon createRandomEnemyPokemon() {
        int randomNumber = (int)(Math.random() * 3);
        Pokemon enemyPokemon = null;
        // 여기서 부터 코딩 시작


        // 여기 까지 코드 작성
        return enemyPokemon;
    }

    private static void displayEscapeEffect(Pokemon pokemon) {
        System.out.println("\n====================");
        System.out.println("도망 이펙트 발동!");
        System.out.println("====================");
        // 여기서 부터 코딩 시작


        // 여기 까지 코드 작성
    }

    private static void animateEscape() {
        // 여기서 부터 코딩 시작


        // 여기 까지 코드 작성
    }

    private static BattleResult startBattle(Pokemon playerPokemon, Pokemon enemyPokemon) {
        System.out.println("배틀 시작!\n");

        while (true) {
            // 여기서 부터 코딩 시작


            // 여기 까지 코드 작성
        }
    }

    private enum BattleResult {
        VICTORY,
        DEFEAT,
        ESCAPE
    }
}
