import java.util.Arrays;
import java.util.Scanner;

public class B1 {
    //Bai1
    static int[] numbers = {1, 5, 8, 6};
        static void loopFor(){
            System.out.println(numbers.length);
            for(int number:numbers){
                System.out.println(number);
            }
        }
        static void loopWhile(){
            int i=0;
            while(i<numbers.length){
                System.out.println(numbers[i]); // Dùng để in giá trị của phần tử trong mảng numbers tại chỉ số i
                i++;
            }
        }
        static void loopDoWhile(){
            int i=0;
            do{
                System.out.println(numbers[i]);
                i++;
            }
            while (i<numbers.length);
            }
    //Bai2
    static int[] twonumbers = {1, 5};
    static void b2Print(){
        for(int twonumber:twonumbers){
            System.out.println(twonumber);
        }
    }
    static void b2tinhTong(){
            int a=0;
            int sum=0;
        while(a<twonumbers.length){
            sum+=twonumbers[a];
            a++;
        }
        System.out.println(sum);
    }
    //Bai3
    static void b3noiChuoi(){
        int a=0;
        String result=Arrays.toString(twonumbers);
        String Chuoi="";
        System.out.println(twonumbers.length);
        while(a<twonumbers.length){
            Chuoi=Chuoi+twonumbers[a];
            a++;
            if(a<=twonumbers.length-1){
                Chuoi=Chuoi+"+";
            }
        }
        System.out.println(Chuoi);
    }
    //Bai4
        static void nhapSoX(){
        int x=0;
        Scanner scanner = new Scanner(System.in);
        while(x<=10){
            System.out.println("Nhap so x");
            x=scanner.nextInt();
        }
        System.out.printf("So x la: %d",x);
        }

        public static void main(String[] args){
            loopFor();
            loopWhile();
            loopDoWhile();
            b2Print();
            b2tinhTong();
            b3noiChuoi();
            nhapSoX();
        }
    }

