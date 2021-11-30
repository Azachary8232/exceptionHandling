import java.util.ArrayList;
import java.util.Random;

public class ExceptionsTest {
    public static void main(String[] args) {



    class Broke extends Exception{}
    class UnreliableFriend {
        public boolean deliverMessage() throws OutOfGasException{
            Random r = new Random();
            boolean hasGas = r.nextBoolean();
            if (hasGas){
                return true;
            }
            throw new OutOfGasException();
    }
}



        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Good");
            }
            catch (Broke e){
                System.out.println("Works");
            }
        }

    }
}