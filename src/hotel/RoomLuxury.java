//      author C. Carboo

package hotel;

public class RoomLuxury extends Room implements Luxury{
    
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
    
    public RoomLuxury() {
        super.setRoomID("");
        super.setAirCondition(true);
        super.setBathroomUitilities(" Toilet, zink, towel warmer, jacuzzi, sauna");
        super.setChargePerDay(3000);
        super.setFurniture(" Air condition. Television. Tea kettle. Iron with iron board. Desk and restchair. Lounge group");
        super.setRoomName("Luxury room");
        super.setTypeOfBed(" King size bed");
        super.setViewFromRoom(" Sea view");
        super.setRoomDescription(" " + roomName + ". Safe-deposit box,"
             + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+".");
    }

    public RoomLuxury(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        super(roomID, roomName, typeOfBed, airCondition, freeBreakfast, isRoomAvailable, chargePerDay);
    }
    
    @Override
    public void enjoyView() {
        System.out.println(ANSI_GREEN+"\nFeel free to enter the balcony, where chilled drinks are awaiting you."+ANSI_RESET);
    }

    @Override
    public void startSauna() {
        System.out.println(ANSI_YELLOW+"\nWelcome home. We have started the sauna for you. Enjoy a relaxing session in the sauna and cool of in the jacuzzi afterwards."+ANSI_RESET);
    }

    @Override
    public void enjoyLoungeGroup() {
        System.out.println(ANSI_PURPLE+"\nAaah, how luxurious. Now you can entertain your guests in this lounge group, fit for a king!"+ANSI_RESET);
    }

}
