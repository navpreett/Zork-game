package io.muzoo.ssc.zork;


public class Main {
    public static void main(String[] args) {
        TextBoard board = new TextBoard(11, 5);
        board.drawLine(0, 2, false, 11,true);
        board.drawLine(5, 0, true, 5,true);
        board.drawLine(0, 0, false, 11,true);
        board.drawLine(0, 4, false, 11,true);
        board.drawLine(0, 0, true, 5,true);
        board.drawLine(10, 0, true, 5,true);
        System.out.println(board);
        Game game = new Game();
        game.start();

    }
}
