import Phones.ButtonsPhone;
import Phones.Phone;
import Phones.SensorPhone;
import Phones.ShowCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Phone [] myLinePhones1 = new Phone[6];
//        Phone [] myLinePhones2 = new Phone[6];
//        Phone myPhone1 = new ButtonsPhone("MyButtonPhone", 1997);
//        Phone myPhone2 = new SensorPhone("MySensorePhone", 6.7);
//
//        System.out.println(myPhone1.getInfo());
//        System.out.println(myPhone2.getInfo());

        ShowCase myShowCase = new ShowCase();
        myShowCase.SetMyPhoneToPosition(1, 1, new SensorPhone("Samsung A-10", 6.2));
        myShowCase.SetMyPhoneToPosition(1, 2, new SensorPhone("IPhone-12", 5.6));
        myShowCase.SetMyPhoneToPosition(1, 3, new ButtonsPhone("Motorolla MC55", 2009));
        myShowCase.SetMyPhoneToPosition(1, 4, null);
        myShowCase.SetMyPhoneToPosition(1, 5, new ButtonsPhone("Sony-Ericsson P200", 2007));
        myShowCase.SetMyPhoneToPosition(1, 6, null);

        myShowCase.SetMyPhoneToPosition(2, 1, null);
        myShowCase.SetMyPhoneToPosition(2, 2, new SensorPhone("Samsung Galaxy A13", 6.6));
        myShowCase.SetMyPhoneToPosition(2, 3, null);
        myShowCase.SetMyPhoneToPosition(2, 4, null);
        myShowCase.SetMyPhoneToPosition(2, 5, new SensorPhone("Siemens SX66", 3.5));
        myShowCase.SetMyPhoneToPosition(2, 6, new ButtonsPhone("Nokia 3230", 2004));
        int inputnum=-1;
        int shell, position, num = -1;
        String scan = "";
        Phone newPhone = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("Insert number for your action:");
            System.out.println("1. Show all phones;");
            System.out.println("2. Add phone to the any empty place;");
            System.out.println("3. Add phone to the pointed position;");
            System.out.println("4. Get the phone from the pointed position;\n");
            System.out.println("0. Exit");
            inputnum = scanner.nextInt();
            switch (inputnum){
                case 1:
                    System.out.print("\033[H\033[2J");
                    myShowCase.ShowPhones();
                    System.out.print("Press Enter to next");
                    scan = scanner.next();
                    break;
                case 2:
                    myShowCase.SetMyPhoneIntoFreeSpace(InputPhone());
                    break;
                case 3:
                    newPhone = InputPhone();
                    System.out.print("Input the number of shell (FROM 1 TO 2): ");
                    shell = scanner.nextInt();
                    System.out.print("Input the number of position (FROM 1 TO 6): ");
                    position = scanner.nextInt();
                    myShowCase.SetMyPhoneToPosition(shell, position, newPhone);
                    break;
                case 4:
                    System.out.print("Input the number of shell (FROM 1 TO 2): ");
                    shell = scanner.nextInt();
                    System.out.print("Input the number of position (FROM 1 TO 6): ");
                    position = scanner.nextInt();
                    newPhone = myShowCase.GetPhone(shell, position);
                    break;
            }

        }while (inputnum!=0);
    }

        public static Phone InputPhone(){
        Phone phone = null;
            int year, size, num = -1;
            String scan = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("\033[H\033[2J");
            System.out.print("Input name of a phone: ");
            scan = scanner.next();
            System.out.println("Choose number of type of the phone:");
            System.out.println("1. Phone with buttons;");
            System.out.println("2. Phone with sensor screen.\n");
            System.out.print("Input number of type: ");
            num = scanner.nextInt();
            if (num == 1){
                System.out.print("Input made year of the phone: ");
                year = scanner.nextInt();
                phone = new ButtonsPhone(scan, year);
            } else if (num == 2) {
                System.out.print("Input the made year of the phone: ");
                size = scanner.nextInt();
                phone = new SensorPhone(scan, size);
            }
            else
                System.out.print("You inputted the wrong data!");
            return phone;
        }
    }