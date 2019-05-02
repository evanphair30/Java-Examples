//Evan Phair			
//10/18/2015		
//Lab 1			
//Baseball

//Test Suite
//atbats = 700;walks= 100;singles= 0;doubles = 0;triples = 0;Homers = 0;Hitbypitch= 0;sacrificeflies= 0;battingaverage=0;onbaseavg=0;sluggingpercentage=0;OPS=0;
//atbats = 273;walks= 39;singles= 0;doubles = 0;triples = 0;Homers = 0;Hitbypitch= 0;sacrificeflies= 0;battingaverage=0;onbaseavg=0;sluggingpercentage=0;OPS=0;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;



public class Baseball extends Frame implements ActionListener
{

private static final long serialVersionUID = 6785359783698851103L;
private Button btnCalculate;
private TextField atbats1 = new TextField(10);
private TextField walks1 = new TextField(10);
private TextField singles1 = new TextField(10);    
private TextField doubles1 = new TextField(10);
private TextField triples1 = new TextField(10);    
private TextField Homers1 = new TextField(10);  
private TextField Hitbypitch1 = new TextField(10);  
private TextField sacrificeflies1 = new TextField(10);  
private TextField battingaverage1 = new TextField(10);  
private TextField onbaseavg1 = new TextField(10);  
private TextField sluggingpercentage1 = new TextField(10);  
private TextField OPS1 = new TextField(10);  

//processing variables
int atbats = 0;
int walks= 0;
int singles= 0;
int doubles = 0;
int triples = 0;
int Homers = 0;
int Hitbypitch= 0;
int sacrificeflies= 0;
float battingaverage=0;
float onbaseavg=0;
float sluggingpercentage=0;
float OPS=0;



public Baseball ()
{
    setTitle ("Baseball -- Lab Sample");
    setLayout ( new FlowLayout ());

    add(new Label("atbats"));
    add( atbats1);
    add(new Label("walks"));
    add( walks1);
    add(new Label("singles"));
    add( singles1);
    add(new Label ("doubles"));
    add( doubles1);
    add(new Label ("triples"));
    add( triples1);
    add(new Label ("Homers"));
    add( Homers1);
    add(new Label ("Hitbypitch"));
    add( Hitbypitch1);
    add(new Label ("sacrificeflies"));
    add( sacrificeflies1);

    btnCalculate = new Button("Calculate");
    add (btnCalculate);
    btnCalculate.addActionListener(new CalculateHandler(this));

    add(new Label("Batting average is"));
    add( battingaverage1);
    add(new Label("on base avg is"));
    add( onbaseavg1);
    add(new Label("slugging percentage is"));
    add( sluggingpercentage1);
    add(new Label("OPS is"));
    add( OPS1);

   
  addWindowListener( new CloseWindow( ));
}

class CalculateHandler implements ActionListener
{
    Baseball f;
    CalculateHandler(Baseball pf)
    { f = pf;}
    public void actionPerformed (ActionEvent event)
    {
        f.CalculateBaseball( );
        f.repaint( );
    }
}// CalculateHandler

void CalculateBaseball()
{
      atbats=Integer.parseInt (atbats1.getText( ));
      walks=Integer.parseInt (walks1.getText( ));
      singles=Integer.parseInt (singles1.getText( ));
      doubles=Integer.parseInt (doubles1.getText( ));
      triples=Integer.parseInt (triples1.getText( ));
      Homers=Integer.parseInt (Homers1.getText( ));
      Hitbypitch=Integer.parseInt (Hitbypitch1.getText( ));
      sacrificeflies=Integer.parseInt (sacrificeflies1.getText( ));
   
      //Calculate
      battingaverage = (float)  (singles+doubles+triples+Homers)/atbats;
      onbaseavg =  (float)    (singles+doubles+triples+Homers + walks + Hitbypitch) /( atbats + walks + Hitbypitch + sacrificeflies);
      sluggingpercentage =  (float)     (singles+(doubles * 2)+(triples * 3)+(Homers * 4))/atbats;
      OPS =Math.abs (onbaseavg + sluggingpercentage);
      
     
  
    //Show answers
     NumberFormat nf =new DecimalFormat("#0.000");
   battingaverage1.setText(String.valueOf (nf.format(battingaverage)));
    onbaseavg1.setText (String.valueOf (nf.format(onbaseavg)));
    //NumberFormat nf1 =new DecimalFormat("#0.000");
    sluggingpercentage1.setText(String.valueOf(nf.format(sluggingpercentage)));
 //   NumberFormat nf2 =new DecimalFormat("#0.000");
    OPS1.setText (String.valueOf (nf.format(OPS)));
 //   NumberFormat nf3 =new DecimalFormat("#0.000");
    
}// CalculateDegrees( )

public void actionPerformed  (ActionEvent event)
{
    repaint( );
}// ActionPerformed
//--------------------------------------------------
public static void main  (String[] args)
{
    Frame BaseballWindow = new Baseball( );
    BaseballWindow.setSize(150,770);
    BaseballWindow.setVisible(true);
}//main

public class CloseWindow extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}//CloseWindow
}// class Degree
