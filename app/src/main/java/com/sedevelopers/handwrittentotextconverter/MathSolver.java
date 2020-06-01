package com.sedevelopers.handwrittentotextconverter;


import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;


public class MathSolver {

    public String eval(String str1){
        String ans,str;
        str = str1;
        Evaluator ev = new Evaluator();
        try {
            ans = ev.evaluate(str);
        } catch (EvaluationException e) {
            e.printStackTrace();
            ans="Calculating...";
        }
        return ans;
    }

}