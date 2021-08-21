package com.senla.model;

import com.senla.util.IdGenerator;

import java.util.List;

public class Room extends AEntity {

    private Long id;
    private Integer number;
    private Integer capacity;
    private RoomStatus status;
    private Guest guests;
    private Double priceRoom;
    private Integer stars;
    private List<Maintenance>roomMaintenance;

    public Room() {

    }
    public Integer getStars() {
        return stars;
    }

    public  RoomStatus roomStatus(){
        return null;
    }


    @Override
    public String toString() {
        return "Room{" +
                "id="+ getId() +
                ", number=" + number +
                ", capacity=" + capacity +
                ", status=" + status +
                ", guests=" + guests +
                ", priceRoom=" + priceRoom +
                ", stars=" + stars +
                '}';
    }

    public Room(Long id, Integer number, Integer capacity, RoomStatus status, Guest guests, Double priceRoom, Integer stars) {
       this.id=id;
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.guests =  guests;
        this.priceRoom=priceRoom;
        this.stars=stars;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public Guest getGuests() {
        return guests;
    }

    public void setGuests(Guest guests) {
        this.guests = guests;
    }

    public Double getPriceRoom() {
         return priceRoom;
}




    @Override
    public void setId(Long id) {
       id = IdGenerator.generateRoomId();
       this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}
