package model.project.projectEntity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "address", length = 50)
    private String userAddress;

    @ManyToOne
    @JoinColumn
    private District userDistrict;

    public Address() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public District getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(District userDistrict) {
        this.userDistrict = userDistrict;
    }
}
