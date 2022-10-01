package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 콘솔 입력
 */
public class GameInputView {

    public static String readNumber() {
        return readLine();
    }

    public static String readWantNewGame() {
        String wantNewGame = readLine();
        validateWantNewGame(wantNewGame);
        return wantNewGame;
    }

    private static void validateWantNewGame(String wantNewGame) {
        if(!"1".equals(wantNewGame) && !"2".equals(wantNewGame)) {
            throw new IllegalArgumentException("1 또는 2만 입력 가능합니다.");
        }
    }
}
