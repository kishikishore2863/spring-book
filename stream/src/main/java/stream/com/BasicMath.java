package stream.com;

public class BasicMath {

    public static void main(String[] args) {

//        int num = 0;
//        int count = 0;
//        if(num == 0 ){
//            System.out.println(1);
//        }else {
//            while (num > 0) {
//                count++;
//                num = num / 10;
//            }
//            System.out.println(count);
//        }



//        int num1 = 5627;
//        int count1 =0;
//        while(num1>0){
//            int digit = num1%10;
//            if(digit%2 != 0){
//                count1++;
//            }
//            num1 = num1/10;
//        }
//        System.out.println(count1);



        int num =25 ;
        int reverse=0;
        while (num>0){
            int digit = num%10;
            reverse =reverse*10+digit;
            num = num/10;
        }
        System.out.println(reverse);

    }
}
