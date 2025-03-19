package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion extends JFrame{
    private JTextField cadroTexto;
    public EcoAplicacion(){
        super();
        // Esto es valido super("Primeira aplicacion con Swing");
        setTitle("Primeira aplicacion con Swing");
        JComponent botoneira = creaBotons();
        JComponent panelCadroTexto = creaPanelCadro();
        cadroTexto=(JTextField) panelCadroTexto;
        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT,botoneira ,panelCadroTexto);
        getContentPane().add(panelPrincipal);
        pack();
        setVisible(true);
    }
    private JComponent creaBotons(){
        JPanel botoneira= new JPanel();
        JButton btnHola= new JButton("Di ola!");
        botoneira.add(btnHola);
        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        cadroTexto.setText("ola a todos!!");
                    }
                }
        );
        return botoneira;
    }
    private JComponent creaPanelCadro(){
        JTextField txtCadro = new JTextField();
        return txtCadro;
    }
}
