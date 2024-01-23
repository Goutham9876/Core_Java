package Abstraction;

class Maximum {
    public int mathFun(int a, int b) {
        return Math.max(a, b);
    }
}

// Child class
class Minimum extends Maximum {
    // Overridden Method
    public int mathFun(int a, int b) {
        return Math.min(a, b);
    }
}

class Average extends Maximum {
    // Overridden Method
    public int mathFun(int a, int b) {
        int Ave = (a + b) / 2;
        return Ave;
    }
}

public class Aggregation {
    public static void main(String args[]) {
        Maximum obj1 = new Minimum();
        Maximum obj2 = new Average();
        System.out.println(obj1.mathFun(6, 4)); // Output: 4 (returns the minimum value)
        System.out.println(obj2.mathFun(6, 4)); // Output: 5 (average of 6 and 4)
    }
}
