package rpg;

public interface Builder {
    void setProfissao(Profissao profissao);

    default void setNome(String nome) {

    }

    void setEquipamento(Equipamento equipamento);
    void setAleatorio();
}
