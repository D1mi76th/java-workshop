package com.vetias.java.workshop.tempdata;

public class Hostel extends Building {
    private boolean isMessAvailable;
    private int NumberofRoom;

    public boolean isMessAvailable() {
        return isMessAvailable;
    }

    public void setMessAvailable(boolean messAvailable) {
        this.isMessAvailable = messAvailable;
    }

    public int getNumberofRoom() {
        return NumberofRoom;
    }

    public void setNumberofRoom(int numberofRoom) {
        this.NumberofRoom = numberofRoom;
    }


}