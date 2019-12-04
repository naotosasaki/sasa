package com.company;

public class TvKoujyou extends Koujyou {
    public Seihin factoryMethod() {
        return new Television();
        //Televisionを返す
    }
    public void touroku(Seihin s) {
        //ｔに登録する
        Television t = (Television) s;
        t.numberring();
        t.setDate(Date.today());
    }
}

