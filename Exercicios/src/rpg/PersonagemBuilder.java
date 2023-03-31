package rpg;

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
        /* TODO
        *  Setar os atributos de maneira aleatoria
        * */
    }
    public Personagem character() {
        return new Personagem(name, klasse,equip);
    }
}
