package com.github;

import java.util.Date;
import java.util.List;

public class Terminarz {
    public static void main(String[] args) {

        TermRepository repository = new TermRepository();

        Term term = new Term();
        term.setDescription("pierwsza");
        term.setDate(new Date());
        repository.add(term);

        Term term1 = new Term();
        term1.setDescription("drugi");
        term1.setDate(new Date());
        repository.add(term1);

        for (Term term2 : repository.getAll()) {
            System.out.println("- "+term2.getDescription()+" "+term2.getDate());
        }

        List<Term> found = repository.find("drugi");
        for (Term term3 : found){
            System.out.println("+ "+term3);
        }


        TimeRange range = new TimeRange(new Date(1000), new Date(2000));
        boolean contains= range.contains(new Date(1000));
        System.out.println(contains);
    }

}
