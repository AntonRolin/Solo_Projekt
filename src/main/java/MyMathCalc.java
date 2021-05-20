/**
 * Created by: Anton Rolin
 * Date: 17/05/2021
 * Time: 15:15
 * Project: springdocker
 * Copyright: MIT
 */
public class MyMathCalc {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
  
    public double divide(int a, int b){
        if(b != 0) {
            return a/b;
        }
        else {
            throw new ArithmeticException();
        }
    }
}
