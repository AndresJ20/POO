import java.util.ArrayList;
public class Agregacion__Main {
    public static void main(String[] args) {
        //1. Crear ruedas, motor, puertas, parachoques del Auto
        Rueda rueda1, rueda2, rueda3, rueda4;
        rueda1 = new Rueda(1000, "PIRELLI", 15, 95.00f, 'N');
        rueda2 = new Rueda(1001, "PIRELLI", 15, 95.00f, 'N');
        rueda3 = new Rueda(1002, "PIRELLI", 15, 95.00f, 'N');
        rueda4 = new Rueda(1003, "PIRELLI", 15, 95.00f, 'N');
        ArrayList<Rueda> llantas = new ArrayList<Rueda>();
        llantas.add(rueda1);
        llantas.add(rueda2);
        llantas.add(rueda3);
        llantas.add(rueda4);

        Motor motor1,motor2;
        motor1 = new Motor("Externa", 1234, 400.0f, "Cilindrica", 34.0f);
        motor2 = new Motor("Interna", 1235, 400.0f, "Cilindrica", 34.0f);
        ArrayList<Motor> motores = new ArrayList<Motor>();
        motores.add(motor1);
        motores.add(motor2);

        Puerta puerta1, puerta2, puerta3, puerta4;
        puerta1 = new Puerta(1892, "Acero", 325.75f, 18.90f, 3.60f);
        puerta2 = new Puerta(1893, "Acero", 325.75f, 18.90f, 3.60f);
        puerta3 = new Puerta(1894, "Acero", 325.75f, 18.90f, 3.60f);
        puerta4 = new Puerta(1895, "Acero", 325.75f, 18.90f, 3.60f);
        ArrayList<Puerta> puertas = new ArrayList<Puerta>();
        puertas.add(puerta1);
        puertas.add(puerta2);
        puertas.add(puerta3);
        puertas.add(puerta4);

        Parachoques parachoque1, parachoque2;
        parachoque1 = new Parachoques("Delantera", 1729, "Acero", 65.45f, 4689.34f);
        parachoque2 = new Parachoques("Traseras", 1730, "Acero", 65.45f, 4689.34f);
        ArrayList<Parachoques> bumper = new ArrayList<Parachoques>();
        bumper.add(parachoque1);
        bumper.add(parachoque2);
        //2. CREAR EL AUTO
        Auto automovil1;
        Auto1 automovil2;
        Auto2 automovil3;
        Auto3 automovil4;
        automovil4 = new Auto3(13254343, "KIA", "TOYOTA", 20000.00f, bumper, 'N');
        automovil3 = new Auto2(13254343, "KIA", "TOYOTA", 20000.00f, puertas, 'N');
        automovil2 = new Auto1(13254343, "KIA", "TOYOTA", 20000.00f, motores, 'N');
        automovil1 = new Auto(13254343, "KIA", "TOYOTA", 20000.00f, llantas, 'N');
        //3. MOSTRAR DATOS PARA VERIFICAR QUE SE GRABARON CORRECTAMENTE
        automovil1.mostrar();
        automovil2.mostrar1();
        automovil3.mostrar2();
        automovil4.mostrar3();
    }
}