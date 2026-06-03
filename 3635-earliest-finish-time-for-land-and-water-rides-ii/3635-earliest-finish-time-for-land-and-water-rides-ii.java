class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        return Math.min(
            solve(landStartTime, landDuration, waterStartTime, waterDuration),
            solve(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int solve(int[] first, int[] firstDuration,
                      int[] second, int[] secondDuration) {

        int finish1 = Integer.MAX_VALUE;

        for (int i = 0; i < first.length; i++) {
            finish1 = Math.min(finish1, first[i] + firstDuration[i]);
        }

        int finish2 = Integer.MAX_VALUE;

        for (int i = 0; i < second.length; i++) {
            finish2 = Math.min(
                finish2,
                Math.max(finish1, second[i]) + secondDuration[i]
            );
        }

        return finish2;
    }
}