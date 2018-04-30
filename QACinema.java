package QACinema;

import java.util.Scanner;

public class QACinema {
            
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner( System.in );
        
        int total;
        
        int stq;
        int stp = 8; // 8 subbed in as couldn't call class value//
        int pricest;
                
        System.out.print("How Many Standard\'s ? ");
        stq = stdin.nextInt();
        pricest = stq * stp;
       
        int oapq;
        int oapp = 6; // 6 subbed in as couldn't call class value//
        int priceoap;
                
        System.out.print("How Many OAP\'s ? ");
        oapq = stdin.nextInt();
        priceoap = oapq * oapp;      
        
        int stuq;
        int stup= 6; // 6 subbed in as couldn't call class value//
        int pricestu;
                
        System.out.print("How Many Student\'s ? ");
        stuq = stdin.nextInt();
        pricestu = stuq * stup;
        
        int cq;
        int cp = 4; // 4 subbed in as couldn't call class value//
        int pricec;
                
        System.out.print("How Many Child\'s ? ");
        cq = stdin.nextInt();
        pricec = cq * cp;
        
        total = pricest + priceoap + pricestu + pricec;
        
        System.out.printf( "%d + %d + %d + %d = £%d  1", pricest, priceoap, pricestu, pricec, total );
                    
    }
}
