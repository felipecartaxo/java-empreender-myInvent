package entidades;

import java.util.ArrayList;

public class InventarioEquipamentos {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    /*
     * public InventarioEquipamentos() {
     * carregarObjetos();
     * }
     */

    public void adicionar(Equipamento equip) {
        equipamentos.add(equip);
    }

    public void remover(Equipamento equip) {
        equipamentos.remove(equip);
    }

    public Equipamento localizar(int id) {
        for (Equipamento equip : equipamentos) {
            if (equip.getId() == id) {
                return equip;
            }
        }

        return null;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public int getTotalEquipamentos() {
        return equipamentos.size();
    }
}