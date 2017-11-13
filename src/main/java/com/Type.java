package com;

public enum Type {
    SENSOR, SLIDER, BUTTONS;

    public  String toString() {
        switch (this){
            case SENSOR:return "Sensor";
            case SLIDER:return "Slider";
            case BUTTONS:return "Buttons";
            default: return "No such model";
        }
    }
}
