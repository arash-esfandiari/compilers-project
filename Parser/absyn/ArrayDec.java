package absyn;

public class ArrayDec extends VarDec {
    public IntExp size;

    public ArrayDec(int row, int col, NameTy typ, String name, IntExp size) {
        super(row, col, typ, name);
        this.size = size;
    }

    public void accept(AbsynVisitor visitor, int level) {
        visitor.visit(this, level);
    }
}
