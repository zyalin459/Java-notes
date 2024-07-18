package kcb;

import javax.swing.*;
import javax.swing.event.TableModelListener;

public class KCB {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new KCBDate() {
            @Override
            public void removeTableModelListener(TableModelListener l) {

            }
        });
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
