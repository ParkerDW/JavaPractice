package training;

public class Polygon {
	private int[] xValues;
	private int[] yValues;
	private int sides;
	
	public Polygon (int[] xxValues, int[] yyValues, int sideNumber){
		this.xValues=xxValues;
		this.yValues=yyValues;
		this.sides=sideNumber;
	}
	
	public int[] getX(){
		return xValues;
	}
	public int[] getY(){
		return yValues;
	}
	public int getSides(){
		return sides;
	}
}
