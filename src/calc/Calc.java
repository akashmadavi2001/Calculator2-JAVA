package calc;

import java.awt.Toolkit;

public class Calc extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calc.class.getName());

    public Calc() {
        initComponents();
        setTitle("Calc");
        setIconImage() ;
    }
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Calculator.png")));
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Number1 = new javax.swing.JTextField();
        Number2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Result = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Module = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator");
        jLabel2.setText("Number 1");
        jLabel3.setText("Number 2");
        Number1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Number2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jLabel4.setText("Result");

        Result.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Add.setText("+");
        Add.setOpaque(true);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Multiplication.setText("*");
        Multiplication.setOpaque(true);
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        Minus.setText("-");
        Minus.setOpaque(true);
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Division.setText("/");
        Division.setOpaque(true);
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setOpaque(true);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Module.setText("%");
        Module.setOpaque(true);
        Module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Module, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Module, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
        Number1.setText(null);
        Number2.setText(null);
        Result.setText(null);
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = Double.parseDouble(Number1.getText());
        double num2 = Double.parseDouble(Number2.getText());
        double result = num1 + num2;
        Result.setText(result + "");
    }

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = Double.parseDouble(Number1.getText());
        double num2 = Double.parseDouble(Number2.getText());
        double result = num1 - num2;
        Result.setText(result + "");
    }

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = Double.parseDouble(Number1.getText());
        double num2 = Double.parseDouble(Number2.getText());
        double result = num1 * num2;
        Result.setText(result + "");
    }

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = Double.parseDouble(Number1.getText());
        double num2 = Double.parseDouble(Number2.getText());
        double result = num1 / num2;
        Result.setText(result + "");
    }

    private void ModuleActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = Double.parseDouble(Number1.getText());
        double num2 = Double.parseDouble(Number2.getText());
        double result = num1 % num2;
        Result.setText(result + "");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Calc().setVisible(true));
    }

    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Division;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Module;
    private javax.swing.JButton Multiplication;
    private javax.swing.JTextField Number1;
    private javax.swing.JTextField Number2;
    private javax.swing.JTextField Result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
}
