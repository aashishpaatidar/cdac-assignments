package model.project.districtDto;

import java.io.IOException;
import java.util.HashMap;

public interface DataMapper {
    HashMap<String, StateData> jsonDataMapperApi() throws IOException;
}
