import java.util.ArrayList;
import java.util.Random;

public class FarmAnimal {
    private static ArrayList<Integer> serials = new ArrayList<Integer>();
    String animalName;
    int serialNumber = 0;
    public FarmAnimal(String animalName) {
        this.animalName = animalName;
    }

    public FarmAnimal(int serialNumber) {
        // check if serial is in the arrayList
        if (serials.contains(serialNumber)) {
            // create new
        } else {
            this.serialNumber = serialNumber;
        }
        // scramble the serial number
        char[] serialNums = Integer.toString(serialNumber).toCharArray();
        String[] newSerialNums = new String[serialNums.length];

        int count = 0;
        for (int i = 0; i < serialNums.length; i++) {
            int random = new Random().nextInt(serialNums.length);

            newSerialNums[count] = Integer.toString(serialNums[random]);
            count++;
        }

        for (int x = 0; x < newSerialNums.length; x++) {
            System.out.println(newSerialNums[x]);
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
