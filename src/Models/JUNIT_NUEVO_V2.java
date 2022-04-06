package Models;

import java.util.Scanner;

public class JUNIT_NUEVO_V2 {

    private static final int FACTOR_MULTIPLICACION=10;
    private static Scanner entrada = new Scanner(System.in);
    private static String participantes;
    private static boolean boleano = false;
    private static int puntua = 0;
    private static int TiempoFinal = 0;
    private static int Tiempo = 0;
    private static double puntuacion = 0;

    public static void main(String[] args) {

        do {
            System.out.println("--Carrera Cervantina de 100 kilometros--");
            System.out.println("El participantes es:\n1.-Ciclista\n2.-Corredor");
            setParticipantes(getEntrada().nextLine());

            opcionParticipante(getParticipantes());
            /*if (participantes.equalsIgnoreCase("Ciclista")) {
                        boleano = true;
                        puntua = 20;
                    } else if (participantes.equalsIgnoreCase("Corredor")) {
                        boleano = true;
                        puntua = 10;
                    }
             */
        } while (!isBoleano());

        setBoleano(false);

        iteracionPuntos();

        setPuntuacion(getTiempoFinal() * getPuntua());

        compruebaCondiciones(getTiempoFinal(), getPuntuacion(), ". . .");

        System.out.println("puntuacion -->" + getPuntuacion()+compruebaCondiciones(TiempoFinal, puntuacion, participantes));

    }

    private static void iteracionPuntos() {
        for (int kmActual = 0; kmActual <= 80; kmActual += 20) {
            System.out.println("Cuanto ha tardado en llegar del kilometro " + kmActual + " al kilometro " + (kmActual + 20));
            setTiempo(getEntrada().nextInt());
            if (getTiempo() == 0 ) {
                setBoleano(true);
            }
            setTiempoFinal(getTiempoFinal() + getTiempo());

        }
    }

    // --------- metodo 1 -------- //
    public static String compruebaCondiciones(int TiempoFinal, double puntuacion, String cadenas) {

        String cadena = "";

        if (TiempoFinal == 0) {

            cadena = "El participante no ha participado";

        } else if (TiempoFinal != 0 && isBoleano() == true) {

            cadena = "El participante abandono la carrera y sus puntos son " + puntuacion;
        } else {

            cadena = "El participante ha terminado consiguindo asi " + puntuacion + " puntos";
        }
        return cadena;

    }

    // ------- metodo 2 ------------ //
    public static boolean opcionParticipante(String opcion) {

        if (getParticipantes().equalsIgnoreCase("Ciclista")) {
            setBoleano(true);
            setPuntua(20+FACTOR_MULTIPLICACION);
        } else if (getParticipantes().equalsIgnoreCase("Corredor")) {
            setBoleano(true);
            setPuntua(10+FACTOR_MULTIPLICACION);
        } else {
            setBoleano(false);
        }
        return isBoleano();
    }

    /**
     * @return the entrada
     */
    public static Scanner getEntrada() {
        return entrada;
    }

    /**
     * @param aEntrada the entrada to set
     */
    public static void setEntrada(Scanner aEntrada) {
        entrada = aEntrada;
    }

    /**
     * @return the participantes
     */
    public static String getParticipantes() {
        return participantes;
    }

    /**
     * @param aParticipantes the participantes to set
     */
    public static void setParticipantes(String aParticipantes) {
        participantes = aParticipantes;
    }

    /**
     * @return the boleano
     */
    public static boolean isBoleano() {
        return boleano;
    }

    /**
     * @param aBoleano the boleano to set
     */
    public static void setBoleano(boolean aBoleano) {
        boleano = aBoleano;
    }

    /**
     * @return the puntua
     */
    public static int getPuntua() {
        return puntua;
    }

    /**
     * @param aPuntua the puntua to set
     */
    public static void setPuntua(int aPuntua) {
        puntua = aPuntua;
    }

    /**
     * @return the TiempoFinal
     */
    public static int getTiempoFinal() {
        return TiempoFinal;
    }

    /**
     * @param aTiempoFinal the TiempoFinal to set
     */
    public static void setTiempoFinal(int aTiempoFinal) {
        TiempoFinal = aTiempoFinal;
    }

    /**
     * @return the Tiempo
     */
    public static int getTiempo() {
        return Tiempo;
    }

    /**
     * @param aTiempo the Tiempo to set
     */
    public static void setTiempo(int aTiempo) {
        Tiempo = aTiempo;
    }

    /**
     * @return the puntuacion
     */
    public static double getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param aPuntuacion the puntuacion to set
     */
    public static void setPuntuacion(double aPuntuacion) {
        puntuacion = aPuntuacion;
    }
}