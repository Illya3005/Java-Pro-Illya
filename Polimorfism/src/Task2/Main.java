package Task2;

import Task2.Let;
import Task2.БіговаДоріжка;
import Task2.Стіна;

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

        for (Player учасник : учасники) {
            for (Let перешкода : перешкоди) {
                перешкода.подолати(учасник);
            }
        }
    }
}
