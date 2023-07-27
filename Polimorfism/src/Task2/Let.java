package Task2;

// Тип даних Перешкода
interface Let {
    void подолати(Player учасник);
}

// Реалізація Бігової Доріжки
class БіговаДоріжка implements Let {
    private int довжина;

    public БіговаДоріжка(int довжина) {
        this.довжина = довжина;
    }

    @Override
    public void подолати(Player учасник) {
        учасник.run(довжина);
    }
}

// Реалізація Стіни
class Стіна implements Let {
    private int висота;

    public Стіна(int висота) {
        this.висота = висота;
    }

    @Override
    public void подолати(Player учасник) {
        учасник.jump(висота);
    }
}

