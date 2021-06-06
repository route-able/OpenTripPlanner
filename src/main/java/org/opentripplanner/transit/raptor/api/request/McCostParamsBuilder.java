package org.opentripplanner.transit.raptor.api.request;


import org.opentripplanner.openstreetmap.OSMSmoothness;

import gnu.trove.map.TObjectDoubleMap;

/**
 * Mutable version of the {@link McCostParams}.
 */
@SuppressWarnings("UnusedReturnValue")
public class McCostParamsBuilder {
    private int boardCost;
    private int transferCost;
    private double[] transitReluctanceFactors;
    private double walkReluctanceFactor;
    private double waitReluctanceFactor;
    private TObjectDoubleMap<String> surfaceReluctanceFactors;
    private OSMSmoothness minSmoothness;


    McCostParamsBuilder(McCostParams defaults) {
        this.boardCost = defaults.boardCost();
        this.transferCost = defaults.transferCost();
        this.transitReluctanceFactors = defaults.transitReluctanceFactors();
        this.walkReluctanceFactor = defaults.walkReluctanceFactor();
        this.waitReluctanceFactor = defaults.waitReluctanceFactor();
        this.surfaceReluctanceFactors = defaults.surfaceReluctanceFactors();
        this.minSmoothness = defaults.minSmoothness();
    }

    public int boardCost() {
        return boardCost;
    }

    public McCostParamsBuilder boardCost(int boardCost) {
        this.boardCost = boardCost;
        return this;
    }

    public int transferCost() {
        return transferCost;
    }

    public McCostParamsBuilder transferCost(int transferCost) {
        this.transferCost = transferCost;
        return this;
    }

    public double[] transitReluctanceFactors() {
        return transitReluctanceFactors;
    }

    public McCostParamsBuilder transitReluctanceFactors(double[] transitReluctanceFactors) {
        this.transitReluctanceFactors = transitReluctanceFactors;
        return this;
    }

    public double walkReluctanceFactor() {
        return walkReluctanceFactor;
    }

    public McCostParamsBuilder walkReluctanceFactor(double walkReluctanceFactor) {
        this.walkReluctanceFactor = walkReluctanceFactor;
        return this;
    }

    public double waitReluctanceFactor() {
        return waitReluctanceFactor;
    }

    public McCostParamsBuilder waitReluctanceFactor(double waitReluctanceFactor) {
        this.waitReluctanceFactor = waitReluctanceFactor;
        return this;
    }

    public TObjectDoubleMap<String> surfaceReluctanceFactors() {
        return surfaceReluctanceFactors;
    }

    public McCostParamsBuilder surfaceReluctanceFactors(TObjectDoubleMap<String> surfaceReluctanceFactors) {
        this.surfaceReluctanceFactors = surfaceReluctanceFactors;
        return this;
    }

    public OSMSmoothness minSmoothness() {
        return minSmoothness;
    }

    public McCostParamsBuilder minSmoothness(OSMSmoothness minSmoothness) {
        this.minSmoothness = minSmoothness;
        return this;
    }
}
