package model.project.dto;

import model.project.service.ApiDtoService;

public class JsonTester {

    public static void main(String[] args) throws Exception {
        State st = new State();
        ApiDtoService api = new ApiDtoService();

        int confirmed = api.loadJsonData().get("MP")
                .getDistricts()
                .entrySet()
                .stream()
                .filter(i -> i.getKey().equals("Indore"))
                .map(k -> k.getValue().getTotal().getConfirmed())
                .iterator().next();

        System.out.println(confirmed);

        long startTime = System.nanoTime();
        //Execution time in milliseconds : 4840
        long sum = api.loadJsonData()
                .values()
                .stream()
                .mapToInt(state -> state.getDistricts()
                        .values()
                        .stream()
                        .map(d -> d.getTotal().getConfirmed())
                        .reduce(0,Integer::sum)).sum();

        System.out.println(sum); //10208713
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

    }
}

