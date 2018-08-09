import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        //code for updating map
    }

    public int getNext(int currValue,int offset){
        return 0;
    }

    public int getPrevious(int currValue,int offset){
        return 0;
    }

    public int getDifference(int n1,int n2){
        return 0;
    }
}
