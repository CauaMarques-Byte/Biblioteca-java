import java.util.Scanner;
public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    boolean emprestado;

    public Livro (String titulo, String autor, int ano, boolean emprestado){
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.emprestado = false;
    }

    public Livro (){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }
    
//Fazer uma notação com um override para sobrepor esse toString, aqui não precisamos realizar um System.out.println, só chamar o toString
    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponivel"; //Codigo Ternario, onde se um for verdade entra em emprestado, se nao disponivel
        return getTitulo() + " " + getAutor() + " " + getAno() + " " + status;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean isEmprestado(){
        return  emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
