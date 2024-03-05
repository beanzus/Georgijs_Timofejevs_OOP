import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Airbus. Press 2 For Boeing");
        int i = sc.nextInt();

        Airport HTR = new Airport("RIX ","LHR ",2," Business");
        Business heathrow = new Business("RIX ","LHR ",2," Eco",30);
        System.out.println("Press 1 for Economy class. Press 2 for Business class.");
        int j = sc.nextInt();
        Economy heathrow1 = new Economy("RIX ","LHR ",2," Business", 100);
        switch (j) {
            case 1 -> {
                heathrow.classes = "Economy";
                System.out.println(heathrow1.printinfo(100, 50, true, 100));
            }
            case 2 -> {
                heathrow.classes = "Business";
                System.out.println(heathrow.printinfo(2, 1));
            }
        }
        heathrow.classes = "Business";
        System.out.println(heathrow.toString());
        Plane airbus = new Plane("Airbus A320 ",1990, 100, false);
        Plane boeing = new Plane("Boeing 737 ",1995, 100, false);



        System.out.println("Flight rating is "+HTR.rating());
        try {
            FileWriter fw  =new FileWriter("Airport.txt");
            fw.write("\n");
            switch (i) {
                case 1 -> {
                    fw.write(airbus.toString());
                    System.out.println(airbus.toString());
                }
                case 2 -> {
                    fw.write(boeing.toString());
                    System.out.println(boeing.toString());
                }
            }
            switch (j) {
                case 1 -> {
                    fw.write("\n");
                    fw.write(heathrow1.printinfo(100, 50, true, 100));
                }
                case 2 -> {
                    fw.write("\n");
                    fw.write(heathrow.printinfo(2, 1));
                }
            }

            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}