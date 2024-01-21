public class Main {



    public static void main(String[] args) {

        System.out.println("Foot     Meters");
        System.out.println("----------------");

        for(double i = 1; i < 11; i++){
            System.out.println(i + "     " + footToMeter(i));
        }

        System.out.println("\n\n\nMeters     Foot");
        System.out.println("----------------");

        for(double i = 20; i <= 65; i+=5){
            System.out.println(i + "     " + meterToFoot(i));
        }

    }

    public static double footToMeter(double foot){
        return foot * 0.305d;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

}

