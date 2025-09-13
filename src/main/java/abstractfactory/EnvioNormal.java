package main.java.abstractfactory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EnvioNormal implements MetodoEnvio {
    private double costoBase;
    private double costoPorKg;
    private double costoPorKm;
    private int velocidadKmPorDia;
    private int diasMinimos;

    @Override
    public String tipo() {
        return "Envio Normal";
    }

    @Override
    public int diasEstimados(int distanciaKm) {
        int dias = (int) Math.ceil(distanciaKm / (double) velocidadKmPorDia);
        return Math.max(dias, diasMinimos);
    }

    @Override
    public double costo(double pesoKg, int distanciaKm) {
        return costoBase + (pesoKg * costoPorKg) + (distanciaKm * costoPorKm);
    }
}
