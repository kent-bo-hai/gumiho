package ast;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class FunctionNode extends ExpressionNode {

//    Func<double, double> Function { get; set; }
    ExpressionNode argument;

    public ExpressionNode getArgument() {
        return argument;
    }

    public FunctionNode setArgument(ExpressionNode argument) {
        this.argument = argument;
        return this;
    }
}
