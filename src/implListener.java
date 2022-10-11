// Generated from impl.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(implParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(implParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(implParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(implParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ALPHA3}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterALPHA3(implParser.ALPHA3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ALPHA3}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitALPHA3(implParser.ALPHA3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ALPHA2}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterALPHA2(implParser.ALPHA2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ALPHA2}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitALPHA2(implParser.ALPHA2Context ctx);
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
	/**
	 * Enter a parse tree produced by the {@code EXPR1}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEXPR1(implParser.EXPR1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR1}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEXPR1(implParser.EXPR1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAND(implParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAND(implParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOR(implParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOR(implParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR3}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEXPR3(implParser.EXPR3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR3}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEXPR3(implParser.EXPR3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR4}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEXPR4(implParser.EXPR4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR4}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEXPR4(implParser.EXPR4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR5}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEXPR5(implParser.EXPR5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR5}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEXPR5(implParser.EXPR5Context ctx);
}