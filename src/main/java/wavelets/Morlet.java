package wavelets;

import interfaces.IWavelet;

public class Morlet implements IWavelet {

    private double Fs;   // частота дискретизации
    private int nv = 12;
    private int nOctave = 8;
    private double dt = 1 / Fs;
    private double s0 = 2 * dt;    // минимальный масштаб
    private double J;

    public Morlet(Double Fs, int nv, int nOctave, int lenthOfSignal) {
        this.Fs = Fs;
        this.nOctave = nOctave;
        this.nv = nv;
        findJ(lenthOfSignal);
    }

    @Override
    public IWavelet getMotherWavlet() {
        return this;
    }

    private double[] scales() {
        double a0 = Math.pow(2, 1 / nv);
        double[] scales = new double[nv * nOctave - 1];
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
