package calcproject;

public class strParse implements CalculatorImpl{

    private Calculate g;
    private Calculate f;
    Ariphmetisc cs;

    public strParse( ){

        g = new Calculate(0 );
        f = new Calculate(0 );
        cs = new Ariphmetisc();

    }

    @Override
    public double calculate(String operation, Calculate a, Calculate b) {
        return 0;
    }

    public double formulParser( StringBuilder str ){
        Ariphmetisc cs = new Ariphmetisc();
        Calculate s = new Calculate( 0 );
        Calculate t = new Calculate( 0 );
        double result = 0;
        String operation = "'+'";

        String[] tmp = String.valueOf( str ).split(operation);

        for (String j : tmp){
            s.setA( Double.parseDouble( j ) );
            cs.calculate( "+", s, t);
            t.setA( cs.result );
        }


        return cs.result;
    }


}
