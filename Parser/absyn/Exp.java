package absyn;

abstract public class Exp extends Absyn {
    public Dec dtype;

    public Exp(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
