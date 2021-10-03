public class Cylinders {
    Cylinder[] cylinder;

    public Cylinders(int quantity) {
        this.cylinder = new Cylinder[quantity];
    }

    public double getAverageVolume() {
        double volume = 0;
        for (int i = 0; i < cylinder.length; i++) {
            volume += cylinder[i].getVolume();
        }
        int lenght = cylinder.length;
        for (int i = 0; i < cylinder.length; i++) {
            if (cylinder[i].getVolume() < 1) {
                lenght--;
            }
        }
        return volume / lenght;
    }
}
