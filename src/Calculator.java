/* Asg 1
* Muhammad Azka Alif - 2502025712
* Steven Audric - 2502007911*/

// This syntax for get input from users
import java.util.Scanner;

public class Calculator {
    // variable total is used to get a total from calculator
    static float total = 0;

    /* Function display
    * This function will print the header and result*/
    static void display(){
        System.out.println("Calculator");
        System.out.println("================");
        //call function hasil to get result
        hasil();
    }
    /*Function hasil
    * This function will print total and return the value
    * of total*/
    static float hasil(){
        System.out.println("Total = " + total);
        return total;
    }
    // this function is built to get input from user
    static void input(){
        System.out.print("Input number :");
    }
    //This function is built to print result
    static void result(){
        display();
    }
    /*Function addition
    * This function has float type and will return
    * value of total*/
    static float addition(float num1){
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        float num2;
        input();
        num2 = keyboard.nextFloat();
        //addition operation
        total = total + num2;
        return total;
    }
    /*Function subtraction
     * This function has float type and will return
     * value of total*/
    static float subtraction(float num1){
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        float num2;
        input();
        num2 = keyboard.nextFloat();
        //subtraction operation
        total = total - num2;
        return total;
    }
    /*Function multiplication
     * This function has float type and will return
     * value of total*/
    static float multiplication(float num1){
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        float num2;
        input();
        num2 = keyboard.nextFloat();
        //multiplication operation
        total = total * num2;
        return total;
    }
    /*Function division
     * This function has float type and will return
     * value of total*/
    static float division(float num1){
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        float num2;
        input();
        num2 = keyboard.nextFloat();
        //division operation
        total = total / num2;
        return total;
    }
    /*Function modulo
     * This function has float type and will return
     * value of total*/
    static float modulo(float num1) {
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        float num2;
        input();
        num2 = keyboard.nextFloat();
        //modulo operation
        total = total % num2;
        return total;

    }
    //function menu for display menu
    static void menu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Clear total");
        System.out.println("7. Exit");
    }

    // main function
    public static void main(String[] args) {
        //syntax for get input from user
        Scanner keyboard = new Scanner(System.in);
        //call display function
        display();
        //declare variable num1 to save first input number
        float num1;
        // call input method or input function
        input();
        num1 = keyboard.nextFloat();
        total = total + num1;
        // call menu function
        menu();
        int ch = 0;
        // the program will always run until user input 7
        while(ch != 7){
            System.out.print("Operator [1...7] : ");
            ch = keyboard.nextInt();
            //if input == 1, the program will run
            //addition operation
            if(ch == 1){
                addition(total);
                result();
            }
            //if input == 2, the program will run
            //subtraction operation
            else if (ch == 2) {
                subtraction(total);
                result();
            }
            //if input == 3, the program will run
            //multiplication operation
            else if (ch == 3) {
                multiplication(total);
                result();
            }
            //if input == 4, the program will run
            //division operation
            else if (ch == 4) {
                division(total);
                result();
            }
            //if input == 5, the program will run
            //modulo operation
            else if (ch == 5) {
                modulo(total);
                result();
            }
            //if input == 6, the program will clear
            //total
            else if (ch == 6) {
                total = 0;
                display();
                input();
                num1 = keyboard.nextFloat();
                total = total + num1;

            }

            else{
                System.out.println("Wrong Input!!");
            }
            menu();
        }
    }
}