package com.thinkitive.entity;

public class CurrentScoreDisplay {
    private double run;
    private int wickets, overs;

    public CurrentScoreDisplay() {
    }

    public void update(double run, int wickets, int overs) {
        this.run = run;
        this.wickets = wickets;
        this.overs = overs;
    }

    public void display() {
        System.out.println("Runs : " + run + "\n"
                + "Wickets : " + wickets + "\n"
                + "Overs : " + overs);
    }
}
