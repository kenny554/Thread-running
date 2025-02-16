package modelo;

import vista.frmInicio;

public class carrera {

    public static caballo[] losCaballos;
    static int[][] posicionesIniciales;

    static public void registrarCaballos() {
        losCaballos = new caballo[4];
        posicionesIniciales = new int[4][2];
        // Registrar caballos con sus posiciones iniciales
        losCaballos[0] = new caballo(101, "Alexis", frmInicio.lblCaballo1.getLocation().x,
                frmInicio.lblCaballo1.getLocation().y, 0);
        losCaballos[1] = new caballo(102, "Danito", frmInicio.lblCaballo2.getLocation().x,
                frmInicio.lblCaballo2.getLocation().y, 0);
        losCaballos[2] = new caballo(103, "Luis", frmInicio.lblCaballo3.getLocation().x,
                frmInicio.lblCaballo3.getLocation().y, 0);
        losCaballos[3] = new caballo(104, "Josue", frmInicio.lblCaballo4.getLocation().x,
                frmInicio.lblCaballo4.getLocation().y, 0);

        // Guardar las posiciones iniciales
        posicionesIniciales[0][0] = frmInicio.lblCaballo1.getLocation().x;
        posicionesIniciales[0][1] = frmInicio.lblCaballo1.getLocation().y;
        posicionesIniciales[1][0] = frmInicio.lblCaballo2.getLocation().x;
        posicionesIniciales[1][1] = frmInicio.lblCaballo2.getLocation().y;
        posicionesIniciales[2][0] = frmInicio.lblCaballo3.getLocation().x;
        posicionesIniciales[2][1] = frmInicio.lblCaballo3.getLocation().y;
        posicionesIniciales[3][0] = frmInicio.lblCaballo4.getLocation().x;
        posicionesIniciales[3][1] = frmInicio.lblCaballo4.getLocation().y;
    }

    static public void reiniciar() {
        // Restaurar las posiciones iniciales de los caballos
        for (int i = 0; i < losCaballos.length; i++) {
            losCaballos[i].setCoorX(posicionesIniciales[i][0]); // Restaurar posición inicial en X
            losCaballos[i].setCoorY(posicionesIniciales[i][1]); // Restaurar posición inicial en Y
        }
    }

    static public void iniciar() {
        // Iniciar los hilos para cada caballo
        for (caballo caballo : losCaballos) {
            new hiloUno(caballo.getNombre()).start();
        }
    }
}
