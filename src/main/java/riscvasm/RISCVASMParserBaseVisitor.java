// Generated from riscvasm\RISCVASMParser.g4 by ANTLR 4.9.1
package riscvasm;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link RISCVASMParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class RISCVASMParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements RISCVASMParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(RISCVASMParser.RContext ctx) { return visitChildren(ctx); }
}