package model.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
    private Map<String, District> districts = new HashMap<>();
    private Meta meta;
    private Total total;

    public State() { }

    public State(Map<String, District> districts, Meta meta, Total total) {
        this.districts = districts;
        this.meta = meta;
        this.total = total;
    }

    public Map<String, District> getDistricts() {
        return districts;
    }

    public void setDistricts(Map<String, District> districts) {
        this.districts = districts;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }
}
