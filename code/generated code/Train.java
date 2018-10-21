
import java.util.*;

/**
 * @author Sujay Mahadik
 */
public class Train {

    public Train() {

    }

    public String returnTrainName(int trainNo) {
        String trainName;
        Hashtable<Integer, String> traindata = new Hashtable<Integer, String>();
        traindata.put(12108, "Intercity Express");
        traindata.put(12109, "Deccan Queen");
        traindata.put(12110, "Koyna Express");
        traindata.put(12111, "Rajdhani");

        trainName = traindata.get(trainNo);
        return trainName;
    }

}