package ast;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class NegateNode extends ExpressionNode {

    ExpressionNode innerNode;

    public ExpressionNode getInnerNode() {
        return innerNode;
    }

    public NegateNode setInnerNode(ExpressionNode innerNode) {
        this.innerNode = innerNode;
        return this;
    }
}
