//Enter code here
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        StringBuilder str = new StringBuilder(str1);
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                str.deleteCharAt(i+1);
                count++;
                i--;
            }
            else{
                i++;
            }
        }
        if(str.length()%2==1){
            str.deleteCharAt(str.length()-1);
            count++;
        }
        System.out.println(count);
        System.out.println(str);
    }
}
