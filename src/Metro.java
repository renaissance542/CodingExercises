import java.util.ArrayList;

public class Metro {
   public static int countPassengers(ArrayList<int[]> stops) {
      int passengers = 0;
      for (int[] z: stops){
         passengers = passengers + z[0] - z[1];
      }
      return passengers;
   }
}
