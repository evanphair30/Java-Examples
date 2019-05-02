//Evan Phair			
//9/19/2015			
//0			
//9/19/2015			
//Fahrenheit Celcius	Approximation	Difference

// test suite
//
//
//
//

import java.awt.*;
import java.awt.event.*;

/**
 * <Degrees>
 * @author <Evan Phair>
 *
 */
public class Degrees extends Frame implements ActionListener
{

private static final long serialVersionUID = 1L;
private Button btnCalculate;
private TextField tfFahrenheit = new TextField(10);
private TextField tfCelcius = new TextField(10);
private TextField tfApproximation = new TextField(10);    
private TextField tfDifference = new TextField(10);
private TextField tfApproximation2 = new TextField(10);    

//processing variables
int     iFahrenheit = 0;
float   fCelcius = 0;
float   fApprox = 0;
float   fDiff = 0;


public Degrees ()
{
    setTitle ("Degrees -- Lab Sample");
    setLayout ( new FlowLayout ());

    add(new Label("Fahrenheit"));
    add( tfFahrenheit);
    add(new Label ("Celcius"));
    add( tfCelcius);
    add(new Label ("Approximation"));
    add( tfApproximation);
    add(new Label ("Alternate Approximation"));
    add( tfApproximation2);
    add(new Label("The Difference is"));
    add( tfDifference);
    btnCalculate = new Button("Calculate");
    add (btnCalculate);
    btnCalculate.addActionListener(new CalculateHandler(this));

  addWindowListener( new CloseWindow( ));
}

class CalculateHandler implements ActionListener
{
    Degrees f;
    CalculateHandler(Degrees pf)
    { f = pf;}
    public void actionPerformed (ActionEvent event)
    {
        f.CalculateDegrees( );
        f.repaint( );
    }
}// CalculateHandler

void CalculateDegrees()
{
      iFahrenheit=Integer.parseInt (tfFahrenheit.getText( ));
   
      //Calculate
      fCelcius = (float)  ((iFahrenheit - 32)*5)/9;
      fApprox =  (float)    iFahrenheit / 2 - 15;
      fDiff =Math.abs (fCelcius - fApprox);

    // Alternate approximation.
     float approx = (float) ((iFahrenheit - 32) * 0.5);
     approx += approx * 0.1;
      
    //Show answers
    tfCelcius.setText(String.valueOf (fCelcius));
    tfApproximation.setText (String.valueOf (fApprox));
    tfApproximation2.setText(String.valueOf(approx));
    tfDifference.setText (String.valueOf (fDiff));
    
}// CalculateDegrees( )

public void actionPerformed  (ActionEvent event)
{
    repaint( );
}// ActionPerformed
//--------------------------------------------------
public static void main  (String[] args)
{
    Frame DegreesWindow = new Degrees( );
    DegreesWindow.setSize(150,500);
    DegreesWindow.setVisible(true);
}//main
public class CloseWindow extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}//CloseWindow
}// class Degree
