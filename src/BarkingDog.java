public class BarkingDog {

    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        if (isDogBarking && hourOfDay < 0) {
            return false;
        } else if (isDogBarking && hourOfDay < 8) {
            return true;
        } else if (isDogBarking && hourOfDay == 23) {
            return true;
        }

        return false;
    }
}
