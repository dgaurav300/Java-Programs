package hashing;

public class HashingExample {
    static int generateHash(String key)
    {
        int hash=0;
        key=key.toLowerCase();
       for(int i=0;i<key.length();i++)
       {
          if(key.charAt(i)=='a')
             hash=hash+1+i;
          if(key.charAt(i)=='b')
             hash=hash+2+i;
          if(key.charAt(i)=='c')
             hash=hash+3+i;
          if(key.charAt(i)=='d')
             hash=hash+4+i;
             if(key.charAt(i)=='e')
             hash=hash+5+i;
             if(key.charAt(i)=='f')
             hash=hash+6+i;
             if(key.charAt(i)=='g')
             hash=hash+7+i;
             if(key.charAt(i)=='h')
             hash=hash+8+i;
             if(key.charAt(i)=='i')
             hash=hash+9+i;
             if(key.charAt(i)=='j')
             hash=hash+10+i;
             if(key.charAt(i)=='k')
             hash=hash+11+i;
             if(key.charAt(i)=='l')
             hash=hash+12+i;
             if(key.charAt(i)=='m')
             hash=hash+13+i;
             if(key.charAt(i)=='n')
             hash=hash+14+i;
             if(key.charAt(i)=='o')
             hash=hash+15+i;
             if(key.charAt(i)=='p')
             hash=hash+16+i;
             if(key.charAt(i)=='q')
             hash=hash+17+i;
             if(key.charAt(i)=='r')
             hash=hash+18+i;
             if(key.charAt(i)=='s')
             hash=hash+19+i;
             if(key.charAt(i)=='t')
             hash=hash+20+i;
             if(key.charAt(i)=='u')
             hash=hash+21+i;
             if(key.charAt(i)=='v')
             hash=hash+22+i;
             if(key.charAt(i)=='w')
             hash=hash+23+i;
             if(key.charAt(i)=='x')
             hash=hash+24+i;
             if(key.charAt(i)=='y')
             hash=hash+25+i;
             if(key.charAt(i)=='z')
             hash=hash+26+i;
          
       }
       return hash;
    }
    public static void main(String[] args) {
        String names[]=new String[10000];

        int pos=generateHash("akash");
        System.out.println(pos);
        names[pos]="akash";

        System.out.println(names[generateHash("akash")]);
       
        
        

    }
}
