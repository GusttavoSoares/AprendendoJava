package Arquivos.ForEach.Calculadora;

public class Calculadora {

    public static void arraySum(int[] number){
        int sum = 0;
        for (int num : number){
            sum += num;
        }
        System.out.println(sum);
    }

    public static void sumVarArgs (int... number){
        int sum = 0;
        for (int num : number){
            sum += num;
        }
        System.out.println(sum);
    }

}