package baseball.model;

import java.util.Map;

/**
 * 상대방(컴퓨터)
 */
public class Computer {

    private final Map<Integer, Integer> differentRandomNumber;

    public Computer(NumberGenerator numberGenerator, NumberControl numberControl) {
        differentRandomNumber = numberGenerator.generateNumber(numberControl.getNumberTotalLength(),
                numberControl.getStartInclusive(), numberControl.getEndInclusive());
    }

    public Map<Integer, Integer> getDifferentRandomNumber() {
        return differentRandomNumber;
    }
}
