package id.voela.iduangs;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by farhan on 1/25/18.
 */

public class IDUang {

    public static String parsingRupiah(int rupiah) {
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        mataUangIndonesia.setMinimumFractionDigits(0);
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setGroupingSeparator('.');
        mataUangIndonesia.setDecimalFormatSymbols(formatRp);
        return mataUangIndonesia.format(rupiah);
    }

    public static String parsingIDR(int idr) {
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        mataUangIndonesia.setMinimumFractionDigits(0);
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("IDR ");
        formatRp.setGroupingSeparator('.');
        mataUangIndonesia.setDecimalFormatSymbols(formatRp);
        if (idr<1000){
            return "Minimum value is 1000";
        }else{
            return mataUangIndonesia.format(idr/1000) + " K";
        }
    }
}
