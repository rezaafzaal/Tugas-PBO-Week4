import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Clock {
    private JFrame frame;
    private JLabel timeLabel;
    private ClockDisplay clock;
    private boolean running;
    private TimerThread tThread;

    public Clock() {
        clock = new ClockDisplay();
        makeFrame();
    }

    private void start() {
        if (!running) {
            running = true;
            tThread = new TimerThread();
            tThread.start();
        }
    }

    private void stop() {
        running = false;
    }

    private void step() {
        clock.timeTick();
        timeLabel.setText(clock.getTime());
    }

    private void makeFrame() {
        frame = new JFrame("Digital Clock");
        JPanel content = (JPanel) frame.getContentPane();
        content.setBorder(new EmptyBorder(10, 50, 10, 50));
        content.setLayout(new BorderLayout(10, 10));

        timeLabel = new JLabel(clock.getTime(), SwingConstants.CENTER);
        timeLabel.setFont(new Font("Consolas", Font.BOLD, 72));
        content.add(timeLabel, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new GridLayout(1, 3));
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton stepBtn = new JButton("Step");

        startBtn.addActionListener(e -> start());
        stopBtn.addActionListener(e -> stop());
        stepBtn.addActionListener(e -> step());

        buttons.add(startBtn);
        buttons.add(stopBtn);
        buttons.add(stepBtn);

        content.add(buttons, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class TimerThread extends Thread {
        public void run() {
            while (running) {
                step();
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                   
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Clock());
    }
}
