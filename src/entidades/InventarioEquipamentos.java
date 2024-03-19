package entidades;

import java.util.ArrayList;

// TODO: Fazer o tratamento de erro
public class InventarioEquipamentos {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>(); // ArrayList onde os equipamentos serão armazenados

    // Adiciona um equipamento ao ArrayList
    public void adicionar(Equipamento equip) {
        equipamentos.add(equip);
    }

    // Remove um equipamento do ArrayList
    public void remover(Equipamento equip) {
        equipamentos.remove(equip);
    }

    // Retorna um equipamento a partir de um ID
    public Equipamento localizarId(int id) {
        for (Equipamento equip : equipamentos) {
            if (equip.getId() == id) {
                return equip;
            }
        }

        return null;
    }

    // Retorna o(s) equipamento(s) de uma determinada marca
    public ArrayList<Equipamento> localizarMarca(String marca) {
        ArrayList<Equipamento> result = new ArrayList<>();

        for (Equipamento equip : equipamentos) {
            if (equip.getMarca().equalsIgnoreCase(marca)) {
                result.add(equip);
            }
        }

        return result;
    }

    // Retorna todos os equipamentos cadastrados
    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    // Exibe a quantidade total de equipamentos
    public int getTotalEquipamentos() {
        return equipamentos.size();
    }
}