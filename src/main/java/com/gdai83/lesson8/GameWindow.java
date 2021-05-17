package com.gdai83.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GameWindow extends JFrame {
        private JTextField textFieldInfo;
        private JTextField textField;
        private JButton newGame;

        private int randomNumber;
        private int count=3;

        private void setRandomNumber(){
            this.randomNumber = (int)(Math.random() * 10) + 1; // [1, 10]
        }

        public GameWindow() {
            setRandomNumber();

            setTitle("Игра: Угадай число");
            setBounds(600, 300, 600, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            // setLayout(new BorderLayout());
            setResizable(false);

            JPanel textPanel = new JPanel();
            add(textPanel, BorderLayout.NORTH);

            textFieldInfo = new JTextField();
            textPanel.add(textFieldInfo);

            textField = new JTextField();
            textPanel.add(textField);

            textFieldInfo.setText("Игра началась!");
            textFieldInfo.setEditable(false);
            textFieldInfo.setHorizontalAlignment(SwingConstants.CENTER);

            textField.setText("Программа загадала число от 1 до 10");
            textField.setEditable(false);
            textField.setHorizontalAlignment(SwingConstants.CENTER);

            Font font = new Font("Arial", Font.PLAIN, 20);
            textFieldInfo.setFont(font);
            textField.setFont(font);

            JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
            add(buttonsPanel, BorderLayout.CENTER);

            for (int i = 1; i <= 10; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.setFont(font);
                buttonsPanel.add(button);

                int buttonIndex = i;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tryToAnswer(buttonIndex);
                    }
                });
            }

            newGame = new JButton("У Вас "+count+" попытки.");
            newGame.setFont(font);
            newGame.setEnabled(false);
            add(newGame, BorderLayout.SOUTH);
            newGame.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count=3;
                    setRandomNumber();
                    textFieldInfo.setText("Игра началась!");
                    textField.setText("Программа загадала число от 1 до 10");
                    newGame.setText("У Вас "+count+" попытки.");
                    newGame.setEnabled(false);
                }
            });

            setVisible(true);
        }

        private void tryToAnswer(int answer) {
            if (count == 1) {
                textField.setText("У Вас закончились ходы :(");
                newGame.setEnabled(true);
                newGame.setText("Играть сначала");
                return;
            }
            if (answer == randomNumber) {
                textFieldInfo.setText("Вы угадали!!!");
                textField.setText("Ответ: " + randomNumber);
            } else if (answer > randomNumber) {
                textFieldInfo.setText("Не угадали!");
                textField.setText("Загаданное число меньше, чем " + answer);
                count--;
                newGame.setText("У Вас "+count+" попытки.");
            } else {
                textFieldInfo.setText("Не угадали!");
                textField.setText("Загаданное число больше, чем " + answer);
                count--;
                newGame.setText("У Вас "+count+" попытки.");
            }
        }

}
