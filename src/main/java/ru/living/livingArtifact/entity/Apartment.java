package ru.living.livingArtifact.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="apartment")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="complex_id")
    private Complex complex;

    @Column(name = "rooms_cnt")
    private short roomsCnt;

    public Apartment(){}

    public Complex getComplex() {
        return complex;
    }

    public void setComplex(Complex complex) {
        this.complex = complex;
    }

    public short getRoomsCnt() {
        return roomsCnt;
    }

    public void setRoomsCnt(short roomsCnt) {
        this.roomsCnt = roomsCnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment)) return false;
        Apartment apartment = (Apartment) o;
        return id == apartment.id &&
                getRoomsCnt() == apartment.getRoomsCnt() &&
                Objects.equals(getComplex(), apartment.getComplex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getComplex(), getRoomsCnt());
    }
}
