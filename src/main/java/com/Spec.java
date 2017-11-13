package com;

public class Spec {
    private Type type;
    private String model;
    private String used;
    private String country;
    public Spec(Type type, String model, String used, String country) {
        this.type = type;
        this.model = model;
        this.used = used;
        this.country = country;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getUsed() {
        return used;
    }

    public String getCountry() {
        return country;
    }

    public boolean isEqual(Spec other) {
            if (!(other.getModel().equals(this.getModel()))) {
                return false;
            }
            if (!(other.getUsed().equals(this.getUsed()))) {
                return false;
            }
            if (!(other.getType().equals(this.getType()))) {
                return false;
            }
            if (!(other.getCountry().equals(this.getCountry()))) {
                return false;
            }
            return true;
        }

    @Override
    public String toString() {
        return "Spec{"
                + "type="
                + type
                + ", model='"
                + model
                + '\''
                + ", used="
                + used
                + ", country='"
                + country
                + '\''
                + '}';
    }
}
