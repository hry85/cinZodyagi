import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogumTarihi, kalan;
        String cinZodyagi =" ";

        Scanner sc=new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        dogumTarihi= sc.nextInt();

        if(dogumTarihi%12==0){
            cinZodyagi="Maymun";
        }else if(dogumTarihi%12==1){
            cinZodyagi="Horoz";
        }else if (dogumTarihi%12==2){
            cinZodyagi="Kopek";
        }else if (dogumTarihi%12==3){
            cinZodyagi="Domuz";
        }else if (dogumTarihi%12==4){
            cinZodyagi="Fare";
        }else if (dogumTarihi%12==5){
            cinZodyagi="Okuz";
        }else if (dogumTarihi%12==6){
            cinZodyagi="Kaplan";
        }else if (dogumTarihi%12==7){
            cinZodyagi="Tavsan";
        }else if (dogumTarihi%12==8){
            cinZodyagi="Ejderha";
        }else if (dogumTarihi%12==9){
            cinZodyagi="Yilan";
        }else if (dogumTarihi%12==10){
            cinZodyagi="At";
        } else if (dogumTarihi % 12 == 11) {
            cinZodyagi="Koyun";
        }else {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz. ");
        }
        System.out.println("if else ile bulma");
        System.out.println("Cin zodyagi burcunuz : " +cinZodyagi);
        System.out.println("------------------------------------");

        kalan=dogumTarihi%12;

        switch (kalan){
            case 0:
                cinZodyagi="Maymun";
                break;
            case 1:
                cinZodyagi="Horoz";
                break;
            case 2:
                cinZodyagi="Kopek";
                break;
            case 3:
                cinZodyagi="Domuz";
                break;
            case 4:
                cinZodyagi="Fare";
                break;
            case 5:
                cinZodyagi="Okuz";
                break;
            case 6:
                cinZodyagi="Kaplan";
                break;
            case 7:
                cinZodyagi="Tavsan";
                break;
            case 8:
                cinZodyagi="Ejderha";
                break;
            case 9:
                cinZodyagi="Yilan";
                break;
            case 10:
                cinZodyagi="At";
                break;
            case 11:
                cinZodyagi="Koyun";
                break;
            default:
                System.out.println("Hatali giris yaptiniz , lutfen tekrar giriniz.");
        }
        System.out.println("Switch case ile bulma");
        System.out.println("Cin zodyagi burcu : " +cinZodyagi);

    }
}
