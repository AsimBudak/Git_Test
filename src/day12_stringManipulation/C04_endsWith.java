package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        //soru: kullanicidan email adresini girmesini isteyin
        //mail @gmail.com icermiyosa "lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa " email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin" yazdirin

        String email="mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz" );
        } else if (email.endsWith(arananMetin)) {
            System.out.println( "email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol edin" );
        }


    }
}
