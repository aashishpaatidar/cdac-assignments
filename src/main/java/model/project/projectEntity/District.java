package model.project.projectEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "district_name", length = 30)
    private String districtName;

    @OneToMany(mappedBy = "district")
    private List<DistrictOffice> districtOffice = new ArrayList<>();

    @OneToMany(mappedBy = "userDistrict")
    private List<Address> addresses = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    public District() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<DistrictOffice> getDistrictOffice() {
        return districtOffice;
    }

    public void setDistrictOffice(List<DistrictOffice> districtOffice) {
        this.districtOffice = districtOffice;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
