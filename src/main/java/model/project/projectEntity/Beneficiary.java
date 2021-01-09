package model.project.projectEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String name;

    private int age;

    @Column(name = "is_vaccinated")
    private boolean isVaccinated;

    @Column(name = "adhaar_no", length = 12, unique = true)
    private String adhaarNumber;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "beneficiary")
    private List<Appointment> appointments = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "centre_id")
    private VaccinationCentre centre;

    @OneToOne(mappedBy = "districtBeneficiary")
    private DistrictUserRequest request;

    public Beneficiary() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public VaccinationCentre getCentre() {
        return centre;
    }

    public void setCentre(VaccinationCentre centre) {
        this.centre = centre;
    }

    public DistrictUserRequest getRequest() {
        return request;
    }

    public void setRequest(DistrictUserRequest request) {
        this.request = request;
    }
}
