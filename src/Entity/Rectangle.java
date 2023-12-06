package Entity;

public class Rectangle extends Figure {

    private int largeur;
    private int hauteur;

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle de largeur " + largeur + " et de hauteur " + hauteur + ". Surface : " + surface();
    }

    @Override
    public float surface() {
        float result = (float) ((largeur * hauteur) / 2);
        return result;
    }
}
