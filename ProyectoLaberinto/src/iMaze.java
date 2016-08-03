/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RodolfoC
 */
public interface iMaze {
    public void paint1(int [] pos);
    
    public void paint2 (int [] pos);
    
    public boolean check (int [] pos);
    
    public int [] forward (int [] pos);
    
    public int [] backward (int [] pos);
    
    public int [] right (int [] pos);
    
    public int [] left (int [] pos);
    
    
    
    
}
