/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RodolfoC
 */
public class Maze implements iMaze{

    @Override
    public void paint1(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint2(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean check(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] forward(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] backward(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] right(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] left(int[] pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String[][] escenarioUno() {
        String[][] matriz = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", " ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", " ", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", " ", "|"},
            {"|", "*", " ", " ", "a", "a", " ", " ", " ", "a", "a", "a", "a", " ", "a", " ", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", " ", "a", " ", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", " ", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", " ", " ", " ", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", " ", "a", " ", " ", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", " ", "x"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        return matriz;
    }
    
    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public int[] checkSurroundings (int[][] maze, int x, int y){
	int der = 0;
	int izq = 0;
	int up = 0;
	int down = 0;
	if (maze [x+1][y] == " "){
		der = 1;
	} if (maze [x-1][y] == " "){
		izq = 1;
	} if (maze [x][y+1] == " "){
		down = 1;
	} if (maze [x][y-1] == " "){
		up = 1;
	} if (maze [x+1][y] == "1"){
		der = 2;
	} if (maze [x-1][y] == "1"){
		izq = 2;
	} if (maze [x][y+1] == "1"){
		down = 2;
	} if (maze [x][y-1] == "1"){
		up = 2;
	}
	int [] surroundings = new int [4];
	surroundings[0] = der;
	surroundings[1] = izq;
	surroundings[2] = down;
	surroundings[3] = up;
	return surroindings;
}
public int direction (int[] x){
	int suma = x[0]+x[1]+x[2]+x[3];
	if (suma == 1){
		//CUANDO HAY UNICAMENTE UN ESPACIO LIBRE
		if (x[0] == 1){
			move(1);
		} if (x[1] == 1){
			move(2);
		} if (x[2] == 1){
			move(3);
		} if (x[3] == 1){
			move(4);
		}
	}
	//CUANDO HAY MAS DE UN ESPACIO LIBRE FALTA O HAY UNOS
}
public void move(int[][] maze, int x, int y, int dir){
	if (dir == 1){
		maze[x+1][y] = "*";
	} if (dir == 2){
		maze[x-1][y] = "*";
	} if (dir == 3){
		maze[x][y+1] = "*";
	} if (dir == 4){
		maze[x][y-1] = "*";
	}
	if (maze [x][y] == "_"){
		maze [x][y] == "1";
	} if (maze [x][y] == "1"){
		maze [x][y] == "2";
	}
}
    
}
