package rpg;

public class Personagem {
    private String nome;
    private Profissao profissao;
    private Equipamento equipamento;
    public Personagem(String nome, Profissao profissao,Equipamento equipamento) {
        this.nome = nome;
        this.profissao = profissao;
        this.equipamento = equipamento;
    }

    public String getNome() {
        return nome;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    @Override
    public String toString() {
        return "Personagem " + getProfissao() + " com o(a) nome " + getNome() + " equipado(a) com " + getEquipamento() + ".";
    }
}
