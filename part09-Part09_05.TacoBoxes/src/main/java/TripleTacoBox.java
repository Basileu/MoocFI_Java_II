/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class TripleTacoBox implements TacoBox{

    private int tacos;
    
    public TripleTacoBox() {
        tacos = 3;
    }

    
    @Override
    public int tacosRemaining() {
        return tacos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        tacos -= 1;
        if (tacos < 0)
            tacos = 0;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
