package rpg;

public class Director {
    public void constructMago(Builder builder) {
        builder.setNome("Cachorão Mil Grau");
        builder.setProfissao(Profissao.MAGO);
        builder.setEquipamento(Equipamento.FACA);
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
}
