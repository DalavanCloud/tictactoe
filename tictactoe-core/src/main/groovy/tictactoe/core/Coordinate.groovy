package tictactoe.core

enum Coordinate {
	A1, A2, A3, B1, B2, B3, C1, C2, C3
	
	String getX () {
		return name().substring(0, 1)
	}
	
	String getY () {
		return name().substring(1)
	}
}
