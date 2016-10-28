// digits

public class main {

    public static void main(String[] args) {
        String h = new String();
        String m = new String();
        int cnt = 0;

        for (int i=0;i<24;i++) {

            if (i <= 9) {
                h = "0" + (String.valueOf(i));
            } else h = (String.valueOf(i));
            //   System.out.println(h);

            for (int n=0;n<60;n++) {
                if (n<=9)  {
                    m = "0"+(String.valueOf(n));
                } else m = (String.valueOf(n));
                //    System.out.println(m);

                String reverse = new StringBuffer(h).reverse().toString();
                if (new String(reverse).equals(m)) {
                    cnt++;
                    System.out.println(h + " : " + m);
                }

            }
        }
        System.out.println("Количество совпадений : " + cnt);
    }
}