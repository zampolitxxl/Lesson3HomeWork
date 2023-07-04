import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box>, Comparable<Container> {
    private List<Box> boxes = new ArrayList<>();

    public void addBox(Box boxeToAdd) {

        boxes.add(boxeToAdd);
    }

    public int containerSum() {
        int sum = 0;
        Iterator var2 = this.iterator();

        while (var2.hasNext()) {
            Box next = (Box) var2.next();
            int weight = next.getWeight();
            sum = sum + weight;
        }
        return sum;
    }
    public int shelfsSum() {
        int sum2 = 0;
        Iterator var3 = this.iterator();

        while (var3.hasNext()) {
            Box next = (Box) var3.next();
            sum2 = sum2 + 1;
        }
        return sum2;
        }

   // }

    @Override
    public Iterator<Box> iterator() {

        return boxes.iterator();
    }


    public int compareTo(Container another) {
        if (containerSum() == another.containerSum()) {
            return 0;
        } else if (containerSum() < another.containerSum()) {
            return -1;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return boxes.toString();
    }
}