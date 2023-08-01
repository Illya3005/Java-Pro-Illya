package Task2.let;

import Task2.player.Player;

// Реалізація Стіни
public class Стіна implements Let {
    private int висота;

    public Стіна(int висота) {
        this.висота = висота;
    }

    @Override
    public void подолати(Player учасник) {
        учасник.jump(висота);
    }
}
