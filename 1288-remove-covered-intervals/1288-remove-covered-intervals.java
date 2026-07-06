import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        // Sort by start point.
        // If start points are the same, place the larger interval first.
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return b[1] - a[1];
        });

        int count = 0;
        int farthestEnd = 0;

        for (int i = 0; i < intervals.length; i++) {

            // If this interval ends after every interval we've seen,
            // then it is NOT covered.
            if (intervals[i][1] > farthestEnd) {
                count++;
                farthestEnd = intervals[i][1];
            }

            // Otherwise, this interval is covered, so ignore it.
        }

        return count;
    }
}