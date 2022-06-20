package main;

import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;

public class Main {
    // чтение сигналов
    // центрирование входных сигналов
    // приведение с общей длине

    // https://www.programcreek.com/java-api-examples/?api=org.apache.commons.math3.transform.FastFourierTransformer
    public static void loadSignals() {
        // toDo реализвать чтение сигналов
        // центрирование сигналов
        // форматирование файлов -> чтение массивов
    }

    // сигналы приводятся к общей длине
    private int padElements(int lengthSignal1, int lengthSignal2) {
        int max = lengthSignal1;
        if (lengthSignal1 < lengthSignal2) {
            max = lengthSignal2;
        }
        int base = 1 + (int) Math.floor(log2(max) + 0.4999);
        return base;
    }

    public static int log2(int N) {
        return (int) (Math.log(N) / Math.log(2));
    }
}
