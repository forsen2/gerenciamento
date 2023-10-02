package gerenciamento;

public class Main {
	public static void main(String args[]) {
		Tarefa t = new Tarefa(2,"Tarefa Numero Um", "Detalhamento 1");
		Tarefa t2 = new Tarefa(52,"Tarefa Numero Dois", "Detalhamento 2");
		t.setDataLimiteTarefa("25/09/2023");
		t2.setDataLimiteTarefa("25/09/2023");
		
		System.out.println(t.toString());
		System.out.println(t2.toString());
		t2.setPercentualAtual(101);
		
		System.out.println(t.toString());
		
		t.setPercentualAtual(101);
		System.out.println(t2.toString());
	}
}
