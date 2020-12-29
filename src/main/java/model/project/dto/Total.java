package model.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Total {
    private int confirmed;
    private int recovered;
    private int deceased;

    public Total() {
    }

    public Total(int confirmed, int recovered, int deceased) {
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deceased = deceased;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeceased() {
        return deceased;
    }

    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }
}
