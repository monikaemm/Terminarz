package com.github;

import java.util.ArrayList;
import java.util.List;

public class TermRepository {

    private List<Term> terms = new ArrayList<>();

    public void add(Term term){

        terms.add(term);
    }
    public void remove(Term term){

        terms.remove(term);
    }

    public List<Term> getAll(){

        return terms;
    }

    public int size(){

        return terms.size();
    }
}
