//package calcproject;

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


    public boolean isParser( String[] arr ) {

        boolean isGo = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != null || arr[i].isEmpty() ) {

                isGo = true;

            } else isGo = false;


        }
        return isGo;
    }

    public double parser( String str ){
        String tmp="";
        String opers = "+-/x";

        for (int i = 0; i < str.length(); i++ ) {
            tmp += str.charAt(i);
            for (int j = 0; j < opers.length(); j++) {
                if ( str.charAt(i) == opers.charAt(j) ) {
                    tmp="";


                } else {
                    System.out.println(tmp);
                    //break;
                }
            }

        }
        return 0;
    }
    public double parser( String[] arr ){

            g.setA( Double.parseDouble( arr[0] ) );
            f.setA( Double.parseDouble( arr[2] ) );
            cs.calculate( arr[1], g, f);

        return cs.result;
    }

    public static void main(String[] args) {
        strParse pr = new strParse();
        pr.parser("9+6+2x9-26");
    }
}
