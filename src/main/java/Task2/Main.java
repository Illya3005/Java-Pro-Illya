package Task2;

import Task2.let.Let;
import Task2.let.БіговаДоріжка;
import Task2.let.Стіна;
import Task2.player.Cat;
import Task2.player.People;
import Task2.player.Player;
import Task2.player.Robot;

public class Main {
    public static void main(String[] args) {
        Player[] учасники = {
                new People("Артем", 150, 50),
                new Cat("Базилио", 100, 30),
                new Robot("R2-D2", 300, 100)
        };

        Let[] перешкоди = {
                new БіговаДоріжка(100),
                new Стіна(50),
                new БіговаДоріжка(200),
                new Стіна(30)
        };

        for (var учасник : учасники) {
            for (Let перешкода : перешкоди) {
                перешкода.подолати(учасник);
            }
        }
    }
}
