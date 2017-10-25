package telas;

import Weka.AcessoWeka;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {

    private final int respostas[];
    private String caminhoBase;

    public TelaPrincipal() {
        respostas = new int[15];

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRdBtn1_1 = new javax.swing.JRadioButton();
        jRdBtn1_2 = new javax.swing.JRadioButton();
        jRdBtn1_3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRdBtn2_1 = new javax.swing.JRadioButton();
        jRdBtn2_2 = new javax.swing.JRadioButton();
        jRdBtn2_3 = new javax.swing.JRadioButton();
        jRdBtn2_4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jRdBtn3_1 = new javax.swing.JRadioButton();
        jRdBtn3_2 = new javax.swing.JRadioButton();
        jRdBtn3_3 = new javax.swing.JRadioButton();
        jRdBtn3_4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRdBtn4_1 = new javax.swing.JRadioButton();
        jRdBtn4_2 = new javax.swing.JRadioButton();
        jRdBtn4_3 = new javax.swing.JRadioButton();
        jRdBtn4_4 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRdBtn5_1 = new javax.swing.JRadioButton();
        jRdBtn5_2 = new javax.swing.JRadioButton();
        jRdBtn5_3 = new javax.swing.JRadioButton();
        jRdBtn5_4 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jRdBtn6_1 = new javax.swing.JRadioButton();
        jRdBtn6_2 = new javax.swing.JRadioButton();
        jRdBtn6_3 = new javax.swing.JRadioButton();
        jRdBtn6_4 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jRdBtn7_1 = new javax.swing.JRadioButton();
        jRdBtn7_2 = new javax.swing.JRadioButton();
        jRdBtn7_3 = new javax.swing.JRadioButton();
        jRdBtn7_4 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRdBtn8_1 = new javax.swing.JRadioButton();
        jRdBtn8_2 = new javax.swing.JRadioButton();
        jRdBtn8_3 = new javax.swing.JRadioButton();
        jRdBtn8_4 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRdBtn9_1 = new javax.swing.JRadioButton();
        jRdBtn9_2 = new javax.swing.JRadioButton();
        jRdBtn9_3 = new javax.swing.JRadioButton();
        jRdBtn9_4 = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jRdBtn10_1 = new javax.swing.JRadioButton();
        jRdBtn10_2 = new javax.swing.JRadioButton();
        jRdBtn10_3 = new javax.swing.JRadioButton();
        jRdBtn10_4 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jRdBtn11_1 = new javax.swing.JRadioButton();
        jRdBtn11_2 = new javax.swing.JRadioButton();
        jRdBtn11_3 = new javax.swing.JRadioButton();
        jRdBtn11_4 = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jRdBtn12_1 = new javax.swing.JRadioButton();
        jRdBtn12_2 = new javax.swing.JRadioButton();
        jRdBtn12_3 = new javax.swing.JRadioButton();
        jRdBtn12_4 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jRdBtn13_1 = new javax.swing.JRadioButton();
        jRdBtn13_2 = new javax.swing.JRadioButton();
        jRdBtn13_3 = new javax.swing.JRadioButton();
        jButton13 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jRdBtn14_1 = new javax.swing.JRadioButton();
        jRdBtn14_2 = new javax.swing.JRadioButton();
        jRdBtn14_3 = new javax.swing.JRadioButton();
        jRdBtn14_4 = new javax.swing.JRadioButton();
        jButton14 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRdBtn15_1 = new javax.swing.JRadioButton();
        jRdBtn15_2 = new javax.swing.JRadioButton();
        jRdBtn15_3 = new javax.swing.JRadioButton();
        jRdBtn15_4 = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        jPanelFinal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextFieldInstancia = new javax.swing.JTextField();
        ButtonInstancia = new javax.swing.JButton();
        TextFieldJ48 = new javax.swing.JTextField();
        TextFieldIBk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chapéu Seletor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jFileChooser1.setApproveButtonText("Carregar");
        jFileChooser1.setCurrentDirectory(new java.io.File("/home/vander/Documentos"));
        jFileChooser1.setDialogTitle("Selecione a Base");
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFileChooser1, "selecionaBase");

        jLabel4.setText("Você chegou em Hogwarts, o que significa que já comprou uma varinha no Olivaras.");

        jLabel5.setText("Qual o material que compõe o seu cerne?");

        buttonGroup1.add(jRdBtn1_1);
        jRdBtn1_1.setText("Pena de Fênix");

        buttonGroup1.add(jRdBtn1_2);
        jRdBtn1_2.setText("Corda de Coração de Dragão");

        buttonGroup1.add(jRdBtn1_3);
        jRdBtn1_3.setText("Pelo de Unicórnio");

        jButton1.setText("Avançar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jRdBtn1_1)
                    .addComponent(jRdBtn1_2)
                    .addComponent(jRdBtn1_3))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn1_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn1_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn1_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, "Pergunta1");

        jLabel6.setText("Durante uma prova, você percebe que um dos seus colegas está colando. No fim, você ainda");

        jLabel7.setText("é o melhor da classe,  mas o tal colega é o segundo  melhor. O que você faz?");

        buttonGroup2.add(jRdBtn2_1);
        jRdBtn2_1.setText("Avisa o professor imediatamente – colar é errado, independentemente do por quê.");

        buttonGroup2.add(jRdBtn2_2);
        jRdBtn2_2.setText("Nada, mas se eu não fosse o melhor da classe, certamente contaria ao professor.");

        buttonGroup2.add(jRdBtn2_3);
        jRdBtn2_3.setText("Incentivaria o outro estudante a admitir o que fez para o professor.");

        buttonGroup2.add(jRdBtn2_4);
        jRdBtn2_4.setText("Parabeniza-o por conseguir fazer a prova com a pena sem o professor perceber.");

        jButton2.setText("Avançar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jRdBtn2_1)
                    .addComponent(jRdBtn2_2)
                    .addComponent(jRdBtn2_3)
                    .addComponent(jRdBtn2_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn2_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn2_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn2_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn2_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, "Pergunta2");

        jLabel8.setText("Você ficaria mais magoado se alguém o chamasse de...");

        buttonGroup3.add(jRdBtn3_1);
        jRdBtn3_1.setText("Fraco");

        buttonGroup3.add(jRdBtn3_2);
        jRdBtn3_2.setText("Ignorante");

        buttonGroup3.add(jRdBtn3_3);
        jRdBtn3_3.setText("Grosseiro");

        buttonGroup3.add(jRdBtn3_4);
        jRdBtn3_4.setText("Chato");

        jButton3.setText("Avançar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jRdBtn3_1)
                    .addComponent(jRdBtn3_2)
                    .addComponent(jRdBtn3_3)
                    .addComponent(jRdBtn3_4))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn3_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn3_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn3_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn3_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, "Pergunta3");

        jLabel10.setText("Você está em um duelo ferrenho contra um habilidoso oponente. Ele lança um feitiço");

        jLabel11.setText("desconhecido em você, e você grita…");

        buttonGroup4.add(jRdBtn4_1);
        jRdBtn4_1.setText("Expelliarmus!");

        buttonGroup4.add(jRdBtn4_2);
        jRdBtn4_2.setText("Protego!");

        buttonGroup4.add(jRdBtn4_3);
        jRdBtn4_3.setText("Estupefaça!");

        buttonGroup4.add(jRdBtn4_4);
        jRdBtn4_4.setText("Crucio!");

        jButton4.setText("Avançar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jRdBtn4_1)
                    .addComponent(jRdBtn4_2)
                    .addComponent(jRdBtn4_3)
                    .addComponent(jRdBtn4_4))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn4_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn4_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn4_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn4_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, "Pergunta4");

        jLabel12.setText("Você está no seu quinto ano em Hogwarts e acabou de receber um Berrador dos seus pais.");

        jLabel13.setText("Por quê?");

        buttonGroup5.add(jRdBtn5_1);
        jRdBtn5_1.setText("Entrar escondido na Floresta Proibida à noite por causa de uma aposta");

        buttonGroup5.add(jRdBtn5_2);
        jRdBtn5_2.setText("Ser pego colando no N.O.M.s de Adivinhação");

        buttonGroup5.add(jRdBtn5_3);
        jRdBtn5_3.setText("Ir para a detenção depois de ser apanhado na biblioteca fora do seu horário de funcionamento");

        buttonGroup5.add(jRdBtn5_4);
        jRdBtn5_4.setText("Nada! Nunca fiz nada para receber um Berrador");

        jButton5.setText("Avançar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jRdBtn5_1)
                    .addComponent(jRdBtn5_2)
                    .addComponent(jRdBtn5_3)
                    .addComponent(jRdBtn5_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn5_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn5_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn5_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn5_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, "Pergunta5");

        jLabel32.setText("Com qual destas citações do Dumbledore você mais se identifica?");

        buttonGroup6.add(jRdBtn6_1);
        jRdBtn6_1.setText("\"Tenha pena dos vivos e, acima de tudo, daqueles que vivem sem amor.\"");

        buttonGroup6.add(jRdBtn6_2);
        jRdBtn6_2.setText("\"Palavras são, na minha nada humilde opinião, nossa inesgotável fonte de magia.\"");

        buttonGroup6.add(jRdBtn6_3);
        jRdBtn6_3.setText("\"Não importa onde uma pessoa nasce, mas sim quem ela escolher ser.\"");

        buttonGroup6.add(jRdBtn6_4);
        jRdBtn6_4.setText("\"Não vale a pena viver sonhando e se esquecer de viver.\"");

        jButton6.setText("Avançar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jRdBtn6_1)
                    .addComponent(jRdBtn6_2)
                    .addComponent(jRdBtn6_3)
                    .addComponent(jRdBtn6_4))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn6_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn6_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn6_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn6_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, "Pergunta6");

        jLabel14.setText("Qual destas frases melhor descreve seu relacionamento com seus amigos mais próximos?");

        buttonGroup7.add(jRdBtn7_1);
        jRdBtn7_1.setText("Adoro estar cercado de pessoas – quanto mais amigos eu tenho, melhor!");

        buttonGroup7.add(jRdBtn7_2);
        jRdBtn7_2.setText("Tenho poucos amigos, mas que são muito íntimos. Eu confiaria minha vida a eles");

        buttonGroup7.add(jRdBtn7_3);
        jRdBtn7_3.setText("Eu costumo ser reservado, por isso não faço novos amigos com frequência");

        buttonGroup7.add(jRdBtn7_4);
        jRdBtn7_4.setText("Eu costumo me tornar amigo de pessoas que podem me ajudar a ter sucesso");

        jButton7.setText("Avançar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jRdBtn7_1)
                    .addComponent(jRdBtn7_2)
                    .addComponent(jRdBtn7_3)
                    .addComponent(jRdBtn7_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn7_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn7_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn7_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn7_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, "Pergunta7");

        jLabel16.setText("De qual das suas capacidades você mais tem orgulho?");

        buttonGroup8.add(jRdBtn8_1);
        jRdBtn8_1.setText("Minha capacidade de absorver novas informações");

        buttonGroup8.add(jRdBtn8_2);
        jRdBtn8_2.setText("Minha capacidade de fazer novos amigos");

        buttonGroup8.add(jRdBtn8_3);
        jRdBtn8_3.setText("Minha capacidade de conseguir o que quero");

        buttonGroup8.add(jRdBtn8_4);
        jRdBtn8_4.setText("Minha capacidade de guardar segredos");

        jButton8.setText("Avançar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jRdBtn8_1)
                    .addComponent(jRdBtn8_2)
                    .addComponent(jRdBtn8_3)
                    .addComponent(jRdBtn8_4))
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn8_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn8_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn8_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn8_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, "Pergunta8");

        jLabel18.setText("A primeira partida de Quadribol da temporada está chegando e você está ansioso para");

        jLabel19.setText("participar. O que você fará?");

        buttonGroup9.add(jRdBtn9_1);
        jRdBtn9_1.setText("Serei um Apanhador. Quero a glória!");

        buttonGroup9.add(jRdBtn9_2);
        jRdBtn9_2.setText("Serei um Artilheiro. Eu quero estar presente e trabalhar como parte da equipe.");

        buttonGroup9.add(jRdBtn9_3);
        jRdBtn9_3.setText("Batedor. Eu gosto de ter todo aquele poder.");

        buttonGroup9.add(jRdBtn9_4);
        jRdBtn9_4.setText("Eu vou estar na torcida, elevando o moral do time!");

        jButton9.setText("Avançar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jRdBtn9_1)
                    .addComponent(jRdBtn9_2)
                    .addComponent(jRdBtn9_3)
                    .addComponent(jRdBtn9_4))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn9_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn9_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn9_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn9_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        getContentPane().add(jPanel9, "Pergunta9");

        jLabel20.setText("É permitido ter um bichinho de estimação em Hogwarts: uma coruja, um gato ou um sapo.");

        jLabel21.setText("Qual você leva?");

        buttonGroup10.add(jRdBtn10_1);
        jRdBtn10_1.setText("Coruja.");

        buttonGroup10.add(jRdBtn10_2);
        jRdBtn10_2.setText("Gato.");

        buttonGroup10.add(jRdBtn10_3);
        jRdBtn10_3.setText("Sapo.");

        buttonGroup10.add(jRdBtn10_4);
        jRdBtn10_4.setText("Nenhum. Eu não conseguiria tomar conta de um bichinho!");

        jButton10.setText("Avançar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jRdBtn10_1)
                    .addComponent(jRdBtn10_2)
                    .addComponent(jRdBtn10_3)
                    .addComponent(jRdBtn10_4))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn10_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn10_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn10_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn10_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );

        getContentPane().add(jPanel10, "Pergunta10");

        jLabel22.setText("É sábado, você já terminou suas lições de casa e está com tempo livre. Você decide sair um");

        jLabel23.setText("pouco do salão comunal. Aonde você vai?");

        buttonGroup11.add(jRdBtn11_1);
        jRdBtn11_1.setText("Floresta Proibida.");

        buttonGroup11.add(jRdBtn11_2);
        jRdBtn11_2.setText("Biblioteca.");

        buttonGroup11.add(jRdBtn11_3);
        jRdBtn11_3.setText("Cozinha.");

        buttonGroup11.add(jRdBtn11_4);
        jRdBtn11_4.setText("Sala Precisa.");

        jButton11.setText("Avançar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jRdBtn11_1)
                        .addComponent(jRdBtn11_2)
                        .addComponent(jRdBtn11_3)
                        .addComponent(jRdBtn11_4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn11_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn11_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn11_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn11_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addContainerGap())
        );

        getContentPane().add(jPanel11, "Pergunta11");

        jLabel24.setText("O que você veria no Espelho de Ojesed?");

        buttonGroup12.add(jRdBtn12_1);
        jRdBtn12_1.setText("Eu cercado de riquezas.");

        buttonGroup12.add(jRdBtn12_2);
        jRdBtn12_2.setText("Eu cercado de familiares e amigos.");

        buttonGroup12.add(jRdBtn12_3);
        jRdBtn12_3.setText("Eu dotado de extremo conhecimento.");

        buttonGroup12.add(jRdBtn12_4);
        jRdBtn12_4.setText("Eu em uma aventura maravilhosa.");

        jButton12.setText("Avançar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jRdBtn12_1)
                    .addComponent(jRdBtn12_2)
                    .addComponent(jRdBtn12_3)
                    .addComponent(jRdBtn12_4))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn12_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn12_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn12_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn12_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        getContentPane().add(jPanel12, "Pergunta12");

        jLabel26.setText("Escolha uma Relíquia da Morte.");

        buttonGroup13.add(jRdBtn13_1);
        jRdBtn13_1.setText("A Varinha das Varinhas.");

        buttonGroup13.add(jRdBtn13_2);
        jRdBtn13_2.setText("A Pedra da Ressurreição.");

        buttonGroup13.add(jRdBtn13_3);
        jRdBtn13_3.setText("A Capa da Invisibilidade.");

        jButton13.setText("Avançar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jRdBtn13_1)
                    .addComponent(jRdBtn13_2)
                    .addComponent(jRdBtn13_3))
                .addContainerGap(428, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn13_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn13_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn13_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );

        getContentPane().add(jPanel13, "Pergunta13");

        jLabel28.setText("O que você pretende fazer após sair de Hogwarts?");

        buttonGroup14.add(jRdBtn14_1);
        jRdBtn14_1.setText("Eu entraria para o Ministério – quero fazer uma diferença no mundo.");

        buttonGroup14.add(jRdBtn14_2);
        jRdBtn14_2.setText("Acho que passaria um tempo viajando antes de começar a trabalhar.");

        buttonGroup14.add(jRdBtn14_3);
        jRdBtn14_3.setText("Eu sossegaria e constituiria uma família assim que possível!");

        buttonGroup14.add(jRdBtn14_4);
        jRdBtn14_4.setText("Eu continuaria trabalhando duro para ser o mais bem-sucedido possível.");

        jButton14.setText("Avançar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jRdBtn14_1)
                    .addComponent(jRdBtn14_2)
                    .addComponent(jRdBtn14_3)
                    .addComponent(jRdBtn14_4))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(35, 35, 35)
                .addComponent(jRdBtn14_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn14_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn14_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn14_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addContainerGap())
        );

        getContentPane().add(jPanel14, "Pergunta14");

        jLabel30.setText("O Chapéu Seletor leva em conta suas preferências. Então, com qual casa de Hogwarts você");

        jLabel31.setText("mais se identifica?");

        buttonGroup15.add(jRdBtn15_1);
        jRdBtn15_1.setText("Grifinória.");

        buttonGroup15.add(jRdBtn15_2);
        jRdBtn15_2.setText("Lufa-Lufa.");

        buttonGroup15.add(jRdBtn15_3);
        jRdBtn15_3.setText("Corvinal.");

        buttonGroup15.add(jRdBtn15_4);
        jRdBtn15_4.setText("Sonserina.");

        jButton15.setText("Avançar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jRdBtn15_1)
                    .addComponent(jRdBtn15_2)
                    .addComponent(jRdBtn15_3)
                    .addComponent(jRdBtn15_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdBtn15_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn15_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn15_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdBtn15_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addContainerGap())
        );

        getContentPane().add(jPanel15, "Pergunta15");

        jLabel1.setText("Insira uma nova instância: ");

        ButtonInstancia.setText("Inserir");
        ButtonInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInstanciaActionPerformed(evt);
            }
        });

        TextFieldJ48.setEditable(false);

        TextFieldIBk.setEditable(false);

        jLabel2.setText("J48");

        jLabel3.setText("IBk");

        javax.swing.GroupLayout jPanelFinalLayout = new javax.swing.GroupLayout(jPanelFinal);
        jPanelFinal.setLayout(jPanelFinalLayout);
        jPanelFinalLayout.setHorizontalGroup(
            jPanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFieldJ48, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextFieldIBk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanelFinalLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(119, 119, 119))
            .addGroup(jPanelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonInstancia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFinalLayout.setVerticalGroup(
            jPanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInstancia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldJ48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldIBk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        getContentPane().add(jPanelFinal, "insereInstancia");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION)) {
            caminhoBase = jFileChooser1.getSelectedFile().getAbsolutePath();
            if (caminhoBase != null) {
                CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                cardLayout.show(getContentPane(), "Pergunta1");
            }
        } else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION)) {
            this.dispose();
        }

    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void ButtonInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInstanciaActionPerformed
        AcessoWeka classificador = new AcessoWeka(caminhoBase);
        String instancia = TextFieldInstancia.getText();

        if (instancia != null) {
            instancia = instancia.replace(",", "");

            if (instancia.length() == 15) {

                for (int i = 0; i < 15; i++) {
                    respostas[i] = Character.getNumericValue(instancia.charAt(i));
                }

                try {
                    TextFieldIBk.setText(classificador.InstanceBased(respostas));
                } catch (Exception ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    TextFieldJ48.setText(classificador.arvoreDeDecisaoJ48(respostas));
                } catch (Exception ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                TextFieldIBk.setText("");
                TextFieldJ48.setText("");
            }
        } else {
            TextFieldIBk.setText("");
            TextFieldJ48.setText("");
        }

    }//GEN-LAST:event_ButtonInstanciaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonInstancia;
    private javax.swing.JTextField TextFieldIBk;
    private javax.swing.JTextField TextFieldInstancia;
    private javax.swing.JTextField TextFieldJ48;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFinal;
    private javax.swing.JRadioButton jRdBtn10_1;
    private javax.swing.JRadioButton jRdBtn10_2;
    private javax.swing.JRadioButton jRdBtn10_3;
    private javax.swing.JRadioButton jRdBtn10_4;
    private javax.swing.JRadioButton jRdBtn11_1;
    private javax.swing.JRadioButton jRdBtn11_2;
    private javax.swing.JRadioButton jRdBtn11_3;
    private javax.swing.JRadioButton jRdBtn11_4;
    private javax.swing.JRadioButton jRdBtn12_1;
    private javax.swing.JRadioButton jRdBtn12_2;
    private javax.swing.JRadioButton jRdBtn12_3;
    private javax.swing.JRadioButton jRdBtn12_4;
    private javax.swing.JRadioButton jRdBtn13_1;
    private javax.swing.JRadioButton jRdBtn13_2;
    private javax.swing.JRadioButton jRdBtn13_3;
    private javax.swing.JRadioButton jRdBtn14_1;
    private javax.swing.JRadioButton jRdBtn14_2;
    private javax.swing.JRadioButton jRdBtn14_3;
    private javax.swing.JRadioButton jRdBtn14_4;
    private javax.swing.JRadioButton jRdBtn15_1;
    private javax.swing.JRadioButton jRdBtn15_2;
    private javax.swing.JRadioButton jRdBtn15_3;
    private javax.swing.JRadioButton jRdBtn15_4;
    private javax.swing.JRadioButton jRdBtn1_1;
    private javax.swing.JRadioButton jRdBtn1_2;
    private javax.swing.JRadioButton jRdBtn1_3;
    private javax.swing.JRadioButton jRdBtn2_1;
    private javax.swing.JRadioButton jRdBtn2_2;
    private javax.swing.JRadioButton jRdBtn2_3;
    private javax.swing.JRadioButton jRdBtn2_4;
    private javax.swing.JRadioButton jRdBtn3_1;
    private javax.swing.JRadioButton jRdBtn3_2;
    private javax.swing.JRadioButton jRdBtn3_3;
    private javax.swing.JRadioButton jRdBtn3_4;
    private javax.swing.JRadioButton jRdBtn4_1;
    private javax.swing.JRadioButton jRdBtn4_2;
    private javax.swing.JRadioButton jRdBtn4_3;
    private javax.swing.JRadioButton jRdBtn4_4;
    private javax.swing.JRadioButton jRdBtn5_1;
    private javax.swing.JRadioButton jRdBtn5_2;
    private javax.swing.JRadioButton jRdBtn5_3;
    private javax.swing.JRadioButton jRdBtn5_4;
    private javax.swing.JRadioButton jRdBtn6_1;
    private javax.swing.JRadioButton jRdBtn6_2;
    private javax.swing.JRadioButton jRdBtn6_3;
    private javax.swing.JRadioButton jRdBtn6_4;
    private javax.swing.JRadioButton jRdBtn7_1;
    private javax.swing.JRadioButton jRdBtn7_2;
    private javax.swing.JRadioButton jRdBtn7_3;
    private javax.swing.JRadioButton jRdBtn7_4;
    private javax.swing.JRadioButton jRdBtn8_1;
    private javax.swing.JRadioButton jRdBtn8_2;
    private javax.swing.JRadioButton jRdBtn8_3;
    private javax.swing.JRadioButton jRdBtn8_4;
    private javax.swing.JRadioButton jRdBtn9_1;
    private javax.swing.JRadioButton jRdBtn9_2;
    private javax.swing.JRadioButton jRdBtn9_3;
    private javax.swing.JRadioButton jRdBtn9_4;
    // End of variables declaration//GEN-END:variables
}
