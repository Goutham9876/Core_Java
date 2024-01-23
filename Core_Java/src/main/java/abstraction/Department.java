
abstract class Department {
    int size = 100;
    abstract int getDepartmentSize();
}

class Deptsize extends Department{
    public int getDepartmentSize()
    {
        return size;

    }
}
class Main{
    public static void main(String args[]) {
        Deptsize dept = new Deptsize();
        System.out.println(dept.getDepartmentSize());
    }
}
