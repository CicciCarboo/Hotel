
package hotel;

public class RoomDeluxeDouble extends Room implements Deluxe{
//prova att sätta super.whatever först i metoden, läggs sedan till nya variabler    
    private int roomID;
    private String roomName = "Deluxe double room";
    private String typeOfBed = "Queen size bed";
    private String viewFromRoom = "Sea view";
    private String bathroomUitilities = "Toilet, zink, bathtub";
    private String furniture = "Television. Tea kettle. Iron with iron board. Desk and restchair. Sofabed.";
    private String roomDescription = "Room description: " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+"." ;
    private boolean airCondition = true;
    private boolean freeBreakfast = true;
    private boolean isRoomAvailable = true;
    private int chargePerDay = 1500;

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
    
    
    @Override
    public void closeCurtins() {
        System.out.println("Welcome home. The curtins are closed automatically.");
    }

    @Override
    public void startAirCondition() {
        if(airCondition == true)
        System.out.println("Enjoy your air condition.");
    }

    @Override
    public void startTV() {
        System.out.println("The TV is on. Use the remote control to choose your favorite channel.");
    }

    @Override
    public String toString() {
        return "DeluxeDoubleRoom{" + "roomID=" + roomID + ", roomName=" + roomName + ", typeOfBed=" + typeOfBed + ", viewFromRoom=" + viewFromRoom + ", bathroomUitilities=" + bathroomUitilities + ", furniture=" + furniture + ", roomDescription=" + roomDescription + ", airCondition=" + airCondition + ", freeBreakfast=" + freeBreakfast + ", isRoomAvailable=" + isRoomAvailable + ", chargePerDay=" + chargePerDay + '}';
    }
    
    

    
}
