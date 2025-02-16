package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import vista.frmInicio;

public class hiloUno extends Thread {

    public hiloUno(String name) {
        this.setName(name);
    }

    public void run() {
        int avance = 10;

        try {
            javax.swing.JLabel lblCaballo = null;

            if (getName().equals("Alexis")) {
                lblCaballo = frmInicio.lblCaballo1;
            } else if (getName().equals("Danito")) {
                lblCaballo = frmInicio.lblCaballo2;
            } else if (getName().equals("Luis")) {
                lblCaballo = frmInicio.lblCaballo3;
            } else if (getName().equals("Josue")) {
                lblCaballo = frmInicio.lblCaballo4;
            }

            // Movimiento del caballo
            while (true) {
                lblCaballo.setLocation(lblCaballo.getLocation().x + avance, lblCaballo.getLocation().y);

                // Consultar dinámicamente el tiempo de espera
                long velocidad = 0;
                if (getName().equals("Alexis")) {
                    velocidad = frmInicio.tiempoManualC1;
                } else if (getName().equals("Danito")) {
                    velocidad = frmInicio.tiempoManualC2;
                } else if (getName().equals("Luis")) {
                    velocidad = frmInicio.tiempoManualC3;
                } else if (getName().equals("Josue")) {
                    velocidad = frmInicio.tiempoManualC4;
                }

                sleep(velocidad);

                if (lblCaballo.getLocation().x >= frmInicio.lblLinea.getLocation().x) {
                    frmInicio.txtR.append("\n" + this.getName() + " ha llegado a la meta!");
                    break;
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
