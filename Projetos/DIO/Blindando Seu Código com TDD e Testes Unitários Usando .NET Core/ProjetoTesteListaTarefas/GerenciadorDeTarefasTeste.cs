using BlindandoSeuCodigoComTDD.Models;
using System.Linq;

namespace ProjetoTesteListaTarefas;

public class GerenciadorDeTestes {
    public GerenciadorDeTarefas gentTaf = new([
        new("Lavar mão", "Lavar amanhã"),
        new("Arrumar quarto", ""),
        new("escovar dente", "tenho que escovar dente todos os dias.")
    ]);
    
    [Fact]
    public void ListarTarefas_RetornarTarefasNaLista() {
        var listaTarefas = gentTaf.ListarTarefas();
        Assert.Equal(3, listaTarefas.Count);
        Assert.Contains(listaTarefas, t => t.Nome == "Lavar mão");
        Assert.Contains(listaTarefas, t => t.Nome == "Arrumar quarto");
        Assert.Contains(listaTarefas, t => t.Nome == "escovar dente");
    }

    [Fact]
    public void CriarTarefa_AdicionarNovaTarefa() {
        gentTaf.CriarTarefa("Estudar", "Estudar para a prova");
        var listaTarefas = gentTaf.ListarTarefas();
        Assert.Equal(4, listaTarefas.Count);
        Assert.Contains(listaTarefas, t => t.Nome == "Estudar");
    }

    [Fact]
    public void AtualizarStatusTarefa_AlterarStatusDaTarefa() {
        gentTaf.AtualizarStatusTarefa(2, true);
        var tarefaComID1 = gentTaf.ListarTarefas().FirstOrDefault(t => t.Id == 2);
        Assert.NotNull(tarefaComID1);
        Assert.True(tarefaComID1.Status);
    }

    [Fact]
    public void RemoverTarefa_DeletarTarefaExistente() {
        gentTaf.RemoverTarefa(2);
        var listaTarefas = gentTaf.ListarTarefas();
        Assert.Equal(2, listaTarefas.Count);
        Assert.DoesNotContain(listaTarefas, t => t.Id == 2);
    }

}
