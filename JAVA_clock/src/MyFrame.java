import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame{

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GHORI");
        this.setLayout(new FlowLayout());
        this.setSize(350,250);
        this.setResizable(false);

        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        timeLabel = new JLabel();
        dayLabel = new JLabel();
        dateLabel = new JLabel();

        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,45));

        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();

    }

    public void setTime(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
