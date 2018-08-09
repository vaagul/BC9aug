import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        //code for updating map
    }



    private int getKeyfromValue(int value){
        for(Map.Entry<Integer,Integer> entry : odometerValues.entrySet()){
            if(entry.getValue() == value)
                return entry.getKey();
        }
        return -1;
    }
    private int getValuefromKey(int key){
        for(Map.Entry<Integer,Integer> entry : odometerValues.entrySet()){
            if(entry.getKey() == key){
                return entry.getValue();
            }
        }
        return -1;
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
