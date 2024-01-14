package Phones;
import java.lang.Thread;

public class ShowCase {
    private Phone [] [] myPhones;

    public ShowCase(){
        this.myPhones = new Phone[2][6];
    }

    public void SetMyPhoneIntoFreeSpace (Phone myPhone){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                if (myPhones[i][j] == null) {
                    myPhones[i][j] = myPhone;
                    System.out.println("The phone pointed to the position!");
                    return;
                }
            }
        }
        System.out.println("All space is already full!");
    }

    public void SetMyPhoneToPosition(int shell, int position, Phone newPhone) {
        if (shell < 3 && shell > 0 && position > 0 && position < 7) {
            if (myPhones[shell - 1][position - 1] == null) {
                myPhones[shell - 1][position - 1] = newPhone;
                System.out.println("The phone pointed to the position!");
            }
            else
                System.out.println("The position is already full of the phone: " + myPhones[shell - 1][position - 1]);
        }
        else
            System.out.println("You inputted the wrong data!");
    }

    public Phone GetPhone (int shell, int position){
        Phone takePhone = new Phone("", "");
        if (shell < 3 && shell > 0 && position > 0 && position < 7) {
            if (myPhones[shell - 1][position - 1] != null) {
                takePhone = myPhones[shell - 1][position - 1];
                System.out.println("Name of phone: "+takePhone.getName() + " type of phone: "+takePhone.getType());
                myPhones[shell - 1][position - 1] = null;
                return takePhone;
            }
            else
                System.out.println("The position is empty!");
        }
        else
            System.out.println("You inputted the wrong data!");
        return null;
    }

    public void ShowPhones (){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                if (myPhones[i][j] != null) {
                    System.out.println("Shell-"+(i+1)+" Position-"+(j+1)+"  Phone name:" + myPhones[i][j].getName() + ", type: "+myPhones[i][j].getType());
                }
                else
                    System.out.println("Shell-"+(i+1)+" Position-"+(j+1)+"_______________EMPTY_________________");
            }
        }
    }
}
