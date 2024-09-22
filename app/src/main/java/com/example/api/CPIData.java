package com.example.api;

import androidx.annotation.NonNull;

public class CPIData {
    private String country;
    private String type;
    private String period;
    private double monthly_rate_pct;
    private double yearly_rate_pct;

    // Getters and setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getMonthly_rate_pct() {
        return monthly_rate_pct;
    }

    public void setMonthly_rate_pct(double monthly_rate_pct) {
        this.monthly_rate_pct = monthly_rate_pct;
    }

    public double getYearly_rate_pct() {
        return yearly_rate_pct;
    }

    public void setYearly_rate_pct(double yearly_rate_pct) {
        this.yearly_rate_pct = yearly_rate_pct;
    }

    @NonNull
    @Override
    public String toString() {
        return "CPIData{" +
                "country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", period='" + period + '\'' +
                ", monthly_rate_pct=" + monthly_rate_pct +
                ", yearly_rate_pct=" + yearly_rate_pct +
                '}';
    }
}
