package excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class CheckedUnchekedExeptions {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // Unchecked Exceptions

        try {
            valor = NumberFormat.getInstance().parse("a1.75"); // Checked Exceptions
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println(valor);
    }
}
