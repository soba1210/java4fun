public class HW1task2 {
public static void main(String[] params){
//2) Найти среди 3х чисел максимальное и минимальное
int num = Integer.parseInt(params[0]);
int num1 = Integer.parseInt(params[1]);
int num2 = Integer.parseInt(params[2]);
if (num <= num1 && num <= num2){
System.out.println("Минимальное число "+ num);
} else {
if (num1 <= num2){
System.out.println("Минимальное число " + num1);
} else {
System.out.println("Минимальное число " + num2);
}
}
if (num >= num1 && num >= num1){
System.out.println("Максимальное число "+ num);
}else{
if (num1 >= num2){
System.out.println("Максимальное число " + num1);
}else{
System.out.println("Максимальное число " + num2);
}
}
}
}
