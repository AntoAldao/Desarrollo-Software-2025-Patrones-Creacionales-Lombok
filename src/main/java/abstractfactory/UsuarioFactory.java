package main.java.abstractfactory;

public class UsuarioFactory implements AbstractFactory {
    @Override
    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return EnvioNormal.builder()
                .costoBase(1200.0)
                .costoPorKg(200.0)
                .costoPorKm(5.0)
                .velocidadKmPorDia(400)
                .diasMinimos(2)
                .build();
    }
}
