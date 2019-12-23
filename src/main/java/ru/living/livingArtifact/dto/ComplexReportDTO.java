package ru.living.livingArtifact.dto;

public class ComplexReportDTO {
    private String name;
    private int studioApartmentCount;
    private int oneRoomApartmentCount;
    private int twoRoomApartmentCount;
    private int threeRoomApartmentCount;
    private int fourRoomApartmentCount;

    public ComplexReportDTO() {}

    public ComplexReportDTO(String name, int studioApartmentCount, int oneRoomApartmentCount, int twoRoomApartmentCount, int threeRoomApartmentCount, int fourRoomApartmentCount) {
        this.name = name;
        this.studioApartmentCount = studioApartmentCount;
        this.oneRoomApartmentCount = oneRoomApartmentCount;
        this.twoRoomApartmentCount = twoRoomApartmentCount;
        this.threeRoomApartmentCount = threeRoomApartmentCount;
        this.fourRoomApartmentCount = fourRoomApartmentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudioApartmentCount() {
        return studioApartmentCount;
    }

    public void setStudioApartmentCount(int studioApartmentCount) {
        this.studioApartmentCount = studioApartmentCount;
    }

    public int getOneRoomApartmentCount() {
        return oneRoomApartmentCount;
    }

    public void setOneRoomApartmentCount(int oneRoomApartmentCount) {
        this.oneRoomApartmentCount = oneRoomApartmentCount;
    }

    public int getTwoRoomApartmentCount() {
        return twoRoomApartmentCount;
    }

    public void setTwoRoomApartmentCount(int twoRoomApartmentCount) {
        this.twoRoomApartmentCount = twoRoomApartmentCount;
    }

    public int getThreeRoomApartmentCount() {
        return threeRoomApartmentCount;
    }

    public void setThreeRoomApartmentCount(int threeRoomApartmentCount) {
        this.threeRoomApartmentCount = threeRoomApartmentCount;
    }

    public int getFourRoomApartmentCount() {
        return fourRoomApartmentCount;
    }

    public void setFourRoomApartmentCount(int fourRoomApartmentCount) {
        this.fourRoomApartmentCount = fourRoomApartmentCount;
    }

}
