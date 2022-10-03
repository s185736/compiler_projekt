// Generated from C:/Users/azmi_/Documents/GitHub/02332_compiler/compiler_projekt/src\impl.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(implParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(implParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OP}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOP(implParser.OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OP}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOP(implParser.OPContext ctx);
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
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(implParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(implParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMUL(implParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMUL(implParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(implParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(implParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(implParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(implParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ALLOPERATORS}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterALLOPERATORS(implParser.ALLOPERATORSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ALLOPERATORS}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitALLOPERATORS(implParser.ALLOPERATORSContext ctx);
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
}