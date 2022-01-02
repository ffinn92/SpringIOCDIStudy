public class Expert001_03 {
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

    public Tire getTIre() {
        return tire;
    }

    public void setTire(Tire tire){
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}

