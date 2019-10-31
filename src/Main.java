import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String riceChoose="";
    public static String meatChoose="";
    public static String beanChoose="";
    public static String salsaChoose="";
    public static String veggieChoose="";
    public static String cheeseChoose="";
    public static String guacChoose="";
    public static String quesoChoose="";
    public static String sourCreamChoose="";

    public static String ExRiceChoose="";
    public static String ExMeatChoose="";
    public static String ExBeanChoose="";
    public static String ExSalsaChoose="";
    public static String ExVeggieChoose="";
    public static String ExCheeseChoose="";
    public static String ExGuacChoose="";
    public static String ExQuesoChoose="";
    public static String ExSourCreamChoose="";

    public static double TotalCost=0;
    public static double Cost=0;
    public static double extraCost=0;

    public static int whitericeCount=0;
    public static int brownriceCount=0;
    public static int chickenCount=0;
    public static int steakCount=0;
    public static int carnitasCount=0;
    public static int chorizoCount=0;
    public static int sofritasCount=0;
    public static int veggiesCount=0;
    public static int blackbeansCount=0;
    public static int pintobeansCount=0;
    public static int mildsalsaCount=0;
    public static int medslasaCount=0;
    public static int hotsalsaCount=0;
    public static int fajitasCount=0;
    public static int lettuceCount=0;
    public static int cheeseCount=0;
    public static int guacCount=0;
    public static int quesoCount=0;
    public static int sourcreamCount=0;


    public static void main(String args[]) {


        Scanner key=new Scanner(System.in);
       System.out.println("Hey! How man burritos do you want?");
       int num=key.nextInt();
       int i=0;
       while(num>0) {
           Cost=0;
           extraCost=0;
           Rice();
           Meat();
           Bean();
           Salsa();
           Veggies();
           Cheese();
           Guac();
           Queso();
           SourCream();
           Burrito(num, riceChoose, meatChoose, beanChoose, salsaChoose, veggieChoose, cheeseChoose, guacChoose, quesoChoose, sourCreamChoose, ExRiceChoose, ExMeatChoose, ExBeanChoose, ExSalsaChoose, ExVeggieChoose, ExCheeseChoose, ExGuacChoose, ExQuesoChoose, ExSourCreamChoose);
           num--;
           System.out.println();
       }
        System.out.println();
       Summary(  whitericeCount, brownriceCount, chickenCount, steakCount, carnitasCount, chorizoCount, sofritasCount, veggiesCount, blackbeansCount, pintobeansCount, mildsalsaCount, medslasaCount, hotsalsaCount, fajitasCount, lettuceCount, cheeseCount, guacCount, quesoCount, sourcreamCount,TotalCost);
    }

    public static String Rice(){
        String[] arr={"white rice", "brown rice", "no rice"};
        Random r=new Random();
        int random=r.nextInt(3);
        riceChoose=arr[random];
        int random2=1+r.nextInt(10);
        int random3=r.nextInt(2);
        if(random2<3){
        ExRiceChoose=arr[random3];
        extraCost+=0.5;
        }
        return riceChoose;
    }
    public static String Meat(){
        String[] arr={"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "no meat"};
        Random r=new Random();
        int random=r.nextInt(7);
        meatChoose=arr[random];
        int random2=1+r.nextInt(10);
        int random3=r.nextInt(6);
        if(random2<3){
            ExMeatChoose=arr[random3];
            extraCost+=0.5;
        }
        return meatChoose;
    }
    public static String Bean(){
        String[] arr={"pinto bean","black bean", "no bean"};
        Random r=new Random();
        int random=r.nextInt(3);
        beanChoose=arr[random];
        int random2=1+r.nextInt(10);
        int random3=r.nextInt(2);
        if(random2<3){
            ExBeanChoose=arr[random3];
            extraCost+=0.5;
        }
        return beanChoose;
    }
    public static String Salsa(){
        String[] arr={"mild", "medium", "hot", "no salsa"};
        Random r=new Random();
        int random=r.nextInt(4);
        salsaChoose=arr[random];
        int random2=1+r.nextInt(10);
        int random3=r.nextInt(3);
        if(random2<3){
            ExSalsaChoose=arr[random3];
            extraCost+=0.5;
        }
        return salsaChoose;
    }
    public static String Veggies(){
        String[] arr={"lettuce", "fajita veggies", "no Veggie"};
        Random r=new Random();
        int random=r.nextInt(3);
        veggieChoose=arr[random];
        int random2=1+r.nextInt(10);
        int random3=r.nextInt(2);
        if(random2<3){
            ExVeggieChoose=arr[random3];
            extraCost+=0.5;
        }
        return veggieChoose;
    }
    public static String Cheese(){
        String[] arr={"cheese","no"};
        Random r=new Random();
        int random=r.nextInt(2);
        cheeseChoose=arr[random];
        int random2=1+r.nextInt(10);

        if(random2<3){
            ExCheeseChoose=arr[0];
            extraCost+=0.5;
        }
        return cheeseChoose;
    }
    public static String Guac(){
        String[] arr={"guac","no"};
        Random r=new Random();
        int random=r.nextInt(2);
        guacChoose=arr[random];
        int random2=1+r.nextInt(10);

        if(random2<3){
            ExGuacChoose=arr[0];
            extraCost+=0.5;
        }
        return guacChoose;
    }
    public static String Queso(){
        String[] arr={"queso","no"};
        Random r=new Random();
        int random=r.nextInt(2);
        quesoChoose=arr[random];
        int random2=1+r.nextInt(10);

        if(random2<3){
            ExQuesoChoose=arr[0];
            extraCost+=0.5;
        }
        return quesoChoose;
    }
    public static String SourCream(){
        String[] arr={"sour cream","no"};
        Random r=new Random();
        int random=r.nextInt(2);
        sourCreamChoose=arr[random];
        int random2=1+r.nextInt(10);

        if(random2<3){
            ExSourCreamChoose=arr[0];
            extraCost+=0.5;
        }
        return sourCreamChoose;
    }


    public static void Burrito(int number,String input1, String input2, String input3, String input4, String input5, String input6, String input7,String input8,String input9,String input10,String input11, String input12, String input13, String input14, String input15, String input16, String input17,String input18) {


        System.out.print("Burrito "+ number +": " + input1 + ", " + input2 + ", " + input3 + ", " + input4 + ", " + input5 + ", " );
        String[] list={ input6, input7 , input8, input9};
        for(String l:list){
            if (!l.equalsIgnoreCase("no")){
                System.out.print(l);
                System.out.print(", ");
            }

        }

        String[] list2={  input10, input11, input12, input13, input14, input15, input16, input17, input18};
        System.out.print("  Extras : " );
        for(String m:list2){
            if (!m.equalsIgnoreCase("")){
                System.out.print(m);
                System.out.print(", ");
            }

        }

        String[] list3={  input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13, input14, input15, input16, input17, input18};
        for(String s:list3){
            switch(s){
                case "white rice":
                    whitericeCount+=1;
                    break;
                case "brown rice":
                    brownriceCount+=1;
                    break;
                case "chicken":
                    chickenCount+=1;
                    break;
                case "steak":
                    steakCount +=0;
                    break;
                case "carnitas":
                    carnitasCount+=1;
                     break;
                case "chorizo":
                    chorizoCount+=1;
                     break;
                case "sofritas":
                     sofritasCount+=1;
                     break;
                case "veggies":
                    veggiesCount+=1;
                    break;
                case "black bean":
                    blackbeansCount+=1;
                    break;
                case "pinto bean":
                    pintobeansCount+=1;
                    break;
                case "mild":
                    mildsalsaCount+=1;
                    break;
                case "medium":
                    medslasaCount+=1;
                    break;
                case "hot":
                    hotsalsaCount +=0;
                    break;
                case "fajita veggies":
                    fajitasCount+=1;
                    break;
                case "lettuce":
                    lettuceCount+=1;
                    break;
                case "cheese":
                    cheeseCount+=1;
                    break;
                case "guac":
                    guacCount+=1;
                    break;
                case "queso":
                    quesoCount+=1;
                    break;
                case "sour cream":
                    sourcreamCount+=1;
                    break;


            }
        }
        Cost=3+extraCost;
        TotalCost+=Cost;
        System.out.print("   " + Cost);
    }
    public static void Summary(int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num11,int num12,int num13,int num14,int num15,int num16,int num17,int num18,int num19,double num20){
       System.out.println("This order has "+num1+" white rice,"+num2+ " brown rice,"+num3+ " chicken,"+num4+  " steak,"+num5+ " carnitas," +num6+" chorizo,"+num7+

                " sofritas,"+num8+ " veggies(as meat option),"+num9+ " black beans,"+num10+ " pinto beans,"+num11+ " mild salsa," +num12+" med salsa,"+num13+ " hot salsa,"

               +num14+ " fajitas," +num15+ " lettuce,"+num16+ " cheese," +num17+" guac,"+num18+" queso," +num19+ " sour cream, and the sum is " +num20);
    }

}