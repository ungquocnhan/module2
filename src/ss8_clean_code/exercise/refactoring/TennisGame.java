package ss8_clean_code.exercise.refactoring;

public class TennisGame {
    public static final int SCORE_ZERO = 0;
    public static final int SCORE_ONE = 1;
    public static final int SCORE_TWO = 2;
    public static final int SCORE_THREE = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return result(player1Score);
        } else {
            boolean player1ScoreElderEqual4 = player1Score >= 4;
            boolean player2ScoreElderEqual4 = player2Score >= 4;
            if (player1ScoreElderEqual4 || player2ScoreElderEqual4) {
                return winPlayer(player1Score, player2Score);
            } else {
                return checkScore(player1Score, player2Score);
            }
        }
    }

    public static String result(int player1Score) {
        switch (player1Score) {
            case SCORE_ZERO:
                return "Love-All";
            case SCORE_ONE:
                return "Fifteen-All";
            case SCORE_TWO:
                return "Thirty-All";
            case SCORE_THREE:
                return "Forty-All";
            default:
                return "Deuce";

        }
    }

    public static String winPlayer(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        boolean resultMinusEqual1 = minusResult == 1;
        if (resultMinusEqual1) {
            return "Advantage player1";
        } else {
            boolean resultMinusEqualMinus1 = minusResult == -1;
            if (resultMinusEqualMinus1) {
                return "Advantage player2";
            } else {
                boolean resultMinusElderEqual2 = minusResult >= 2;
                if (resultMinusElderEqual2) {
                    return "Win for player1";
                } else {
                    return "Win for player2";
                }
            }
        }
    }

    public static String checkScore(int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
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
        return score.toString();
    }
}
