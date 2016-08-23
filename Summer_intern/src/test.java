import java.util.Scanner;
 
public class test {
 
    public static void main(String[] args) {
        System.out.println("输入怪的数量: ");
        Scanner in = new Scanner(System.in);
        int gNum = in.nextInt();
       in.next();
        if(gNum<=0||gNum >100000){
            System.out.println("怪物数不能少于0个,且不能多于100000个");
            System.exit(0);
        }
        int[] array = new int[gNum];
        System.out.println("输入小易初始能力值: ");
        int powNum = in.nextInt();
        if(gNum<0){
            System.out.println("生命值输入错误");
            System.exit(0);
        }
        System.out.println("输入怪物的能力值:： ");
        for(int i=0;i<gNum;i++){
            array[i] = in.nextInt();
            if(array[i]<=0){
                System.out.println("怪物生命值输入错误");
                System.exit(0);
            }
        }
         
        for(int i=0;i<gNum;i++){
            powNum = powNum + fight(powNum,array[i]);
        }
        System.out.println("最终生命值为："+ powNum);
        System.exit(0);
 
    }
     
    public static int fight(int i, int j){
            if(i>=j) {
                return j;
            }
            else
                return maxYS(i,j);
    }  
     
    public static int maxYS(int i,int j){
          while (i%j != 0) {  
                int temp = i%j;  
                i = j;  
                j = temp;  
            }
          return j;
    }
 
}