public class Ariphmetisc implements CalculatorImpl {

    double result;
    private Calculate tmp;

    public Ariphmetisc(){

       tmp = new Calculate( 0 );

    }

    public void setResult( double result ){
        this.result = result;
    }

    public double getResult(){
        return result;
    }

    @Override
    public double calculate(String operation, Calculate a, Calculate b) {

        switch ( operation ){

             case( "+" ): result = tmp.operPlus( a.getA(), b.getA() );
             break;
             case( "-" ): result =  tmp.operMinus( a.getA(), b.getA() );
             break;
             case( "x" ): result = tmp.operMultiply( a.getA(), b.getA() );
             break;
             case( "/" ): result = tmp.operDivide( a.getA(), b.getA() );
             break;
             case( "x^2" ): result = tmp.xPow( a.getA() );
             break;
             case( "sqrt" ): result = tmp.xSqrt( a.getA() );
             break;
             case( "+/-" ): result = tmp.plusMinus( a.getA() );
             break;
             case( "1/x" ): result = tmp.oneDivx( a.getA() );
             break;
       }

        return result;
    }
    public void addResult( double result ){

        this.result += result;
    }
    public void clearResult(){
        this.result = 0;

    }



}
