package ru.living.livingArtifact.dto;

public class ApartmentRepoDTO {

    private String name;
    private long countApartment;
    private short countRooms;

    public ApartmentRepoDTO() {}

    public ApartmentRepoDTO(String name, long countApartment, short countRooms) {
        this.name = name;
        this.countApartment = countApartment;
        this.countRooms = countRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountApartment() {
        return countApartment;
    }

    public void setCountApartment(long countApartment) {
        this.countApartment = countApartment;
    }

    public short getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(short countRooms) {
        this.countRooms = countRooms;
    }

}
