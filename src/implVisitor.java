// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimInp(implParser.SimInpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(implParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(implParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ALPHA3}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALPHA3(implParser.ALPHA3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ALPHA2}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALPHA2(implParser.ALPHA2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ALPHA1}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALPHA1(implParser.ALPHA1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR1}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR1(implParser.EXPR1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(implParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(implParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR3}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR3(implParser.EXPR3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR4}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR4(implParser.EXPR4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR5}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR5(implParser.EXPR5Context ctx);
}