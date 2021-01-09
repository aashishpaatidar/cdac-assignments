package model.project.projectEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "district_office")
public class DistrictOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "office_name", length = 30)
    private String officeName;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    @OneToMany(mappedBy = "districtOffice")
    private List<VaccinationCentre> centres = new ArrayList<>();

    public DistrictOffice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<VaccinationCentre> getCentres() {
        return centres;
    }

    public void setCentres(List<VaccinationCentre> centres) {
        this.centres = centres;
    }
}
