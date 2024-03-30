package suretrust;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

public class view extends JFrame {

    private static final long serialVersionUID = 1L;
    private Object[] columnNames = {"Name", "Registration_number","Room_number", "bentch", "invigilator_name"};
    private Object[][] data = {
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
        {"kiran kumar", "20F21A0477", new Integer(23), "1st row 4rd bentch","karthick"},
        {"kumar", "20F21A0474", new Integer(23), "1st row 7rd bentch","karthick"},
        {"charan", "20F21A0471", new Integer(23), "1st row 8rd bentch","karthick"},
        {"raju", "20F21A0479", new Integer(23), "1st row 9rd bentch","karthick"},
       
    };
    private JTable table;
    private DefaultTableModel model;
    private javax.swing.Timer timer = null;

    public view() {
        model = new DefaultTableModel(data, columnNames) {

            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        table = new JTable(model) {

            private static final long serialVersionUID = 1L;

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (isRowSelected(row) && isColumnSelected(column)) {
                    ((JComponent) c).setBorder(new LineBorder(Color.red));
                }
                return c;
            }
        };
        ListSelectionModel rowSelMod = table.getSelectionModel();
        rowSelMod.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = table.getSelectedRow();
                int col = table.getSelectedColumn();
                String str = "Selected Row(s): ";
                int[] rows = table.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    str += rows[i] + " ";
                }
                str += "Selected Column(s): ";
                int[] cols = table.getSelectedColumns();
                for (int i = 0; i < cols.length; i++) {
                    str += cols[i] + " ";
                }
                str += "Selected Cell: " + table.getSelectedRow() + ", " + table.getSelectedColumn();
                System.out.println(str);
                Object value = table.getValueAt(row, col);
                System.out.println(String.valueOf(value));
            }
        });
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        JButton button1 = new JButton("Remove all rows");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                if (model.getRowCount() > 0) {
                    for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
                    }
                }
                System.out.println("model.getRowCount() --->" + model.getRowCount());
            }
        });
        JButton button2 = new JButton("Add new rows");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                start();
            }
        });
        JPanel southPanel = new JPanel();
        southPanel.add(button1);
        southPanel.add(button2);
        add(southPanel, BorderLayout.SOUTH);
    }

    private void start() {
        timer = new javax.swing.Timer(2500, updateCol());
        timer.start();
    }

    public Action updateCol() {
        return new AbstractAction("text load action") {

            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object[] data0 = {"vasu", "20f21a0489", new Integer(12),"1st row 3bentch","karthick"};
                model.addRow(data0);
                Object[] data1 = {"dharani", "20f21a0490", new Integer(12),"1st row 6bentch","karthick"};
                model.addRow(data1);
                Object[] data2 = {"sabiya", "20f21a0499", new Integer(12),"1st row 2bentch","karthick"};
                model.addRow(data2);
                Object[] data3 = {"afroz", "20f21a0479", new Integer(12),"1st row 3bentch","karthick"};
                model.addRow(data3);
                System.out.println("model.getRowCount() --->" + model.getRowCount());
                timer.stop();
                int rowIndex = table.getRowCount() - 1;
                table.changeSelection(rowIndex, 0, false, false);
            }
        };
    }

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                view frame = new view();
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
