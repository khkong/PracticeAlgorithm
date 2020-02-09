public class Solution6003 {

    public int maxStudents(char[][] seats) {

        for (int i = 0; i < seats.length; i++) {

        }
        return getMaximum(seats, 0, 0);
    }

    private int getMaximum(char[][] seats, int startI, int startJ) {
        if (startI < seats.length && startJ < seats.length) {
            int answer = 0;
            if (seats[startI][startJ] == '.') {
                answer = 1;
            }

            int a = getMaximum(seats, startI, startJ + 2);
            int b = getMaximum(seats, startI + 2, startJ);
            int c = getMaximum(seats, startI + 2, startJ + 2);

            int add = Math.max(a, Math.max(b, c));
            return answer + add;
        }
        return 0;
    }
}
