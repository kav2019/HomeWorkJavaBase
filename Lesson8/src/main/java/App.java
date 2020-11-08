import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    protected boolean isAlive = true;

    public App(final int SIZE) {
        setTitle("Bombs and Deaths");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        boolean[][] bombs = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bombs[i][j] = Math.random() <= 0.25;
            }
        }

        JButton[][] buttons = new JButton[SIZE][SIZE];

        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = new JButton();
                buttons[i][j] = button;
                button.setText("???");
                int ii = i;
                int jj = j;
                button.addActionListener(actionEvent -> {
                    if (!isAlive) return;
                    if (bombs[ii][jj]) {
                        button.setText("\u2620");
                        button.setFont(button.getFont().deriveFont(40.F));
                        button.setBackground(Color.RED);
                        button.setForeground(Color.WHITE);
                        isAlive = false;
                        for (int x = 0; x < SIZE; x++) { //Открываем бомбы
                            for (int y = 0; y < SIZE; y++) { //пробегаемся по массиву со значениями бомб
                                if (bombs[x][y] == true) { //если нахоим, то открываем из массива кнопок нужную
                                    buttons[x][y].setBackground(Color.RED);
                                }
                            }
                        }
                    } else {
                        int countBomb = 0; // устанавливаем счетчик бомб
                        if(ii == 0 && jj ==0){ //проверяем верхний левый угол
                            for (int m = 0; m <= ii + 1 ; m++){
                                for (int k = 0; k <= jj + 1; k++){
                                    if (bombs[m][k] == true){
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( ii == 0 && jj == SIZE -1){ //проверяем верхний правый угол
                            for (int m = 0; m <= ii ; m++){
                                for (int k = jj - 1; k <= jj; k++){
                                    if (bombs[m][k] == true){
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( ii == SIZE -1  && jj == 0){ //проверяем нижний левый угол
                            for (int m = ii - 1; m <= ii ; m++){
                                for (int k = 0; k <= jj + 1; k++){
                                    if (bombs[m][k] == true){
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( ii == SIZE -1  && jj == SIZE - 1){ //проверяем нижний правый угол
                            for (int m = ii - 1; m <= ii ; m++){
                                for (int k = jj - 1; k <= jj ; k++){
                                    if (bombs[m][k] == true){
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if (ii > 0 && jj > 0 && jj < SIZE - 1 && ii < SIZE - 1) { //проверяем если в центре
                            for (int k = ii - 1; k <= ii + 1; k++) {
                                for (int m = jj - 1; m <= jj + 1; m++) {
                                    if (bombs[k][m] == true) {
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( ii > 1 && ii < SIZE - 1  && jj == 0){ //проверяем если в центре слева
                            for (int k = ii - 1; k <= ii + 1; k++) {
                                for (int m = 0; m <= jj + 1; m++) {
                                    if (bombs[k][m] == true) {
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( ii == 0  && jj > 0 && jj < SIZE - 1){ //проверяем если в центре сверху
                            for (int k = 0; k <= ii + 1; k++) {
                                for (int m = jj-1; m <= jj+1; m++) {
                                    if (bombs[k][m] == true) {
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if (ii == SIZE -1 && jj > 0 && jj < SIZE -1){ //проверяем если в центре внизу
                            for(int k = ii -1; k <= ii; k++){
                                for (int m = jj - 1; m <= jj+1 ; m++){
                                    if (bombs[k][m] == true){
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        if ( jj == SIZE - 1  && ii > 0 && ii < SIZE - 1){ //проверяем если в центре справа
                            for (int k = ii - 1; k <= ii+1; k++) {
                                for (int m = jj-1; m <= jj; m++) {
                                    if (bombs[k][m] == true) {
                                        countBomb++;
                                    }
                                }
                            }
                        }
                        button.setText(String.valueOf(countBomb));
                        button.setBackground(Color.GREEN);
                    }
                });
                add(button);
            }
        }
        setVisible(true);
    }
}