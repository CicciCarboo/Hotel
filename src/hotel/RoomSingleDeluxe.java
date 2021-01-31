/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author cicci
 */
public class RoomSingleDeluxe extends Room implements Deluxe{

    
    public RoomSingleDeluxe() {
        super.setRoomID("");
        super.setAirCondition(true);
        super.setBathroomUitilities("Toilet, zink, bathtub");
        super.setChargePerDay(2000);
        super.setFurniture("Air condition. Television. Tea kettle. Iron with iron board. Desk and restchair. Sofabed");
        super.setRoomName("Single deluxe room");
        super.setTypeOfBed("Queen size bed");
        super.setViewFromRoom("Sea view");
        super.setRoomDescription(" " + roomName + ". The room comes with a safe for your passport,"
            + " money etc. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+".");
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
