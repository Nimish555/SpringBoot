package car.example.constructor.injection;

public class car {
    private Specification specification;

    public car(Specification specification) {
        this.specification = specification;
    }

    public void print(){
        System.out.println("car details: " + specification.toString());
    }
}
