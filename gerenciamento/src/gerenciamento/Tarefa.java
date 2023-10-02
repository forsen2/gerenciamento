package gerenciamento;

public class Tarefa {

	private int prioridadeTarefa;
	private String nomeTarefa;
	private String dataLimiteTarefa;
	private double percentualConcluidoTarefa;
	private String detalhamentoTarefa;
	private double percentualAtual;
	private boolean tarefaConcluida;
	public static int numTarefaConcluida = 0;
	
	public Tarefa(int prioridadeTarefa, String nomeTarefa, String detalhamentoTarefa) {
		this.prioridadeTarefa = prioridadeTarefa;
		this.nomeTarefa = nomeTarefa;
		this.detalhamentoTarefa = detalhamentoTarefa;
	}
	
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	
	public int getPrioridadeTarefa() {
		return prioridadeTarefa;
	}
	
	public double getPercentualConcluido() {
		return percentualConcluidoTarefa;
	}
	
	public String getDetalhamentoTarefa() {
		return detalhamentoTarefa;
	}
	
	public String getDataLimiteTarefa() {
		return dataLimiteTarefa;
	}

	public double getPercentualAtual() {
		return percentualAtual;
	}
	
	public boolean getTarefaConcluida() {
		return tarefaConcluida;
	}
	
	////////////////////////////////////////////
	
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
	public void setPrioridadeTarefa(int prioridadeTarefa) {
		this.prioridadeTarefa = prioridadeTarefa;
	}
	
	public void setDataLimiteTarefa(String dataLimiteTarefa) {
		this.dataLimiteTarefa = dataLimiteTarefa;
	}
	
	public void setPercentualConcluidoTarefa(double percentualConcluidoTarefa) {
		this.percentualConcluidoTarefa = percentualConcluidoTarefa;
	}
	
	public void setDetalhamentoTarefa(String detalhamentoTarefa) {
		this.detalhamentoTarefa = detalhamentoTarefa;
	}
	
	public void setPercentualAtual(double percentualAtual) {
		this.percentualAtual = percentualAtual;
		if (percentualAtual >= 100) {
			tarefaConcluida = true;
			numTarefaConcluida++;
			
		}
		
	}
	
	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}
	
	public String toString() {
		return "Nome da tarefa : " + this.nomeTarefa + "\nData Limite da Tarefa: " + this.dataLimiteTarefa + "\nQuantidade Tarefas Concluidas: " + "\nTarefa Concluida? " + tarefaConcluida + "\nNumero de Tarefas Concluidas: " +this.numTarefaConcluida + "\n";
	}
	
}
