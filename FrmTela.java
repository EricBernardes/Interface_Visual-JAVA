import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
       
public class FrmTela extends JFrame{

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    private JButton btnSomar;
    

    public FrmTela(){

        super("Efetue somas:");
        
        txtNumero1 = new JTextField(10);
        txtNumero2 = new JTextField(10);
        txtResultado = new JTextField(10);
        btnSomar = new JButton("Somar");

        setLayout(new FlowLayout());        

        add(txtNumero1);
        add(txtNumero2);
        add(btnSomar);
        add(txtResultado);

        setSize(800, 600);

        setLocationRelativeTo(null);   

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
    }

}
