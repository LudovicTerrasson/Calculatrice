/**
 * 
 */
/**
 * 
 */
module Calculatrice {
	requires java.desktop;
	requires javafx.base;
	requires javafx.controls;
	
	opens frontend to javafx.graphics, javafx.fxml;
}