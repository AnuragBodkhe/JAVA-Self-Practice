package ConditionalStatements;

public class if_else_else_if4 {
    public static void main(String[] args){
        int marks = 89;

        if(marks>=90 && marks<=100){
            System.out.println("A");
        }else if(marks>=75 && marks<90){
            System.out.println("B");
        }else if(marks>=60 && marks<75){
            System.out.println("C");
        }else if(marks<=40 && marks<60){
            System.out.println("D");
        }else{
            System.out.println("Fail");
        }
    }
}
