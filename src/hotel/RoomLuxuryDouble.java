
package hotel;

public class RoomLuxuryDouble extends Room implements Luxury{
    
    private int roomID;
    private String roomName = "Luxury double room";
    private String typeOfBed = "King size bed";
    private String viewFromRoom = "Sea view";
    private String bathroomUitilities = "Toilet, zink, shower, jacuzzi, towel warmer";
    private String furniture = "Television. Tea kettle. Iron with iron board. Desk and restchair, lounge groop, balcony";
    private String roomDescription = "Room description: " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+"." ;
    private boolean airCondition = true;
    private boolean freeBreakfast = true;
    private boolean isRoomAvailable = true;
    private int chargePerDay = 2000;
    
    @Override
    public void enoyView() {
        System.out.println("Feel free to enter the balcony, where chilled drinks are awaiting you.");
    }

    @Override
    public void startJacuzzi() {
        System.out.println("Welcome home. We have started the jacuzzi for you. Enjoy a relaxing bath.");
    }

    @Override
    public void enjoyLoungeGroup() {
        System.out.println("Aaah, how luxurious. Now you can entertain your guests in this lounge group, fit for a king!");
    }

    @Override
    public String toString() {
        return "RoomLuxuryDouble{" + "roomID=" + roomID + ", roomName=" + roomName + ", typeOfBed=" + typeOfBed + ", viewFromRoom=" + viewFromRoom + ", bathroomUitilities=" + bathroomUitilities + ", furniture=" + furniture + ", roomDescription=" + roomDescription + ", airCondition=" + airCondition + ", freeBreakfast=" + freeBreakfast + ", isRoomAvailable=" + isRoomAvailable + ", chargePerDay=" + chargePerDay + '}';
    }
    
}
