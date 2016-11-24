package ru.gil;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean checkValidate(String str) {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++)
        {
            char element = str.charAt(i);
            if (element == '(' || element == '[')
            {
                stack.push(element);
            }

            else if (element == ')' || element == ']')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();

                if (element == ')' && last == '(' || element == ']' && last == '[') {
                    stack.pop();
                } else return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Введите строку из '()' '[]' скобок : ");
        str = sc.nextLine();

        if (checkValidate(str)) {
            System.out.println("Строка валидна");
        } else System.out.println("Строка не валидна");

    }
}
