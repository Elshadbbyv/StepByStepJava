package work.javaSE.iktlab.lesson.collection.list.Exception.exercise;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try{
            Integer a  = sc.nextInt();
            Integer b = sc.nextInt();
            try{
                int c = a/b;
                int d = a%b;
                System.out.println("Ededin Qismeti: "+c);
                System.out.println("Qaliq Hisse: "+d);

            }catch (Exception e){
                System.out.println("Bolen 0 ola bilmez");
            }
        }catch (Exception e){
            System.out.println("Tip Yanlisdir");
        }finally {
            System.out.println();

            System.out.println("Emeliyyat basa catdi");
            sc.close();
        }
    }
}
