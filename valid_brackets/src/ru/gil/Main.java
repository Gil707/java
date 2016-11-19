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
                stack.push(element);                    // кладем в стэк элемент если это открытая скобка
            }

            else if (element == ')' || element == ']')  // если этот символ - закрытая скобка смотрим стэк
            {
                if (stack.isEmpty())                    // если стэк пустой, то строка не валидна, 1-я скобка сразу закрытая
                    return false;

                char last = stack.peek();               // читаем последний элемент стэка

                if (element == ')' && last == '(' || element == ']' && last == '[') {
                    stack.pop();                        // если текущий элемент закрытая скобка а последний открытая, убираем последний элемент
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
