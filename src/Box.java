public class Box implements  Comparable<Box> {

    private int  number;//номер ящика

    private int  weight;//вес


    public Box (int number, int weight) {
        this.number = number;
        this.weight = weight;
    }
        @Override
        public String toString() {
            return "Номер:  " + number + "  Вес:  " + weight;
    }
    public  int getWeight(){
        int weight=this.weight;
        return weight;
    }

    @Override
    public int compareTo(Box another) {
        if (this.weight == another.weight) {
                return 0;
            } else if (this.weight < another.weight) {
                return -1;
            } else {
                return 1;
            }
        }

}
