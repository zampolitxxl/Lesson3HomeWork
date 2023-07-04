import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Box testBOX1 = new Box(1, 35);
        Box testBOX2 = new Box(2, 22);
        Box testBOX3 = new Box(3, 10);

        Box testBOX4 = new Box(4, 47);
        Box testBOX5 = new Box(5, 5);
        Box testBOX6 = new Box(6, 8);
        Box testBOX7 = new Box(7, 12);

        Box testBOX8 = new Box(8, 19);
        Box testBOX9 = new Box(9, 75);


        Container firstContainer = new Container();

        firstContainer.addBox(testBOX1);
        firstContainer.addBox(testBOX2);
        firstContainer.addBox(testBOX3);

        System.out.println("Первый контейнер  "+ firstContainer);


        Container secondContainer = new Container();

        secondContainer.addBox(testBOX4);
        secondContainer.addBox(testBOX5);
        secondContainer.addBox(testBOX6);
        secondContainer.addBox(testBOX7);

        System.out.println("Второй контейнер  "+ secondContainer);




        Container thirdContainer = new Container();

        thirdContainer.addBox(testBOX8);
        thirdContainer.addBox(testBOX9);

        System.out.println( "Третий контейнер  "+thirdContainer);







        //СЭТ
        Set<Box> personSet = new TreeSet<>();
        personSet.add(testBOX1);
        personSet.add(testBOX2);
        personSet.add(testBOX3);


        System.out.println("СЕТ 1 контейнер"+personSet);





        System.out.println(testBOX2.compareTo(testBOX1));


        //проверка суммы
        //int a=firstContainer.containerSum();

        Set<Container> contSet = new TreeSet<>();
        contSet.add(firstContainer);
        contSet.add(secondContainer);
        contSet.add(thirdContainer);

        System.out.println("СЕТ 3 контейнера"+contSet);


        int a = secondContainer.shelfsSum();
        System.out.println("Ящиков в втором контейнере"+a);


        Set<Container> contSet2 = new TreeSet<>(new ContainerCountComparator());
        contSet2.add(firstContainer);
        contSet2.add(secondContainer);
        contSet2.add(thirdContainer);
        System.out.println("СЕТ  три контецнера компоратор по ящикам"+contSet2);









    }
}