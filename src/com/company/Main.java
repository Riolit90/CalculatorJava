package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите арабские числа с учётом пробела от 1 до 10");
        System.out.println("Обязателен знак действия между ними ");
        System.out.println("Также можно ввести римские числа от от I до X включительно");

        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            for (String retval : input.split(" ", 50)) {
                list.add(retval);
            }
            Logic.logic(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Ты ввел не верные данные, ознакомься с условиями в конце концов");
        }
        System.exit(0);
    }

}