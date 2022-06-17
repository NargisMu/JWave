package wavelets;

import interfaces.IWavelet;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;

public class Morlet implements IWavelet {

    private double Fs;   // частота дискретизации
    private double J;
    private double w0;          // параметр вейвлета Морлет
    private int voices = 12;
    private int octave = 8;
    private double dt = 1 / Fs;     // временной шаг
    private double s0 = 2 * dt;    // минимальный масштаб


    public Morlet(Double Fs, double w0, int lenthOfSignal) {
        this.Fs = Fs;
        this.w0 = w0;
        findJ(lenthOfSignal);
    }

    @Override
    public IWavelet getMotherWavlet() {
        return this;
    }

    private double[] scales() {
        double a0 = Math.pow(2, 1 / voices);
        double[] scales = new double[voices * octave - 1];
        return scales;
    }

    private double findJ(int lenthOfSignal) {
        J = Math.floor(22);
        return J;
    }

    @Override
    public double getFs() {
        return Fs;
    }

    public static int log2(int N) {
        int result = (int) (Math.log(N) / Math.log(2));
        return result;
    }
}
