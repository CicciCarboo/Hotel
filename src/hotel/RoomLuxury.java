//      author C. Carboo

package hotel;

public class RoomLuxury extends Room implements Luxury{
    
    public RoomLuxury() {
        super.setRoomID("");
        super.setAirCondition(true);
        super.setBathroomUitilities("Toilet, zink, towel warmer, jacuzzi, sauna");
        super.setChargePerDay(3000);
        super.setFurniture("Air condition. Television. Tea kettle. Iron with iron board. Desk and restchair. Lounge group");
        super.setRoomName("Luxury room");
        super.setTypeOfBed("King size bed");
        super.setViewFromRoom("Sea view");
        super.setRoomDescription(" " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+".");
    }

    public RoomLuxury(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        super(roomID, roomName, typeOfBed, airCondition, freeBreakfast, isRoomAvailable, chargePerDay);
    }
    
    @Override
    public void enoyView() {
        System.out.println("Feel free to enter the balcony, where chilled drinks are awaiting you.");
    }

    @Override
    public void startSauna() {
        System.out.println("Welcome home. We have started the sauna for you. Enjoy a relaxing session in the sauna and cool of in the jacuzzi afterwards.");
    }

    @Override
    public void enjoyLoungeGroup() {
        System.out.println("Aaah, how luxurious. Now you can entertain your guests in this lounge group, fit for a king!");
    }

}
