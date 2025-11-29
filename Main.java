public class Main{
    public static void main(String[] args){
        for (int i = 0 ; i< 10 ; i++){
            System.out.println("Number is : "  + (i + 1));
        }
        String my_name = "shahbaz";
        System.out.println(my_name.length());
        int age = 19;
        // func(my_name , age);
        System.out.println(func(my_name , age));
        cat.dingDong();
    }
    private static int func(String name , int age){
        // System.out.println("My name is : " + name + " and my age is : " + age);
        // System.out.println(age);
        System.out.println(name);
        return age;
    }
}