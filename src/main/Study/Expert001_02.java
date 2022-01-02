public class Expert001_02 {
}

public interface Tire {
    String getBrand();
}

public class KoreaTire implements Tire {
    public String getBrand(){
        return "코리아 타이어";
    }
}

public class AmericaTire implements Tire {
    public String getBrand(){
        return "미국 타이어";
    }
}

public class Car {
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        //Tire tire = new AmericaTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}

