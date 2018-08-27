/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourteeners;

/**
 *
 * @author bryan
 */
public class Mountain {

    private String name;
    private int elevation;
    private int elevationFactor;
    private int exposure;
    private int exposureFactor;
    private int elevationGain;
    private int elevationGainFactor;
    private int roundTripDistance;
    private int roundTripDistanceFactor;
    private int technicalRating;
    private int technicalRatingFactor;
    private int totalDifficulty;

    public Mountain() {
        name = "NoNameGiven";
        elevation = 1;
        elevationFactor = 1;
        exposure = 1;
        exposureFactor = 1;
        elevationGain = 1;
        elevationGainFactor = 1;
        roundTripDistance = 1;
        roundTripDistanceFactor = 1;
        technicalRating = 1;
        technicalRatingFactor = 1;
        totalDifficulty = 1;
    }

    public Mountain(String nm, int el, int e, int eG, int rTD, int tR) {
        name = nm;
        elevation = el;
        elevationFactor = 1;
        exposure = e;
        exposureFactor = 400;
        elevationGain = eG;
        elevationGainFactor = 1;
        roundTripDistance = rTD;
        roundTripDistanceFactor = 10;
        technicalRating = tR;
        technicalRatingFactor = 400;
        setTotalDifficulty();
    }

    public Mountain(String nm, int el, int elF, int e, int eF, int eG, int eGF, int rTD, int rTDF, int tR, int tRF) {
        name = nm;
        elevation = el;
        elevationFactor = elF;
        exposure = e;
        exposureFactor = eF;
        elevationGain = eG;
        elevationGainFactor = eGF;
        roundTripDistance = rTD;
        roundTripDistanceFactor = rTDF;
        technicalRating = tR;
        technicalRatingFactor = tRF;
        setTotalDifficulty();
    }

    /**
     * @return the exposure
     */
    public int getExposure() {
        return exposure;
    }

    /**
     * @param exposure the exposure to set
     */
    public void setExposure(int exposure) {
        this.exposure = exposure;
    }

    /**
     * @return the exposureFactor
     */
    public int getExposureFactor() {
        return exposureFactor;
    }

    /**
     * @param exposureFactor the exposureFactor to set
     */
    public void setExposureFactor(int exposureFactor) {
        this.exposureFactor = exposureFactor;
    }

    /**
     * @return the roundTripDistance
     */
    public int getRoundTripDistance() {
        return roundTripDistance;
    }

    /**
     * @param roundTripDistance the roundTripDistance to set
     */
    public void setRoundTripDistance(int roundTripDistance) {
        this.roundTripDistance = roundTripDistance;
    }

    /**
     * @return the roundTripDistanceFactor
     */
    public int getRoundTripDistanceFactor() {
        return roundTripDistanceFactor;
    }

    /**
     * @param roundTripDistanceFactor the roundTripDistanceFactor to set
     */
    public void setRoundTripDistanceFactor(int roundTripDistanceFactor) {
        this.roundTripDistanceFactor = roundTripDistanceFactor;
    }

    /**
     * @return the technicalRating
     */
    public int getTechnicalRating() {
        return technicalRating;
    }

    /**
     * @param technicalRating the technicalRating to set
     */
    public void setTechnicalRating(int technicalRating) {
        this.technicalRating = technicalRating;
    }

    /**
     * @return the technicalRatingFactor
     */
    public int getTechnicalRatingFactor() {
        return technicalRatingFactor;
    }

    /**
     * @param technicalRatingFactor the technicalRatingFactor to set
     */
    public void setTechnicalRatingFactor(int technicalRatingFactor) {
        this.technicalRatingFactor = technicalRatingFactor;
    }

    /**
     * @return the totalDifficulty
     */
    public int getTotalDifficulty() {
        setTotalDifficulty();
        return totalDifficulty;
    }

    /**
     */
    public void setTotalDifficulty() {
        totalDifficulty = (elevation * elevationFactor) + (exposure * exposureFactor) + (elevationGain * elevationGainFactor) + (roundTripDistance * roundTripDistanceFactor) + (technicalRating * technicalRatingFactor);
    }

    /**
     * @return the elevation
     */
    public int getElevation() {
        return elevation;
    }

    /**
     * @param elevation the elevation to set
     */
    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    /**
     * @return the elevationFactor
     */
    public int getElevationFactor() {
        return elevationFactor;
    }

    /**
     * @param elevationFactor the elevationFactor to set
     */
    public void setElevationFactor(int elevationFactor) {
        this.elevationFactor = elevationFactor;
    }

    /**
     * @return the elevationGain
     */
    public int getElevationGain() {
        return elevationGain;
    }

    /**
     * @param elevationGain the elevationGain to set
     */
    public void setElevationGain(int elevationGain) {
        this.elevationGain = elevationGain;
    }

    /**
     * @return the elevationGainFactor
     */
    public int getElevationGainFactor() {
        return elevationGainFactor;
    }

    /**
     * @param elevationGainFactor the elevationGainFactor to set
     */
    public void setElevationGainFactor(int elevationGainFactor) {
        this.elevationGainFactor = elevationGainFactor;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
