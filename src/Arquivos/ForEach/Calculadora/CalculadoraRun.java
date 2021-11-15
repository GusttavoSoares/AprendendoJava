package Arquivos.ForEach.Calculadora;

public class CalculadoraRun {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int[] numbers = {1,2,3,4,5}; // or int[] numbers = new int[] {1,2,3,4,5};
        calc.arraySum(numbers);
        calc.sumVarArgs(1,2,3,4,5); // I can put values separated by commas, on the top only the array
    }
}
