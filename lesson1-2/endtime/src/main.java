import com.sun.org.apache.xpath.internal.SourceTree;

public class main {

    public static void main(String[] args) {

        double sec = Math.random()*28800;
        int t = (int)sec;

        System.out.println(t);
        getend(t);
    }

    static void getend(int time) {
        String ends = "";
        String endh = "";
        time = (int)time/3600;
        switch (time) {
            case 8:
            case 7:
            case 6:
            case 5:
                ends = "ось "; endh = " часов"; break;

            case 4:
            case 3:
            case 2:
                ends = "ось "; endh = " часа"; break;

            case 1:
                ends = "ся "; endh = " чаc"; break;

            case 0:
                ends = "ось "; endh = " менее часа"; break;

        }

        System.out.print("Остал" + ends);
                if (time != 0) System.out.print(time);
        System.out.println(endh);;
    }
}
