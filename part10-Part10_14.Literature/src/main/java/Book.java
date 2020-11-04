
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Book {
    private String title;
    private int ageRecommended;

    public Book(String title, int ageRecommended) {
        this.title = title;
        this.ageRecommended = ageRecommended;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAgeRecommended() {
        return ageRecommended;
    }

    public void setAgeRecommended(int ageRecommended) {
        this.ageRecommended = ageRecommended;
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
        final Book other = (Book) obj;
        if (this.ageRecommended != other.ageRecommended) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return getTitle() + " (recommended for " + getAgeRecommended() + " years-old or older)";
    } 
    
}
