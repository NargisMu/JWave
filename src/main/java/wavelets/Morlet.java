package wavelets;

import interfaces.IWavelet;

public class Morlet implements IWavelet {

    private double Fs = 1.5;
    private int nv = 12;
    private int nOctave = 8;

    @Override
    public IWavelet getMotherWavlet() {
        return this;
    }

    double getScaleMinimum(){
        return 2*getTimeStep();
    }

    double[] getMaximum(){
        double a0 = Math.pow(2,1/nv);
        double[] scales = new double[nv*nOctave-1];

        return scales;
    }

    double getTimeStep(){
        return 1/Fs;
    }

    double getFs(){
        return Fs;
    }

    IWavelet setFs(Double frequency){
        this.Fs = frequency;
        return this;
    }
}
