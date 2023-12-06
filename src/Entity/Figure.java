package Entity;

public abstract class Figure implements Comparable<Figure>{

    public abstract float surface();

    @Override
    public int compareTo(Figure figure) {
        float surface1 = this.surface();
        float surface2 = figure.surface();
        if (surface1 < surface2) {
            return -1;
        } else if (surface1 == surface2) {
            return 0;
        } else {
            return 1;
        }
    }
}
