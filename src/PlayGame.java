public class PlayGame {
    public Players player1, player2;

    public void turn(Players player1, Players player2)  {

            if (player1.getChoose() == "pepper" && player2.getChoose() == "pepper") {
                System.out.println(player1.getName() + "and" + player2.getName() + "tie");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "pepper" && player2.getChoose() == "rock") {
                System.out.println(player1.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(1));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "pepper" && player2.getChoose() == "scissors") {
                System.out.println(player2.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(1));
            } else if (player1.getChoose() == "rock" && player2.getChoose() == "rock") {
                System.out.println(player1.getName() + "and" + player2.getName() + "tie");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "rock" && player2.getChoose() == "pepper") {
                System.out.println(player2.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(1));
            } else if (player1.getChoose() == "rock" && player2.getChoose() == "scissors") {
                System.out.println(player1.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(1));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "scissors" && player2.getChoose() == "scissors") {
                System.out.println(player1.getName() + "and" + player2.getName() + "tie");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "scissors" && player2.getChoose() == "pepper") {
                System.out.println(player1.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(1));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(0));
            } else if (player1.getChoose() == "scissors" && player2.getChoose() == "rock") {
                System.out.println(player2.getName() + " is win ");
                System.out.printf("%s points is %d \n", player1.getName(), player1.getPoint(0));
                System.out.printf("%s points is %d ", player2.getName(), player2.getPoint(1));
            }
        }
    }
