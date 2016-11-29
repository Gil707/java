/**
 * Created by Gil on 16-Nov-16.
 */
public class List {

    private Integer value;
    private List next;

    public List(int value, List next) {
        this.value = value;
        this.next = next;
    }

    public void add (Integer i) {
        if (this.value == null) {
            value = i;
        } else {
            next.add(i);
        }
    }

//    public void remove (Integer i);
//    public void print ();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public void setNext(List next) {
        this.next = next;
    }


}
