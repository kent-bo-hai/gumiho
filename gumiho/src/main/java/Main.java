import ast.ExpressionNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class Main {

    public static void main(String[] args) {

        String expr = "3 +4 ";

        try {
            CodePointCharStream charStreams = CharStreams.fromString(expr);
            DemoLexer lexer = new DemoLexer(charStreams);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            DemoParser parser = new DemoParser(tokenStream);

            DemoParser.CompileUnitContext cst = parser.compileUnit();

            BuilderVisitor visitor = new BuilderVisitor();
            ExpressionNode ast = visitor.visit(cst);

            System.out.println();
        } catch (Exception e) {

        }


    }
}
