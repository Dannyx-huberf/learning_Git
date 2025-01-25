import java.util.Scanner;
public class test{
    public static void main(String[] args){
        System.out.print("Enter your name:  ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Enter your age:  ");
        int age = input.nextInt();
        
        if(age > 0 && age < 9 ){
            System.out.println("You are a child "+name);
        }
        else if(age>9 && age <18){
            System.out.println("You are a teen "+name);
        }
        else if(age>18 && age<40){
            System.out.println("You are an aldut "+name);
        }
        else if(age>40 && age < 150){
            System.out.println("You are an elderly fellow "+name);
        }else{
            System.out.println(name+" You be Ghost🤣");
        }
        System.out.println("In the next two years "+name+" will be "+(age+2)+" years old");
    }
}
