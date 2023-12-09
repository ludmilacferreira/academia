package CRUD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - Idade: " + idade;
    }
}

class Academia {
    private List<Aluno> listaAlunos;

    public Academia() {
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public List<Aluno> obterTodosAlunos() {
        return new ArrayList<>(listaAlunos);
    }

    public void atualizarAluno(Aluno alunoAntigo, Aluno alunoNovo) {
        int index = listaAlunos.indexOf(alunoAntigo);
        if (index != -1) {
            listaAlunos.set(index, alunoNovo);
        }
    }

    public void excluirAluno(Aluno aluno) {
        listaAlunos.remove(aluno);
    }
}

class AcademiaUI extends JFrame {
    private Academia academia;
    private DefaultListModel<Aluno> listModel;

    public AcademiaUI() {
        academia = new Academia();
        listModel = new DefaultListModel<>();

        setTitle("Sistema de Academia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JList<Aluno> alunoJList = new JList<>(listModel);
        atualizarListaAlunos();

        JButton addButton = new JButton("Adicionar Aluno");
        JButton editarButton = new JButton("Editar Aluno");
        JButton excluirButton = new JButton("Excluir Aluno");

        addButton.addActionListener(e -> cadastrarAluno());
        editarButton.addActionListener(e -> editarAluno(alunoJList.getSelectedValue()));
        excluirButton.addActionListener(e -> excluirAluno(alunoJList.getSelectedValue()));

        setLayout(new BorderLayout());
        add(new JScrollPane(alunoJList), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editarButton);
        buttonPanel.add(excluirButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void cadastrarAluno() {
        CadastroAlunoUI cadastroUI = new CadastroAlunoUI(academia, this);
    }

    private void editarAluno(Aluno aluno) {
        if (aluno != null) {
            AtualizacaoAlunoUI atualizacaoUI = new AtualizacaoAlunoUI(academia, this, aluno);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para editar.");
        }
    }

    private void excluirAluno(Aluno aluno) {
        if (aluno != null && JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir " + aluno.getNome() + "?",
                "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            academia.excluirAluno(aluno);
            atualizarListaAlunos();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para excluir.");
        }
    }

    public void atualizarListaAlunos() {
        listModel.clear();
        academia.obterTodosAlunos().forEach(listModel::addElement);
    }
}

class CadastroAlunoUI extends JFrame {
    private Academia academia;
    private AcademiaUI academiaUI;
    private JTextField nomeTextField;
    private JTextField idadeTextField;

    public CadastroAlunoUI(Academia academia, AcademiaUI academiaUI) {
        this.academia = academia;
        this.academiaUI = academiaUI;

        setTitle("Cadastro de Aluno");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeTextField = new JTextField();
        JLabel idadeLabel = new JLabel("Idade:");
        idadeTextField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(e -> cadastrarAluno());

        setLayout(new GridLayout(4, 2));
        add(nomeLabel);
        add(nomeTextField);
        add(idadeLabel);
        add(idadeTextField);
        add(new JLabel());
        add(new JLabel());
        add(cadastrarButton);

        setVisible(true);
    }

    private void cadastrarAluno() {
        String nome = nomeTextField.getText();
        int idade = Integer.parseInt(idadeTextField.getText());

        academia.adicionarAluno(new Aluno(nome, idade));
        academiaUI.atualizarListaAlunos();
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
        dispose();
    }
}

class AtualizacaoAlunoUI extends CadastroAlunoUI {
    private Aluno aluno;

    public AtualizacaoAlunoUI(Academia academia, AcademiaUI academiaUI, Aluno aluno) {
        super(academia, academiaUI);
        this.aluno = aluno;
        setTitle("Atualização de Aluno");
        preencherCampos();
    }

    private void preencherCampos() {
        nomeTextField.setText(aluno.getNome());
        idadeTextField.setText(Integer.toString(aluno.getIdade()));
    }

    @Override
    protected void cadastrarAluno() {
        aluno.setNome(nomeTextField.getText());
        aluno.setIdade(Integer.parseInt(idadeTextField.getText()));
        academia.atualizarAluno(aluno, aluno);
        academiaUI.atualizarListaAlunos();
        JOptionPane.showMessageDialog(this, "Dados do aluno atualizados com sucesso!");
        dispose();
    }
}

public class Crud {
    public static void main(String[] args) {
        new AcademiaUI();
    }
}

