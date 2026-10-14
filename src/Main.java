public class Main {
    public static void main(String[] args) {
        ejercicio5();
    }

    public static void ejercicio1() {
        String modeloCoche = "Skoda Fabia";
        int plazasCoche = 5;
        double precioCoche = 30.5;
        System.out.println("COCHE: " + modeloCoche + " (" + plazasCoche + " plazas) - " +
                precioCoche + "€/día");
        String modeloMoto = "Vespa GTS310";
        int plazasMoto = 2;
        double precioMoto = 15.5;
        System.out.println("MOTO: " + modeloMoto + " (" + plazasMoto + " plazas) - " +
                precioMoto + "€/día");
        String modeloPat = "Xiaomi 5 Pro";
        int plazasPat = 1;
        double precioPat = 10.0;
        System.out.println("PATINETE: " + modeloPat + " (" + plazasPat + " plazas) - " +
                precioPat + "€/día");
        String modeloFur = "Mercedes-Benz Citan";
        int plazasFur = 3;
        double precioFur = 40.5;
        System.out.println("FURGONETA: " + modeloFur + " (" + plazasFur + " plazas) - " +
                precioFur + "€/día");
    }

    public static void ejercicio2() {
        double precioCoche = 30.5;
        double precioMoto = 15.5;
        double precioPat = 10.0;
        double precioFur = 40.5;
        int numCoche = 20;
        int numMoto = 50;
        int numPat = 15;
        int numFur = 10;
        double ingresos = precioCoche * numCoche + precioMoto * numMoto +
                precioPat * numPat + precioFur * numFur;
        System.out.println("Ingresos totales: " + ingresos + "€");
    }

    public static void ejercicio3() {
        String modeloFur = "Mercedes-Benz Citan";
        double precioFur = 40.5;
        int numFur = 10;
        final int DESCUENTO = 15;
        double subtotal = precioFur * numFur;
        double descuento = subtotal * DESCUENTO / 100;
        double total = subtotal - descuento;
        System.out.println("Vehículo: " + modeloFur);
        System.out.println("Unidades: " + numFur);
        System.out.println("Subtotal: " + subtotal + "€");
        System.out.println("Descuento: " + DESCUENTO + "%");
        System.out.println("Total: " + total + "€");
    }

    public static void ejercicio4() {
        double precioCoche = 30.5;
        double precioMoto = 15.5;
        double precioPat = 10.0;
        double precioFur = 40.5;
        final int TOTAL = 4;
        double media = (precioCoche + precioMoto + precioFur + precioPat) / TOTAL;
        System.out.println("Precio medio: " + media + "€");
    }

    public static void ejercicio5() {
        int numCoche = 20;
        int numMoto = 50;
        int numPat = 15;
        int numFur = 10;
        int total = numCoche + numMoto + numFur + numPat;
        double porCoche = (double) numCoche / total * 100;
        double porMoto = (double) numMoto / total * 100;
        double porFur = (double) numFur / total * 100;
        double porPat = (double) numPat / total * 100;
        System.out.println("Total vehículos: " + total);
        System.out.println("Coches: " + porCoche + "%");
        System.out.println("Motos: " + porMoto + "%");
        System.out.println("Furgonetas: " + porFur + "%");
        System.out.println("Patinetes: " + porPat + "%");
    }
}