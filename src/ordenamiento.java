public class Ordenamiento extends javax.swing.JFrame {

    String info;
    int l,ce,p;
    char q;
    int VD[];

    public Ordenamiento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caja1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        caja2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(caja1);
        caja1.setBounds(30, 20, 200, 30);

        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 70, 120, 30);
        getContentPane().add(caja2);
        caja2.setBounds(30, 120, 200, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-272)/2, (screenSize.height-205)/2, 272, 205);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        info=caja1.getText();
        l=info.length();
        ce=0;
        for(int i=0;i<l;i++)
        {
            q=info.charAt(i);
            if(q==' ')
            {
                ce=ce + 1;
            }
        }
        int vp[]=new int [ce+1];
        VD=vp;
        int pe=0;
        p=0;
        while(ce>0)
        {
            l=info.length();
            for(int i=0;i<l;i++)
            {
                q=info.charAt(i);
                if(q==' ')
                {
                    pe=i;
                    break;
                }
            }
            VD[p]=Integer.parseInt(info.substring(0,pe));
            info=info.substring(pe+1);
            p=p+1;
            ce=ce-1;
        }
        VD[p]=Integer.parseInt(info);
        int aux;
        l=VD.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<=l-2;j++)
            {
                if(VD[j]>VD[j+1])
                {
                    aux=VD[j];
                    VD[j]=VD[j+1];
                    VD[j+1]=aux;
                }
            }
        }
        l=VD.length;
        for(int i=0;i<l;i++)
        {
            caja2.setText(caja2.getText()+VD[i]+" ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
