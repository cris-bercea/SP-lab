package com.company;

import java.util.Collection;
import java.util.Vector;

public class Carte {
    String titlu;
    Cuprins cup;
    private Collection<Author> aut;

    public Carte(String titlu, Cuprins cup, Collection<Author> aut)
    {
        this.titlu = titlu;
        this.cup = cup;
        this.aut = aut;
    }

    public Collection<Author> getAut() {
        return aut;
    }

    public Cuprins getCup() {
        return cup;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
