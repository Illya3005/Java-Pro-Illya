package Task2.let;

import Task2.player.Player;

// Реалізація Бігової Доріжки
public class БіговаДоріжка implements Let {
    private int довжина;

    public БіговаДоріжка(int довжина) {
        this.довжина = довжина;
    }

    @Override
    public void подолати(Player учасник) {
        учасник.run(довжина);
    }
}
