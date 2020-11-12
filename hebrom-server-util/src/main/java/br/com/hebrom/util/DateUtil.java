package br.com.hebrom.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitária para tratamentos de datas/horas
 * 
 * @author Jackson Willian
 */
public final class DateUtil {

    public static final String DD_MM_YYYY_HH_MM = "dd/MM/yyyy HH:mm";

    public static final String DD_MM_YYYY_HH_MM_SS_IMAGE = "_dd_MM_yyyy_HH_mm_ss";

    /**
     * Cast de string para Date, com parametrização da formatação.
     * 
     * @param data
     * @param format
     * @return Date
     * @throws ParseException
     */
    public static final Date toDate(String data, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(data);
    }

    /**
     * Cast de string para Date, com formatação default.
     * 
     * @param data
     * @return Date
     * @throws ParseException
     */
    public static final Date toDate(String data) throws ParseException {
        return new SimpleDateFormat(DD_MM_YYYY_HH_MM).parse(data);
    }

    public static final String toString(Date data) {
        DateFormat dateFormat = new SimpleDateFormat(DD_MM_YYYY_HH_MM);
        return dateFormat.format(data);
    }

    public static final String toString(Date data, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(data);
    }

}
