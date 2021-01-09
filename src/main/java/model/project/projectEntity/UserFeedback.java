package model.project.projectEntity;

import javax.persistence.*;

@Entity
@Table(name = "user_feedback")
public class UserFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "adverse_effects", length = 50)
    private String adverseEffects;

    @Column(length = 200)
    private String details;

    @OneToOne
    @JoinColumn(name = "beneficiary_id")
    private Beneficiary beneficiary;

    public UserFeedback() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdverseEffects() {
        return adverseEffects;
    }

    public void setAdverseEffects(String adverseEffects) {
        this.adverseEffects = adverseEffects;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

}
