package homework4;

import java.util.Scanner;

public class DataReader {

    public static int readNumber () {
        boolean trigger = true;
        int number = 0;
        String numberInputString = "";
        Scanner in = new Scanner(System.in);

   do {
          try {
              numberInputString = in.next();
              number = Integer.parseInt(numberInputString);
              trigger = false;
          } catch (Exception ex) {
               System.out.println(Message.ERROR_INPUT_MESSAGE);
               trigger = true;
          }
      } while (trigger);

        in.close();
        return number;
    }

}

