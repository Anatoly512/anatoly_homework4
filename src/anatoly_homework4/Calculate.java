package anatoly_homework4;

import java.util.Scanner;

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

    public void drawRectangle() {
      int x;
      int y;
       System.out.println(Message.SIDE_ONE);
       x = DataReader.readNumber();
       System.out.println(Message.SIDE_TWO);
       y = DataReader.readNumber();
       drawRectangleTwoSides(x, y);
       Message.Empty_String_For_Task_2 = Message.COMPLETE;
    }

    public void drawRectangle(int choice_equal_sides) {
        int x;
        int y;
         System.out.println(Message.SIDE_EQUAL_SIDES);
         x = DataReader.readNumber();
         y = x;
         drawRectangleTwoSides(x, y);
         Message.Empty_String_For_Task_3 = Message.COMPLETE;
    }

    private void drawRectangleTwoSides(int x, int y) {
        System.out.println(" Two sides  :  " + x +", " + y);    // Test string


    }

    public void getMax () {
        int a = 0;
        int b = 0;
        float float1 = 0;
        float float2 = 0;
        boolean floatTrue = false;
        boolean floatNumber1 = false;
        boolean floatNumber2 = false;
        boolean trigger = true;
        boolean trigger2 = false;
        String numberInputString = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println(Message.NUMBER_ONE);        //  Ввод первого числа
        do {
            try {
                numberInputString = scanner.next();
                trigger2 = false;

                try {
                   a = Integer.parseInt(numberInputString);
                }
                catch (NumberFormatException | NullPointerException nfe) {
                    try {
                        float1 = Float.parseFloat(numberInputString);
                        floatTrue = true;
                        floatNumber1 = true;
                    }
                    catch (NumberFormatException | NullPointerException n) {
                        System.out.println(Message.WRONG_DURING_INPUT);
                        System.out.print(Message.PLEASE_TRY_AGAIN);
                        trigger2 = true;
                     }
                }

                trigger = false;

            } catch (Exception ex) {
                System.out.println(Message.ERROR_NUMBER_INPUT_MESSAGE);
                trigger = true;
            }
        } while (trigger | trigger2);


        System.out.println(Message.NUMBER_TWO);       //  Ввод второго числа
        do {
            try {
                numberInputString = scanner.next();
                trigger2 = false;

                try {
                   b = Integer.parseInt(numberInputString);
                }
                catch (NumberFormatException | NullPointerException nfe) {
                    try {
                        float2 = Float.parseFloat(numberInputString);
                        floatTrue = true;
                        floatNumber2 = true;
                    }
                    catch (NumberFormatException | NullPointerException n) {
                        System.out.println(Message.WRONG_DURING_INPUT);
                        System.out.print(Message.PLEASE_TRY_AGAIN);
                        System.out.println();
                        trigger2 = true;
                    }
                }

                trigger = false;

            } catch (Exception ex) {
                System.out.println(Message.ERROR_NUMBER_INPUT_MESSAGE);
                trigger = true;
            }
        } while (trigger | trigger2);


       //  Если хотя бы одна переменная типа Float,
       //  то все переменные явно приводятся к типу Float

        if ((floatNumber1) && (floatNumber2)) {
        }
         else {
             if (floatNumber1) {
                float2  = (float) b;
             }
             else {
                 if (floatNumber2) {
                   float1  = (float) a;
                 }
             }
        }


           if (!floatTrue) {
              getMaxOfTwoValues(a, b);      //  Передаются параметры типа Int
           }
              else {
              getMaxOfTwoValues(float1, float2);     //    Передаются параметры типа Float
    }


        Message.Empty_String_For_Task_4 = Message.COMPLETE;
    }


    private void getMaxOfTwoValues (int a, int b) {
        int maxValue = 0;

        System.out.println(" Int value !  " + a + "  " + b);      //  Только для фазы тестирования

        if (a == b) {
            System.out.println(" This two numbers are equal  :  " + a + " and " + b);
        }
        else {
            if (a > b) { maxValue = a; }
            else maxValue = b;
            System.out.println(" Max value = " + maxValue);
        }

    }

    private void getMaxOfTwoValues (float a, float b) {
        float maxValue = 0f;

        System.out.println(" Float value !  " + a + "  " + b);     //  Только для фазы тестирования

        if (a == b) {
            System.out.println(" This two numbers are equal  :  " + a + " and " + b);
        }
        else {
            if (a > b) { maxValue = a; }
            else maxValue = b;
            System.out.println(" Max value = " + maxValue);
        }

    }

}
