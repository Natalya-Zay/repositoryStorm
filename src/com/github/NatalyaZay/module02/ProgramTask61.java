package com.github.NatalyaZay.module02;

public class ProgramTask61 {
    public static void main(String[] args) {
        House[] house = new House[8];
        house[0] = new House(2,"Park Avenue",1);
        house[1] = new House(3,"Park Avenue",2,4,"Monolit");
        house[2] = new House(4,"Park Avenue",3,5,5,50,180);
        house[3] = new House(5,"Park Avenue",4,1,8,60,150);
        house[4] = new House(6,"Park Avenue",5,7,11,70);
        house[5] = new House(7,"Park Avenue",6,2,15,80,120);
        house[6] = new House(8,"Park Avenue",7,5,16,90,98);
        house[7] = new House(9,"Park Avenue",8,6,20,100,110);

        House.roomCountInApartment(house);
        System.out.println();
        House.apartmentInFloor(house);
        System.out.println();
        House.apartmentBigArea(house);
    }
}

class House{

    private int numberHouse;
    private String street;
    private int numberApartment;
    private int countRooms;
    private int countFloors;
    private int lifeTime;
    private String buildingType;
    private int area;
    private  House[] house ;

    public House (int numberHouse, String street, int numberApartment){
        this.numberHouse = numberHouse;
        this.street = street;
        this.numberApartment = numberApartment;
    }

    public House (int numberHouse,String street, int numberApartment, int countRooms, String buildingType){
        this.numberHouse = numberHouse;
        this.street = street;
        this.countRooms = countRooms;
        this.buildingType = buildingType;
        this.numberApartment = numberApartment;
    }

    public House (int numberHouse, String street, int numberApartment, int countRooms, int countFloors, int lifeTime){
        this.numberHouse = numberHouse;
        this.street = street;
        this.countRooms = countRooms;
        this.countFloors = countFloors;
        this.lifeTime = lifeTime;
        this.numberApartment = numberApartment;
    }

    public House (int numberHouse, String street, int numberApartment, int countRooms, int countFloors, int lifeTime, int area){
        this.numberHouse = numberHouse;
        this.street = street;
        this.countRooms = countRooms;
        this.countFloors = countFloors;
        this.lifeTime = lifeTime;
        this.numberApartment = numberApartment;
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public int getCountFloors() {
        return countFloors;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public int getArea() {
        return area;
    }

    public int getNumberApartment() {
        return numberApartment;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public House[] getHouse() {
        return house;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public void setCountFloors(int countFloors) {
        this.countFloors = countFloors;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setHouse(House[] house) {
        this.house = house;
    }

    public void setNumberApartment(int numberApartment) {
        this.numberApartment = numberApartment;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberHouse=" + numberHouse +
                ", street='" + street + '\'' +
                ", numberApartment=" + numberApartment +
                ", countRooms=" + countRooms +
                ", countFloors=" + countFloors +
                ", lifeTime=" + lifeTime +
                ", buildingType='" + buildingType + '\'' +
                ", area=" + area +
                '}';
    }

    public static void roomCountInApartment(House[]houses){

        for (int i=0; i< houses.length;i++){
          if (houses[i].countRooms > 3){
              System.out.print(houses[i].numberApartment + " ");
          }
        }
    }

    public static void apartmentInFloor(House[]houses){

        for (int i=0; i< houses.length;i++){
            if (houses[i].countRooms > 3 && houses[i].countFloors > 10 && houses[i].countFloors <= 20){
                System.out.print(houses[i].numberApartment + " ");
            }
        }
    }

    public static void apartmentBigArea(House[]houses){

        for (int i=0; i< houses.length;i++){
            if (houses[i].area > 100){
                System.out.print(houses[i].numberApartment + " ");
            }
        }
    }
}