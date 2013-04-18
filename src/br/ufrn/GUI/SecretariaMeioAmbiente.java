/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Zeff
 */
public class SecretariaMeioAmbiente extends javax.swing.JFrame {

    private AtualizaSubscriber subscriberPollution;
    private AtualizaSubscriber subscriberaWillRain;
    private AtualizaSubscriber subscriberAcidRain;
    private AtualizaSubscriber subscriberNoise;
    
    private String Texto = "";

    /**
     * Creates new form SecretariaMeioAmbiente
     */
    public SecretariaMeioAmbiente() {
        initComponents();
    }

    public void exibirInformacao(String informacao) {
        String valores[] = informacao.split(";");
        //valores[0] = area
        //valores[1] = nome da function
        //valores[2] = estado do contexto ou informacao relevante
        //valores[3] = direção do vento

        //===pollutionMonitor
        if (valores[1].equals("pollutionMonitor")) {
            if (valores[2].equals("TRAFEGO_ON")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelCarroA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carro.png")));
                    Texto = Texto + "Quantidade de carros muito grande na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta fluxo de veiculos
                } else if (valores[0].equals(Integer.toString(2))) {
                    labelCarroA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carro.png")));
                    Texto = Texto + "Quantidade de carros muito grande na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta fluxo de veiculos
                } else if (valores[0].equals(Integer.toString(3))) {
                    labelCarroA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carro.png")));
                    Texto = Texto + "Quantidade de carros muito grande na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta fluxo de veiculos
                } else if (valores[0].equals(Integer.toString(4))) {
                    labelCarroA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carro.png")));
                    Texto = Texto + "Quantidade de carros muito grande na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta fluxo de veiculos
                }
            } else if (valores[2].equals("TRAFEGO_OFF")) {
                //Seta o icone do trafego pra OFF em cada area

                if (valores[0].equals(Integer.toString(1))) {
                    labelCarroA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
                } else if (valores[0].equals(Integer.toString(2))) {
                    labelCarroA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
                } else if (valores[0].equals(Integer.toString(3))) {
                    labelCarroA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
                } else if (valores[0].equals(Integer.toString(4))) {
                    labelCarroA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
                }
            } else {
                if (valores[0].equals(Integer.toString(1))) {
                    if (valores[2].equals("BOA")) {
                        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
                        Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                    } else if (valores[2].equals("REGULAR")) {
                        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado2.png")));
                        Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                    } else if (valores[2].equals("INADEQUADA")) {
                        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado3.png")));
                        Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                    } else if (valores[2].equals("MA")) {
                        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado4.png")));
                        Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                    } else if (valores[2].equals("PESSIMA")) {
                        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado5.png")));
                        Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                    }
                    //seta o nivel de poluicao com: valores[2]
                }
            }
            if (valores[0].equals(Integer.toString(2))) {
                if (valores[2].equals("BOA")) {
                    labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("REGULAR")) {
                    labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado2.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("INADEQUADA")) {
                    labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado3.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("MA")) {
                    labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado4.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("PESSIMA")) {
                    labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado5.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                }
                //seta o nivel de poluicao com: valores[2]
            }
            if (valores[0].equals(Integer.toString(3))) {
                if (valores[2].equals("BOA")) {
                    labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("REGULAR")) {
                    labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado2.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("INADEQUADA")) {
                    labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado3.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("MA")) {
                    labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado4.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("PESSIMA")) {
                    labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado5.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                }
                //seta o nivel de poluicao com: valores[2]
            }
            if (valores[0].equals(Integer.toString(4))) {
                if (valores[2].equals("BOA")) {
                    labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("REGULAR")) {
                    labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado2.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("INADEQUADA")) {
                    labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado3.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("MA")) {
                    labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado4.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                } else if (valores[2].equals("PESSIMA")) {
                    labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado5.png")));
                    Texto = Texto + "Qualidade do ar na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                }
                //seta o nivel de poluicao com: valores[2]
            }
        }
        //===willRainMonitor
        if (valores[1].equals("willRainMonitor")) {
            if (valores[2].equals("RAIN_ON")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelNuvChuA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemChuva.png")));
                    Texto = Texto + "Chuva na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelNuvChuA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemChuva.png")));
                    Texto = Texto + "Chuva na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelNuvChuA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemChuva.png")));
                    Texto = Texto + "Chuva na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelNuvChuA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemChuva.png")));
                    Texto = Texto + "Chuva na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta vai chover
                }
            } else if (valores[2].equals("RAIN_OFF")) {
                //setar o icone OFF de chuva em todas as areas
                if (valores[0].equals(Integer.toString(1))) {
                    labelNuvChuA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelNuvChuA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelNuvChuA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
                    //seta vai chover
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelNuvChuA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
                    //seta vai chover
                }
            }
        } //===acidRainMonitor
        else if (valores[1].equals("acidRainMonitor")) {
            if (valores[2].equals("AQUI")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelNuvAciA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemAcida.png")));
                    Texto = Texto + "Chuva Ácida na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que tem chuva acida da area
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelNuvAciA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemAcida.png")));
                    Texto = Texto + "Chuva Ácida na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que tem chuva acida da area
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelNuvAciA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemAcida.png")));
                    Texto = Texto + "Chuva Ácida na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que tem chuva acida da area
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelNuvAciA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemAcida.png")));
                    Texto = Texto + "Chuva Ácida na área " + valores[0] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que tem chuva acida da area
                }
            } else if (valores[2].equals("OUTRO")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelNuvMovA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/wind-cloud.png")));
                    Texto = Texto + "Chuva Ácida se movendo para a direção " + valores[3] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que pode ter chuva acida em outra area

                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelNuvMovA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/wind-cloud.png")));
                    Texto = Texto + "Chuva Ácida se movendo para a direção " + valores[3] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que pode ter chuva acida em outra area

                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelNuvMovA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/wind-cloud.png")));
                    Texto = Texto + "Chuva Ácida se movendo para a direção " + valores[3] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que pode ter chuva acida em outra area

                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelNuvMovA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/wind-cloud.png")));
                    Texto = Texto + "Chuva Ácida se movendo para a direção " + valores[3] + "\n";
                    jTextArea1.setText("" + Texto);
                    //seta que pode ter chuva acida em outra area

                }
            } else if (valores[2].equals("ACID_OFF")) {
                //setar o icone de chuva acida OFF para cada area
                if (valores[0].equals(Integer.toString(1))) {
                    labelNuvMovA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
                    labelNuvAciA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
                    //seta que pode ter chuva acida em outra area
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelNuvMovA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
                    labelNuvAciA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
                    //seta que pode ter chuva acida em outra area
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelNuvMovA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
                    labelNuvAciA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
                    //seta que pode ter chuva acida em outra area
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelNuvMovA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
                    labelNuvAciA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
                    //seta que pode ter chuva acida em outra area
                }
            }

        } //===noiseMonitor
        else if (valores[1].equals("noiseMonitor")) {
            DateFormat df = new SimpleDateFormat("H");
            String hora = df.format(new Date());

            if (valores[2].equals("NOISE_ON")) {
                if (valores[0].equals(Integer.toString(1))) {
                    if ((Integer.parseInt(hora) >= 22 && Integer.parseInt(hora) <= 24) || (Integer.parseInt(hora) >= 0 && Integer.parseInt(hora) < 6)) {
                        labelBuzinaA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Buzina.png")));
                        Texto = Texto + "Muito barulho fora do horário de 22:00 às 6:00 na area " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                        //seta que o barulho esta alem do permitido
                        //OBS: somente setar esse icone se a hora for entre: 22h e 6h
                    }
                }

                if (valores[0].equals(Integer.toString(2))) {
                    if ((Integer.parseInt(hora) >= 22 && Integer.parseInt(hora) <= 24) || (Integer.parseInt(hora) >= 0 && Integer.parseInt(hora) < 6)) {
                        labelBuzinaA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Buzina.png")));
                        Texto = Texto + "Muito barulho fora do horário de 22:00 às 6:00 na area " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                        //seta que o barulho esta alem do permitido
                        //OBS: somente setar esse icone se a hora for entre: 22h e 6h
                    }
                }
                if (valores[0].equals(Integer.toString(3))) {
                    if ((Integer.parseInt(hora) >= 22 && Integer.parseInt(hora) <= 24) || (Integer.parseInt(hora) >= 0 && Integer.parseInt(hora) < 6)) {
                        labelBuzinaA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Buzina.png")));
                        Texto = Texto + "Muito barulho fora do horário de 22:00 às 6:00 na area " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                        //seta que o barulho esta alem do permitido
                        //OBS: somente setar esse icone se a hora for entre: 22h e 6h
                    }
                }
                if (valores[0].equals(Integer.toString(4))) {
                    if ((Integer.parseInt(hora) >= 22 && Integer.parseInt(hora) <= 24) || (Integer.parseInt(hora) >= 0 && Integer.parseInt(hora) < 6)) {
                        labelBuzinaA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Buzina.png")));
                        Texto = Texto + "Muito barulho fora do horário de 22:00 às 6:00 na area " + valores[0] + "\n";
                        jTextArea1.setText("" + Texto);
                        //seta que o barulho esta alem do permitido
                        //OBS: somente setar esse icone se a hora for entre: 22h e 6h
                    }
                }
            } else if (valores[2].equals("NOISE_OFF")) {
                //setar os icones de noise OFF para cada area
                if (valores[0].equals(Integer.toString(1))) {
                    labelBuzinaA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelBuzinaA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelBuzinaA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelBuzinaA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelBuzinaA1 = new javax.swing.JLabel();
        labelNuvChuA1 = new javax.swing.JLabel();
        labelNuvPolA1 = new javax.swing.JLabel();
        labelCarroA1 = new javax.swing.JLabel();
        labelNuvAciA1 = new javax.swing.JLabel();
        labelNuvMovA1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        labelBuzinaA3 = new javax.swing.JLabel();
        labelNuvChuA3 = new javax.swing.JLabel();
        labelNuvPolA3 = new javax.swing.JLabel();
        labelCarroA3 = new javax.swing.JLabel();
        labelNuvAciA3 = new javax.swing.JLabel();
        labelNuvMovA3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelBuzinaA4 = new javax.swing.JLabel();
        labelNuvChuA4 = new javax.swing.JLabel();
        labelNuvPolA4 = new javax.swing.JLabel();
        labelCarroA4 = new javax.swing.JLabel();
        labelNuvAciA4 = new javax.swing.JLabel();
        labelNuvMovA4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelBuzinaA2 = new javax.swing.JLabel();
        labelNuvChuA2 = new javax.swing.JLabel();
        labelNuvPolA2 = new javax.swing.JLabel();
        labelCarroA2 = new javax.swing.JLabel();
        labelNuvAciA2 = new javax.swing.JLabel();
        labelNuvMovA2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/subscribers1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jButton1.setText("Desconectado");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Clique para se conectar ao Hub");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelBuzinaA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png"))); // NOI18N

        labelNuvChuA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png"))); // NOI18N

        labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png"))); // NOI18N

        labelCarroA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png"))); // NOI18N

        labelNuvAciA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png"))); // NOI18N

        labelNuvMovA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBuzinaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNuvChuA1)
                .addGap(18, 18, 18)
                .addComponent(labelNuvPolA1)
                .addGap(18, 18, 18)
                .addComponent(labelCarroA1)
                .addGap(18, 18, 18)
                .addComponent(labelNuvAciA1)
                .addGap(18, 18, 18)
                .addComponent(labelNuvMovA1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNuvMovA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvAciA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCarroA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvPolA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvChuA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBuzinaA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 3"));

        labelBuzinaA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png"))); // NOI18N

        labelNuvChuA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png"))); // NOI18N

        labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png"))); // NOI18N

        labelCarroA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png"))); // NOI18N

        labelNuvAciA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png"))); // NOI18N

        labelNuvMovA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBuzinaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNuvChuA3)
                .addGap(18, 18, 18)
                .addComponent(labelNuvPolA3)
                .addGap(18, 18, 18)
                .addComponent(labelCarroA3)
                .addGap(18, 18, 18)
                .addComponent(labelNuvAciA3)
                .addGap(18, 18, 18)
                .addComponent(labelNuvMovA3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNuvMovA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvAciA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCarroA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvPolA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvChuA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBuzinaA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 4"));

        labelBuzinaA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png"))); // NOI18N

        labelNuvChuA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png"))); // NOI18N

        labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png"))); // NOI18N

        labelCarroA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png"))); // NOI18N

        labelNuvAciA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png"))); // NOI18N

        labelNuvMovA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBuzinaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNuvChuA4)
                .addGap(18, 18, 18)
                .addComponent(labelNuvPolA4)
                .addGap(18, 18, 18)
                .addComponent(labelCarroA4)
                .addGap(18, 18, 18)
                .addComponent(labelNuvAciA4)
                .addGap(18, 18, 18)
                .addComponent(labelNuvMovA4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNuvMovA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvAciA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCarroA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvPolA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvChuA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBuzinaA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 2"));

        labelBuzinaA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png"))); // NOI18N

        labelNuvChuA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png"))); // NOI18N

        labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png"))); // NOI18N

        labelCarroA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png"))); // NOI18N

        labelNuvAciA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png"))); // NOI18N

        labelNuvMovA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBuzinaA2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNuvChuA2)
                .addGap(18, 18, 18)
                .addComponent(labelNuvPolA2)
                .addGap(18, 18, 18)
                .addComponent(labelCarroA2)
                .addGap(18, 18, 18)
                .addComponent(labelNuvAciA2)
                .addGap(18, 18, 18)
                .addComponent(labelNuvMovA2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNuvMovA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvAciA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCarroA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvPolA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNuvChuA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBuzinaA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("Desconectado")) {

            subscriberAcidRain = new AtualizaSubscriber(AtualizaSubscriber.ACID_RAIN, this);
            subscriberNoise = new AtualizaSubscriber(AtualizaSubscriber.NOISE, this);
            subscriberPollution = new AtualizaSubscriber(AtualizaSubscriber.POLLUTION, this);
            subscriberaWillRain = new AtualizaSubscriber(AtualizaSubscriber.WILL_RAIN, this);

            subscriberAcidRain.subscribe();
            subscriberNoise.subscribe();
            subscriberPollution.subscribe();
            subscriberaWillRain.subscribe();

            jButton1.setText("Conectado");
            jButton1.setBackground(Color.GREEN);
            jButton1.setForeground(Color.RED);
            jLabel3.setText("Clique para se desconectar do Hub");
        } else {

            subscriberAcidRain.unsubscribe();
            subscriberNoise.unsubscribe();
            subscriberPollution.unsubscribe();
            subscriberaWillRain.unsubscribe();

            labelCarroA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
            labelBuzinaA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
            labelNuvChuA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
            labelNuvPolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
            labelNuvAciA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
            labelNuvMovA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
            labelCarroA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
            labelBuzinaA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
            labelNuvChuA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
            labelNuvPolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
            labelNuvAciA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
            labelNuvMovA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
            labelCarroA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
            labelBuzinaA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
            labelNuvChuA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
            labelNuvPolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
            labelNuvAciA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
            labelNuvMovA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
            labelCarroA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/carroSem.png")));
            labelBuzinaA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/SemBuzina.png")));
            labelNuvChuA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemChuva.png")));
            labelNuvPolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemVerdeEstado1.png")));
            labelNuvAciA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/NuvemSemAcida.png")));
            labelNuvMovA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/no-wind-cloud.png")));
            jButton1.setText("Desconectado");
            jButton1.setBackground(Color.RED);
            jButton1.setForeground(Color.GREEN);
            jLabel3.setText("Clique para se conectar ao Hub");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretariaMeioAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretariaMeioAmbiente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelBuzinaA1;
    private javax.swing.JLabel labelBuzinaA2;
    private javax.swing.JLabel labelBuzinaA3;
    private javax.swing.JLabel labelBuzinaA4;
    private javax.swing.JLabel labelCarroA1;
    private javax.swing.JLabel labelCarroA2;
    private javax.swing.JLabel labelCarroA3;
    private javax.swing.JLabel labelCarroA4;
    private javax.swing.JLabel labelNuvAciA1;
    private javax.swing.JLabel labelNuvAciA2;
    private javax.swing.JLabel labelNuvAciA3;
    private javax.swing.JLabel labelNuvAciA4;
    private javax.swing.JLabel labelNuvChuA1;
    private javax.swing.JLabel labelNuvChuA2;
    private javax.swing.JLabel labelNuvChuA3;
    private javax.swing.JLabel labelNuvChuA4;
    private javax.swing.JLabel labelNuvMovA1;
    private javax.swing.JLabel labelNuvMovA2;
    private javax.swing.JLabel labelNuvMovA3;
    private javax.swing.JLabel labelNuvMovA4;
    private javax.swing.JLabel labelNuvPolA1;
    private javax.swing.JLabel labelNuvPolA2;
    private javax.swing.JLabel labelNuvPolA3;
    private javax.swing.JLabel labelNuvPolA4;
    // End of variables declaration//GEN-END:variables
}
