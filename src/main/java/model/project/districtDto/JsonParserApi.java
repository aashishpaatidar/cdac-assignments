package model.project.districtDto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class JsonParserApi {
    public HashMap<String, StateData> jsonDataMapperApi() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory typeFactory = mapper.getTypeFactory();
        MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, StateData.class);
        return mapper.readValue(new URL("https://api.covid19india.org/state_district_wise.json"), mapType);
    }
}
