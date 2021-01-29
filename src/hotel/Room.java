
/* QUESTIONS
    1) How to autoincrement oblects ID's.? Svar: kolla video @timestamp: 23:00 min: https://youtu.be/CnVp7T-eA5A
    2) How many rooms of each in hotel?
    

*/
package hotel;


public class Room {
    // Superclass/parentclass to all Room classes
        
    private int roomID;
    private String roomName = "Standard single room";
    private String typeOfBed = "Standard single bed";
    private String viewFromRoom = "Pateo view";
    private String bathroomUitilities = "Toilet, zink, shower";
    private String furniture = "Television. Tea kettle. Iron with iron board. Desk and restchair";
    private String roomDescription = "Room description: " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+"." ;
    private boolean airCondition = false;
    private boolean freeBreakfast = true;
    private boolean isRoomAvailable = true;
    private int chargePerDay = 1000;

    public Room() {
    }

    public Room(int roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.typeOfBed = typeOfBed;
        this.airCondition = airCondition;
        this.freeBreakfast = freeBreakfast;
        this.isRoomAvailable = isRoomAvailable;
        this.chargePerDay = chargePerDay;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
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

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
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

    public String getViewFromRoom() {
        return viewFromRoom;
    }

    public void setViewFromRoom(String viewFromRoom) {
        this.viewFromRoom = viewFromRoom;
    }

    public String getBathroomUitilities() {
        return bathroomUitilities;
    }

    public void setBathroomUitilities(String bathroomUitilities) {
        this.bathroomUitilities = bathroomUitilities;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    
    @Override
    public String toString() {
        return "Room{" + "roomID=" + roomID + ", roomName=" + roomName + ", typeOfBed=" + typeOfBed + ", roomDescription=" + roomDescription + ", airCondition=" + airCondition + ", freeBreakfast=" + freeBreakfast + ", isRoomAvailable=" + isRoomAvailable + ", chargePerDay=" + chargePerDay + '}';
    }
    
    
    
}
