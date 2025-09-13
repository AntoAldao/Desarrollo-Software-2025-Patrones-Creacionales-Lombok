package main.java.abstractfactory;

public class AdminFactory implements AbstractFactory {

    @Override
    public InterfazUI crearUI() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        //Política; admin usa express por defecto
        return EnvioExpres.builder()
                .costoBase(2000.0)
                .costoPorKg(300.0)
                .costoPorKm(8.0)
                .velocidadKmPorDia(800)
                .diasMinimos(1)
                .build();
    }
}
