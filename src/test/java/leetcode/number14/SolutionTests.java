package leetcode.number14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTests {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void caseOne() {
        String expectedString = "fl";
        String[] case1 = {"flower", "flow", "flight"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseTwo() {
        String expectedString = "";
        String[] case1 = {"dog","racecar","car"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseThree() {
        String expectedString = "a";
        String[] case1 = {"a"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseFour() {
        String expectedString = "c";
        String[] case1 = {"cir","car"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseFive() {
        String expectedString = "";
        String[] case1 = {"reflower","flow","flight"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseSix() {
        String expectedString = "";
        String[] case1 = {"caa","","a","acb"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseSeven() {
        String expectedString = "a";
        String[] case1 = {"acc","aaa","aaba"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }

    @Test
    void caseEight() {
        String expectedString = "";
        String[] case1 = {"a","aca","accb","b"};
        String res = solution.longestCommonPrefix(case1);

        assertThat(res).isEqualTo(expectedString);
    }
}
