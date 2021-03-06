package api.dtos;

import api.entities.Stadium;
import org.jetbrains.annotations.NotNull;

public class StadiumDto {
    private String name;
    private int capacity;
    private boolean covered;

    public StadiumDto(String name, int capacity, boolean covered) {
        this.name = name;
        this.capacity = capacity;
        this.covered = covered;
    }

     public StadiumDto (@NotNull Stadium stadium){
        this(stadium.getName(), stadium.getCapacity(), stadium.isCovered());
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StadiumDto{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", covered=" + covered +
                '}';
    }
}
