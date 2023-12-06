package Entity;

public class Cercle extends Figure {

    private int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle de rayon " + rayon + ". Surface : " + surface();
    }

    @Override
    public float surface() {
        float result = (float) (Math.PI * rayon * rayon);
        return result;
    }
}
