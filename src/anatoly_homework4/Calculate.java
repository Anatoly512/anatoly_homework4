package anatoly_homework4;

public class Calculate {

    public void printOfNumbers() {
        int x;
        System.out.println(Message.THANK_YOU);

        System.out.println(Message.ENTER_NUMBER);
        x =  DataReader.readNumber();

        for (int i = 1; i <=x; i++){
          System.out.println(i);
        }

       Message.Empty_String_For_Task_1 = Message.COMPLETE;
    }
}
