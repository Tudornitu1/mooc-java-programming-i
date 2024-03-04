public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        count++;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        } else {
            return (double) this.sum / this.count;
        }
    }
}