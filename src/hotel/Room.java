
package hotel;


public class Room {
    // Superclass/parentclass to all room classes
        
    String roomID;
    String roomName;
    String typeOfBed;
    boolean airCondition;
    boolean freeBreakfast;
    boolean isRoomAvailable;
    int chargePerDay;

    public Room() {
    }

    public Room(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.typeOfBed = typeOfBed;
        this.airCondition = airCondition;
        this.freeBreakfast = freeBreakfast;
        this.isRoomAvailable = isRoomAvailable;
        this.chargePerDay = chargePerDay;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public boolean isFreeBreakfast() {
        return freeBreakfast;
    }

    public void setFreeBreakfast(boolean freeBreakfast) {
        this.freeBreakfast = freeBreakfast;
    }

    public boolean isIsRoomAvailable() {
        return isRoomAvailable;
    }

    public void setIsRoomAvailable(boolean isRoomAvailable) {
        this.isRoomAvailable = isRoomAvailable;
    }

    public int getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }
    
    
    
}
