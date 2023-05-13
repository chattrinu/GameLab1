public class Main {
    public static void main(String[] args)  {

       Players player1 = new Players("Tony","paper");
       Players player2 = new Players("Emma","paper");
       PlayGame game = new PlayGame();
       game.turn(player1,player2);

    }
}