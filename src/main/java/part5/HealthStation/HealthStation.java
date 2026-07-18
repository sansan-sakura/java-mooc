
public class HealthStation {
    private int countWeighings;


    public int weigh(Person person) {
        countWeighings = countWeighings + 1;
        // return the weight of the person passed as the parameter

        return person.getWeight();

    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);

    }

    public int weighings(){
        return countWeighings;
    }

}
