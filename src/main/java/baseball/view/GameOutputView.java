package baseball.view;

import baseball.model.GameResult;

/**
 * 콘솔 출력
 */
public class GameOutputView {

    public static void printMission() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printMissionResult(GameResult gameResult) {
        int ballCount = gameResult.getBall();
        int strikeCount = gameResult.getStrike();
        if(ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
            return;
        }
        printBall(ballCount);
        printStrike(strikeCount);
    }

    public static void printCompleteGame(int strikeCount) {
        System.out.printf("%d개의 숫자를 모두 맞히셨습니다! 게임 종료%n", strikeCount);
    }

    public static void printWantNewGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private static void printBall(int ballCount) {
        if(ballCount > 0) {
            System.out.printf("%d볼 ", ballCount);
        }
    }

    private static void printStrike(int strikeCount) {
        if(strikeCount > 0) {
            System.out.printf("%d스트라이크%n", strikeCount);
            return;
        }
        System.out.println();
    }
}
