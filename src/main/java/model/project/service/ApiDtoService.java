package model.project.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import model.project.dto.State;
import java.net.URL;
import java.util.HashMap;

public class ApiDtoService {

    public HashMap<String, State> loadJsonData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory typeFactory = mapper.getTypeFactory();
        MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, State.class);
        return mapper.readValue(new URL("https://api.covid19india.org/v4/data.json"), mapType);
    }

}
