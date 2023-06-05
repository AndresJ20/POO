import java.util.Scanner;
public class PolimorfismoEjecucion {
    public static int posicion = 0;
    public static void crearCuentaAhorro(Scanner entrada,PolimorfismoCuenta [] cta){
        int dc = -1; int num_cta; String titula_cta; float saldo_actual; float ah_meta; char estado;
        int ind = 0;
        do{
            System.out.println("\nCREACIÓN DE CUENTAS DE AHORRO");
            System.out.println("*********************************");
            System.out.print("INGRESE NUMERO CUENTA:");
            num_cta = entrada.nextInt();
            System.out.print("INGRESE TITULAR CUENTA: ");
            titula_cta = entrada.next();
            System.out.print("INGRESE SALDO ACTUAL: ");
            saldo_actual = entrada.nextFloat();
            System.out.print("INGRESE AHORRO META: ");
            ah_meta = entrada.nextFloat();
            estado = 'A';
            cta[ind] = new PolimorfismoAhorro(num_cta,titula_cta, saldo_actual, estado, ah_meta);
            ind++;
            System.out.println("DATOS GRABADOS CORRECTAMENTE...");
            System.out.print("DIGITE [1] CONTINUAR - DIGITE [2] SALIR AL MENU: ");
            dc = entrada.nextInt();
            System.out.println(dc);
        }while (dc==1);
    }
    public static void crearCuentaCorriente(Scanner entrada,PolimorfismoCuenta [] cta){
        int dc = -1; int num_cta; String titula_cta; float saldo_actual; char estado; String of_cred;
        int ind = 0;
        do{
            System.out.println("\nCREACIÓN DE CUENTAS CORRIENTES");
            System.out.println("*********************************");
            System.out.print("INGRESE NUMERO CUENTA:");
            num_cta = entrada.nextInt();
            System.out.print("INGRESE TITULAR CUENTA: ");
            titula_cta = entrada.next();
            System.out.print("INGRESE SALDO ACTUAL: ");
            saldo_actual = entrada.nextFloat();
            System.out.print("INGRESE OFICIAL DE CREDITO: ");
            of_cred = entrada.next();
            estado = 'A';
            cta[ind] = new PolimorfismoCorriente(num_cta,titula_cta, saldo_actual, estado, of_cred);
            ind++;
            System.out.println("DATOS GRABADOS CORRECTAMENTE...");
            System.out.print("DIGITE [1] CONTINUAR - DIGITE [2] SALIR AL MENU: ");
            dc = entrada.nextInt();
            System.out.println(dc);
        }while (dc==1);
    }
    public static void consultarSaldos(PolimorfismoCuenta [] cta){
        System.out.println("\nCONSULTANDO DATOS DE LAS CUENTAS...");
        for(int i=0; i < cta.length; i++){
            System.out.println("TIPO DE CUENTA: " + cta[i].getClass().getSimpleName() + " TITULAR: " + cta[i].getTitular() + "|" + " SALDO ACTUAL: " + cta[i].getSaldo_actual());
        }
    }
    public static void generarInteres(PolimorfismoCuenta [] cta){
        System.out.println("\nGENERANDO INTERES DE LAS CUENTAS...");
        for(int i = 0; i < cta.length; i++){
            System.out.println("TIPO CUENTA: " + cta[i].getClass() + " INTERES: " + cta[i].generarInteres());
            cta[i].setSaldo_actual(cta[i].getSaldo_actual()+cta[i].generarInteres());
            System.out.println("SALDO ACTUAL ACTUALIZADO: " + cta[i].getSaldo_actual());
        }
    }
    public static void menuPrincipal(Scanner entrada,PolimorfismoCuenta [] cta){
        System.out.println("MENU PRINCIPAL");
        System.out.println("**************");
        System.out.println("1. APERTURAR CUENTA AHORRO");
        System.out.println("2. APERTURAR CUENTA CORRIENTE");
        System.out.println("3. DEPOSITO EN CUENTA DE AHORROS");
        System.out.println("4. DEPOSITO EN CUENTA CORRIENTE");
        System.out.println("5. CONSULTAR SALDOS DE CUENTAS");
        System.out.println("6. GENERAR INTERES");
        System.out.println("7. RETIRAR AHORRO");
        System.out.println("8. RETIRAR CORRIENTE");
        System.out.println("9. SALIR");
        System.out.print("DIGITE UNA OPCION: ");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1: crearCuentaAhorro(entrada, cta); menuPrincipal(entrada, cta); break;
            case 2: crearCuentaCorriente(entrada, cta); menuPrincipal(entrada, cta); break;
            case 3: depositarAhorro(cta); menuPrincipal(entrada, cta); break;
            case 4: depositarCorriente(cta); menuPrincipal(entrada, cta); break;
            case 5: consultarSaldos(cta); menuPrincipal(entrada, cta); break;
            case 6: generarInteres(cta); menuPrincipal(entrada, cta); break;
            case 7: retirarAhorro(cta); menuPrincipal(entrada, cta); break;
            case 8: retirarCorriente(cta); menuPrincipal(entrada, cta); break;
        }
    }
    public static void depositarCorriente(PolimorfismoCuenta [] cta){
        Scanner entrada = new Scanner(System.in); float valor_deposito;
        int numero_cuenta, indice = 0, posicion = -1; boolean encontrado = false;
        System.out.println("DEPOSITO CORRIENTE");
        System.out.println("*******************");
        System.out.print("INGRESE NUMERO DE CUENTA: ");
        numero_cuenta = entrada.nextInt();
        while(indice < cta.length && encontrado == false){
            if(cta[indice].getNumero() == numero_cuenta){
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }
        if(encontrado == true){
            System.out.println("TITULAR: " + cta[posicion].getTitular());
            System.out.print("INGRESAR VALOR DEL DEPOSITO: ");
            valor_deposito = entrada.nextFloat();
            cta[posicion].setSaldo_actual(valor_deposito + cta[posicion].getSaldo_actual());
            System.out.println("SALDO ACTUAL:  " + cta[posicion].getSaldo_actual());
            System.out.println("DEPOSITO REALIZADO CORRECTAMENTE...");
        } else{
            System.out.println("\nCUENTA NO EXISTENTE");
        }
    }
    public static void depositarAhorro(PolimorfismoCuenta [] cta){
        Scanner entrada = new Scanner(System.in); float valor_deposito;
        int numero_cuenta, indice = 0, posicion = -1; boolean encontrado = false;
        System.out.println("DEPOSITO DE AHORRO");
        System.out.println("*******************");
        System.out.print("INGRESE NUMERO DE CUENTA: ");
        numero_cuenta = entrada.nextInt();
        while(indice < cta.length && encontrado == false){
            if(cta[indice].getNumero() == numero_cuenta){
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }
        if(encontrado == true){
            System.out.println("TITULAR: " + cta[posicion].getTitular());
            System.out.print("INGRESAR VALOR DEL DEPOSITO: ");
            valor_deposito = entrada.nextFloat();
            cta[posicion].setSaldo_actual(valor_deposito + cta[posicion].getSaldo_actual());
            System.out.println("SALDO ACTUAL:  " + cta[posicion].getSaldo_actual());
            System.out.println("DEPOSITO REALIZADO CORRECTAMENTE...");
        } else{
            System.out.println("\nCUENTA NO EXISTENTE");
        }
    }
    public static void retirarAhorro(PolimorfismoCuenta [] cta){
        Scanner entrada = new Scanner(System.in); float valor_retirado = 0;
        int numero_cuenta, indice = 0, posicion = -1; boolean encontrado = false;
        System.out.println("RETIRO DE AHORRO");
        System.out.println("*******************");
        System.out.print("INGRESE NUMERO DE CUENTA: ");
        numero_cuenta = entrada.nextInt();
        while(indice < cta.length && encontrado == false){
            if(cta[indice].getNumero() == numero_cuenta){
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }
        if(encontrado == true){
            System.out.println("TITULAR: " + cta[posicion].getTitular());
            do{
            System.out.print("INGRESAR VALOR DEL RETIRO: ");
            valor_retirado = entrada.nextFloat();
            if(cta[posicion].getSaldo_actual() < valor_retirado)
            System.out.println("ERROR, EL VALOR DEBE DE SER MENOR QUE EL SALDO");
            if(cta[posicion].getSaldo_actual() > valor_retirado){
                cta[posicion].setSaldo_actual(cta[posicion].getSaldo_actual() - valor_retirado);
                System.out.println("SALDO ACTUAL:  " + cta[posicion].getSaldo_actual());
                System.out.println("RETIRO REALIZADO CORRECTAMENTE");
            }
            } while (cta[posicion].getSaldo_actual() < valor_retirado);
        } else{
            System.out.println("\nCUENTA NO EXISTENTE");
        }
    }
    public static void retirarCorriente(PolimorfismoCuenta [] cta){
        Scanner entrada = new Scanner(System.in); float valor_retirado = 0;
        int numero_cuenta, indice = 0, posicion = -1; boolean encontrado = false;
        char A,I;
        System.out.println("RETIRO CORRIENTE");
        System.out.println("*******************");
        System.out.print("INGRESE NUMERO DE CUENTA: ");
        numero_cuenta = entrada.nextInt();
        while(indice < cta.length && encontrado == false){
            if(cta[indice].getNumero() == numero_cuenta){
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }
        if(encontrado == true){
            System.out.println("TITULAR: " + cta[posicion].getTitular());
            do{
            System.out.print("INGRESAR VALOR DEL RETIRO: ");
            valor_retirado = entrada.nextFloat();
            if(cta[posicion].getSaldo_actual() < valor_retirado)
            System.out.println("ERROR, EL VALOR DEBE DE SER MENOR QUE EL SALDO");
            //System.out.println("CUENTA INACTIVA...");
            System.out.println("ESTADO DE CUENTA: " + cta[posicion].cuentaInactiva());
            if(cta[posicion].getSaldo_actual() > valor_retirado){
                cta[posicion].setSaldo_actual(cta[posicion].getSaldo_actual() - valor_retirado);
                System.out.println("SALDO ACTUAL:  " + cta[posicion].getSaldo_actual());
                System.out.println("RETIRO REALIZADO CORRECTAMENTE");
                System.out.println("ESTADO DE CUENTA: " + cta[posicion].cuentaActiva());
                //System.out.println("CUENTA ACTIVA NUEVAMENTE...");
            }
            } while (cta[posicion].getSaldo_actual() < valor_retirado);
        } else{
            System.out.println("\nCUENTA NO EXISTENTE");
        }
    }
    public char cuentaActiva(){
        System.out.println("ESTADO DE CUENTA: " + 'A');
        return 'A';
    }
    public char cuentaInactiva(){
        System.out.println("ESTADO DE CUENTA: " + 'I');
        return 'I';
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAX = 1;
        PolimorfismoCuenta [] cta = new PolimorfismoCuenta[MAX];
        menuPrincipal(entrada,cta);
    }
}