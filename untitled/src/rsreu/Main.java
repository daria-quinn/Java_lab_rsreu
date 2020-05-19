package rsreu;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Trip trip = Trip.builder()
                .type(Trip.Type.HIKING)
                .startTime(LocalTime.of(random.nextInt(4), random.nextInt(60)))
                .speedInKmH(random.nextDouble() * 4)
                .targetLocation(possibleLocations.stream()
                        .filter(l -> l.getTerrain().getType() == Terrain.Type.FIELD)
                        .findFirst().get()
                )
                .participant(me)
                .participant(me.getHouseHold().getDomesticAnimals().stream()
                        .filter(a -> a.getSex() == Sex.MALE)
                        .filter(a -> a.getShoes() != null
                                && a.getShoes().getMaterial() == Material.IRON)
                        .findFirst().get()
                ).build();
    }
}
