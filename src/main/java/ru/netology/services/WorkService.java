package ru.netology.services;

public class WorkService {
    public int calculate(int income, int expenses, int treshhold) {
        int monthes = 0;
        int cash = 0;
        for (int x = 0; x < 12; x++) {
            if (cash >= treshhold) {
                cash -= expenses;
                cash /= 3;
                monthes++;

            } else {
                cash += income;
                cash -= expenses;

            }

        }

        return monthes;

    }
}