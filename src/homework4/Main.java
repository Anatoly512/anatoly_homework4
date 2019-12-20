package homework4;

public class Main {

    private Calculate calculate = new Calculate();
    public static void main(String[] args) {

        Main choice = new Main();
        choice.choiceOfTasks();

    }

    private void choiceOfTasks() {
        int choiceNumber = 0;

        // Task 1   function printOfNumbers prints list from 1 to x numbers  (x)
        // Task 2   drawRectangle  (x, y)
        // Task 3   drawRectangle  (x)    (height == width)
        // Task 4   getMax (n1, n2)   returns max number  and  reload getMax for differ types of data (int, float)
        // Task 5   ==  Task 1 using recursion
        // Task 6   ==  Task 2 using recursion

        System.out.println(Message.CHOOSE_TASK);  // Выбор из 6 заданий
        System.out.println(Message.TASK_ONE_PRINT_LIST + Message.Empty_String_For_Task_1);
        System.out.println(Message.TASK_TWO_DRAW_RECTANGLE_DIFFER_SIDES + Message.Empty_String_For_Task_2);
        System.out.println(Message.TASK_THREE_DRAW_RECTANGLE_DIFFER_SIDES + Message.Empty_String_For_Task_3);
        System.out.println(Message.TASK_FOUR_GET_MAX_VALUE + Message.Empty_String_For_Task_4);
        System.out.println(Message.TASK_FIVE_RECURSION_PRINT_LIST + Message.Empty_String_For_Task_5);
        System.out.println(Message.TASK_SIX_RECURSION_DRAW_RECTANGLE + Message.Empty_String_For_Task_6);

        choiceNumber = DataReader.readNumber();


        System.out.println(Message.THANK_YOU);

        calculate.printOfNumbers(choiceNumber);

    }

}
