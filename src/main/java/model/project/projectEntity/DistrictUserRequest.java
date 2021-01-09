package model.project.projectEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "district_user_request")
public class DistrictUserRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "current_request_date")
    private LocalDate currentDate;

    @Column(name = "request_status")
    private boolean requestStatus;

    @OneToOne
    @JoinColumn(name = "beneficiary_id")
    private Beneficiary districtBeneficiary;

    public DistrictUserRequest() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public boolean isRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(boolean requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Beneficiary getDistrictBeneficiary() {
        return districtBeneficiary;
    }

    public void setDistrictBeneficiary(Beneficiary districtBeneficiary) {
        this.districtBeneficiary = districtBeneficiary;
    }
}
