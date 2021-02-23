package eternalethiopia;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

public class EternalEthiopiaFunction {

    public static int day_of_date(String m) {
        int r = (no_of_days(m) + 2) % 7;
        return r;
    }

    public static int no_of_days(String m) {
        int no_of_days = (Integer.parseInt(m.substring(4)) - 1) * 365 + (Integer.parseInt(m.substring(4))) / 4
                + (Integer.parseInt(m.substring(2, 4)) - 1) * 30 + Integer.parseInt(m.substring(0, 2));
        return no_of_days;
    }

    public static int leap_count(String m) {
        int q = (Integer.parseInt(m.substring(4)) - 1) / 30;
        int r = (Integer.parseInt(m.substring(4)) - 1) % 30;
        int leap = q * 11;
        int j = Integer.parseInt(m.substring(4)) - 1 - r;
        int[] leapValue = {2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29};
        while (j < Integer.parseInt(m.substring(4))) {
            for (int value : leapValue) {
                if (j % 30 == value) {
                    leap += 1;
                }
            }
            j += 1;
        }
        return leap;
    }

    public static String print_date(int d, int m, int y) {
        String day, mo, q;
        if (d == 0) {
            day = Integer.toString(30);
            mo = String.format("%02d", m);
            q = String.format("%04d", y);
        } else {
            day = String.format("%02d", d);
            mo = String.format("%02d", m + 1);
            q = String.format("%04d", y);
        }
        String date = day + mo + q;
        return date;
    }

    public static String print_date_hijri(int d, int m, int i) {
        String day, mo, q, date = "";
        q = String.format("%04d", i);
        if (m == 6 && d == 1) {
            mo = Integer.toString(12);
            day = Integer.toString(30);
            date = day + mo + q;
        } else if (d == 0) {
            mo = String.format("%02d", 2 * m);
            day = Integer.toString(29);
            date = day + mo + q;
        } else if ((0 < d) && (d <= 30)) {
            mo = String.format("%02d", 2 * m + 1);
            day = String.format("%02d", d);
            date = day + mo + q;
        } else if (d > 30) {
            mo = String.format("%02d", 2 * m + 2);
            day = String.format("%02d", d - 30);
            date = day + mo + q;
        }
        return date;
    }

    public static String date_of_days(int m) {
        int mo = 0;
        int d = 0;
        int i = 1;
        String date;
        while (m > 365) {
            m -= 365;
            i += 1;
            if ((i + 1) % 4 == 0) {
                if (m > 366) {
                    m -= 366;
                    i += 1;
                } else {
                    mo = m / 30;
                    d = m % 30;
                    date = print_date(d, mo, i);
                    return date;
                }
            }
        }
        mo = m / 30;
        d = m % 30;
        date = print_date(d, mo, i);
        return date;
    }

    public static String ethio_to_hijri(String m) {
        int mo, d;
        String date;
        int t = no_of_days(m);
        int day_before_614 = no_of_days("20110614");
        t -= day_before_614;
        if (t > 0) {
            int[] list = {2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29};
            int i = 1;
            while (t > 354) {
                t -= 354;
                i += 1;
                for (int value : list) {
                    if (i % 30 == value) {
                        if (t > 355) {
                            t -= 355;
                            i += 1;
                        } else {
                            mo = t / 59;
                            d = t % 59;
                            date = print_date_hijri(d, mo, i);
                            return date;
                        }
                    }
                }
            }
            mo = t / 59;
            d = t % 59;
            date = print_date_hijri(d, mo, i);
        } else {
            date = "00000000";
        }
        return date;
    }

    public static String hijri_to_ethio(String m) {
        int hijri_dates;
        String date;
        int q = leap_count(m);
        if ((Integer.parseInt(m.substring(2, 4))) % 2 == 1) {
            hijri_dates = ((Integer.parseInt(m.substring(4))) - 1) * 354 + q + (((Integer.parseInt(m.substring(2, 4))) - 1) / 2) * 59
                    + Integer.parseInt(m.substring(0, 2));
        } else {
            hijri_dates = ((Integer.parseInt(m.substring(4))) - 1) * 354 + q + (((Integer.parseInt(m.substring(2, 4))) - 2) / 2) * 59
                    + 30 + Integer.parseInt(m.substring(0, 2));
        }
        int day_before_614 = no_of_days("20110614");
        int dates = hijri_dates + day_before_614;
        date = date_of_days(dates);
        return date;
    }

    public static int count_date_european(String m) {
        int[] l = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        if ((Integer.parseInt(m.substring(4)) < 1582) | (Integer.parseInt(m.substring(4)) == 1582 & Integer.parseInt(m.substring(2, 4)) < 10)
                | (Integer.parseInt(m.substring(4)) == 1582 & Integer.parseInt(m.substring(2, 4)) == 10 & Integer.parseInt(m.substring(0, 2)) < 5)) {
            if (Integer.parseInt(m.substring(4)) % 4 == 0) {
                l[1] = 29;
            } else {
            }

            for (int i = 0; i < Integer.parseInt(m.substring(2, 4)) - 1; i++) {
                count = count + l[i];
            }
            int date_count = (Integer.parseInt(m.substring(4)) - 1) * 365 + (Integer.parseInt(m.substring(4)) - 1) / 4 + count
                    + Integer.parseInt(m.substring(0, 2));
            return date_count;
        } else {
            if (Integer.parseInt(m.substring(4)) % 4 == 0) {
                if ((Integer.parseInt(m.substring(4)) % 100 != 0) | (Integer.parseInt(m.substring(4)) % 100 == 0 & Integer.parseInt(m.substring(4)) % 400 == 0)) {
                    l[1] = 29;
                } else {

                }
            } else {
            }
            for (int i = 0; i < (Integer.parseInt(m.substring(2, 4))) - 1; i++) {
                count = count + l[i];
            }
            int k = Integer.parseInt(m.substring(4)) - 1599;
            int r = k / 100;
            int t = r / 4;
            int z = r - t;
            int date_count = (Integer.parseInt(m.substring(4)) - 1) * 365 + (Integer.parseInt(m.substring(4)) - 1) / 4
                    + count + Integer.parseInt(m.substring(0, 2)) - 10 - z;
            return date_count;
        }
    }

    public static String from_European_to_Ethiopian(String m) {
        int t = count_date_european(m);
        t -= 2797;
        String date = date_of_days(t);
        return date;
    }

    public static String[] easter_goodfriday(String m) {
        int wr;
        String[] easter = new String[2];
        int A = 5500 + Integer.parseInt(m);
        int w = (A - 1) % 19;
        int B = (w * 11) % 30;
        int M = 30 - B;
        if (M >= 15) {
            wr = 1;
        } else {
            wr = 2;
        }
        int L = A / 4;
        int TD = (A - 1) * 365 + L;
        int r = (TD + 1) % 7;
        int s = r + 1;
        int TDM = TD + (wr - 1) * 30 + M;
        r = TDM % 7;
        int D = r + 1;
        r = (D + 1) % 7;
        int F = 128 - r;
        int TDB_5 = TDM + F + 67;
        int WR_5 = ((TDB_5 - TD - 1) / 30) + 1;
        int r_1 = (TDB_5 - TD - 1) % 30;
        int D_5 = r_1 + 1;
        easter[0] = String.format("%02d", D_5) + String.format("%02d", WR_5) + String.format("%04d", Integer.parseInt(m));
        /*Good Friday */
        int TDB_6 = TDM + F + 69;
        int WR_6 = ((TDB_6 - TD - 1) / 30) + 1;
        r = (TDB_6 - TD - 1) % 30;
        int D_6 = r + 1;
        easter[1] = String.format("%02d", D_6) + String.format("%02d", WR_6) + String.format("%04d", Integer.parseInt(m));
        return easter;
    }

    public static int work_days(String date_1, String date_2) {
        int date1 = no_of_days(date_1);
        int date2 = no_of_days(date_2);
        int no_days = date2 - date1 + 1;
        int q = no_days / 7;
        int r = no_days % 7;
        int z = day_of_date(date_1);
        int week_ends = 0;
        if (r == 0) {
            week_ends = 0;
        } else if (z == 0) {
            week_ends = 1;
        } else if (z + r < 7) {
            week_ends = 0;
        } else if (z + r == 7) {
            week_ends = 1;
        } else if (z + r > 7) {
            week_ends = 2;
        }
        int work_days = no_days - 2 * q - week_ends;
        return work_days;
    }

    public static Object[] holiday_list(String date_1, String date_2) {
        int workdays = work_days(date_1, date_2);
        ArrayList<String> holidays = new ArrayList<String>();
        int days_1 = no_of_days(date_1);
        int days_2 = no_of_days(date_2);
        String date1 = ethio_to_hijri(date_1);
        String date2 = ethio_to_hijri(date_2);

        int i = 0;
        while ((Integer.parseInt(date1.substring(4)) + i) <= (Integer.parseInt(date2.substring(4)))) {
            if ((Integer.parseInt(date1.substring(4)) + i) > 0) {
                String s = String.format("%04d", Integer.parseInt(date1.substring(4)) + i);
                String s1 = hijri_to_ethio("1012" + s);
                int date3 = no_of_days(s1);
                String s2 = hijri_to_ethio("0110" + s);
                int date4 = no_of_days(s2);
                String s3 = hijri_to_ethio("1203" + s);
                int date5 = no_of_days(s3);
                if ((days_1 <= date3) && (date3 <= days_2)) {
                    holidays.add(s1 + "\u12A0\u1228\u134B");
                }
                if ((days_1 <= date4) && (date4 <= days_2)) {
                    holidays.add(s2 + "\u12A2\u12F5 \u12A0\u120D \u1348\u1325\u122D");
                }
                if ((days_1 <= date5) && (date5 <= days_2)) {
                    holidays.add(s3 + "\u1218\u12CD\u120A\u12F5");
                }
            }
            i += 1;
        }

        i = 0;
        while ((Integer.parseInt(date_1.substring(4)) + i) <= (Integer.parseInt(date_2.substring(4)))) {
            int k = Integer.parseInt(date_1.substring(4)) + i;
            String s = String.format("%04d", k);
            int date6 = no_of_days("0101" + s);
            int date7 = no_of_days("1701" + s);
            int date8 = no_of_days("1105" + s);
            int date9 = no_of_days("2306" + s);
            int date10 = no_of_days("2308" + s);
            int date11 = no_of_days("2708" + s);
            int date12 = no_of_days("2807" + s);
            int date13 = no_of_days("0201" + s);
            int date14 = no_of_days("2009" + s);
            int date15 = no_of_days("2804" + s);
            int date16 = no_of_days("2904" + s);

            String[] easter = easter_goodfriday(s);
            if (days_1 <= no_of_days(easter[0]) && no_of_days(easter[0]) <= days_2) {
                holidays.add(easter[0] + "\u1235\u1245\u1208\u1275");
            }
            if (days_1 <= no_of_days(easter[1]) && no_of_days(easter[1]) <= days_2) {
                holidays.add(easter[1] + "\u134B\u1232\u12AB");
            }

            if ((days_1 <= date6) && (date6 <= days_2)) {
                holidays.add("0101" + s + "\u12A5\u1295\u1241\u1323\u1323\u123D");
            }
            if ((days_1 <= date7) && (date7 <= days_2)) {
                holidays.add("1701" + s + "\u1218\u1235\u1240\u120D");
            }
            if ((days_1 <= date8) && (date8 <= days_2)) {
                holidays.add("1105" + s + "\u1325\u121D\u1240\u1275");
            }

            if (k > 1888) {
                if ((days_1 <= date9) && (date9 <= days_2)) {
                    holidays.add("2306" + s + "\u12E8\u12A0\u12F5\u12CB \u12F5\u120D \u1260\u12D3\u120D");
                }
            }
            if (k > 1966) {
                if ((days_1 <= date10) && (date10 <= days_2)) {
                    holidays.add("2308" + s + "\u121C\u12ED \u12F4\u12ED");
                }
            }
            if ((k > 1983) | ((1933 < k) && (k < 1967))) {
                if ((days_1 <= date11) && (date11 <= days_2)) {
                    holidays.add("2708" + s + "\u12E8\u12A0\u122D\u1260\u129E\u127D \u1240\u1295");
                }
            }
            if ((1966 < k) && (k < 1984)) {
                if ((days_1 <= date12) && (date12 <= days_2)) {
                    holidays.add("2807" + s + "\u12E8\u12A0\u122D\u1260\u129E\u127D \u1240\u1295");
                }
            }
            if ((1967 < k) && (k < 1984)) {
                if ((days_1 <= date13) && (date13 <= days_2)) {
                    holidays.add("0201" + s + "\u12E8\u12D8\u12CD\u12F5 \u12A0\u1308\u12DB\u12DD \u12E8\u12C8\u12F0\u1240\u1260\u1275");
                }
            }
            if (k > 1983) {
                if ((days_1 <= date14) && (date14 <= days_2)) {
                    holidays.add("2009" + s + "\u12F0\u122D\u130D \u12E8\u12C8\u12F0\u1240\u1260\u1275");
                }
            }
            if (k % 4 == 0) {
                if ((days_1 <= date15) && (date15 <= days_2)) {
                    holidays.add("2804" + s + "\u1308\u1293");
                }
            } else if (k % 4 != 0) {
                if ((days_1 <= date16) && (date16 <= days_2)) {
                    holidays.add("2904" + s + "\u1308\u1293");
                }
            }
            i += 1;
        }

        for (int a = 0; a < holidays.size(); a++) {
            String temp = holidays.get(a);
            holidays.set(a, temp.substring(4, 8) + temp.substring(2, 4) + temp.substring(0, 2) + temp.substring(8));
        }

        for (int k = 0; k < holidays.size(); k++) {
            for (int a = 0; a < holidays.size() - 1; a++) {
                int z = compare(holidays.get(a), holidays.get(a + 1));
                if (z > 0) {
                    String temp = holidays.get(a);
                    holidays.set(a, holidays.get(a + 1));
                    holidays.set(a + 1, temp);
                }
            }
        }

        for (int a = 0; a < holidays.size() - 1; a++) {
            if ((holidays.get(a).substring(0, 8)).equals(holidays.get(a + 1).substring(0, 8))) {
                String temp = holidays.get(a);
                holidays.set(a, temp + " \u1363" + holidays.get(a + 1).substring(8));
                holidays.remove(a + 1);
            }
        }

        for (int a = 0; a < holidays.size(); a++) {
            String temp = holidays.get(a);
            holidays.set(a, temp.substring(6, 8) + temp.substring(4, 6) + temp.substring(0, 4) + temp.substring(8));
        }

        for (String holiday : holidays) {
            if ((day_of_date(holiday.substring(0, 8)) != 0) && (day_of_date(holiday.substring(0, 8))) != 6) {
                workdays -= 1;
            }
        }
        Object[] work_holiday = new Object[2];
        work_holiday[0] = workdays;
        work_holiday[1] = holidays;
        return work_holiday;
    }

    public static int compare(String s1, String s2) {
        return s1.substring(2).compareTo(s2.substring(2));
    }

    public static String geez_numeral(int m) {
        String s = "";
        String[] l = {"\u1369", "\u136A", "\u136B", "\u136C", "\u136D", "\u136E", "\u136F", "\u1370", "\u1371",
            "\u1372", "\u1373", "\u1374", "\u1375", "\u1376", "\u1377", "\u1378", "\u1379", "\u137A", "\u137B"};
        if ((1 <= m) && (m <= 10)) {
            s = l[m - 1];
        } else if ((10 < m) && (m <= 100)) {
            int q = m / 10;
            int r = m % 10;
            if (r == 0) {
                s = l[8 + q];
            } else {
                s = l[8 + q] + l[r - 1];
            }
        } else if ((100 < m) && (m <= 10000)) {
            int q = m / 100;
            int r = m % 100;
            if (q == 1) {
                String num = geez_numeral(r);
                s = l[18] + num;
            } else if (r == 0) {
                String num = geez_numeral(q);
                s = num + l[18];
            } else {
                String num = geez_numeral(q);
                String num2 = geez_numeral(r);
                s = num + l[18] + num2;
            }
        }
        return s;
    }

    public static String get_Month(int n) {
        String[] month_name = {"\u1218\u1235\u12A8\u1228\u121D", "\u1325\u1245\u121D\u1275", "\u1205\u12F3\u122D",
            "\u1273\u1205\u1233\u1235", "\u1325\u122D", "\u12E8\u12AB\u1272\u1275", "\u1218\u130B\u1262\u1275", "\u121A\u12EB\u12DD\u12EB",
            "\u130D\u1295\u1266\u1275", "\u1230\u1294", "\u1210\u121D\u120C", "\u1290\u1210\u1234", "\u1333\u1309\u121C"};
        return month_name[n - 1];
    }

    public static String get_CurrentDate() {
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        String date = ft.format(d);
        return date;
    }

    public static void show_CurrentMonth() throws InterruptedException {
        String date = get_CurrentDate();
        String etDate = from_European_to_Ethiopian(date);
        display_Month(etDate);
        display_Images();
    }

    public static void display_Month(String s) {
        String[] S = create_date(s);
        String date1 = S[0];
        String date2 = S[1];
        int l = Integer.parseInt(S[2]);
        int d = Integer.parseInt(S[3]);

        JButton[] buttons = {EternalEthiopia.jButton9, EternalEthiopia.jButton10, EternalEthiopia.jButton11,
            EternalEthiopia.jButton12, EternalEthiopia.jButton13, EternalEthiopia.jButton14,
            EternalEthiopia.jButton15, EternalEthiopia.jButton16, EternalEthiopia.jButton17,
            EternalEthiopia.jButton18, EternalEthiopia.jButton19, EternalEthiopia.jButton20,
            EternalEthiopia.jButton21, EternalEthiopia.jButton22, EternalEthiopia.jButton23,
            EternalEthiopia.jButton24, EternalEthiopia.jButton25, EternalEthiopia.jButton26,
            EternalEthiopia.jButton27, EternalEthiopia.jButton28, EternalEthiopia.jButton29,
            EternalEthiopia.jButton30, EternalEthiopia.jButton31, EternalEthiopia.jButton32,
            EternalEthiopia.jButton33, EternalEthiopia.jButton34, EternalEthiopia.jButton35,
            EternalEthiopia.jButton36, EternalEthiopia.jButton37, EternalEthiopia.jButton38,
            EternalEthiopia.jButton39, EternalEthiopia.jButton40, EternalEthiopia.jButton41,
            EternalEthiopia.jButton42, EternalEthiopia.jButton43, EternalEthiopia.jButton44};

        for (int k = 0; k < buttons.length; k++) {
            buttons[k].setText(" ");
            buttons[k].setEnabled(true);
            buttons[k].setBackground(null);
            buttons[k].setBorderPainted(true);
        }

        int[] weekEnds = {0, 6, 7, 13, 14, 20, 21, 27, 28, 34, 35};
        for (int w : weekEnds) {
            buttons[w].setBackground(Color.red);
        }

        Object[] work_holidays = holiday_list(date1, date2);
        ArrayList<String> holidays = new ArrayList<String>();
        holidays = (ArrayList) work_holidays[1];
        int r = day_of_date(date1);
        int m = 1;
        while (m <= 30) {
            buttons[m + r - 1].setText(String.valueOf(m));
            if (m == d) {
                buttons[d + r - 1].setBackground(Color.green);
            }
            for (String holiday : holidays) {
                if (Integer.parseInt(holiday.substring(0, 2)) == m) {
                    buttons[m + r - 1].setBackground(Color.red);
                }
            }

            m++;
        }

        for (int n = 0; n < r; n++) {
            buttons[n].setBackground(null);
            buttons[n].setEnabled(false);
            buttons[n].setText("");
            buttons[n].setBorderPainted(false);
        }

        for (int k = l + 5 - r; k >= 0; k--) {
            buttons[35 - k].setBackground(null);
            buttons[35 - k].setEnabled(false);
            buttons[35 - k].setText("");
            buttons[35 - k].setBorderPainted(false);
        }
        display_holidays(date1, date2, 0);
    }

    public static void display_holidays(String date1, String date2, int id) {
        Font myFont2 = InternalFont.getFont(InternalFont.Custom, Font.BOLD, 14);
        JLabel[] labels1 = {EternalEthiopia.jLabel3, EternalEthiopia.jLabel4, EternalEthiopia.jLabel5,
            EternalEthiopia.jLabel6, EternalEthiopia.jLabel7, EternalEthiopia.jLabel8,
            EternalEthiopia.jLabel9, EternalEthiopia.jLabel10, EternalEthiopia.jLabel11};
        JLabel[] labels2 = {EternalEthiopia.jLabel19, EternalEthiopia.jLabel20, EternalEthiopia.jLabel21,
            EternalEthiopia.jLabel22, EternalEthiopia.jLabel23, EternalEthiopia.jLabel24,
            EternalEthiopia.jLabel25, EternalEthiopia.jLabel26, EternalEthiopia.jLabel27,
            EternalEthiopia.jLabel28, EternalEthiopia.jLabel29, EternalEthiopia.jLabel30,
            EternalEthiopia.jLabel31, EternalEthiopia.jLabel32};

        Object[] work_holidays = holiday_list(date1, date2);
        ArrayList<String> holidays = new ArrayList<String>();
        holidays = (ArrayList) work_holidays[1];        

        if (id == 0) {
            for (int k = 0; k < labels1.length; k++)
            {
                labels1[k].setForeground(Color.red);
                labels1[k].setFont(myFont2);
                labels1[k].setText(" ");
            }
            labels1[0].setText(get_Month(Integer.parseInt(date1.substring(2, 4)))
                    + " " + geez_numeral(Integer.parseInt(date1.substring(4))));
            labels1[8].setText(String.valueOf(work_holidays[0]) + "  \u12E8\u1235\u122B \u1240\u1293\u1275");
            for (int k = 0; k < Math.min(holidays.size(), 7); k++) {
                labels1[k + 1].setText(get_Month(Integer.parseInt(holidays.get(k).substring(2, 4)))
                        + " " + geez_numeral(Integer.parseInt(holidays.get(k).substring(0, 2))) + " - "
                        + holidays.get(k).substring(8));
            }
        } 
        else 
        {
            for (int k = 0; k < labels2.length; k++)
            {
                labels2[k].setForeground(Color.red);
                labels2[k].setFont(myFont2);
                labels2[k].setText(" ");
            }
            labels2[13].setText(String.valueOf(work_holidays[0]));
            for (int k = 0; k < Math.min(holidays.size(), 13); k++) {
                labels2[k].setText(get_Month(Integer.parseInt(holidays.get(k).substring(2, 4)))
                        + " " + geez_numeral(Integer.parseInt(holidays.get(k).substring(0, 2))) + " - "
                        + holidays.get(k).substring(8));
            }
        }
    }

    public static String[] create_date(String s) {
        String date1 = "", date2 = "", mo = "", year = " ";
        int d = 0, l;
        String[] S = new String[4];
        if (s.length() == 8) {
            d = Integer.parseInt(s.substring(0, 2));
            mo = s.substring(2, 4);
            year = s.substring(4);
        } else if (s.length() == 6) {
            mo = s.substring(0, 2);
            year = s.substring(2);
        }
        date1 = "01" + mo + year;

        if (Integer.parseInt(mo) == 13) {
            if ((Integer.parseInt(year) % 4) == 3) {
                date2 = "06" + mo + year;
                l = 24;
            } else {
                date2 = "05" + mo + year;
                l = 25;
            }
        } else {
            date2 = "30" + mo + year;
            l = 0;
        }
        S[0] = date1;
        S[1] = date2;
        S[2] = String.format("%02d", l);
        S[3] = String.format("%02d", d);

        return S;
    }

    public static void display_Images() throws InterruptedException {
        Random generator = new Random();
        String[] images = {"message.png", "message2.png"};
        JLabel[] labels = {EternalEthiopia.jLabel12, EternalEthiopia.jLabel33, EternalEthiopia.jLabel34};
        int num = generator.nextInt(images.length);
        while (true) {
            ImageIcon icon = new ImageIcon(EternalEthiopiaFunction.class.getResource(images[num]));
            Image icon1 = icon.getImage();
            for (int k = 0; k < labels.length; k++) {
                Image icon2 = getScaledImage(icon1, labels[k].getWidth(), labels[k].getHeight());
                labels[k].setIcon(new ImageIcon(icon2));

            }
            try {
                Thread.sleep(6000L);
            } catch (InterruptedException e) {
                for (int k = 0; k < labels.length; k++) {
                    labels[k].setText("Interrupted!");
                }

            }
            num = (num + 1) % images.length;
        }
    }

    public static Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage buffImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = buffImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        return buffImg;
    }

}
