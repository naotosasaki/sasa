package com.company;
class IrairaState extends DogState {
    private static com.company.IrairaState s = new com.company.IrairaState();

    private IrairaState() {
    }

    public static DogState getInstance() {
        return s;
    }

    public void tukareta(Dog moto) {
        moto.changeState(TuraiState.getInstance());
    }

    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }


    public String toString() {
        return "いらいら状態";
    }
}