import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame{
    JPDemo jp1;
    FDemo(){
        super.setTitle("snake & ladder");
        jp1=new JPDemo();
        add(jp1);
    }
}




class JPDemo extends JPanel implements ActionListener{
    ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9;


    Image swt,board,player1,player2,dice,player11,player22,snake,ladder;


    JButton b1,b2;


    JTextField t1,t2,t3,t4,t5,t6;


    Demo1 d=new Demo1();
    JPDemo(){
        setBackground(Color.BLACK);



        img1=new ImageIcon("swt.png");
        img2=new ImageIcon("board.jpg");
        img3=new ImageIcon("player1.png");
        img4=new ImageIcon("player2.png");
        img5=new ImageIcon("dice.png");
        img6=new ImageIcon("player1.png");
        img7=new ImageIcon("player2.png");
        img8=new ImageIcon("snake.png");
        img9=new ImageIcon("ladder.png");


        swt=img1.getImage();
        board=img2.getImage();
        player1=img3.getImage();
        player2=img4.getImage();
        dice=img5.getImage();
        player11=img6.getImage();
        player22=img7.getImage();
        snake=img8.getImage();
        ladder=img9.getImage();


        setLayout(null);
        b1= new JButton("restart");
        b1.setBounds(560,720,100,30);
        add(b1);
        b1.addActionListener(this);

        b2= new JButton("roll dice");
        b2.setBounds(420,720,100,30);
        add(b2);
        b2.addActionListener(this);

        t1=new JTextField("player1 name");
        t1.setBounds(50,350,100,30);
        add(t1);

        t2=new JTextField("player2 name");
        t2.setBounds(50,450,100,30);
        add(t2);

        t3=new JTextField("player"+d.c+"chance");
        t3.setBounds(200,720,200,30);
        add(t3);

        t4=new JTextField("bit by snake");
        t4.setBounds(50,150,100,30);
        add(t4);

        t5=new JTextField("archived ladder");
        t5.setBounds(50,250,100,30);
        add(t5);

        t6=new JTextField("winner...");
        t6.setBounds(20,720,200,30);
        add(t6);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(swt,0,0,200,200,this);
        g.drawImage(board,200,0,700,700,this);
        g.drawImage(player1,0,350,30,30,this);
        g.drawImage(player2,0,450,30,30,this);
        g.drawImage(dice,50,630,50,50,this);
        g.drawImage(player11,d.x1,d.y1,30,30,this);
        g.drawImage(player22,d.x2,d.y2,30,30,this);
        g.drawImage(snake,0,150,30,30,this);
        g.drawImage(ladder,0,250,30,30,this);
    }
    public void actionPerformed(ActionEvent e){
        Demo1 d=new Demo1();
        int g=0;
        if(e.getSource()==b1){
            d.t1=0;
            d.t2=0;
            d.c=1;
            t3.setText("player"+d.c+"chance");
            d.x1=140;
            d.y1=630;
            d.x2=140;
            d.y2=670;
            repaint();
        }


        if(e.getSource()==b2){
            int random=(int)Math.round(Math.random()*5+1);
            switch (random){
                case 1:
                    img5=new ImageIcon("dice1.png");
                    if(d.c==1){
                        if(d.t1+1<101) {
                            d.t1 += 1;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                        //t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+1<101) {
                            d.t2 += 1;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
                case 2:
                    img5=new ImageIcon("dice2.png");
                    if(d.c==1){
                        if(d.t1+2<101) {
                            d.t1 += 2;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                        //t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+2<101) {
                            d.t2 += 2;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
                case 3:
                    img5=new ImageIcon("dice3.png");
                    if(d.c==1){
                        if(d.t1+3<101) {
                            d.t1 += 3;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                        //t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+3<101) {
                            d.t2 += 3;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
                case 4:
                    img5=new ImageIcon("dice4.png");
                    if(d.c==1){
                        if(d.t1+4<101) {
                            d.t1 += 4;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                        //t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+4<101) {
                            d.t2 += 4;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
                case 5:
                    img5=new ImageIcon("dice5.png");
                    if(d.c==1){
                        if(d.t1+5<101) {
                            d.t1 += 5;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                        //t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+5<101) {
                            d.t2 += 5;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
                case 6:
                    img5=new ImageIcon("dice6.png");
                    if(d.c==1){
                        if(d.t1+6<101) {
                            d.t1 += 6;
                        }
                        if(d.ladder(d.t1,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t1,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t1);
                       // t3.setText("player"+d.c+"chance");
                    }
                    else{
                        if(d.t2+6<101) {
                            d.t2 += 6;
                        }
                        if(d.ladder(d.t2,d.c)){
                            t5.setText("player"+d.c+" archived ladder");
                        }
                        if(d.snake(d.t2,d.c)){
                            t4.setText("player"+d.c+" bit by snake");
                        }
                        d.logic(d.t2);
                        //t3.setText("player"+d.c+"chance");
                    }
                    break;
            }
            dice=img5.getImage();
            t3.setText("player"+d.c+"chance");
            repaint();
            g=d.c%2+1;
            if(d.t1==100||d.t2==100){
                t6.setText("player"+g+"  won the match,restart game...");
            }
        }
    }
}


public class Demo1 {
    public static int x1=140,x2=140;
    public static int y1=630,y2=670;
    public static int t1=0,t2=0,c=1;
    public static void main(String args[]){
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setBounds(0,0,1100,900);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void logic(int total){
        int a,b;
        if(total%10==0){
            a=total/10-1;
            b=10;
        }
        else{
            a=total/10;
            b=total%10;
        }
        if(c==1){
            if(a%2!=0){
                x1=920-(b*70);
            }
            else{
                x1=160+(b*70);
            }

            y1=630-(a*70);
            c=2;

        }
        else {
            if (a % 2 != 0) {
                x2 = 920 - (b * 70);
            } else {
                x2 = 160 + (b * 70);
            }

            y2 = 670 - (a * 70);
            c = 1;
        }
    }

    public boolean ladder(int total,int k){
        if(k==1){
            if(total==4) {
                t1 = 25;
                return true;
            }
            if(total==13) {
                t1 = 46;
                return true;
            }
            if(total==33) {
                t1 = 49;
                return true;
            }
            if(total==50) {
                t1 = 69;
                return true;
            }
            if(total==42) {
                t1 = 63;
                return true;
            }
            if(total==62) {
                t1 = 81;
                return true;
            }
            if(total==74) {
                t1 = 92;
                return true;
            }
        }
        else if (k==2){
            if(total==4) {
                t2 = 25;
                return true;
            }
            if(total==13) {
                t2 = 46;
                return true;
            }
            if(total==33) {
                t2 = 49;
                return true;
            }
            if(total==50) {
                t2 = 69;
                return true;
            }
            if(total==42) {
                t2 = 63;
                return true;
            }
            if(total==62) {
                t2 = 81;
                return true;
            }
            if(total==74) {
                t2 = 92;
                return true;
            }
        }
        return false;
    }
    public boolean snake(int total,int k){
        if(k==1){
            if(total==27) {
                t1 = 5;
                return true;
            }
            if(total==40) {
                t1 = 3;
                return true;
            }
            if(total==43) {
                t1 = 18;
                return true;
            }
            if(total==54) {
                t1 = 31;
                return true;
            }
            if(total==66) {
                t1 = 45;
                return true;
            }
            if(total==76) {
                t1 = 58;
                return true;
            }
            if(total==89) {
                t1 = 53;
                return true;
            }
            if(total==99){
                t1=41;
                return true;
            }
        }
        else if (k==2){
            if(total==27) {
                t2 = 5;
                return true;
            }
            if(total==40) {
                t2 = 3;
                return true;
            }
            if(total==43) {
                t2 = 18;
                return true;
            }
            if(total==54) {
                t2 = 31;
                return true;
            }
            if(total==66) {
                t2 = 45;
                return true;
            }
            if(total==76) {
                t2 = 58;
                return true;
            }
            if(total==89) {
                t2 = 53;
                return true;
            }
            if(total==99){
                t2=41;
                return true;
            }
        }
        return false;
    }
}
