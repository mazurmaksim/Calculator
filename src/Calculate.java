//package calcproject;

import java.math.BigDecimal;

public class Calculate{

   private double a;
   private String[] operators = {"+", "-", "=", "x", "/", "C", "x^2", "sqrt","+/-", "1/x"};

   public Calculate( double a ){
     this.a = a;
   }

   public String getOperators( String operator ){
      for( String op : operators ){
       if( operator.equals( op ) ){
        return op;
         }
      }
     return "";
   }

   public double plusMinus( double a ){

       return a*(-1);
   }
   public double operPlus( double a, double b ){
       BigDecimal k = BigDecimal.valueOf(a);
       BigDecimal r = BigDecimal.valueOf(b);
       BigDecimal c = k.add(r);
       return  c.doubleValue();
   }

   public double xPow( double a ){
       BigDecimal k = BigDecimal.valueOf(a);
       BigDecimal r = BigDecimal.valueOf(a);
       BigDecimal c = r.multiply(k);
       return  c.doubleValue();

   }

   public double xSqrt( double a ){
      return Math.sqrt( a );
     }

   public double operMultiply( double a, double b ){
       BigDecimal k = BigDecimal.valueOf(a);
       BigDecimal r = BigDecimal.valueOf(b);
       BigDecimal c = k.multiply(r);
       return  c.doubleValue();
   }

   public double oneDivx( double a ){
      // BigDecimal k = BigDecimal.valueOf(1.0);
      // BigDecimal r = BigDecimal.valueOf(a);
       //BigDecimal c = k.divide(r, RoundingMode.UP);
       //return  c.doubleValue();
        return 1/a;
   }

   public double operMinus( double a, double b ){
       BigDecimal k = BigDecimal.valueOf(a);
       BigDecimal r = BigDecimal.valueOf(b);
       BigDecimal c = k.subtract(r);
    return  c.doubleValue();
   }

   public double percent( double b){
       return 0;
   }

   public double operDivide( double a, double b){
       return a/b;
   }

   public void setA( double a ){
       this.a = a;
  }

   public double getA(){
   return a;
   }


 } 