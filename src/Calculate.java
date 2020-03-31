 public class Calculate{

   private double a;
   private String[] operators = {"+", "-", "=", "x", "/", "C", "x^2"};

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

   public double operPlus( double a, double b ){
    return a + b;
   }

   public double xPow( double a ){
       return Math.pow( a, 2 );
   }

   public double operMultiply( double a, double b ){
       return a * b;
   }

   public double operMinus( double a, double b ){
    return  a - b;
   }

   public double percent( double b){
       return 0;
   }

   public double operDivide( double a, double b){
       return a/b;
   }

   public double onedevide(double d){
       return 0;
   }

   public void setA( double a ){
       this.a = a;
  }

   public double getA(){
   return a;
   }

 } 