package wavelets;

import interfaces.IWavelet;

public class DOG implements IWavelet {
    @Override
    public IWavelet getMotherWavlet() {
        return this;
    }

    @Override
    public double getFs() {
        return 0;
    }
}
