package parking_lot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testSolutionWithinOneMinute() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:00";
        String timeLeft = "10:00";
        Solution s = new Solution();

        int expectedCost = 2;
        int actualCost = s.solution(timeEntered, timeLeft);

        Assertions.assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testSolutionLastMinute() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:59";
        String timeLeft = "11:00";
        Solution s = new Solution();

        int expectedCost = 5;
        int actualCost = s.solution(timeEntered, timeLeft);

        Assertions.assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testSolutionFirstMinute() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:00";
        String timeLeft = "10:01";
        Solution s = new Solution();

        int expectedCost = 5;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testSolutionOneMinute() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:42";
        String timeLeft = "10:43";
        Solution s = new Solution();

        int expectedCost = 5;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testSolution4Hours() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:00";
        String timeLeft = "13:21";
        Solution s = new Solution();

        int expectedCost = 17;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testSolution3Hours() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:00";
        String timeLeft = "13:00";
        Solution s = new Solution();

        int expectedCost = 13;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testSolution2Hours() {

        //Given
        //Format is HH:MM
        String timeEntered = "09:42";
        String timeLeft = "11:42";
        Solution s = new Solution();

        int expectedCost = 9;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }


    @Test
    public void testSolution24Hours() {

        //Given
        //Format is HH:MM
        String timeEntered = "00:00";
        String timeLeft = "23:59";
        Solution s = new Solution();

        int expectedCost = 97;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testSolutionFromZeroMinuteToFiveMinute() {

        //Given
        //Format is HH:MM
        String timeEntered = "10:00";
        String timeLeft = "10:05";
        Solution s = new Solution();

        int expectedCost = 5;
        int actualCost = s.solution(timeEntered, timeLeft);


        Assertions.assertEquals(expectedCost, actualCost);
    }

}