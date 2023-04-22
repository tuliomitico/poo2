package rpg;

import java.util.Random;

public class PersonagemBuilder implements  Builder {
    private Profissao klasse;
    private String name;
    private Equipamento equip;
    private Object aleatorio;

    @Override
    public void setProfissao(Profissao profissao) {
        this.klasse = profissao;
    }

    @Override
    public void setNome(String nome) {
        this.name = nome;
    }

    @Override
    public void setEquipamento(Equipamento equipamento) {
        this.equip = equipamento;
    }

    @Override
    public void setAleatorio() {
        int randomEquip = new Random().nextInt(Equipamento.values().length);
        int randomProfissao = new Random().nextInt(Profissao.values().length);
        this.equip = Equipamento.values()[randomEquip];
        this.klasse = Profissao.values()[randomProfissao];
    }
    public Personagem character() {
        return new Personagem(name, klasse, equip);
    }
}
