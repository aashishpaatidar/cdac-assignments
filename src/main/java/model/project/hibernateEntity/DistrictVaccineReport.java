package model.project.hibernateEntity;

import java.time.LocalDate;

public class DistrictVaccineReport {
    private Integer id;
    private int vaccineVialQuantity;
    private LocalDate requestDate;
    private boolean isActive;
    private District district;
}

// select report from DistrictVaccineReport report where
// report.district.state.stateName = :"MH" and report.isActive = :true;

// select district_reports r where r.beneficiary.address.district = :"xyz";

// quota - 100, inventory - 500, reg - 250;
// date - 8/01/2021
// 9th - 100

// select * district_request where cd = curdate(); = 250
// select * from vacc_centre;
// 100 100
// -> 100  100  9th ///50
// -> 50+50  50     10th
// select * from beneficiary order by appoint_date desc;

// select vc from vaccination_centre vc where vc.do.d_name = "xyz";
// select b from beneficiary b where b.address.district.d_name = "xyz" and is_vcc = true;
// select from beneficiary b group by b.address.district.d_name
// indore = 500
// pune = 2000
//
