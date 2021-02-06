//      author C. Carboo

package hotel;

public class RoomSingleDeluxe extends Room implements Deluxe{
    
    // <editor-fold defaultstate="collapsed" desc=" Colorcodes ">
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
// </editor-fold>
    
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
        System.out.println(ANSI_YELLOW+"\nWelcome home. The curtins are closed automatically."+ANSI_RESET);
    }

    @Override
    public void startAirCondition() {
        if(airCondition == true)
        System.out.println(ANSI_GREEN+"\nEnjoy your air condition."+ANSI_RESET);
    }

    @Override
    public void startTV() {
        System.out.println(ANSI_PURPLE+"\nThe TV is on. Use the remote control to choose your favorite channel."+ANSI_RESET);
    }

}
