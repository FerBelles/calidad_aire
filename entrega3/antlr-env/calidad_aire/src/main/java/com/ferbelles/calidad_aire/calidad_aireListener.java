package com.ferbelles.calidad_aire;

// Generated from calidad_aire.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calidad_aireParser}.
 */
public interface calidad_aireListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(calidad_aireParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(calidad_aireParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conjuntos}
	 * labeled alternative in {@link calidad_aireParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterConjuntos(calidad_aireParser.ConjuntosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conjuntos}
	 * labeled alternative in {@link calidad_aireParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitConjuntos(calidad_aireParser.ConjuntosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code data}
	 * labeled alternative in {@link calidad_aireParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterData(calidad_aireParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code data}
	 * labeled alternative in {@link calidad_aireParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitData(calidad_aireParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#datos}.
	 * @param ctx the parse tree
	 */
	void enterDatos(calidad_aireParser.DatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#datos}.
	 * @param ctx the parse tree
	 */
	void exitDatos(calidad_aireParser.DatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#pm10}.
	 * @param ctx the parse tree
	 */
	void enterPm10(calidad_aireParser.Pm10Context ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#pm10}.
	 * @param ctx the parse tree
	 */
	void exitPm10(calidad_aireParser.Pm10Context ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#pm25}.
	 * @param ctx the parse tree
	 */
	void enterPm25(calidad_aireParser.Pm25Context ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#pm25}.
	 * @param ctx the parse tree
	 */
	void exitPm25(calidad_aireParser.Pm25Context ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#o3}.
	 * @param ctx the parse tree
	 */
	void enterO3(calidad_aireParser.O3Context ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#o3}.
	 * @param ctx the parse tree
	 */
	void exitO3(calidad_aireParser.O3Context ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#so2}.
	 * @param ctx the parse tree
	 */
	void enterSo2(calidad_aireParser.So2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#so2}.
	 * @param ctx the parse tree
	 */
	void exitSo2(calidad_aireParser.So2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#no2}.
	 * @param ctx the parse tree
	 */
	void enterNo2(calidad_aireParser.No2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#no2}.
	 * @param ctx the parse tree
	 */
	void exitNo2(calidad_aireParser.No2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calidad_aireParser#co}.
	 * @param ctx the parse tree
	 */
	void enterCo(calidad_aireParser.CoContext ctx);
	/**
	 * Exit a parse tree produced by {@link calidad_aireParser#co}.
	 * @param ctx the parse tree
	 */
	void exitCo(calidad_aireParser.CoContext ctx);
}