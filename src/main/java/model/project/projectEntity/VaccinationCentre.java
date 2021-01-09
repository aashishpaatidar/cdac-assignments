package model.project.projectEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vaccination_centre")
public class VaccinationCentre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "centre_name", length = 12)
    private String centreName;

    @ManyToOne
    @JoinColumn(name = "district_office_id")
    private DistrictOffice districtOffice;

    @OneToMany(mappedBy = "centre")
    private List<Beneficiary> beneficiaryList = new ArrayList<>();

    @OneToOne
    private VaccinationInventory inventory;


    public VaccinationCentre() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public DistrictOffice getDistrictOffice() {
        return districtOffice;
    }

    public void setDistrictOffice(DistrictOffice districtOffice) {
        this.districtOffice = districtOffice;
    }

    public List<Beneficiary> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(List<Beneficiary> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }

    public VaccinationInventory getInventory() {
        return inventory;
    }

    public void setInventory(VaccinationInventory inventory) {
        this.inventory = inventory;
    }

}
