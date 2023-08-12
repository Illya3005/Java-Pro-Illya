package Task2.player;

public class People implements Player {
    private String name;
    private int обмеженняБігу;
    private int обмеженняСтрибка;
    private boolean дійснийУчасник;

    public People(String name, int обмеженняБігу, int обмеженняСтрибка) {
        this.name = name;
        this.обмеженняБігу = обмеженняБігу;
        this.обмеженняСтрибка = обмеженняСтрибка;
        this.дійснийУчасник = true;
    }

    @Override
    public void run(int distance) {
        if (дійснийУчасник) {
            if (distance <= обмеженняБігу) {
                System.out.println("Людина " + name + " пробігла " + distance + " м");
            } else {
                System.out.println("Людина " + name + " не зміг пробігти " + distance + " м. Пройдено " + обмеженняБігу + " м");
                дійснийУчасник = false;
            }
        }
    }

    @Override
    public void jump(int high) {
        if (дійснийУчасник) {
            if (high <= обмеженняСтрибка) {
                System.out.println("Людина " + name + " стрибнула на висоту " + high + " см");
            } else {
                System.out.println("Людина " + name + " не зміг стрибнути на висоту " + high + " см. Пройдено " + обмеженняСтрибка + " см");
                дійснийУчасник = false;
            }
        }
    }
}
