package Controller;

public class Calc_DAO {

    public double calcularAreaParede(double altura, double largura) {

        return altura * largura;

    }

    public int calcularQuantidadeBlocos(double areaParede) {

        double areaBloco = 0.18 * 0.38;

        return (int) Math.ceil(areaParede / areaBloco);

    }
}