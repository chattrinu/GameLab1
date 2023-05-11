public class Main {
    public static void main(String[] args)  {

       Players player1 = new Players("Tommy","scissors");
       Players player2 = new Players("Emma","peppers");
       PlayGame game = new PlayGame();
       game.turn(player1,player2);

    }
}