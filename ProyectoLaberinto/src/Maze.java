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
    
}
