package easy.math;

public class DetermineColorOfChessboardSquare_1812 {
	public boolean squareIsWhite(String coordinates) {
		int row = (coordinates.charAt(1) - '1') % 2;
		int col = (coordinates.charAt(0) - 'a') % 2;
		return row != col;
	}
}
