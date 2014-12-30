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

    public List<Term> find(String phrase){

        List<Term> found = new ArrayList<>();
        for ( Term tempTerm : terms){
            if(tempTerm.getDescription().contains(phrase)){
                found.add(tempTerm);
            }
        }
        return found;
    }
}
