import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        int key=0;
        for(int i= (int)Math.pow(10,digits-1); i< (int)Math.pow(10,digits)-1;i++){
            if(isValidDigit(i))
                odometerValues.put(key++,i);
        }

    }
    private boolean isValidDigit(int n){
        boolean is_ascending=true;
        while(n>9){
            int temp = (n/10);
            if(n%10 <= temp%10);
                is_ascending=false;
            n=n/10;
        }
        return is_ascending;
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
