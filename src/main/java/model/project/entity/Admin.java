package model.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends User {

    @Column(length = 20)
    private  String details;

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}