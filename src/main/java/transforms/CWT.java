package transforms;

import interfaces.ITransform;
import org.apache.commons.math3.complex.Complex;

public class CWT implements ITransform {

    public CWT(Complex[] signal) {
        padElements(signal.length);
    }

    private int padElements(int lengthSignal) {
        int base = 1 + (int) Math.floor(log2(lengthSignal) + 0.4999);
        return base;
    }

    public static int log2(int N) {
        return (int) (Math.log(N) / Math.log(2));
    }
}
