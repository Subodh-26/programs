public class constructor {
    String name;
    static String college = "Revature";
    constructor (String name){
        this.name = name;
    }
    constructor (constructor e){
        name = e.name;
    }

    void display(){
        String initials ="A";
        System.out.println("my name is:" +name+","+initials+"----college:"+college);
    }

    public static void main(String[] args) {
        constructor obj = new constructor("Subodh");
        System.out.println(obj.name);

        constructor obj2 = new constructor(obj);
        System.out.println(obj2.name);
        obj.display();
        constructor.college="hms";
        obj2.display();
    }
}
