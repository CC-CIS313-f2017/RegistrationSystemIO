package com.company;

public class Graduate extends Student{
    public static final double MINGPA = 3;
    public static final int MAX_BELOW_C = 4;
    private int below_c;

    public Graduate(String studId, String lastName, String firstName) {
        super(studId, lastName, firstName);
        below_c = 0;
    }

    public int getBelow_c() {
        return below_c;
    }

    public void incrementBelow_c(){
        below_c++;
    }

    @Override
    public double getMingpa() {
        return MINGPA;
    }

    @Override
    public boolean isInGoodStanding() {
        return super.isInGoodStanding() && (below_c < MAX_BELOW_C);
    }
}
