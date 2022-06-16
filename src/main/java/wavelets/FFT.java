package wavelets;

import interfaces.ITransform;
import primitives.Complex;

// Orlando
//hedoluna
public class FFT implements ITransform {
    // https://stackoverflow.com/questions/3287518/reliable-and-fast-fft-in-java
    //https://introcs.cs.princeton.edu/java/97data/FFT.java.html


    // https://github.com/hedoluna/fft

    // https://introcs.cs.princeton.edu/java/97data/Complex.java.html
    public static Complex[] fft(Complex[] x) throws IllegalArgumentException {
        int sizeOfSignal = x.length;
        if (sizeOfSignal == 1) {
            // base case
            return new Complex[]{x[0]};
        } else if (sizeOfSignal % 2 != 0) {
            // radix 2 Cooley-Tukey FFT
            throw new IllegalArgumentException("n is not a power of 2");
        } else {
            // compute FFT of even terms
            Complex[] even = new Complex[sizeOfSignal / 2];
            for (int k = 0; k < sizeOfSignal / 2; k++) {
                even[k] = x[2 * k];
            }
            Complex[] evenFFT = fft(even);
        }

        return null;
    }
}
