package com.company;

import static jdk.nashorn.internal.objects.Global.print;

public class NishinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }
        private void print(int n) {
            System.out.println( n + "を2進数で表示します");
            //
            // ここに2進数表示処理を作成する
            //
             }
        }

