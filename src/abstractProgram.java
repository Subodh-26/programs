abstract class animal {
    abstract void sleep();

    void sound() {
        System.out.println("Sound");
    }
}

class demo1 extends animal {
    void sleep() {
        System.out.println("Sleep method");
    }
}

public class abstractProgram {
    public static void main(String[] args) {
        demo1 obj = new demo1();
        obj.sleep();
        obj.sound();
    }
}
