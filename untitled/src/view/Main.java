package view;

import estrutura.PilhaAluno;
import model.Aluno;
import javax.swing.JOptionPane;

public class Main {

    private static PilhaAluno pilha;
    private static final int CAPACIDADE = 10;

    public static void main(String[] args) {
        pilha = new PilhaAluno(CAPACIDADE);
        int opcao = 0;
        do {
            String menu = "--- PILHA DE ALUNOS  ---\n" +
                    "1 - Adicionar aluno\n" +
                    "2 - Remover aluno \n" +
                    "3 - Buscar aluno por matrícula\n" +
                    "4 - Listar todos\n" +
                    "5 - Contar alunos\n" +
                    "6 - Sair";
            String escolha = JOptionPane.showInputDialog(menu);
            if (escolha == null) opcao = 6;
            else {
                try {
                    opcao = Integer.parseInt(escolha);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Número inválido.");
                    continue;
                }
            }
            switch (opcao) {
                case 1: adicionarAluno(); break;
                case 2: pilha.remover(); break;
                case 3: buscarAluno(); break;
                case 4: pilha.listar(); break;
                case 5: JOptionPane.showMessageDialog(null, "Total: " + pilha.contar()); break;
                case 6: JOptionPane.showMessageDialog(null, "Saindo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 6);
    }

    private static void adicionarAluno() {
        String nome = JOptionPane.showInputDialog("Nome:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome obrigatório.");
            return;
        }
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        if (matricula == null || matricula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Matrícula obrigatória.");
            return;
        }
        String curso = JOptionPane.showInputDialog("Curso:");
        if (curso == null || curso.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Curso obrigatório.");
            return;
        }
        Aluno aluno = new Aluno(nome, matricula, curso);
        pilha.adicionar(aluno);
    }

    private static void buscarAluno() {
        String mat = JOptionPane.showInputDialog("Matrícula para buscar:");
        if (mat == null || mat.trim().isEmpty()) return;
        Aluno a = pilha.buscarPorMatricula(mat);
        if (a != null) JOptionPane.showMessageDialog(null, "Encontrado:\n" + a);
        else JOptionPane.showMessageDialog(null, "Matrícula não encontrada.");
    }
}