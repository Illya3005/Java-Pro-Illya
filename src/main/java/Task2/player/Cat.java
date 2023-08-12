package Task2.player;

public class Cat implements Player {
    private String name;
    private int обмеженняБігу;
    private int обмеженняСтрибка;
    private boolean дійснийУчасник;

    public Cat(String name, int обмеженняБігу, int обмеженняСтрибка) {
        this.name = name;
        this.обмеженняБігу = обмеженняБігу;
        this.обмеженняСтрибка = обмеженняСтрибка;
        this.дійснийУчасник = true;
    }

    @Override
    public void run(int distance) {
        if (дійснийУчасник) {
            if (distance <= обмеженняБігу) {
                System.out.println("Кіт " + name + " пробігла " + distance + " м");
            } else {
                System.out.println("Кіт " + name + " не зміг пробігти " + distance + " м. Пройдено " + обмеженняБігу + " м");
                дійснийУчасник = false;
            }
        }
    }

    @Override
    public void jump(int high) {
        if (дійснийУчасник) {
            if (high <= обмеженняСтрибка) {
                System.out.println("Кіт " + name + " стрибнула на висоту " + high + " см");
            } else {
                System.out.println("Кіт " + name + " не зміг стрибнути на висоту " + high + " см. Пройдено " + обмеженняСтрибка + " см");
                дійснийУчасник = false;
            }
        }
    }
}
