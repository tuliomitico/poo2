package rpg;

public class Director {
    public void construct(Builder builder,String nome, Profissao klasse, Equipamento equip) {
        builder.setNome(nome);
        builder.setProfissao(klasse);
        builder.setEquipamento(equip);
    }

    public void construct(Builder builder, String nome, Profissao klasse) {
        builder.setNome(nome);
        builder.setProfissao(klasse);
        builder.setEquipamento(Equipamento.ESPADA);
    }
    public void constructGuerreiro(Builder builder) {
        builder.setNome("Galo cego");
        builder.setProfissao(Profissao.GUERREIRO);
        builder.setEquipamento(Equipamento.ESPADA);
    }
    public void constructBandido(Builder builder) {
        builder.setNome("Luiz Inácio Lula da Silva");
        builder.setProfissao(Profissao.BANDIDO);
        builder.setEquipamento(Equipamento.ANEL);
    }
    public void constructAleatorio(Builder builder, String name) {
        builder.setNome(name);
        builder.setAleatorio();
    }
}
