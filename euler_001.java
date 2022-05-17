import java.util.*;

class test {
    public static void main(String[] args) {
        
        // keep track of sum
        int sum=0, lim=1000;

        // add multiples of 5 ignoring multiples of 3
        for(int i=0;i<lim;i+=5){
            if(i%3!=0)sum+=i;
        }
        
        // add all multiples of 3
        for(int i=0;i<lim;i+=3){
            sum+=i;
        }
        System.out.println(sum);
    }
}