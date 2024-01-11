package com.thinkitive.entity;

public class AverageScoreDisplay {
    private float runRate;
    private int predictedScore;
    public void update(double run, int wickets, int overs) {
        runRate = (float) (run / overs);

        int totalOvers = 50;
        predictedScore = (int) (runRate * totalOvers);
    }

    public void display() {
        System.out.println("RunRate : " + runRate + "\n"
                + "Predicated Score : " + predictedScore);
    }
}
