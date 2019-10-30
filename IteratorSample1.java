package com.company;
public class IteratorSample1 {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add(new Game("チュウニズム", 100));
        gameListAggregate.add(new Game("BanG Dream!", 0));
        gameListAggregate.add(new Game("アイドルマスターシンデレラガールズ", 0));
        gameListAggregate.add(new Game("Muse Dash", 370));
        iterator.first(); // まず探す場所を先頭位置にしてもらう
        while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
            Game game = (Game) iterator.getItem(); // はいどうぞ (と受取る)
            System.out.println((game).getName());
            System.out.println((game).getPrice());
            iterator.next(); // 次を頂戴
        }
    }
}