import java.lang.reflect.Field;

public class WriteString {

    int a = 10;

    public static void main(String[] args) {
        User user = new User(40, 28, "name");
        WriteString string = new WriteString();
        String str = string.toString(user);
        System.out.println(str);
        System.out.println();
        String str2 = string.toString2(user);
        System.out.println(str2);
    }

    public WriteString() {
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return "";
        }

        Class<?> cls = obj.getClass();

        String name = cls.getSimpleName();

        StringBuilder sb = new StringBuilder(name).append(" (");

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {

            field.setAccessible(true);
            String fldName = field.getName();

        sb.append(fldName).append("=").append(extractFields(field, obj)).append(", ");
            if (obj != null && field.getType().isPrimitive()) {
                System.out.println(field.getName() + " is primitive");
            }
        }
        sb.append(")");

        return sb.toString();
    }

    public static String toString2(Object obj) {

        String objString = null;
        StringBuilder sb = new StringBuilder();

//        System.out.println(obj.getClass().toString());


        if (obj != null && obj.getClass().isPrimitive()) {
            objString = toString2(obj);
            System.out.println(objString);
            sb.append(objString);
//            System.out.println(objString);
        }


        sb.append(objString);

        System.out.println(sb.toString());
////                String objString = toString2(obj);


//        Class<?> cls = obj.getClass();
//        Field[] fields = cls.getDeclaredFields();
//
//        for (Field field : fields) {
//            field.setAccessible(true);
//            if (obj != null && field.getType().isPrimitive()) {
////                String objString = toString2(obj);
//                System.out.println(field.getName() + " is primitive");
//            } else {
//                objString = obj.toString();
//                objString = toString2(field);
//                System.out.println(field.getName() + " (" + objString + ") is not a primitive");
//            }
//
//        }
//            String objString = obj.toString();

        return "";

    }

    private static String extractFields(Field fld, Object obj) {
        String res = "null";

        try {
            Object val = fld.get(obj);
            res = val.toString();
        } catch (IllegalAccessException e) {
            System.err.println("Error " + e.getMessage());
        }

        return res;
    }
}