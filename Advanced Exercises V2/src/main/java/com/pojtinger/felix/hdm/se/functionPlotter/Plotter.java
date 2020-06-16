package com.pojtinger.felix.hdm.se.functionPlotter;

public interface Plotter {
    void setYResolution(int yResolution);

    void setXResolution(int xResolution);

    void setXLimit(double xLimit);

    void setYMultiplier(double yMultiplier);

    String getGraph(PlotterYCalculator yCalc);
}