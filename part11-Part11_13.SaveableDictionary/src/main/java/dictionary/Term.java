/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author basil
 */
public class Term {
//    private List<String> termList;

    private String word1;
    private String word2;

    public Term(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Term other = (Term) obj;
        if ((this.word1.equals(other.word1) && (this.word2.equals(other.word2)))
                || (this.word1.equals(other.word2) && this.word2.equals(other.word1))) {
            return true;
        }
        return false;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    @Override
    public String toString() {
        return "Term{" + "word1=" + word1 + ", word2=" + word2 + '}';
    }
    
    

}
