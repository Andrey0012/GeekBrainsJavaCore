package ru.geekbrains.lesson4;

import javafx.scene.effect.DropShadowBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private final JList <TextMessage> messageList;
    private final DefaultListModel<TextMessage> messageListModel;
    private final TextMessageCellRenderer messageCellRenderer;
    private final JScrollPane scroll;
    private final JPanel sendMessagePanel;
    private final JButton sendButton;
    private final JTextField messageField;
    public MainWindow () throws HeadlessException {
        setTitle("Application");
        setBounds(200,200,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        messageList = new JList<>();
        messageListModel = new DefaultListModel<>();
        messageList.setModel(messageListModel);
        messageCellRenderer = new TextMessageCellRenderer();
        messageList.setCellRenderer(messageCellRenderer);


        scroll = new JScrollPane(messageList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll,BorderLayout.CENTER);

        sendMessagePanel= new JPanel();
        sendMessagePanel.setLayout(new BorderLayout());
        sendButton = new JButton("Отправить");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text = messageField.getText();
               if (text != null && !text.trim().isEmpty()) {
                   TextMessage msg = new TextMessage("Вы", text);
                   messageListModel.add(messageListModel.size(),msg);
                   messageField.setText(null);
               }
            }
        });
        sendMessagePanel.add(sendButton,BorderLayout.EAST);
        messageField = new JTextField();
        sendMessagePanel.add(messageField,BorderLayout.CENTER);

        add(sendMessagePanel,BorderLayout.SOUTH);


        setVisible(true);

     //   setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
     //   setLayout(new BorderLayout());
      //  setLayout(new FlowLayout());

      /*  JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button1 = new JButton("Center");
        JButton button2 = new JButton("East");
        JButton button3 = new JButton("West");
        JButton button4 = new JButton("Заголовок окна");
    //    JButton button5 = new JButton("South");

      //  panel.add(button1,BorderLayout.CENTER);
     /*   button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   JOptionPane.showMessageDialog(MainWindow.this,"Message", "Title", JOptionPane.INFORMATION_MESSAGE);

            }
        });*/

        //создаем многострочное текстовое поле
     /*   panel.add(new JScrollPane(messageArea));
        getContentPane().add(new JScrollPane(panel)); // прокуртка и добавление поляв окно

        panel.add(button2,BorderLayout.EAST);
        panel.add(button3,BorderLayout.WEST);
        panel.add(button4,BorderLayout.NORTH);
     //   panel.add(button5,BorderLayout.SOUTH);

    //    add(panel,BorderLayout.CENTER); // добавляекм текстовое поле

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));

        add(panel2,BorderLayout.SOUTH);
        JTextField field = new JTextField();
        JButton button11 = new JButton("Отправить");

        panel2.add(field);
        panel2.add(button11);

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    /*    JButton button11 = new JButton("Button11");
        JButton button21 = new JButton("Button21");
        JButton button31 = new JButton("Button31");


        panel2.add(button11);
        panel2.add(button21);
        panel2.add(button31); */

    }
}
