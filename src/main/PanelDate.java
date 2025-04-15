package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PanelDate extends JLayeredPane {
    private final int month;
    private final int year;

    private final Color SELECTED_DAY_COLOR = Color.YELLOW;
    private final Color APPROVED_DAY_COLOR = Color.GREEN;

    private Cell selectedCell = null;

    public PanelDate(int month, int year) {
        this.month = month;
        this.year = year;
        initComponents();
        init();
    }

    private void init() {
        setDayTitles();
        setDate();
        addCellListeners();
        highlightDatabaseDays();
    }

    private void setDayTitles() {
        Component[] dayTitles = {mon, tue, wed, thu, fri, sat, sun};
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int i = 0; i < dayTitles.length; i++) {
            ((Cell) dayTitles[i]).asTitle();
            ((Cell) dayTitles[i]).setText(daysOfWeek[i]);
        }
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY;
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            if (com instanceof Cell) {
                Cell cell = (Cell) com;
                if (!cell.isTitle()) {
                    int dayOfMonth = calendar.get(Calendar.DATE);
                    cell.setText(String.valueOf(dayOfMonth));
                    cell.setDate(calendar.getTime());
                    cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                    if (toDay.isToDay(new ToDay(dayOfMonth, month, year))) {
                        cell.setAsToDay();
                    }
                    calendar.add(Calendar.DATE, 1);
                }
            }
        }
    }

    private void addCellListeners() {
        for (Component com : getComponents()) {
            if (com instanceof Cell) {
                Cell cell = (Cell) com;
                if (!cell.isTitle()) {
                    cell.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (shouldAllowClick(cell)) {
                                handleCellClick(cell);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean shouldAllowClick(Cell cell) {
        // Add logic here to determine if the cell should be clickable.
        // For now, let's disable all cells.
        return false;
    }

    private void handleCellClick(Cell cell) {
        SwingUtilities.invokeLater(() -> {
            if (selectedCell != null) {
                selectedCell.setBackground(SELECTED_DAY_COLOR);
            }
            cell.setBackground(SELECTED_DAY_COLOR);
            selectedCell = cell;
        });
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    public void setColorForDay(int day, boolean isSelected, boolean isApproved) {
        Color color = isSelected ? SELECTED_DAY_COLOR : (isApproved ? APPROVED_DAY_COLOR : SELECTED_DAY_COLOR);
        for (Component com : getComponents()) {
            if (com instanceof Cell) {
                Cell cell = (Cell) com;
                if (!cell.isTitle() && Integer.parseInt(cell.getText()) == day) {
                    cell.setBackground(color);
                }
            }
        }
    }

    public void changeColorForSelectedDay(int day) {
        setColorForDay(day, true, false);
    }

    public void setDateFormatMMDDYYYY() {
        for (Component com : getComponents()) {
            if (com instanceof Cell) {
                Cell cell = (Cell) com;
                cell.setDateFormat("MM/dd/yyyy");
            }
        }
    }

    private void clearSelectedDays() {
        for (Component com : getComponents()) {
            if (com instanceof Cell) {
                Cell cell = (Cell) com;
                cell.setBackground(SELECTED_DAY_COLOR);
            }
        }
    }

    public void highlightDay(int day, int month, int year) {
        if (this.month == month && this.year == year) {
            clearSelectedDays();
            for (Component com : getComponents()) {
                if (com instanceof Cell) {
                    Cell cell = (Cell) com;
                    if (!cell.isTitle() && Integer.parseInt(cell.getText()) == day) {
                        cell.setBackground(SELECTED_DAY_COLOR);
                        break;
                    }
                }
            }
        }
    }
private void highlightDatabaseDays() {
     String dbUrl = "jdbc:mysql://127.0.0.1:3306/reg";
        String dbUser = "root";
        String dbPassword = "";
    Set<Integer> highlightedDays = new HashSet<>();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure the MySQL driver is loaded
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "SELECT Day, Approved FROM calendar WHERE Month = ? AND Year = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, month);
                stmt.setInt(2, year);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int day = rs.getInt("Day");
                        boolean isApproved = rs.getBoolean("Approved");
                        // Check if the day has already been highlighted
                        if (!highlightedDays.contains(day)) {
                            setColorForDay(day, false, isApproved);
                            // Add the day to the set of highlighted days
                            highlightedDays.add(day);
                        }
                    }
                }
            }
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), "Error occurred while loading the MySQL driver: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), "Error occurred while retrieving dates from the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new main.Cell();
        mon = new main.Cell();
        tue = new main.Cell();
        wed = new main.Cell();
        thu = new main.Cell();
        fri = new main.Cell();
        sat = new main.Cell();
        cell8 = new main.Cell();
        cell9 = new main.Cell();
        cell10 = new main.Cell();
        cell11 = new main.Cell();
        cell12 = new main.Cell();
        cell13 = new main.Cell();
        cell14 = new main.Cell();
        cell15 = new main.Cell();
        cell16 = new main.Cell();
        cell17 = new main.Cell();
        cell18 = new main.Cell();
        cell19 = new main.Cell();
        cell20 = new main.Cell();
        cell21 = new main.Cell();
        cell22 = new main.Cell();
        cell23 = new main.Cell();
        cell24 = new main.Cell();
        cell25 = new main.Cell();
        cell26 = new main.Cell();
        cell27 = new main.Cell();
        cell28 = new main.Cell();
        cell29 = new main.Cell();
        cell30 = new main.Cell();
        cell31 = new main.Cell();
        cell32 = new main.Cell();
        cell33 = new main.Cell();
        cell34 = new main.Cell();
        cell35 = new main.Cell();
        cell36 = new main.Cell();
        cell37 = new main.Cell();
        cell38 = new main.Cell();
        cell39 = new main.Cell();
        cell40 = new main.Cell();
        cell41 = new main.Cell();
        cell42 = new main.Cell();
        cell43 = new main.Cell();
        cell44 = new main.Cell();
        cell45 = new main.Cell();
        cell46 = new main.Cell();
        cell47 = new main.Cell();
        cell48 = new main.Cell();
        cell49 = new main.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(222, 12, 12));
        sun.setText("Sun");
        sun.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(fri);

        sat.setForeground(new java.awt.Color(255, 0, 0));
        sat.setText("Sat");
        sat.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell25ActionPerformed(evt);
            }
        });
        add(cell25);

        cell26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void cell25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell25ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Cell cell10;
    private main.Cell cell11;
    private main.Cell cell12;
    private main.Cell cell13;
    private main.Cell cell14;
    private main.Cell cell15;
    private main.Cell cell16;
    private main.Cell cell17;
    private main.Cell cell18;
    private main.Cell cell19;
    private main.Cell cell20;
    private main.Cell cell21;
    private main.Cell cell22;
    private main.Cell cell23;
    private main.Cell cell24;
    private main.Cell cell25;
    private main.Cell cell26;
    private main.Cell cell27;
    private main.Cell cell28;
    private main.Cell cell29;
    private main.Cell cell30;
    private main.Cell cell31;
    private main.Cell cell32;
    private main.Cell cell33;
    private main.Cell cell34;
    private main.Cell cell35;
    private main.Cell cell36;
    private main.Cell cell37;
    private main.Cell cell38;
    private main.Cell cell39;
    private main.Cell cell40;
    private main.Cell cell41;
    private main.Cell cell42;
    private main.Cell cell43;
    private main.Cell cell44;
    private main.Cell cell45;
    private main.Cell cell46;
    private main.Cell cell47;
    private main.Cell cell48;
    private main.Cell cell49;
    private main.Cell cell8;
    private main.Cell cell9;
    private main.Cell fri;
    private main.Cell mon;
    private main.Cell sat;
    private main.Cell sun;
    private main.Cell thu;
    private main.Cell tue;
    private main.Cell wed;
    // End of variables declaration//GEN-END:variables

    
}
