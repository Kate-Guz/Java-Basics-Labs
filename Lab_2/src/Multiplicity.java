public class Multiplicity {
    private String arr;

    public Multiplicity(String arr) {
        this.arr = arr;
    }

    public Multiplicity() {
    }

    public String getMultiplicity() {
        return arr;
    }

    public void setMultiplicity(String arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Множество: " + arr;
    }

    public static void useSymbol(Multiplicity m, char v) {
        System.out.println();
        int t = 0;
        for (int i = 0; i < m.getMultiplicity().length(); i++) {
            if (m.getMultiplicity().charAt(i) == v) {
                System.out.println("Символ " + v + " присутствует в строке.");
                t++;
            }
        }
        if (t == 0) {
            System.out.println("В строке нет такого символа.");
        }
    }

    public static void intersection(Multiplicity m, Multiplicity v) {
        System.out.println();
        int t = 0;
        char o = ' ';
        String one = "";
        for (int i = 0; i < m.getMultiplicity().length(); i++) {
            for (int l = 0; l < v.getMultiplicity().length(); l++) {
                if (m.getMultiplicity().charAt(i) == v.getMultiplicity().charAt(l)) {
                    o = m.getMultiplicity().charAt(i);
                    one = one + o;
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        } else if (t > 0) {
            System.out.println("Общие символы множеств: ");
            for (int i = 0; i < one.length(); i++) {
                System.out.print(one.charAt(i));
            }
        }
        System.out.println();
    }

    public static void grouping(Multiplicity m, Multiplicity v) {
        System.out.println();
        String t1 = m.getMultiplicity();
        String t2 = v.getMultiplicity();
        m.setMultiplicity(t1 + t2);
        v.setMultiplicity(t1 + t2);
        System.out.println("Первое множество после объединения: " + m.getMultiplicity());
        System.out.println("Второе множество после объединения: " + v.getMultiplicity());
    }

    public static void difference(Multiplicity m, Multiplicity v) {
        System.out.println();
        int t = 0, ind = 0;
        String one = m.getMultiplicity();
        for (int i = 0; i < m.getMultiplicity().length(); i++) {
            for (int l = 0; l < v.getMultiplicity().length(); l++) {
                if (m.getMultiplicity().charAt(i) == v.getMultiplicity().charAt(l)) {
                    ind = i - t;
                    one = removeCharAt(one, ind);
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        } else if (t > 0) {
            m.setMultiplicity(one);
            System.out.println("Разность двух множеств: " + m.getMultiplicity());
        }
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void addition(Multiplicity m, Multiplicity v) {
        System.out.println();
        System.out.println("Результат сложения множеств: " + m.getMultiplicity() + v.getMultiplicity());
    }

    public static void getNewSymbol(Multiplicity m, char v) {
        System.out.println();
        m.setMultiplicity(m.getMultiplicity() + v);
        System.out.println("Множество после добавление символа: " + m.getMultiplicity());
    }

    public static void oneOfCouple(Multiplicity m[]) {
        System.out.println();
        String all = "";
        int t = 0, x = 0, ind = 0;
        for (int i = 0; i < m.length; i++) {
            all = all + m[i].getMultiplicity();
        }
        for (int i = 0; i < m.length - 1; i++) {
            for (int l = 0; l < m[i].getMultiplicity().length(); l++) {
                for (int k = 0; k < m[i + 1].getMultiplicity().length(); k++) {
                    if (m[i].getMultiplicity().charAt(l) == m[i + 1].getMultiplicity().charAt(k)) {
                        ind = x - t;
                        all = removeCharAt(all, ind);
                        t++;
                    }
                }
                x++;
            }
        }
        System.out.println("Сортировка множество попарно: " + all);
    }
}
