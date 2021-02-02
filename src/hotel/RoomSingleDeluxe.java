//      author C. Carboo

package hotel;

public class RoomSingleDeluxe extends Room implements Deluxe{

    
    public RoomSingleDeluxe() {
        super.setRoomID("");
        super.setAirCondition(true);
        super.setBathroomUitilities(" Toilet, zink, bathtub");
        super.setChargePerDay(2000);
        super.setFurniture(" Air condition. Television. Tea kettle. Iron with iron board. Desk and restchair. Sofabed");
        super.setRoomName("Single deluxe room");
        super.setTypeOfBed(" Queen size bed");
        super.setViewFromRoom(" Sea view");
        super.setRoomDescription(" " + roomName + ". Safe-deposit box,"
            + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+".");
    }

    public RoomSingleDeluxe(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
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

}
