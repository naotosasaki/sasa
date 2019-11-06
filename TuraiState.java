package com.company;
class TuraiState extends DogState {
    private static TuraiState s = new TuraiState();
    private TuraiState(){}
    public static DogState getInstance() {
        return s;
    }

    public void tukareta(Dog moto) {
        //なにもしない
    }

    public void tabeta(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }
    public String toString() {
        return "病気状態";
    }
}