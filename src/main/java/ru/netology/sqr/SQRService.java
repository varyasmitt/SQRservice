package ru.netology.sqr;

public class SQRService {
    public int sqrValuesAreIncluded(int up, int down, int firstValue, int secondValue) {
        int number = 0;
        for (int i = firstValue; i <= secondValue; i++) {
            if (down <= i * i && i * i <= up)
                 {
                    number++;
                }
        }
        return number;
    }
}






