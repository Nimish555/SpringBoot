package car.example.constructor.injection;

public class Specification {
    private String Model;
    private String Type;

    public String getModel() {
        return Model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "Model='" + Model + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
