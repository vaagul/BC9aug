import java.util.HashMap;
import java.util.Map;

public class Odometer {
    Map<Integer,Integer> odometerValues=new HashMap<>();
    int digits;

    Odometer(int digits){
        this.digits=digits;
        int key=0;
        for(int i= (int)Math.pow(10,digits-1); i< (int)Math.pow(10,digits);i++){
            if(isValidDigit(i)) {
                odometerValues.put(key++, i);
            }
        }
    }
    public boolean isValidDigit(int n){
        boolean is_ascending=true;
        while(n>9){
            int temp = (n/10);
            if(n%10 <= temp%10)
                is_ascending=false;
            n=n/10;
        }
        return is_ascending;
    }

    public void printMap(){
        for(Map.Entry<Integer,Integer> entry:odometerValues.entrySet()){
            System.out.println(entry.getKey() + "\t" +entry.getValue());
        }
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

    public int getImmediateNext(int currvalue){
        return getNext(currvalue,1);
    }

    public int getImmediatePrevious(int currvalue){
        return getPrevious(currvalue,1);
    }

     public int getNext(int currValue,int offset){
    	int size=odometerValues.size();
    	int key=getKeyfromValue(currValue);
    	return getValuefromKey((key+offset)%size);

    }
	public int getPrevious(int currValue,int offset){
		int size=odometerValues.size();
    	int index=getKeyfromValue(currValue);
    	return getValuefromKey((index-offset+size)%size);

    }

    public int getDifference(int n1,int n2){

    	int diff=Math.abs(getKeyfromValue(n1)-getKeyfromValue(n2));
        return diff;
    }
}
