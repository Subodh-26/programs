
class arithmatic{
    void area(int length,int breadth){

        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
class calculate extends arithmatic{
    void volume(int side){
        int volume = side * side * side;
        System.out.println("Volume of cube: " + volume);
    }
        }


public class InheritanceExample {
    public static void main(String[] args) {
        int breadth = 5;
        int length = 4;
        arithmatic obj = new arithmatic();
        obj.area(length,breadth);
        calculate obj1 = new calculate();
        int side = 4;
        obj1.volume(side);
       // obj1.area();
    }
}

