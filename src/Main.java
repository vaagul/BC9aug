public class Main {

    public static void main(String[] args) {
        Odometer odometer= new Odometer(4);
        //odometer.printMap();
        System.out.println(odometer.getImmediateNext(6789));
        System.out.println(odometer.getImmediatePrevious(1234));
        System.out.println(odometer.getNext(3456,10));
        System.out.println(odometer.getDifference(1234,6789));
        System.out.println(odometer.getPrevious(2345,1));
    }
}
