package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        long balance = 0;

        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                count ++;
                balance = (balance - expenses) / 3;
            } else {

                balance = balance + income - expenses;
            }
        }
        return count;
    }
}
