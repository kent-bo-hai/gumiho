package ast;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class InfixExpressionNode extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode rigt;



    public ExpressionNode getLeft() {
        return left;
    }

    public InfixExpressionNode setLeft(ExpressionNode left) {
        this.left = left;
        return this;
    }

    public ExpressionNode getRigt() {
        return rigt;
    }

    public InfixExpressionNode setRigt(ExpressionNode rigt) {
        this.rigt = rigt;
        return this;
    }
}
