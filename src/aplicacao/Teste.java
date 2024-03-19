import entidades.Equipamento;
import entidades.InventarioEquipamentos;

public class Teste {
    public static void main(String[] args) {
        InventarioEquipamentos inv = new InventarioEquipamentos();

        Equipamento e1 = new Equipamento(1, "DSKTI-01", "HP");
        Equipamento e2 = new Equipamento(2, "DSKTI-02", "HP");
        Equipamento e3 = new Equipamento(3, "NTB01-ADM", "Antigo notebook de Julliete", "Daten");

        inv.adicionar(e1);
        inv.adicionar(e2);
        inv.adicionar(e3);

        System.out.println("---> Localizar equipamento de ID 3 = " + inv.localizarId(3));
        System.out.println("---> Localizando os equipamentos da HP: " + inv.localizarMarca("HP"));

        System.out.println("---> Quantidade todal de equipamentos = " + inv.getTotalEquipamentos());
        System.out.println("---> Lista de equipamentos: " + inv.getEquipamentos());
    }
}