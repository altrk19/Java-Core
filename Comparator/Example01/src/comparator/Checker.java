package comparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return method1(o1, o2);
//        return method2(o1,o2);
    }

    private int method1(Player o1, Player o2) {
        if (o1.score < o2.score)
            return 1;
        else if (o1.score > o2.score)
            return -1;
        else
            return o1.name.compareTo(o2.name);
    }

    private int method2(Player o1, Player o2) {
        return o1.score < o2.score ? 1 : o1.score == o2.score ? o1.name.compareTo(o2.name) : -1;
    }
}