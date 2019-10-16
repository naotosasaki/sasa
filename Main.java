package com.company;
    class main{
    public static void main(String[] args) {

        Renban R1 =Renban.getInstance();
        Renban R2 =Renban.getInstance();


        System.out.println(String.format("%04d",R1.getNumber()));
        System.out.println(String.format("%04d",R2.getNumber()));
        System.out.println(String.format("%04d",R1.getNumber()));
    }
}


class Renban {
    private static Renban renban = new Renban();
    private  int num =0;
    private Renban() {
    }

    public static Renban getInstance(){

        return renban;
    }

    public  int getNumber() {
        num=num +1;
        return num;
    }
}
