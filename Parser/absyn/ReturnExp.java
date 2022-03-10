package absyn;

public class ReturnExp extends Exp {
    
    public Exp exp;
    
    public ReturnExp(int row, int col, Exp exp) {
        this.row = row;
        this.col = col;
        this.test = exp;
    }

    public void accept(AbsynVisitor visitor, int level) {
        visitor.visit(this, level);
    }
}
