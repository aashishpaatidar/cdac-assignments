package model.project.districtDto;

import java.io.IOException;

public class MainTester {
    public static void main(String[] args) throws IOException {
        JsonParserApi api = new JsonParserApi();

        long startTime = System.nanoTime();

        //Execution time in milliseconds : 4812
        int sum = api.jsonDataMapperApi()
                .values()
                .stream()
                .mapToInt(i -> i.getDistrictData()
                        .values()
                        .stream()
                        .map(DistrictData::getConfirmed)
                        .reduce(0, Integer::sum)).sum();

        System.out.println(sum); //10208713
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

        int activeCases = api.jsonDataMapperApi()
                .get("Rajasthan")
                .getDistrictData()
                .entrySet()
                .stream()
                .filter(i -> i.getKey().equals("Jaipur"))
                .map(k -> k.getValue().getActive())
                .iterator().next();

        System.out.println(activeCases);
    }
}
