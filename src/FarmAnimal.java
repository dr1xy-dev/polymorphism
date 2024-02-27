public class FarmAnimal {
    String animalName;
    int serialNumber = 0;
    public FarmAnimal(String animalName) {
        this.animalName = animalName;
    }

    public FarmAnimal(int serialNumber) {
        // generate serial number

        for (int x = 0; x < 4; x++) {
            double random = Math.random();
            random.randIn
        }
        this.serialNumber = serialNumber;
    }

    public void dispay() {
        if (animalName == null) {
            System.out.println(serialNumber);
        } else {
            System.out.println(animalName);
        }
    }

}
