// Write a program to crate custom wrapper class

// Wrapper Class 
class Maximum {
    private int maxi = 0;
    private int size = 0;

    public void insert(int value) {
        this.size++;
        if (value > this.maxi) {
            this.maxi = value;
        }
    }

    public int getTopNumber() {
        return this.maxi;
    }

    public int getElementNumber() {
        return this.size;
    }
};

public class CustomWrapperClasses {
    public static void main(String[] args) {
        Maximum x = new Maximum();
        x.insert(2);
        x.insert(24);
        x.insert(6);

        System.out.println("Max number is " + x.getTopNumber());
        System.out.println("Number of element inserted " + x.getElementNumber());
    }
}