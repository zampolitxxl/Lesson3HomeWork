import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {


    @Override
    public int compare(Container o1, Container o2) {
        if (o1.shelfsSum() == o2.shelfsSum()) {
            return 0;
        } else if (o1.shelfsSum() < o2.shelfsSum()) {
            return -1;
        } else {
            return 1;
        }  }
}

