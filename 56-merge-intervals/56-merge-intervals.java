/* LeetCode optimesed solution (Time Complexity: O(n log n), Space Compleity: O(n)) */
class Solution {
    public int[][] merge(int[][] intervals) {
        
        // Sorting the array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Initialising
        LinkedList<int[]> merged = new LinkedList<>();
        
        for (int[] interval : intervals) {
            
            // If list is empty or last interval second value is less than current interval first values, add interval to the list
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
            }
        }
            
        // Convert the linked list to array and return it
        return merged.toArray(new int[merged.size()][]);
    }
}


/* MISSING SOME OF THE EDGE CASES */
/* My initial solution (Time Complexity: O(n log n), Space Compleity: O(n)) */
// class Solution {
//     public int[][] merge(int[][] intervals) {
        
//         // Initialising variable
//         int refinedCounter = 1;
//         int temp = 0;
        
//         // Sorting the array
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
//         for (int i=0; i+1<intervals.length; i++) {
            
//             if (intervals[i][1] >= intervals[i+1][0]) {
//                 intervals[i+1][0] = intervals[i][0];
                
//                 if (intervals[i][1] > intervals[i+1][1]) {
//                     intervals[i+1][1] = intervals[i][1];
//                 }
//                 refinedCounter--;
//             } else if (intervals[i][1] > intervals[i+1][1]) {
//                 intervals[i+1][1] = intervals[i][1];
//                 refinedCounter--;
//             } else if (intervals[i][1] >= intervals[i+1][0]) {
//                 intervals[i+1][0] = intervals[i][0];
//                 refinedCounter--;
//             } else if (intervals[i][0] == intervals[i+1][0] && intervals[i][1] == intervals[i+1][1]) {
//                 refinedCounter--;
//             } else if (intervals[i][0] > intervals[i+1][0] && intervals[i][1] < intervals[i+1][1]) {
//                 refinedCounter--;
//             }  else if (intervals[i][1] >= intervals[i+1][0]) {
//                 intervals[i+1][0] = intervals[i][0];
//                 refinedCounter--;
//             }
            
//             // Contnter to determine the size of the refined array and start 
//             refinedCounter++;
//         }
        
        
        
//         // Initialising new array to hold the refined values
//         int[][] intervalsRefined = new int[refinedCounter][2];
        
//         // Filling the new array with the refined values
//         for (int j=0; j<refinedCounter; j++) {
//             intervalsRefined[j][0] = intervals[intervals.length-refinedCounter+j][0];
//             intervalsRefined[j][1] = intervals[intervals.length-refinedCounter+j][1];
//         }
        
//         // Return the refined array if length of the intial array is more than one else return intial array
//         return (intervals.length>1) ? intervalsRefined : intervals;
//     }
// }