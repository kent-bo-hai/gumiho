import ast.AdditionNode;
import ast.ExpressionNode;
import ast.InfixExpressionNode;
import ast.NumberNode;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class BuilderVisitor extends DemoBaseVisitor<ExpressionNode> {

    @Override
    public ExpressionNode visitCompileUnit(DemoParser.CompileUnitContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExpressionNode visitInfixExpr(DemoParser.InfixExprContext ctx) {
        InfixExpressionNode node = null;
        switch (ctx.op.getType()) {
            case DemoLexer.OP_ADD:
                node = new AdditionNode();
                break;
            case DemoLexer.OP_SUB:
                break;
            case DemoLexer.OP_MUL:
                break;
            case DemoLexer.OP_DIV:
                break;
            default:
                throw new UnsupportedOperationException(ctx.op.getText());
        }

        node.setLeft(visit(ctx.left));
        node.setRigt(visit(ctx.right));
        return node;
    }

    @Override
    public ExpressionNode visitUnaryExpr(DemoParser.UnaryExprContext ctx) {
        return visitUnaryExpr(ctx);
    }

    @Override
    public ExpressionNode visitFuncExpr(DemoParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public ExpressionNode visitNumberExpr(DemoParser.NumberExprContext ctx) {
        return new NumberNode();
    }

    @Override
    public ExpressionNode visitParensExpr(DemoParser.ParensExprContext ctx) {
        return super.visitParensExpr(ctx);
    }



}
