package com.company;

abstract public class Koujyou {
    public final Seihin create() {
        //seihinに施す処理を記述
        Seihin seihin = factoryMethod(); touroku(seihin);
        return seihin;
    }
    public abstract Seihin factoryMethod();
    public abstract void touroku(Seihin s);
}

