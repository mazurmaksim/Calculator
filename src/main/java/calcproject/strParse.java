package calcproject;

public class strParse {
   private String k = "1.3+2.567*3.7-15/6+";

   public static double parseString( String str ){

        String operatios = "+-*/";
        double result = 0;
        double tmp = 0;
        String tmpnum = "";
        String operator = "";
        //String[] arr = new String[3];

        for ( int i=0;i<str.length(); i++ ){

            for ( int j=0; j< operatios.length();j++){

                if ( str.charAt( i ) == operatios.charAt( j ) )
                {
                    //System.out.println( str.charAt( i ));
                    tmpnum="";
                    operator = String.valueOf(str.charAt( i ));

                }
                else if ( str.charAt( i ) != operatios.charAt( j ) ){
                    tmpnum += str.charAt(i);
                    System.out.print( tmpnum + "\n" );
                    break;
                }

                tmpnum = "";


            }

        }

        return 0;
   }

    public static void main(String[] args) {
        parseString( "1.3+2.567*3.7-15/6+" );
    }
}
