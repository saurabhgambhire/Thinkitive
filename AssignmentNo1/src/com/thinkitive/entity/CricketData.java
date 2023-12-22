package com.thinkitive.entity;

public class CricketData {
    private double run;
    private int wickets;
    private int overs;
    private CurrentScoreDisplay currentScoreDisplay;
    private AverageScoreDisplay averageScoreDisplay;

    public CricketData() {
        currentScoreDisplay = null;
        averageScoreDisplay = null;
    }


    public CricketData(double run, int wickets, int overs, CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
        this.run = run;
        this.wickets = wickets;
        this.overs = overs;
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;

        changeData();
    }

    public void changeData() {
        // Update data
        currentScoreDisplay.update(run, wickets, overs);
        averageScoreDisplay.update(run, wickets, overs);

        currentScoreDisplay.display();
        averageScoreDisplay.display();
    }


    @Override
    public String toString() {
        return "CricketData{" +
                "run=" + run +
                ", wickets=" + wickets +
                ", overs=" + overs +
                ", currentScoreDisplay=" + currentScoreDisplay +
                ", averageScoreDisplay=" + averageScoreDisplay +
                '}';
    }
}
