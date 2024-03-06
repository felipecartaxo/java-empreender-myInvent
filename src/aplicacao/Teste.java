import entidades.Equipamento;
import entidades.InventarioEquipamentos;

public class Teste {
    public static void main(String[] args) {
        InventarioEquipamentos inv = new InventarioEquipamentos();

        Equipamento e1 = new Equipamento(1, "PC hp1");
        Equipamento e2 = new Equipamento(2, "PC health");

        inv.adicionar(e1);
        inv.adicionar(e2);

        System.out.println("Total = " + inv.getTotalEquipamentos());
        System.out.println("Lista de equipamentos: " + inv.getEquipamentos());
    }
}