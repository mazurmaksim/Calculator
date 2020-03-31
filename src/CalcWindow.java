 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class CalcWindow extends JFrame {

    private JFrame f;
    private Font butfont;
    private JTextField txtwin;
    private JButton percent;
    private JButton ce;
    private JButton c;
    private JButton del_left;
    private JButton one_div_x;
    private JButton x_pow;
    private JButton x_sqrt;
    private JButton divide;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton multiply;
    private JButton four; 
    private JButton five;    
    private JButton six;
    private JButton minus;
    private JButton one;  
    private JButton two;
    private JButton three;
    private JButton plus;
    private JButton plusminus; 
    private JButton zero;
    private JButton comma;
    private JButton equal;
    private String txtfil = "";
    private Calculate a;
    private Calculate b;
    private Ariphmetisc ar;
    private String operation = "";

    private ActionListener actPlus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        operation = ((JButton) e.getSource()).getText();
        a.setA( Double.parseDouble( txtwin.getText() ) );
        txtwin.setText("");
        txtfil="";

        }
    };

     private ActionListener actX_pow = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             operation = ((JButton) e.getSource()).getText();
             a.setA( Double.parseDouble( txtwin.getText() ) );
             ar.calculate( a.getOperators( operation ), a, b);
             txtwin.setText(String.valueOf( ar.result ) );
         }
     };

     private ActionListener actDivide = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

             operation = ((JButton) e.getSource()).getText();
             a.setA( Double.parseDouble( txtwin.getText() ) );
             txtwin.setText("");
             txtfil="";

         }
     };

     private ActionListener actC = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

             operation = "";
             a.setA( 0 );
             txtwin.setText( "0" );
             b.setA( 0 );
             txtfil="";

         }
     };

     private ActionListener actMinus = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

             operation = ((JButton) e.getSource()).getText();
             a.setA( Double.parseDouble( txtwin.getText() ) );
             txtwin.setText("");
             txtfil="";

         }
     };

     private ActionListener actCe = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {


             b.setA( 0 );
             txtwin.setText( String.valueOf( b.getA() ) );
             txtfil="";

         }
     };

     private ActionListener actMultiply = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

             operation = ((JButton) e.getSource()).getText();
             a.setA( Double.parseDouble( txtwin.getText() ) );
             txtwin.setText("");
             txtfil="";

         }
     };

     private ActionListener actEqual = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

         System.out.print( a.getA());
            System.out.print(" " + operation + " " );
         try {

          b.setA(Double.parseDouble(txtfil));

         } catch (NumberFormatException et){
             b.setA( a.getA() );
         }
         System.out.print(b.getA());
         ar.calculate( a.getOperators( operation ), a, b);
         txtwin.setText(String.valueOf( ar.result ) );
         a.setA( ar.result );
            System.out.println(" = " + ar.result );
            txtfil = "";
        }

    };

    private ActionListener digits = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
             txtwin.setText("");
             txtfil += ((JButton)e.getSource()).getText();
             txtwin.setText( txtfil );

        }
    };

   public CalcWindow(){

    a = new Calculate(0 );
    b = new Calculate(0 );
    ar = new Ariphmetisc();
    f = new JFrame( "Calculator" );
    butfont =  new Font( "Calibri", Font.PLAIN, 30 );

    txtwin = new JTextField( "", 11);
    txtwin.setBounds( 0, 0, 400, 100 );
    txtwin.setFont( new Font( "Calibri", Font.BOLD, 70 ) );
    txtwin.setHorizontalAlignment( txtwin.RIGHT );
    f.add( txtwin );

    percent = new JButton( "%" );
    percent.setBounds( 0, 100, 100, 100 );
    percent.setFont( butfont );
    f.add( percent );

    ce = new JButton( "CE" );
    ce.setBounds( 100, 100, 100, 100 );
    ce.setFont( butfont );
    f.add( ce );

    c = new JButton( "C" );
    c.setBounds( 200, 100, 100, 100 );
    c.setFont( butfont );
    f.add( c );

    del_left = new JButton( "<x" );
    del_left.setBounds( 300, 100, 100, 100 );
    del_left.setFont( butfont );
    f.add( del_left );

    one_div_x = new JButton( "1/x" );
    one_div_x.setBounds( 0, 200, 100, 100 );
    one_div_x.setFont( butfont );
    f.add( one_div_x );

    x_pow = new JButton( "x^2" );
    x_pow.setBounds( 100, 200, 100, 100 );
    x_pow.setFont( butfont );
    f.add( x_pow );

    x_sqrt = new JButton( "sqrt" );
    x_sqrt.setBounds( 200, 200, 100, 100 );
    x_sqrt.setFont( butfont );
    f.add( x_sqrt );

    divide = new JButton( "/" );
    divide.setBounds( 300, 200, 100, 100 );
    divide.setFont( butfont );
    f.add( divide );

    seven = new JButton( "7" );
    seven.setBounds( 0, 300, 100, 100 );
    seven.setFont( butfont );
    f.add( seven );

    eight = new JButton( "8" );
    eight.setBounds( 100, 300, 100, 100 );
    eight.setFont( butfont );
    f.add( eight );

    nine = new JButton( "9" );
    nine.setBounds( 200, 300, 100, 100 );
    nine.setFont( butfont );
    f.add( nine );

    multiply = new JButton( "x" );
    multiply.setBounds( 300, 300, 100, 100 );
    multiply.setFont( butfont );
    f.add( multiply );

    four = new JButton( "4" );
    four.setBounds( 0, 400, 100, 100 );
    four.setFont( butfont );
    f.add( four );

    five = new JButton( "5" );
    five.setBounds( 100, 400, 100, 100 );
    five.setFont( butfont );
    f.add( five );

    six = new JButton( "6" );
    six.setBounds( 200, 400, 100, 100 );
    six.setFont( butfont );
    f.add( six );

    minus = new JButton( "-" );
    minus.setBounds( 300, 400, 100, 100 );
    minus.setFont( butfont );
    f.add( minus );

    one = new JButton( "1" );
    one.setBounds( 0, 500, 100, 100 );
    one.setFont( butfont );
    f.add( one );

    two = new JButton( "2" );
    two.setBounds( 100, 500, 100, 100 );
    two.setFont( butfont );
    f.add( two );

    three = new JButton( "3" );
    three.setBounds( 200, 500, 100, 100 );
    three.setFont( butfont );
    f.add( three );

    plus = new JButton( "+" );
    plus.setBounds( 300, 500, 100, 100 );
    plus.setFont( butfont );
    f.add( plus );

    plusminus = new JButton( "+/-" );
    plusminus.setBounds( 0, 600, 100, 100 );
    plusminus.setFont( butfont );
    f.add( plusminus );

    zero = new JButton( "0" );
    zero.setBounds( 100, 600, 100, 100 );
    zero.setFont( butfont );
    f.add( zero );

    comma = new JButton( "," );
    comma.setBounds( 200, 600, 100, 100 );
    comma.setFont( butfont );
    f.add( comma );

    equal = new JButton( "=" );
    equal.setBounds( 300, 600, 100, 100 );
    equal.setFont( butfont );
    f.add( equal );


    one.addActionListener( digits );
    two.addActionListener( digits );
    three.addActionListener( digits );
    four.addActionListener( digits );
    five.addActionListener( digits );
    six.addActionListener( digits );
    seven.addActionListener( digits );
    eight.addActionListener( digits);
    nine.addActionListener( digits );
    zero.addActionListener( digits );

    x_pow.addActionListener( actX_pow );
    ce.addActionListener( actCe );
    c.addActionListener( actC );
    multiply.addActionListener( actMultiply );
    plus.addActionListener( actPlus );
    minus.addActionListener( actMinus );
    equal.addActionListener( actEqual );
    divide.addActionListener( actDivide );

    f.setSize( 406, 729 );
    f.setLayout( null );
    f.setVisible( true );
    f.setResizable( false );
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
   
   }
 
 }