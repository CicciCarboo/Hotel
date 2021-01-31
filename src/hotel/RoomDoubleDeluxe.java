//      author C. Carboo
package hotel;

public class RoomDoubleDeluxe extends Room implements Deluxe{

    public RoomDoubleDeluxe() {
        super.setRoomID("");
        super.setAirCondition(true);
        super.setBathroomUitilities("Toilet, zink, bathtub");
        super.setChargePerDay(2000);
        super.setFurniture("Air condition. Television. Tea kettle. Iron with iron board. Desk and restchair. Sofabed");
        super.setRoomName("Double deluxe room");
        super.setTypeOfBed("Two queen sized beds");
        super.setViewFromRoom("Sea view");
        super.setRoomDescription(" " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+".");
    }

    public RoomDoubleDeluxe(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        super(roomID, roomName, typeOfBed, airCondition, freeBreakfast, isRoomAvailable, chargePerDay);
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
//
//    @Override
//    public String toString() {
//        return "DeluxeDoubleRoom{" + "roomID=" + roomID + ", roomName=" + roomName + ", typeOfBed=" + typeOfBed + ", viewFromRoom=" + viewFromRoom + ", bathroomUitilities=" + bathroomUitilities + ", furniture=" + furniture + ", roomDescription=" + roomDescription + ", airCondition=" + airCondition + ", freeBreakfast=" + freeBreakfast + ", isRoomAvailable=" + isRoomAvailable + ", chargePerDay=" + chargePerDay + '}';
//    }
    
    

    
}
