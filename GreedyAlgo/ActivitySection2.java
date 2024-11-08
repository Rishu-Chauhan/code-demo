import java.util.Comparator;

public class ActivitySection2 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
       int end[]={2,4,6,7,9,9};
     
      
       int activity[][] = new int[start.length][3];
       for (int i = 0; i < start.length; i++) {
           activity[i][0] = i; // Activity index
           activity[i][1] = start[i]; // Start time
           activity[i][2] = end[i]; // End time
       }

       // Sort the activities based on their end times
       Arrays.sort(activity, Comparator.comparingInt(o -> o[2]));

       int maxAct = 0;
       ArrayList<Integer> ans = new ArrayList<>();
       maxAct = 1; // At least one activity can be selected
       ans.add(activity[0][0]); // Add the first activity
       int lastEnd = activity[0][2]; // End time of the last selected activity

       for (int i = 1; i < start.length; i++) {
           // If the start time of the current activity is greater than or equal to the end time of the last selected activity
           if (activity[i][1] >= lastEnd) {
               maxAct++;
               ans.add(activity[i][0]); // Add the current activity to the list
               lastEnd = activity[i][2]; // Update the end time
           }
       }

       // Output the results
       System.out.println("Maximum number of activities = " + maxAct);
       System.out.print("Selected activities: ");
       for (int i = 0; i < ans.size(); i++) {
           System.out.print("A" + ans.get(i) + " ");
       }
       System.out.println();
    }
}
