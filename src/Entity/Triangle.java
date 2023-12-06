package Entity;

public class Triangle extends Figure {

    private int base;
    private int hauteur;

    public Triangle(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Triangle de base " + base + " et de hauteur " + hauteur + ". Surface : " + surface();
    }

    @Override
    public float surface() {
        float result = (float) ((base * hauteur) / 2);
        return result;
    }
}
