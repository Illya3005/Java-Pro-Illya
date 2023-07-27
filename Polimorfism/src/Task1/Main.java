package Task1;

import Task1.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] фігури = new Figure[3];
        фігури[0] = new Коло(9);
        фігури[1] = new Трикутник(11, 4);
        фігури[2] = new Квадрат(43);

        double сумарнаПлоща = обчислитиСумарнуПлощу(фігури);
        System.out.println("Сумарна площа всіх фігур: " + сумарнаПлоща);
    }

    public static double обчислитиСумарнуПлощу(Figure[] фігури) {
        double сума = 0;
        for (Figure фігура : фігури) {
            сума += фігура.returnSquare();
        }
        return сума;
    }
}
