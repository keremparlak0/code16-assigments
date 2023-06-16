package Data;

import java.util.ArrayList;

public class SeatsData {
    ArrayList<String> seats;

    public SeatsData() {
        seats = new ArrayList<String>();
        String seat = null;
        for (int i = 1; i <= 33; i++) {
            for (char j = 'A'; j <= 'D'; j++) {
                seat = i + "" + j;
                System.out.println(seat);
            }
            System.out.println();
        }
    }
}
