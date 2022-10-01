package baseball.model;

import java.util.Map;

/**
 * 숫자 생성기
 * 확장성을 위해 숫자 생성기 interface 생성
 */
public interface NumberGenerator {

    /**
     * 원하는 자리수의 숫자 생성
     * @param numberTotalLength 숫자의 총 자리수(예: 123 -> 3)
     * @param startInclusive 각 자리수에 들어갈 수 있는 가장 작은 숫자
     * @param endInclusive 각 자리수에 들어갈 수 있는 가장 큰 숫자
     * @return 생성된 숫자
     */
    Map<Integer, Integer> generateNumber(final int numberTotalLength, final int startInclusive, final int endInclusive);
}
