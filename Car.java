package Car;


class Car {
    private String mark;
    private String type;
    private int tank;
    private Wheel[] wheels = new Wheel[4];

    Car(String mark, String type) {
        this.mark = mark;
        this.type = type;

    }

    void refillCar(double money) {
        tank += money;
    }

    void drive() {

        if (tank != 0) {

            System.out.println("Wi are drive");
            tank--;

        } else {
            System.out.println("You must refillCar , car do not drive in the air !");
        }

    }

    void changeWheel(int position, Wheel wheel) {

        if (position <= 0 || position > 4) {
            System.out.println("Not correct position,  choose position 1 - 4  ");
        }else {
            wheels[position - 1] = wheel;
        }
    }

    void checkWheel() {
        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i] == null) {
                System.out.println("You must set up wheel" + (i + 1));
            }
        }
    }

    @Override
    public String toString() {
        return "Car " +
                "mark - '" + mark + '\'' +
                " type - '" + type + '\'' +
                '}';

    }
}
