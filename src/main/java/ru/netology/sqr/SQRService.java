package ru.netology.sqr;

public class SQRService {
    public int sqrValuesAreIncluded(int up, int down) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (down <= i * i && i * i <= up) {
                number++;
            }
        }
        return number;
    }
}






