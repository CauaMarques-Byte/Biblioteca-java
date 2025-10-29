import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public void cadastratLivro(Livro livro) {
        livros.add(livro);
        System.out.println(livro);
    }

    public void listarLivros() {
        livros.toArray();
        System.out.println(livros);
    }

    public Livro buscarLivro(Livro livro) {
        for (Livro livrosbi : livros) {
            if (livro.equals(livro)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(Livro livro) {
        Livro livros = buscarLivro(livro);
        if (livro != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou já emprestado!");
        }
    }

    int escolher = 0;

    public void devolverLivro(Livro livro) {
        Livro livrosb = buscarLivro(livro);
        if (livro != null && livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou já disponível!");
        }
    }
}