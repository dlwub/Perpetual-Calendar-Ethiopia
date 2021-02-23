package eternalethiopia;
import static eternalethiopia.EternalEthiopiaFunction.from_European_to_Ethiopian;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



public class EternalEthiopia extends JFrame {
    
    private static GroupLayout jPanel1Layout, jPanel2Layout, jPanel3Layout;
    private static JPanel jPanel1, jPanel2, jPanel3;
    private static JTabbedPane jTabbedPane;
    private static JTextArea jTextArea;
    private static JTextField jTextField1, jTextField2, jTextField3, jTextField4;
    private static JCheckBox jCheckBox1, jCheckBox2;
    public static JButton jButton1, jButton2, jButton3, jButton4, jButton5,
            jButton6, jButton7, jButton8, jButton9, jButton10, jButton11,
            jButton12, jButton13, jButton14, jButton15, jButton16, jButton17,
            jButton18, jButton19, jButton20, jButton21, jButton22, jButton23,
            jButton24, jButton25, jButton26, jButton27, jButton28, jButton29,
            jButton30, jButton31, jButton32, jButton33, jButton34, jButton35,
            jButton36, jButton37, jButton38, jButton39, jButton40, jButton41,
            jButton42, jButton43, jButton44;
    public static JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6,
            jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13,
            jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20,
            jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27,
            jLabel28, jLabel29, jLabel30, jLabel31, jLabel32, jLabel33, jLabel34;

    public EternalEthiopia() {
        super("\u12D8\u120B\u1208\u121B\u12CA \u1240\u1295 \u1218\u1241\u1320\u122A\u12EB - \u12A2\u1275\u12EE\u1335\u12EB");
        Font myFont = InternalFont.getFont(InternalFont.Custom, Font.BOLD, 14);
        Font myFont1 = InternalFont.getFont(InternalFont.Custom, Font.BOLD, 16);
        super.setFont(myFont);
        jTabbedPane = new JTabbedPane();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jTextArea = new JTextArea("     \u12D8\u120B\u1208\u121B\u12CA \u1240\u1295 \u1218\u1241\u1320\u122A\u12EB - "
                + "\u12A2\u1275\u12EE\u1335\u12EB \u12EB\u1201\u1291\u1295 \u12C8\u122D \u1260\u12C8\u1229\u121D "
                + "\u12CD\u1235\u1325 \u12EB\u1209\u1275\u1295 \u1260\u12D3\u120B\u1275\u1293 \u12E8\u1235\u122B\n"
                + "\u1240\u1293\u1275 \u1265\u12DB\u1275 \u12A5\u1295\u12F2\u1201\u121D \u12A8\u12AD\u122D\u1235\u1276\u1235 "
                + "\u120D\u12F0\u1275 \u1300\u121D\u122E \u12A5\u1235\u12A8 9999 \u12D3.\u121D \u12F5\u1228\u1235 "
                + "\u12EB\u1208\u1295 \u121B\u1295\u129B\u12CD\u121D\n\u12C8\u122D \u1260\u12C8\u1229\u121D \u12CD\u1235\u1325 "
                + "\u12EB\u1209\u1275\u1295 \u1260\u12D3\u120B\u1275\u1293 \u12E8\u1235\u122B \u1240\u1293\u1275 "
                + "\u1265\u12DB\u1275 (\u1260\u12A2\u1275\u12EE\u1335\u12EB \u12E8\u12D8\u1218\u1295 "
                + "\u12A0\u1246\u1323\u1320\u122D\n\u1218\u1220\u1228\u1275) \u1208\u121B\u12E8\u1275 "
                + "\u12ED\u1320\u1245\u121B\u120D \u1362 \u12EB\u1201\u1291\u1295 \u12C8\u122D \u1208\u121B\u12E8\u1275 "
                + "\u1355\u122E\u130D\u122B\u1219\u1295 \u1218\u12AD\u1348\u1275 \u1260\u1242 \u1290\u12CD "
                + "\u1362\n\n     \u1260\u121B\u1295\u129B\u12CD\u121D \u12A0\u1218\u1275 \u12CD\u1235\u1325 \u12EB\u1208\u1295 "
                + "\u120C\u120B \u12C8\u122D \u1208\u121B\u12E8\u1275 \u1260\u1218\u1300\u1218\u122D\u12EB\u12CD('\u1240\u1295 \u1218"
                + "\u1241\u1320\u122A\u12EB'\n\u1260\u121A\u1208\u12CD) \u1308\u1345 \u120B\u12ED '\u12C8\u122D' "
                + "\u1260\u121A\u1208\u12CD \u1233\u1325\u1295 \u12CD\u1235\u1325 \u12C8\u1229\u1295 (2 \u12F2\u1302\u1275)"
                + "\u1363 '\u12D3.\u121D' \u1260\u121A\u1208\u12CD\n\u1233\u1325\u1295 \u12CD\u1235\u1325 \u12F0\u130D\u121E "
                + "\u12A0\u1218\u1270 \u121D\u1205\u1228\u1271\u1295 (4 \u12F2\u1302\u1275) \u12EB\u1235\u1308\u1261\u1293 "
                + "'\u12A0\u1233\u12ED' \u12E8\u121A\u1208\u12CD\u1295 \u1241\u120D\u134D\n\u12ED\u132B\u1291 \u1362\n\n"
                + "     \u12D8\u120B\u1208\u121B\u12CA \u1240\u1295 \u1218\u1241\u1320\u122A\u12EB - \u12A2\u1275\u12EE\u1335\u12EB "
                + "\u1260\u121B\u1293\u1278\u12CD\u121D \u1201\u1208\u1275 \u1240\u1293\u1275 \u1218\u12AB\u12A8\u120D \u12EB\u1209 "
                + "\u12E8\u1260\u12D3\u120B\u1275\n\u12DD\u122D\u12DD\u122D\u1293 \u12E8\u1235\u122B \u1240\u1293\u1275 "
                + "\u1265\u12DB\u1275\u1295 \u1208\u121B\u12E8\u1275\u121D \u12ED\u1228\u12F3\u120D \u1362 \u12ED\u1205\u1295 "
                + "\u1208\u121B\u12F5\u1228\u130D \u1260\u1201\u1208\u1270\u129B\u12CD ('\u12E8\u1260\u12D3\u120B\u1275\n"
                + "\u121B\u12CD\u132B' \u1260\u121A\u1208\u12CD) \u1308\u1345 \u120B\u12ED \u1263\u1209\u1275 \u1201\u1208\u1275 "
                + "\u1233\u1325\u1296\u127D \u12CD\u1235\u1325 \u12E8\u1218\u1290\u123B\u12CD\u1295\u1293 \u12E8\u1218\u12F5\u1228"
                + "\u123B\u12CD\u1295 \u1240\u1293\u1275\n\u1260\u1245\u12F0\u121D \u1270\u12A8\u1270\u120D \u12A0\u1235\u1308"
                + "\u1265\u1270\u12CD '\u1260\u12D3\u120B\u1275' \u12A5\u1293 '\u12E8\u1235\u122B \u1240\u1293\u1275 \u1265\u12DB\u1275'"
                + "\u12E8\u121A\u1209\u1275\u1295 \u1201\u1208\u1275 \u1233\u1325\u1296\u127D\n\u12ED\u132B\u1291 \u1362"
                + "\n\n\n\n\t\tDeveloped by: D.L.W\n\t\u00a9Copyright 2016•All Rights Reserved");
        jTextArea.setEditable(false);
        jTextArea.setFont(myFont);
        jTextField1 = new JTextField();
        jTextField1.setFont(myFont);
        jTextField2 = new JTextField();
        jTextField2.setFont(myFont);
        jTextField3 = new JTextField();
        jTextField3.setToolTipText("8 \u12F2\u1302\u1275(DDMMYYYY)");
        jTextField3.setFont(myFont);
        UIManager.put("ToolTip.font", myFont);
        jTextField4 = new JTextField();
        jTextField4.setToolTipText("8 \u12F2\u1302\u1275(DDMMYYYY)");
        jTextField4.setFont(myFont);
        CheckBoxHandler handler = new CheckBoxHandler();
        jButton1 = new JButton("\u12A0\u1233\u12ED");
        jButton1.setFont(myFont);
        jButton1.addActionListener((ActionEvent event) -> {
            try {
                int mo = Integer.parseInt(jTextField1.getText());
                int year = Integer.parseInt(jTextField2.getText());
                if (((1 <= mo) && (mo <= 13)) && ((1 <= year) && (year <= 9999))) {
                    String date = EternalEthiopiaFunction.get_CurrentDate();
                    String etDate = from_European_to_Ethiopian(date);
                    if ((Integer.parseInt(etDate.substring(2, 4)) == mo)
                            && (Integer.parseInt(etDate.substring(4)) == year)) {
                        EternalEthiopiaFunction.display_Month(etDate);
                    } else {
                        EternalEthiopiaFunction.display_Month(String.format("%02d", mo) + String.format("%04d", year));
                    }

                }
            } catch (NumberFormatException e) {
                UIManager.put("OptionPane.messageFont", myFont1);
                JOptionPane.showMessageDialog(null, "\u1270\u1233\u1235\u1270\u12CB\u120D\u1362  \u12A5\u1295\u12F0\u1308\u1293"
                        + " \u12EB\u1235\u1308\u1261!", "\u1218\u120D\u12D5\u12AD\u1275!", JOptionPane.WARNING_MESSAGE);
            }
        });
        jButton2 = new JButton("\u12A5\u1201");
        jButton2.setFont(myFont1);
        jButton2.setOpaque(true);
        jButton2.setBackground(Color.blue);
        jButton3 = new JButton("\u1230\u129E");
        jButton3.setFont(myFont1);
        jButton3.setOpaque(true);
        jButton3.setBackground(Color.blue);
        jButton4 = new JButton("\u121B\u12AD");
        jButton4.setFont(myFont1);
        jButton4.setOpaque(true);
        jButton4.setBackground(Color.blue);
        jButton5 = new JButton("\u1228\u1261");
        jButton5.setFont(myFont1);
        jButton5.setOpaque(true);
        jButton5.setBackground(Color.blue);
        jButton6 = new JButton("\u1210\u1219");
        jButton6.setFont(myFont1);
        jButton6.setOpaque(true);
        jButton6.setBackground(Color.blue);
        jButton7 = new JButton("\u12A0\u122D");
        jButton7.setFont(myFont1);
        jButton7.setOpaque(true);
        jButton7.setBackground(Color.blue);
        jButton8 = new JButton("\u1245\u12F3");
        jButton8.setFont(myFont1);
        jButton8.setOpaque(true);
        jButton8.setBackground(Color.blue);
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jButton21 = new JButton();
        jButton22 = new JButton();
        jButton23 = new JButton();
        jButton24 = new JButton();
        jButton25 = new JButton();
        jButton26 = new JButton();
        jButton27 = new JButton();
        jButton28 = new JButton();
        jButton29 = new JButton();
        jButton30 = new JButton();
        jButton31 = new JButton();
        jButton32 = new JButton();
        jButton33 = new JButton();
        jButton34 = new JButton();
        jButton35 = new JButton();
        jButton36 = new JButton();
        jButton37 = new JButton();
        jButton38 = new JButton();
        jButton39 = new JButton();
        jButton40 = new JButton();
        jButton41 = new JButton();
        jButton42 = new JButton();
        jButton43 = new JButton();
        jButton44 = new JButton();
        jCheckBox1 = new JCheckBox("\u1260\u12D3\u120B\u1275");
        jCheckBox1.setFont(myFont);
        jCheckBox1.addItemListener(handler);
        jCheckBox2 = new JCheckBox("\u12E8\u1235\u122B \u1240\u1293\u1275 \u1265\u12DB\u1275");
        jCheckBox2.setFont(myFont);
        jCheckBox2.addItemListener(handler);
        jLabel1 = new JLabel("\u12C8\u122D", SwingConstants.CENTER);
        jLabel1.setFont(myFont);
        jLabel2 = new JLabel("\u12D3.\u121D", SwingConstants.CENTER);
        jLabel2.setFont(myFont);
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel("\u1240\u1295 \u12C8\u122D \u12D3.\u121D", SwingConstants.RIGHT);
        jLabel13.setFont(myFont);
        jLabel14 = new JLabel("\u1240\u1295 \u12C8\u122D \u12D3.\u121D", SwingConstants.CENTER);
        jLabel14.setFont(myFont);
        jLabel15 = new JLabel("\u1260", SwingConstants.CENTER);
        jLabel15.setFont(myFont);
        jLabel16 = new JLabel("\u12A5\u1293 \u1260", SwingConstants.CENTER);
        jLabel16.setFont(myFont);
        jLabel17 = new JLabel("\u1218\u12AB\u12A8\u120D \u12EB\u1209");
        jLabel17.setFont(myFont);
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jPanel1Layout = new GroupLayout(jPanel1);
        jPanel2Layout = new GroupLayout(jPanel2);
        jPanel3Layout = new GroupLayout(jPanel3);
        jPanel1.setLayout(jPanel1Layout);
        jPanel2.setLayout(jPanel2Layout);
        jPanel3.setLayout(jPanel3Layout);
        jPanel1Layout.setAutoCreateGaps(false);
        jPanel1Layout.setAutoCreateContainerGaps(false);
        jPanel2Layout.setAutoCreateGaps(true);
        jPanel2Layout.setAutoCreateContainerGaps(true);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton4)
                                .addComponent(jButton5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addComponent(jButton10)
                                .addComponent(jButton11)
                                .addComponent(jButton12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton16)
                                .addComponent(jButton17)
                                .addComponent(jButton18)
                                .addComponent(jButton19))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addComponent(jButton24)
                                .addComponent(jButton25)
                                .addComponent(jButton26))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton30)
                                .addComponent(jButton31)
                                .addComponent(jButton32)
                                .addComponent(jButton33))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton37)
                                .addComponent(jButton38)
                                .addComponent(jButton39)
                                .addComponent(jButton40))
                        .addComponent(jButton44)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(jLabel1, jLabel2, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(jTextField1, jTextField2, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(jTextField2, jButton1, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addComponent(jButton7)
                                .addComponent(jButton8))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addComponent(jButton14)
                                .addComponent(jButton15))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton20)
                                .addComponent(jButton21)
                                .addComponent(jButton22))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton27)
                                .addComponent(jButton28)
                                .addComponent(jButton29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton34)
                                .addComponent(jButton35)
                                .addComponent(jButton36))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton41)
                                .addComponent(jButton42)
                                .addComponent(jButton43))
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, jButton1, jButton2, jButton3, jButton4, jButton5,
                jButton6, jButton7, jButton8, jButton9, jButton10, jButton11, jButton12, jButton13,
                jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton20, jButton21,
                jButton22, jButton23, jButton24, jButton25, jButton26, jButton27, jButton28, jButton29,
                jButton30, jButton31, jButton32, jButton33, jButton34, jButton35, jButton36, jButton37,
                jButton38, jButton39, jButton40, jButton41, jButton42, jButton43, jButton44);
        jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8,
                jLabel9, jLabel10, jLabel11);
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(jTextField1, jLabel3, LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(jLabel3, jButton2, LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jButton10)
                        .addComponent(jButton11)
                        .addComponent(jButton12)
                        .addComponent(jButton13)
                        .addComponent(jButton14)
                        .addComponent(jButton15))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton16)
                        .addComponent(jButton17)
                        .addComponent(jButton18)
                        .addComponent(jButton19)
                        .addComponent(jButton20)
                        .addComponent(jButton21)
                        .addComponent(jButton22))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton23)
                        .addComponent(jButton24)
                        .addComponent(jButton25)
                        .addComponent(jButton26)
                        .addComponent(jButton27)
                        .addComponent(jButton28)
                        .addComponent(jButton29))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton30)
                        .addComponent(jButton31)
                        .addComponent(jButton32)
                        .addComponent(jButton33)
                        .addComponent(jButton34)
                        .addComponent(jButton35)
                        .addComponent(jButton36))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton37)
                        .addComponent(jButton38)
                        .addComponent(jButton39)
                        .addComponent(jButton40)
                        .addComponent(jButton41)
                        .addComponent(jButton42)
                        .addComponent(jButton43))
                .addComponent(jButton44)
                .addPreferredGap(jButton44, jLabel4, LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(jLabel4, jLabel5, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(jLabel5, jLabel6, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(jLabel6, jLabel7, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(jLabel7, jLabel8, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(jLabel8, jLabel9, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(jLabel9, jLabel10, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(jLabel10, jLabel11, LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(SwingConstants.VERTICAL, jButton2, jButton3, jButton4, jButton5,
                jButton6, jButton7, jButton8, jButton9, jButton10, jButton11, jButton12, jButton13,
                jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton20, jButton21,
                jButton22, jButton23, jButton24, jButton25, jButton26, jButton27, jButton28, jButton29,
                jButton30, jButton31, jButton32, jButton33, jButton34, jButton35, jButton36, jButton37,
                jButton38, jButton39, jButton40, jButton41, jButton42, jButton43, jButton44);
        jPanel1Layout.linkSize(SwingConstants.VERTICAL, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8,
                jLabel9, jLabel10, jLabel11);

        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3)
                                .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCheckBox1)
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)
                        .addComponent(jLabel30)
                        .addComponent(jLabel31)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup()
                        .addComponent(jLabel14)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField4)
                                .addComponent(jLabel17))
                        .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(SwingConstants.HORIZONTAL, jLabel13, jLabel14, jTextField3, jTextField4);
        jPanel2Layout.linkSize(SwingConstants.HORIZONTAL, jLabel18, jLabel19, jLabel20, jLabel21, jLabel22,
                jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31);

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3)
                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4)
                        .addComponent(jLabel17))
                .addComponent(jCheckBox1)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(jLabel18, jLabel19, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(jLabel19, jLabel20, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(jLabel20, jLabel21, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(jLabel21, jLabel22, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(jLabel22, jLabel23, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(jLabel23, jLabel24, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(jLabel24, jLabel25, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(jLabel25, jLabel26, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(jLabel26, jLabel27, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(jLabel27, jLabel28, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(jLabel28, jLabel29, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(jLabel28, jLabel30, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(jLabel30, jLabel31, LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31))
                        .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(SwingConstants.VERTICAL, jLabel18, jLabel19, jLabel20, jLabel21, jLabel22,
                jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31);

        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jTextArea, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextArea, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(jTextArea, jLabel34, LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane.setFont(myFont);
        jTabbedPane.addTab("\u1240\u1295 \u1218\u1241\u1320\u122A\u12EB", null, jPanel1, "");
        jTabbedPane.addTab("\u12E8\u1260\u12D3\u120B\u1275 \u121B\u12CD\u132B", null, jPanel2, "");
        jTabbedPane.addTab("\u1308\u1208\u133B", null, jPanel3, "");
        add(jTabbedPane);
    }

    private class CheckBoxHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            if (jCheckBox1.isSelected() | jCheckBox2.isSelected()) {
                try {
                    String d1 = jTextField3.getText();
                    String d2 = jTextField4.getText();

                    if ((d1.length() == 8) && (d2.length() == 8)) {
                        if (((((1 <= Integer.parseInt(d1.substring(0, 2)) && Integer.parseInt(d1.substring(0, 2)) <= 30)
                                && (1 <= Integer.parseInt(d1.substring(2, 4)) && (Integer.parseInt(d1.substring(2, 4)) <= 12)))
                                | (Integer.parseInt(d1.substring(2, 4)) == 13 && Integer.parseInt(d1.substring(4)) % 4 == 3
                                && (1 <= Integer.parseInt(d1.substring(0, 2)) && Integer.parseInt(d1.substring(0, 2)) <= 6))
                                | (Integer.parseInt(d1.substring(2, 4)) == 13 && Integer.parseInt(d1.substring(4)) % 4 != 3
                                && (1 <= Integer.parseInt(d1.substring(0, 2)) && Integer.parseInt(d1.substring(0, 2)) <= 5)))
                                && (1 <= Integer.parseInt(d1.substring(4)) && Integer.parseInt(d1.substring(4)) <= 9999))
                                && (((((1 <= Integer.parseInt(d2.substring(0, 2)) && Integer.parseInt(d2.substring(0, 2)) <= 30)
                                && (1 <= Integer.parseInt(d2.substring(2, 4)) && (Integer.parseInt(d2.substring(2, 4)) <= 12)))
                                | (Integer.parseInt(d2.substring(2, 4)) == 13 && Integer.parseInt(d2.substring(4)) % 4 == 3
                                && (1 <= Integer.parseInt(d2.substring(0, 2)) && Integer.parseInt(d2.substring(0, 2)) <= 6))
                                | (Integer.parseInt(d2.substring(2, 4)) == 13 && Integer.parseInt(d2.substring(4)) % 4 != 3
                                && (1 <= Integer.parseInt(d2.substring(0, 2)) && Integer.parseInt(d2.substring(0, 2)) <= 5)))
                                && (1 <= Integer.parseInt(d2.substring(4)) && Integer.parseInt(d2.substring(4)) <= 9999)))) {
                            if (EternalEthiopiaFunction.no_of_days(d1) <= EternalEthiopiaFunction.no_of_days(d2)) {
                                EternalEthiopiaFunction.display_holidays(d1, d2, 1);
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    Font myFont2 = InternalFont.getFont(InternalFont.Custom, Font.BOLD, 14);
                    UIManager.put("OptionPane.messageFont", myFont2);
                    JOptionPane.showMessageDialog(null, "\u1270\u1233\u1235\u1270\u12CB\u120D\u1362  \u12A5\u1295\u12F0\u1308\u1293"
                            + " \u12EB\u1235\u1308\u1261!", "\u1218\u120D\u12D5\u12AD\u1275!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    
}       

