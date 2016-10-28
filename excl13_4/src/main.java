// excl_13_4

public class main {

    public static void main(String[] args) {

        int cnt=0;

        for(int i=4;i<=99994;i++){

            String s=String.valueOf(i);
            CharSequence cs1 = "4";
            CharSequence cs2 = "13";

            if((s.contains(cs1)) || (s.contains(cs2))){
                cnt++;
            }

        }
        System.out.println("Нужно исключить "+cnt+" номеров");
    }
}
