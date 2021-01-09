package model.project.hibernateEntity;

import java.util.HashSet;
import java.util.Set;

public class State {

    private Integer id;
    private String stateName;
    private final Set<District> districtSet = new HashSet<>();
}
