package model.project.projectEntity;

import javax.persistence.*;

@Entity
@Table(name = "vaccination_inventory")
public class VaccinationInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int inventory;

    @OneToOne(mappedBy = "inventory")
    @JoinColumn(name = "centre_id")
    private VaccinationCentre centre;

    public VaccinationInventory(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public VaccinationCentre getCentre() {
        return centre;
    }

    public void setCentre(VaccinationCentre centre) {
        this.centre = centre;
    }
}
