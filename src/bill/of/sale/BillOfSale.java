
package bill.of.sale;

import java.text.DecimalFormat;
/**
 *
 * @author seden0957
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    double shirt, total, tax, change;
        shirt = 12.49 ;
        tax = shirt * .13 ;
        total = shirt + tax ;
        change = 20 - total ;     
        DecimalFormat x = new DecimalFormat ("###.##");
        System.out.println(" Original Cost: $" +(x.format(shirt))  +  " Tax: $" +(x.format(tax))+ " Total: $" +(x.format(total))+ " Change: $" +(x.format(change)) );
    } 
} 
