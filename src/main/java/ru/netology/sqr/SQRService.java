package ru.netology.sqr;

public class SQRService {
    public long enumeration(long minLimit, long maxLimit) {
        int counter = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (Math.pow(i, 2) >= minLimit && Math.pow(i, 2) <= maxLimit)
                counter = counter + 1;
        }
        {
            return counter;
        }
    }
}
