package model.project.hibernateEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StateVaccineOrders {
    private Integer id;
    private LocalDate orderDate;
    private final List<DistrictVaccineReport> districtReport = new ArrayList<>();

}
