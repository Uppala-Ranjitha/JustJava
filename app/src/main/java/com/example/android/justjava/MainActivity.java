package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String msg = TotalInfo(numberOfCoffees);
        displayMessage(msg);
    }

    public String TotalInfo(int numberOfCoffees){
        String msg = "Name : Kaptain Kunal\n" + "Quantity : " + numberOfCoffees + "\nTotal : #" + numberOfCoffees * 5 + "\nThank you!";
        return msg;
    }
    /**
     * This method increments the quantity to 3.
     */
    public void Increment(View view)
    {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }

    /**
     * this method decrements number of coffees to 1.
     */
    public void Decrement(View view){
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * this method is to display a string when the order method is clicked
     */
    private void displayMessage(String message){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
