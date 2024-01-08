public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("--------------------");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("--------------------");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("--------------------");

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("--------------------");

        System.out.println(areaCircle(5.0));
        System.out.println(areaCircle(-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) {
            return false;
        }

        if (barking && (hour < 8 || hour > 20)) {
            return true;
        }

        return false;
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        return (13 <= num1 && num1 <= 19)
                || (13 <= num2 && num2 <= 19)
                || (13 <= num3 && num3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){
        int upperLimit = (isSummer) ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    public static double area(double uzunKenar, double kısaKenar){
        if(uzunKenar < 0 || kısaKenar < 0) {
            return -1;
        }
        else {
            return kısaKenar * uzunKenar;
        }
    }

    public static double areaCircle(double radius){
        if(radius < 0) {
            return -1;
        }
        else {
          return radius * radius * Math.PI;
        }
    }
}