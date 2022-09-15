package ss8_clean_code.exercise.refactoring;

public class TennisGame {

    public static final int SCORE_ZERO = 0;
    public static final int SCORE_ONE = 1;
    public static final int SCORE_TWO = 2;
    public static final int SCORE_THREE = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case SCORE_ZERO:
                    score = new StringBuilder("Love-All");
                    break;
                case SCORE_ONE:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case SCORE_TWO:
                    score = new StringBuilder("Thirty-All");
                    break;
                case SCORE_THREE:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else {

            boolean player1ScoreElderEqual4 = player1Score >= 4;
            boolean player2ScoreElderEqual4 = player2Score >= 4;

            if (player1ScoreElderEqual4 || player2ScoreElderEqual4) {
                int minusResult = player1Score - player2Score;

                boolean resultMinusEqual1 = minusResult == 1;
                if (resultMinusEqual1) {
                    score = new StringBuilder("Advantage player1");
                } else {

                    boolean resultMinusEqualMinus1 = minusResult == -1;
                    if (resultMinusEqualMinus1) {
                        score = new StringBuilder("Advantage player2");
                    } else {

                        boolean resultMinusElderEqual2 = minusResult >= 2;
                        if (resultMinusElderEqual2) {
                            score = new StringBuilder("Win for player1");
                        } else {

                            score = new StringBuilder("Win for player2");
                        }
                    }
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) {
                        tempScore = player1Score;
                    } else {
                        score.append("-");
                        tempScore = player2Score;
                    }
                    switch (tempScore) {
                        case SCORE_ZERO:
                            score.append("Love");
                            break;
                        case SCORE_ONE:
                            score.append("Fifteen");
                            break;
                        case SCORE_TWO:
                            score.append("Thirty");
                            break;
                        case SCORE_THREE:
                            score.append("Forty");
                            break;
                    }
                }
            }
        }
        return score.toString();
    }
}
