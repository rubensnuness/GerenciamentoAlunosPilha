package estrutura;

import model.Aluno;
import javax.swing.JOptionPane;

public class PilhaAluno {
    private Aluno[] vetor;
    private int topo;
    private int capacidade;

    public PilhaAluno(int capacidade) {
        this.capacidade = capacidade;
        this.vetor = new Aluno[capacidade];
        this.topo = -1;
    }

    public void adicionar(Aluno aluno) {
        if (topo == capacidade - 1) {
            JOptionPane.showMessageDialog(null, "Pilha cheia! Capacidade máxima: " + capacidade);
            return;
        }
        topo++;
        vetor[topo] = aluno;
        JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");
    }

    public void remover() {
        if (topo == -1) {
            JOptionPane.showMessageDialog(null, "Pilha vazia! Nada para remover.");
            return;
        }
        Aluno removido = vetor[topo];
        topo--;
        JOptionPane.showMessageDialog(null, "Aluno removido:\n" + removido);
    }

    public Aluno buscarPorMatricula(String matricula) {
        for (int i = 0; i <= topo; i++) {
            if (vetor[i].getMatricula().equalsIgnoreCase(matricula)) {
                return vetor[i];
            }
        }// -1 significa pilha vazia
        return null;
    }

    public void listar() {
        if (topo == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
            return;
        }
        StringBuilder sb = new StringBuilder("--- LISTA DE ALUNOS (do início ao topo) ---\n");
        for (int i = 0; i <= topo; i++) {
            sb.append(vetor[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public int contar() {
        return topo + 1;
    }
}