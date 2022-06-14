package wavelets;

import interfaces.IWavelet;

public class Paule implements IWavelet {

    @Override
    public IWavelet getMotherWavlet() {
        return this;
    }
}
