package day16_MethodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        String str="valla bu java cok zevkli0";
        for (int i = str.length()-1; i >0 ; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }

}
