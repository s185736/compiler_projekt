package task;// Generated from C:/Users/azmi_/Documents/GitHub/02332_compiler/compiler_projekt/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 */
	void enterLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 */
	void exitLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimInp(implParser.SimInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimInp(implParser.SimInpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ALPHA1}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterALPHA1(implParser.ALPHA1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ALPHA1}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitALPHA1(implParser.ALPHA1Context ctx);
}