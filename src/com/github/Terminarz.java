package com.github;

import javafx.scene.input.InputMethodTextRun;

import java.util.Date;

public class Terminarz {
    public static void main(String[] args) {

        TermRepository repository = new TermRepository();
        System.out.println("initial size: "+repository.size());

        Term term = new Term();
        term.setDescription("pierwsza");
        term.setDate(new Date());
        repository.add(term);


        System.out.println("size after adding: "+repository.size());
        System.out.println(repository.getAll());

        Term term1 = new Term();
        term1.setDescription("drugi");
        term1.setDate(new Date());
        repository.add(term1);

        term.setDescription("trzeci");

        repository.remove(term);


        for (Term term2 : repository.getAll()) {
            System.out.println("- "+term2.getDescription()+" "+term2.getDate());
        }


    }
}
